package dados;

import java.util.ArrayList;

import entidades.Usuario;
import entidades.Venda;


public interface IVendaDAO {

	public void setVenda(ArrayList<Venda> lista);

	public ArrayList<Venda> getVendas();

	public void addVenda(Venda venda);

	public void removeVenda(Venda venda);
	
	public ArrayList<Venda> getVendasByUsuario(Usuario usuario);
	
}
