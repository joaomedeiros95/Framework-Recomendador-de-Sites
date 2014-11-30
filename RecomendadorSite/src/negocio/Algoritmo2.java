package negocio;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import entidades.Produto;
import entidades.Venda;
import excecoes.AcessoIlegalException;
import excecoes.AtributoNaoExistenteException;

public class Algoritmo2 extends ServicoDeRecomendacao {
    
    private ArrayList<Venda> lista;
    private ArrayList listaDeAtributos = new ArrayList();
    
    private String atributo;
    
    private Object[] valores = new Object[1000];
    private String[] chaves = new String[1000];
    
    private Map mapa = new HashMap();
    
    public Algoritmo2(ArrayList<Venda> lista, String atributo){
        this.lista = lista;
        this.atributo = atributo;
    }

    @Override
    public String[] iniciarAlgoritmo() throws AtributoNaoExistenteException, AcessoIlegalException{
        Field[] f;
        for(Venda v : lista){
            for(Produto prod : v.getLista()){
                f = prod.getClass().getDeclaredFields();
                for(Field f1 : f){
                    f1.setAccessible(true);
                    if(f1.getName().equals(atributo)){
                        try {
                            listaDeAtributos.add(f1.get(prod));
                        } catch (IllegalArgumentException ex) {
                            throw new AtributoNaoExistenteException();
                        } catch (IllegalAccessException ex) {
                            throw new AcessoIlegalException();
                        }
                    }
                }
            }
        }

        ArrayList<String> produtosPassados = new ArrayList();
        for(int i = 0;i < listaDeAtributos.size();i++){
            int cont = 0;
            if(!produtosPassados.contains(listaDeAtributos.get(i).toString())){
                for(int j = i;j < listaDeAtributos.size();j++){
                        if(listaDeAtributos.get(i).toString().equals(listaDeAtributos.get(j).toString())){
                        cont++;
                        }

                }
                produtosPassados.add(listaDeAtributos.get(i).toString());
                chaves[i] = listaDeAtributos.get(i).toString();
                valores[i] = cont;
            }
        }
        
        for(int i = 0;i < chaves.length;i++){
            if(chaves[i] != null){
                mapa.put(chaves[i], valores[i]);
            }
        }
        System.out.println ("HashMap: " + mapa); 
        
        return chaves;
    }
}
