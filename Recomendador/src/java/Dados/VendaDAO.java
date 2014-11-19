package Dados;

import Entidades.Venda;
import java.util.ArrayList;

public class VendaDAO implements Dados.IVendaDAO {
        ArrayList<Venda> lista = new ArrayList();
        Venda venda;
        
        public void setVendaList(ArrayList<Venda> lista){
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

}
