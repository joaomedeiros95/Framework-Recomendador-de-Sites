package Dados;

import Entidades.Usuario;
import java.util.ArrayList;

public class UsuarioDAO implements Dados.IUsuarioDAO {
	ArrayList<Usuario> lista = new ArrayList<Usuario>();
	private static UsuarioDAO instance;

	public void addUsuario(Entidades.Usuario usuario) {
		lista.add(usuario);
	}

	public void removeUsuario(Entidades.Usuario usuario) {
		lista.remove(usuario);
	}

	public void setUsuario(ArrayList<Usuario> lista) {
		this.lista = lista;
	}

	public ArrayList<Usuario> getUsuarios() {
		return lista;
	}
	
	public Usuario getUsuarioByNome(String nome) {
		for(Usuario retorno : lista) {
			if(retorno.getNome().equals(nome))
				return retorno;
		}
		return null;
	}
	
	public static UsuarioDAO getDAO() {
		if(instance == null) 
			instance = new UsuarioDAO();
		return instance;
	}

}
