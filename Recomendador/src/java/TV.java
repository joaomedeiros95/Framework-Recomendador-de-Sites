/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pedro
 */
public class TV extends Entidades.Produto{
    private Integer polegada;
    private Integer voltagem;
    private String resolucao;
    
    public TV(Integer id, String nome, float valor) {
        super(id, nome, valor);
    }

    /**
     * @return the polegada
     */
    public Integer getPolegada() {
        return polegada;
    }

    /**
     * @param polegada the polegada to set
     */
    public void setPolegada(Integer polegada) {
        this.polegada = polegada;
    }

    /**
     * @return the voltagem
     */
    public Integer getVoltagem() {
        return voltagem;
    }

    /**
     * @param voltagem the voltagem to set
     */
    public void setVoltagem(Integer voltagem) {
        this.voltagem = voltagem;
    }

    /**
     * @return the resolucao
     */
    public String getResolucao() {
        return resolucao;
    }

    /**
     * @param resolucao the resolucao to set
     */
    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }
    
}
