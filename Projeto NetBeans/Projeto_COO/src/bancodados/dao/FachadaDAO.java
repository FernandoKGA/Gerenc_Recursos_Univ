/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodados.dao;

import objetos.*;
import bancodados.Banco_de_DadosException;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author Fernando Karchiloff
 */
public interface FachadaDAO {
    
    public void insereUsuario(Usuario usuario) throws Banco_de_DadosException;
    
    public Usuario buscaUsuario(String numeroUSP) throws Banco_de_DadosException;
    
    public LinkedList<Usuario> listaUsuarios() throws Banco_de_DadosException;
    
    public void excluirUsuario(String numeroUSP) throws Banco_de_DadosException;
    
    public boolean verificaQuantCoordenador(String curso) throws Banco_de_DadosException;
    
    public void insereRecurso(Recurso recurso) throws Banco_de_DadosException;
    
    public void insereLaboratorio(Recurso recurso) throws Banco_de_DadosException;
    
    public Recurso buscaRecurso(String nome, String predio, String tipo) throws Banco_de_DadosException;
    
    public Recurso buscaRecursoPorID(int idRecurso) throws Banco_de_DadosException;
    
    public List<Recurso> listaTodosRecursos() throws Banco_de_DadosException;
    
    public List<Recurso> listaRecursos(String predio, String tipo) throws Banco_de_DadosException;
    
    public void excluirRecurso(Recurso recurso) throws Banco_de_DadosException;
    
    public void insereReserva(Reserva reserva) throws Banco_de_DadosException;
    
    public List<Reserva> listaTodasReservas() throws Banco_de_DadosException;
    
    public List<Reserva> listaReservasPorUsuario(String numeroUSP) throws Banco_de_DadosException;
    
    public void excluirReserva(Reserva reserva) throws Banco_de_DadosException;
    
    public List<Reserva> listaReservasMensais(String numeroUSP, String data_ftf) throws
            Banco_de_DadosException;
    
    public List<Reserva> buscaReservaDia(String data_ftf, Recurso rec) throws Banco_de_DadosException;
    
    public void atualizaReservas() throws Banco_de_DadosException;
}
