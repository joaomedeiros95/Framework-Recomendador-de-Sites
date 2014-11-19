package Dados;
    
import Entidades.Usuario;
import java.util.ArrayList;
    
public class UsuarioDAO implements Dados.IUsuarioDAO {
        ArrayList<Usuario> lista = new ArrayList();
        
	public void addUsuario(Entidades.Usuario usuario) {
            lista.add(usuario);
            
	}
        
        public void removeUsuario(Entidades.Usuario usuario){
            lista.remove(usuario);
        }
        
        public void setUsuario(ArrayList<Usuario> lista){
            this.lista = lista;
        }
        
	public ArrayList<Usuario> getUsuarios() {
		return lista;
	}
        
}
