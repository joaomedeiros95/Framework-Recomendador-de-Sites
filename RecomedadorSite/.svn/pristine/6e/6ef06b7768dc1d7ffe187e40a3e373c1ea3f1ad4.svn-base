package Negócio;

import Dados.UsuarioDAO;
import Entidades.Usuario;

public class CadastrarUsuario implements Negócio.ICadastrarUsuario {

	private Dados.IUsuarioDAO iUsuarioDAO;

	public void cadastrarUsuario(Usuario usuario) {
		iUsuarioDAO = UsuarioDAO.getDAO();
		iUsuarioDAO.addUsuario(usuario);
		for(Usuario user : iUsuarioDAO.getUsuarios())
			System.out.println(user.getNome());
	}

}
