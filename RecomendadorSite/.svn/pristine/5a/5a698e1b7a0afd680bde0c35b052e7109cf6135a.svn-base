package Negócio;

import java.util.ArrayList;

import Dados.IVendaDAO;
import Dados.VendaDAO;
import Entidades.Usuario;
import Entidades.Venda;

public class CadastrarVenda {
	
	private IVendaDAO vendaDAO;
	
	public void cadastrarVenda(Venda venda) {
		vendaDAO = VendaDAO.getDAO();
		vendaDAO.addVenda(venda);
	}
	
	public ArrayList<Venda> acharVendaByUsuario(Usuario usuario) {
		vendaDAO = VendaDAO.getDAO();
		return vendaDAO.getVendasByUsuario(usuario);
	}

}
