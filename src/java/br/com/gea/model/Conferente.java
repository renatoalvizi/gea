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
public class Conferente extends Pessoa{
    private int idConferente;
    private Boolean situacaoConferente;

    public Conferente(int idConferente, Boolean situacaoConferente) {
        this.idConferente = idConferente;
        this.situacaoConferente = situacaoConferente;
    }

    public Conferente(int idConferente, Boolean situacaoConferente, int idPessoa, String nomeRazaoPessoa, String rgIePessoa, String cpfCnpjPessoa, String dataNascFundPessoa, String telefonePessoa, String logradouroPessoa, String numLogradouroPessoa, String bairroPessoa, String cepPessoa, String emailPessoa, String senhaPessoa) {
        super(idPessoa, nomeRazaoPessoa, rgIePessoa, cpfCnpjPessoa, dataNascFundPessoa, telefonePessoa, logradouroPessoa, numLogradouroPessoa, bairroPessoa, cepPessoa, emailPessoa, senhaPessoa);
        this.idConferente = idConferente;
        this.situacaoConferente = situacaoConferente;
    }
            

    /**
     * @return the idConferente
     */
    public int getIdConferente() {
        return idConferente;
    }

    /**
     * @param idConferente the idConferente to set
     */
    public void setIdConferente(int idConferente) {
        this.idConferente = idConferente;
    }

    /**
     * @return the situacaoConferente
     */
    public Boolean getSituacaoConferente() {
        return situacaoConferente;
    }

    /**
     * @param situacaoConferente the situacaoConferente to set
     */
    public void setSituacaoConferente(Boolean situacaoConferente) {
        this.situacaoConferente = situacaoConferente;
    }
    
    
    
}
