package Dados;

import java.util.ArrayList;

import Entidades.Produto;

public interface IProdutoDAO {

	public void addProduto(Entidades.Produto produto);

	public void removeProduto(Entidades.Produto produto);

	public void setProduto(ArrayList<Produto> lista);

	public ArrayList<Produto> getProdutos();
	
	public Produto getProdutoByNome(String nome);
}
