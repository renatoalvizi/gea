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
public class Coordenador extends Pessoa{
    private int idCoordenador;
    private Boolean situacaoCoordenador;

    public Coordenador(int idCoordenador, Boolean situacaoCoordenador) {
        this.idCoordenador = idCoordenador;
        this.situacaoCoordenador = situacaoCoordenador;
    }

    public Coordenador(int idCoordenador, Boolean situacaoCoordenador, int idPessoa, String nomeRazaoPessoa, String rgIePessoa, String cpfCnpjPessoa, String dataNascFundPessoa, String telefonePessoa, String logradouroPessoa, String numLogradouroPessoa, String bairroPessoa, String cepPessoa, String emailPessoa, String senhaPessoa) {
        super(idPessoa, nomeRazaoPessoa, rgIePessoa, cpfCnpjPessoa, dataNascFundPessoa, telefonePessoa, logradouroPessoa, numLogradouroPessoa, bairroPessoa, cepPessoa, emailPessoa, senhaPessoa);
        this.idCoordenador = idCoordenador;
        this.situacaoCoordenador = situacaoCoordenador;
    }

    
    
    /**
     * @return the idCoordenador
     */
    public int getIdCoordenador() {
        return idCoordenador;
    }

    /**
     * @param idCoordenador the idCoordenador to set
     */
    public void setIdCoordenador(int idCoordenador) {
        this.idCoordenador = idCoordenador;
    }

    /**
     * @return the situacaoCoordenador
     */
    public Boolean getSituacaoCoordenador() {
        return situacaoCoordenador;
    }

    /**
     * @param situacaoCoordenador the situacaoCoordenador to set
     */
    public void setSituacaoCoordenador(Boolean situacaoCoordenador) {
        this.situacaoCoordenador = situacaoCoordenador;
    }
    
    
}
