/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodados.dao;

import bancodados.Banco_de_DadosException;

/**
 *
 * @author ferna
 */
public interface AbstractFactoryDAO {
    public RecursoDAO createRecursoDAO() throws Banco_de_DadosException;
    
    public ReservaDAO createReservaDAO() throws Banco_de_DadosException;
    
    public UsuarioDAO createUsuarioDAO() throws Banco_de_DadosException;
}
