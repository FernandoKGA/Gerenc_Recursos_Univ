/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodados.dao.jdbc;

import bancodados.Banco_de_DadosException;
import bancodados.dao.reservaDAO;
import java.util.LinkedList;
import objetos.Reserva;

/**
 *
 * @author ferna
 */
public class reservaDAO_JDBC implements reservaDAO{

    @Override
    public void insere(Reserva reserva) throws Banco_de_DadosException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LinkedList<Reserva> lista() throws Banco_de_DadosException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LinkedList<Reserva> listaPorUsuario(String nUSP) throws Banco_de_DadosException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Reserva reserva) throws Banco_de_DadosException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
