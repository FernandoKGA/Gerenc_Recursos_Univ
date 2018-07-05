/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodados.dao.jdbc;

import bancodados.Banco_de_DadosException;
import bancodados.dao.DaoAbstractFactory;
import bancodados.dao.recursoDAO;
import bancodados.dao.reservaDAO;
import bancodados.dao.usuarioDAO;
/**
 *
 * @author ferna
 */
public class FactoryDAO_JDBC implements DaoAbstractFactory{

    @Override
    public recursoDAO createRecursoDAO() throws Banco_de_DadosException {
        return new recursoDAO_JDBC();
    }

    @Override
    public reservaDAO createReservaDAO() throws Banco_de_DadosException {
        return new reservaDAO_JDBC();
    }

    @Override
    public usuarioDAO createUsuarioDAO() throws Banco_de_DadosException {
        return new usuarioDAO_JDBC();
    }
    
}
