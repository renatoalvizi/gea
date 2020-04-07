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
public class Administrador extends Pessoa{
    private int idAdministrador;
    private Boolean situacaoAdministrador;

    public Administrador() {
    }

    public Administrador(int idPessoa, String nomeRazaoPessoa, String rgIePessoa, String cpfCnpjPessoa, String dataNascFundPessoa, String telefonePessoa, String logradouroPessoa, String numLogradouroPessoa, String bairroPessoa, String cepPessoa, String emailPessoa, String senhaPessoa) {
        super(idPessoa, nomeRazaoPessoa, rgIePessoa, cpfCnpjPessoa, dataNascFundPessoa, telefonePessoa, logradouroPessoa, numLogradouroPessoa, bairroPessoa, cepPessoa, emailPessoa, senhaPessoa);
    }

    
    /**
     * @return the idAdministrador
     */
    public int getIdAdministrador() {
        return idAdministrador;
    }

    /**
     * @param idAdministrador the idAdministrador to set
     */
    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    /**
     * @return the situacaoAdministrador
     */
    public Boolean getSituacaoAdministrador() {
        return situacaoAdministrador;
    }

    /**
     * @param situacaoAdministrador the situacaoAdministrador to set
     */
    public void setSituacaoAdministrador(Boolean situacaoAdministrador) {
        this.situacaoAdministrador = situacaoAdministrador;
    }
    
    
}
