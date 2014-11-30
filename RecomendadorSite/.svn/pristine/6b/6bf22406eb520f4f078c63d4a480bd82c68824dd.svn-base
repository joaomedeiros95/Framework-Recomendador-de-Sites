package negocio;

import java.util.ArrayList;
import java.util.List;

import dados.ProdutoDAO;
import entidades.Produto;
import excecoes.CampoInvalidoException;
import excecoes.NadaEncontradoException;

public class CadastrarProduto implements ICadastrarObjeto {

	private dados.IProdutoDAO iProdutoDAO;

	public void cadastrarProduto(String nome, String valor) throws CampoInvalidoException {
		validate(nome, valor);
		
		Produto produto = new Produto(); 
		produto.setNome(nome);
		produto.setValor(Float.parseFloat(valor));
		
		iProdutoDAO = ProdutoDAO.getDAO();
		iProdutoDAO.addProduto(produto);
		for(Produto teste : iProdutoDAO.getProdutos())
			System.out.println(teste.getNome() + " " + teste.getValor());
	}
	

	public Produto acharProdutoByNome(String nome) throws CampoInvalidoException, NadaEncontradoException {
		if(nome == "")
			throw new CampoInvalidoException("nome");
		iProdutoDAO = ProdutoDAO.getDAO();
		Produto retorno = iProdutoDAO.getProdutoByNome(nome);
		if(retorno == null)
			throw new NadaEncontradoException("Produto");
		else
			return retorno;
	}
	
	private void validate(String nome, String valor) throws CampoInvalidoException {
		List<String> erros = new ArrayList<String>();
		if(nome == "") 
			erros.add("nome");
		if(valor == "")
			erros.add("valor");
		else {
			try {
				Float.parseFloat(valor);
			} catch(NumberFormatException e) {
				erros.add("valor");
			}
		}
		
		//Se existir erros
		if(erros.size() > 0)
			throw new CampoInvalidoException(erros);
	}

}
