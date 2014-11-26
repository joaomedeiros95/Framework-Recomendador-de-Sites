package Dados;

import Entidades.Produto;
import java.util.ArrayList;

public class ProdutoDAO implements Dados.IProdutoDAO {
	ArrayList<Produto> lista = new ArrayList<Produto>();
	private static ProdutoDAO instance;

	public void addProduto(Entidades.Produto produto) {
		lista.add(produto);
	}

	public void removeProduto(Entidades.Produto produto) {
		lista.remove(produto);
	}

	public void setProduto(ArrayList<Produto> lista) {
		this.lista = lista;
	}

	public ArrayList<Produto> getProdutos() {
		return lista;
	}
	
	public Produto getProdutoByNome(String nome) {
		for(Produto retorno : lista) {
			if(retorno.getNome().equals(nome)) 
				return retorno;
		}
		return null;
	}
	
	public static ProdutoDAO getDAO() {
		if(instance == null) 
			instance = new ProdutoDAO();
		return instance;
	}

}
