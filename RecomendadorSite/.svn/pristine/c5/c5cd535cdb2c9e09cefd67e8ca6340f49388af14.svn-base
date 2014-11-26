package Dados;

import java.util.ArrayList;

import Entidades.Usuario;
import Entidades.Venda;

public class VendaDAO implements Dados.IVendaDAO {
	ArrayList<Venda> lista = new ArrayList<Venda>();
	Venda venda;
	private static VendaDAO instance;

	public void setVenda(ArrayList<Venda> lista) {
		this.lista = lista;
	}

	public ArrayList<Venda> getVendas() {
		return lista;
	}

	public void addVenda(Venda venda) {
		this.lista.add(venda);
	}

	public void removeVenda(Venda venda) {
		this.lista.remove(venda);
	}
	
	public ArrayList<Venda> getVendasByUsuario(Usuario usuario) {
		ArrayList<Venda> retorno = new ArrayList<Venda>();
		for(Venda venda : lista) {
			if(venda.getUsuario().equals(usuario))
				retorno.add(venda);
		}
		
		if(retorno.size() > 0)
			return retorno;
		else
			return null;
	}
	
	public static VendaDAO getDAO() {
		if(instance == null)
			instance = new VendaDAO();
		return instance;
	}

}
