package negocio;

import entidades.Venda;
import java.util.ArrayList;
import excecoes.AcessoIlegalException;
import excecoes.AtributoNaoExistenteException;

public class Algoritmo3 extends negocio.ServicoDeRecomendacao {

	private Algoritmo1 algoritmo1;

	private Algoritmo2 algoritmo2;
	
	private ArrayList<Venda> lista;
	private String atributo;
	
	public Algoritmo3(ArrayList<Venda> lista, String atributo){
        this.lista = lista;
        this.atributo = atributo;
    }

    @Override
    public String[] iniciarAlgoritmo() throws AtributoNaoExistenteException, AcessoIlegalException {
        algoritmo1 = new Algoritmo1(lista);
        algoritmo2 = new Algoritmo2(lista, atributo);

        String[] seila = new String[1000];
        String[] alg1 = algoritmo1.iniciarAlgoritmo();
        String[] alg2 = algoritmo2.iniciarAlgoritmo();

        int ultimo = 0;
        boolean flag = true;
        for(int i = 0; i < alg1.length;i++){
            seila[i] = alg1[i];
            if(seila[i] == null && flag == true){
                ultimo = i;
                flag = false;
            }
        }
        
        int teste = 0;
        flag = true;
        for(int i = ultimo;i < alg1.length;i++){
            for(int j = teste;j < alg2.length;j++){
                if(alg2[j] != null){
                    seila[i] = alg2[j];
                    break;
                }
            }
            teste++;
        }
        
        return seila;
    }

}
