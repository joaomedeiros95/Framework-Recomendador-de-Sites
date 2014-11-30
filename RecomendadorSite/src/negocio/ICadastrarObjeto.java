package negocio;

import entidades.Produto;
import excecoes.CampoInvalidoException;
import excecoes.NadaEncontradoException;

public interface ICadastrarObjeto {

	public void cadastrarProduto(String nome, String Valor) throws CampoInvalidoException;
	public Produto acharProdutoByNome(String nome) throws CampoInvalidoException, NadaEncontradoException;
	
}
