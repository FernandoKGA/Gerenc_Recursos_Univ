/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodados.dao;

import bancodados.Banco_de_DadosException;
import java.util.LinkedList;
import objetos.Reserva;

/**
 *
 * @author Lucas
 */
public interface reservaDAO {
    public void insere(Reserva reserva) throws Banco_de_DadosException;
    //public Reserva busca(String ) throws Banco_de_DadosException;
    public LinkedList<Reserva> lista() throws Banco_de_DadosException;
    public LinkedList<Reserva> listaPorUsuario(String nUSP) throws Banco_de_DadosException;
    public void excluir(Reserva reserva) throws Banco_de_DadosException;
    
}
