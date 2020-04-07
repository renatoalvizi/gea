/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gea.dao;

import java.util.List;

/**
 *
 * @author renat
 */
public interface GenericDAO {
    public Boolean Cadastrar(Object objeto);
    public Boolean Alterar(Object objeto);
    public Boolean Excluir(Integer id);
    public List<Object> Listar();
    public Object Carregar(int idObject);
}
