package negocio;

import entidades.Usuario;
import entidades.Venda;

public interface ICadastrarVenda {

	public Venda acharVendaByUsuario(Usuario usuario);
	
}
