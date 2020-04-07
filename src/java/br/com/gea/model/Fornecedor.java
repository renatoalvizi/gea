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
public class Fornecedor extends Pessoa{
    private int idFornecedor;
    private String tipoTrabalhoFornecido;
    private Boolean situacaoFornecedor;

    public Fornecedor() {
    }

    public Fornecedor(int idPessoa, String nomeRazaoPessoa, String rgIePessoa, String cpfCnpjPessoa, String dataNascFundPessoa, String telefonePessoa, String logradouroPessoa, String numLogradouroPessoa, String bairroPessoa, String cepPessoa, String emailPessoa, String senhaPessoa) {
        super(idPessoa, nomeRazaoPessoa, rgIePessoa, cpfCnpjPessoa, dataNascFundPessoa, telefonePessoa, logradouroPessoa, numLogradouroPessoa, bairroPessoa, cepPessoa, emailPessoa, senhaPessoa);
    }
    
    
    /**
     * @return the idFornecedor
     */
    public int getIdFornecedor() {
        return idFornecedor;
    }

    /**
     * @param idFornecedor the idFornecedor to set
     */
    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    /**
     * @return the tipoTrabalhoFornecido
     */
    public String getTipoTrabalhoFornecido() {
        return tipoTrabalhoFornecido;
    }

    /**
     * @param tipoTrabalhoFornecido the tipoTrabalhoFornecido to set
     */
    public void setTipoTrabalhoFornecido(String tipoTrabalhoFornecido) {
        this.tipoTrabalhoFornecido = tipoTrabalhoFornecido;
    }

    /**
     * @return the situacaoFornecedor
     */
    public Boolean getSituacaoFornecedor() {
        return situacaoFornecedor;
    }

    /**
     * @param situacaoFornecedor the situacaoFornecedor to set
     */
    public void setSituacaoFornecedor(Boolean situacaoFornecedor) {
        this.situacaoFornecedor = situacaoFornecedor;
    }
    
    
}
