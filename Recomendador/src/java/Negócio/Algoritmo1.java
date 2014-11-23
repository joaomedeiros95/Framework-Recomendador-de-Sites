package Negócio;

import Entidades.Produto;
import Entidades.Venda;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Algoritmo1 extends Negócio.ServiçoDeRecomendacao {
    private ArrayList<Venda> lista;
    private ArrayList ListaDeProdutos = new ArrayList();
    private Map mapa = new HashMap();
    
    String[] chaves = new String[1000];
    int[] valores = new int[1000];
    
    public Algoritmo1(ArrayList<Venda> lista){
        this.lista = lista;
    }

    @Override
    public void iniciarAlgoritmo() {
        
        //Pega o nome da classe de cada produto e coloca em uma lista
        for(Venda v : lista){
            for(Produto p : v.getLista()){
                ListaDeProdutos.add(p.getClass().getSimpleName());
            }
        }
        
        //preenche 2 arrays com o nome da classe e a quantidade
        ArrayList<String> produtosPassados = new ArrayList();
        for(int i = 0;i < ListaDeProdutos.size();i++){
            int cont = 0;
            if(!produtosPassados.contains(ListaDeProdutos.get(i).toString())){
                for(int j = i;j < ListaDeProdutos.size();j++){
                        if(ListaDeProdutos.get(i).toString().equals(ListaDeProdutos.get(j).toString())){
                        cont++;
                        }

                }
                produtosPassados.add(ListaDeProdutos.get(i).toString());
                chaves[i] = ListaDeProdutos.get(i).toString();
                valores[i] = cont;
                System.out.println(chaves[i]+" / "+valores[i]+" / "+ListaDeProdutos.size());
            }
        }
        
        //(ERRO) sort para organizar em ordem crescente
        for(int i =0;i < chaves.length;i++){
            for(int j = i;j < chaves.length;j++){
                if(chaves[i] != null || chaves[j] != null){
                    if(valores[i] < valores[j]){
                        Integer aux = valores[i];
                        valores[i] = valores[j];
                        valores[j] = aux;
                        
                        String aux2 = chaves[i];
                        chaves[i] = chaves[j];
                        chaves[j] = aux2;
                    }
                } 
            }
        }
        
        //coloca tudo em um hashmap
        for(int i = 0;i < chaves.length;i++){
            if(chaves[i] != null){
                mapa.put(chaves[i], valores[i]);
            }
        }
        System.out.println ("HashMap: " + mapa); 
    }

}
