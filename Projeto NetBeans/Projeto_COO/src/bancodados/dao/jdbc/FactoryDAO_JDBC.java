/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodados.dao.jdbc;

import bancodados.Banco_de_DadosException;
import bancodados.dao.AbstractFactoryDAO;
import bancodados.dao.CursoDAO;
import bancodados.dao.PredioDAO;
import bancodados.dao.RecursoDAO;
import bancodados.dao.ReservaDAO;
import bancodados.dao.TipoDAO;
import bancodados.dao.UsuarioDAO;
/**
 *
 * @author ferna
 */
public class FactoryDAO_JDBC implements AbstractFactoryDAO{

    @Override
    public TipoDAO createTipoDAO() throws Banco_de_DadosException {
        return new TipoDAO_JDBC();
    }

    @Override
    public CursoDAO createCursoDAO() throws Banco_de_DadosException {
        return new CursoDAO_JDBC();
    }

    @Override
    public PredioDAO createPredioDAO() throws Banco_de_DadosException {
        return new PredioDAO_JDBC();
    }
    
    @Override
    public UsuarioDAO createUsuarioDAO() throws Banco_de_DadosException {
        return new UsuarioDAO_JDBC();
    }
    
    @Override
    public RecursoDAO createRecursoDAO() throws Banco_de_DadosException {
        return new RecursoDAO_JDBC();
    }

    @Override
    public ReservaDAO createReservaDAO() throws Banco_de_DadosException {
        return new ReservaDAO_JDBC();
    }
}
