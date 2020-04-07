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
public class Participante extends Pessoa{
    private int idParticipante;
    private String SexoParticipante;
    private Boolean situacaoParticipante;

    public Participante(int idParticipante, String SexoParticipante, Boolean situacaoParticipante) {
        this.idParticipante = idParticipante;
        this.SexoParticipante = SexoParticipante;
        this.situacaoParticipante = situacaoParticipante;
    }

    public Participante(int idParticipante, String SexoParticipante, Boolean situacaoParticipante, int idPessoa, String nomeRazaoPessoa, String rgIePessoa, String cpfCnpjPessoa, String dataNascFundPessoa, String telefonePessoa, String logradouroPessoa, String numLogradouroPessoa, String bairroPessoa, String cepPessoa, String emailPessoa, String senhaPessoa) {
        super(idPessoa, nomeRazaoPessoa, rgIePessoa, cpfCnpjPessoa, dataNascFundPessoa, telefonePessoa, logradouroPessoa, numLogradouroPessoa, bairroPessoa, cepPessoa, emailPessoa, senhaPessoa);
        this.idParticipante = idParticipante;
        this.SexoParticipante = SexoParticipante;
        this.situacaoParticipante = situacaoParticipante;
    }
    
    

    /**
     * @return the idParticipante
     */
    public int getIdParticipante() {
        return idParticipante;
    }

    /**
     * @param idParticipante the idParticipante to set
     */
    public void setIdParticipante(int idParticipante) {
        this.idParticipante = idParticipante;
    }

    /**
     * @return the SexoParticipante
     */
    public String getSexoParticipante() {
        return SexoParticipante;
    }

    /**
     * @param SexoParticipante the SexoParticipante to set
     */
    public void setSexoParticipante(String SexoParticipante) {
        this.SexoParticipante = SexoParticipante;
    }

    /**
     * @return the situacaoParticipante
     */
    public Boolean getSituacaoParticipante() {
        return situacaoParticipante;
    }

    /**
     * @param situacaoParticipante the situacaoParticipante to set
     */
    public void setSituacaoParticipante(Boolean situacaoParticipante) {
        this.situacaoParticipante = situacaoParticipante;
    }
    
    
}
