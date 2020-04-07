/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gea.model;

/**
 *
 * @author renat
 */
public class Cidade {
    private int idCidade;
    private String nomeCidade;
    private String estadoCidade;

    public Cidade(int idCidade, String nomeCidade, String estadoCidade) {
        this.idCidade = idCidade;
        this.nomeCidade = nomeCidade;
        this.estadoCidade = estadoCidade;
    }
        
    /**
     * @return the idCidade
     */
    public int getIdCidade() {
        return idCidade;
    }

    /**
     * @param idCidade the idCidade to set
     */
    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }

    /**
     * @return the nomeCidade
     */
    public String getNomeCidade() {
        return nomeCidade;
    }

    /**
     * @param nomeCidade the nomeCidade to set
     */
    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    /**
     * @return the estadoCidade
     */
    public String getEstadoCidade() {
        return estadoCidade;
    }

    /**
     * @param estadoCidade the estadoCidade to set
     */
    public void setEstadoCidade(String estadoCidade) {
        this.estadoCidade = estadoCidade;
    }
    
    
}
