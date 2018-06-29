/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodados.dao;

import bancodados.Banco_de_DadosException;
import java.util.List;
import objetos.Recurso;
import objetos.Reserva;

/**
 *
 * @author Lucas
 */
public interface reservaDAO {
    public void insere(Reserva reserva) throws Banco_de_DadosException;
    public List<Reserva> lista() throws Banco_de_DadosException;
    public List<Reserva> listaPorUsuario(String nUSP) throws Banco_de_DadosException;
    public void excluir(Reserva reserva) throws Banco_de_DadosException;
    //Lista todas as reservas ativas do mês para o Usuario
    public List<Reserva> listaMensais(String numeroUSP, String data_ftf) throws Banco_de_DadosException;
    //Lista todas as reservas ativas no dia para um Recurso
    public List<Reserva> buscaDia(String data_ftf, Recurso rec) throws Banco_de_DadosException;
    public void atualiza() throws Banco_de_DadosException;
}
