package Negócio;

import Entidades.Usuario;

public interface ICadastrarUsuario {
	
	public void cadastrarUsuario(Usuario usuario);
	public Usuario acharUsuarioByNome(String nome);
	
}
