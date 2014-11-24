package Negócio;

import Dados.ProdutoDAO;
import Entidades.Produto;

public class CadastrarProduto implements Negócio.ICadastrarObjeto {

	private Dados.IProdutoDAO iProdutoDAO;

	public void cadastrarProduto(Produto produto) {
		iProdutoDAO = ProdutoDAO.getDAO();
		iProdutoDAO.addProduto(produto);
		for(Produto teste : iProdutoDAO.getProdutos())
			System.out.println(teste.getNome() + " " + teste.getValor());
	}

}
