package apresentacao;

import hotspots.Livro;
import hotspots.Notebook;
import hotspots.TV;
import hotspots.UsuarioPersonalizado;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import util.ClassFinder;
import entidades.Produto;
import entidades.Usuario;

@ManagedBean(name="facede")
@RequestScoped
public class FacedeBean {
	
	public List<String> getAtributosUsuarioPersonalizado() {
		Usuario user = new UsuarioPersonalizado();
		return user.getAtributos();
	}
	
	public List<String> getAllClassNamesProduto() {
		List<Class<?>> allClasses = ClassFinder.find("hotspots");
		List<String> retorno = new ArrayList<String>();
		for(Class<?> classe : allClasses) {
			if(!classe.getName().contains("Usuario"))
				retorno.add(classe.getName().replace("hotspots.", ""));
		}
		
		return retorno;
	}
	
	public List<String> getAtributosTV() {
		Produto tv = new TV();		
		return tv.getAtributos();
	}
	
	public List<String> getAtributosNotebook() {
		Produto notebook = new Notebook();		
		return notebook.getAtributos();
	}
	
	public List<String> getAtributosLivro() {
		Produto livro = new Livro();		
		return livro.getAtributos();
	}
	
}
