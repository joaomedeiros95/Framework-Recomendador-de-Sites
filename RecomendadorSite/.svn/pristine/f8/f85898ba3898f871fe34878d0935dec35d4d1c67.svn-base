package negocio;

import entidades.Usuario;
import excecoes.CampoInvalidoException;
import excecoes.NadaEncontradoException;

public interface ICadastrarUsuario {
	
	public void cadastrarUsuario(String nome, String CPF, String RG, String tel, String end, String obs) throws CampoInvalidoException;
	public Usuario acharUsuarioByNome(String nome) throws CampoInvalidoException, NadaEncontradoException;
	
}
