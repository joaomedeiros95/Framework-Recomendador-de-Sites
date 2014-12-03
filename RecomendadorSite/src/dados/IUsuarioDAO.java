package dados;

import java.util.ArrayList;

import entidades.Usuario;

public interface IUsuarioDAO {
	
	public void addUsuario(entidades.Usuario usuario);

	public void removeUsuario(entidades.Usuario usuario);

	public void setUsuario(ArrayList<Usuario> lista);

	public ArrayList<Usuario> getUsuarios();
	
	public Usuario getUsuarioByNome(String nome);
	
}
