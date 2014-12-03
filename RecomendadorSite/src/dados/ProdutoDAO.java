package dados;

import java.util.ArrayList;

import entidades.Produto;

public class ProdutoDAO implements dados.IProdutoDAO {
	ArrayList<Produto> lista = new ArrayList<Produto>();
	private static ProdutoDAO instance;

	public void addProduto(entidades.Produto produto) {
		lista.add(produto);
	}

	public void removeProduto(entidades.Produto produto) {
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
