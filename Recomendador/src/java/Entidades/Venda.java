package Entidades;

import java.util.ArrayList;
import java.util.Date;

public class Venda {
    private Usuario usuario;
    private ArrayList<Produto> lista = new ArrayList();
    private Date data;
    
    public Venda(Usuario usuario, ArrayList<Produto> lista, Date data){
        this.usuario = usuario;
        this.lista = lista;
        this.data = data;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the lista
     */
    public ArrayList<Produto> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(ArrayList<Produto> lista) {
        this.lista = lista;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }
    
    
    
}
