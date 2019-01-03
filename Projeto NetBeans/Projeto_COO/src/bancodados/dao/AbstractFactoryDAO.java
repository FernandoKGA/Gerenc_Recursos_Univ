/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodados.dao;

import bancodados.Banco_de_DadosException;

/**
 *
 * @author fernando-karchiloff
 */
public interface AbstractFactoryDAO {
    public TipoDAO createTipoDAO() throws Banco_de_DadosException;
    
    public CursoDAO createCursoDAO() throws Banco_de_DadosException;
    
    public PredioDAO createPredioDAO() throws Banco_de_DadosException;
    
    public UsuarioDAO createUsuarioDAO() throws Banco_de_DadosException;
    
    public RecursoDAO createRecursoDAO() throws Banco_de_DadosException;
    
    public ReservaDAO createReservaDAO() throws Banco_de_DadosException;
}
