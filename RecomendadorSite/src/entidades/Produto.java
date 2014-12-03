package entidades;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Produto {
    private Integer id;
    private String nome;
    private float valor;
    
    public Produto(Integer id, String nome, float valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }

    public Produto() {
	}

	/**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }
    
    public List<String> getAtributos() {
    	Field[] fields = this.getClass().getDeclaredFields();
    	
    	List<String> retorno = new ArrayList<String>();
    	
    	for(Field field : fields) 
    		retorno.add(field.getName());
    	return retorno;
    }
}
