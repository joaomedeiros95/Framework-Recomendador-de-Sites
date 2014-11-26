package Negócio;

import Entidades.Usuario;
import Entidades.Venda;

public interface ICadastrarVenda {

	public Venda acharVendaByUsuario(Usuario usuario);
	
}
