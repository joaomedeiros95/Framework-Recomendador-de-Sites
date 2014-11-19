/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pedro
 */
public class UsuarioPersonalizado extends Entidades.Usuario{
    private Integer sexo;
    private float tamanhoRoupa;
    private String email;
    
    public UsuarioPersonalizado(Integer id, String nome, String cpf, String rg, String tel, String end, String obs) {
        super(id, nome, cpf, rg, tel, end, obs);
    }

    /**
     * @return the sexo
     */
    public Integer getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(Integer sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the tamanhoRoupa
     */
    public float getTamanhoRoupa() {
        return tamanhoRoupa;
    }

    /**
     * @param tamanhoRoupa the tamanhoRoupa to set
     */
    public void setTamanhoRoupa(float tamanhoRoupa) {
        this.tamanhoRoupa = tamanhoRoupa;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
}
