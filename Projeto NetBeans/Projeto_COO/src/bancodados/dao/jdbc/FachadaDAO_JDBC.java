/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodados.dao.jdbc;

import bancodados.Banco_de_DadosException;
import bancodados.dao.*;
import java.util.LinkedList;
import java.util.List;
import objetos.Recurso;
import objetos.Reserva;
import objetos.Usuario;

/**
 *
 * @author Fernando Karchiloff
 */
public class FachadaDAO_JDBC implements FachadaDAO{
        
    private final UsuarioDAO usuarioDAO;
    private final RecursoDAO recursoDAO;
    private final ReservaDAO reservaDAO;
    
    public FachadaDAO_JDBC() throws Banco_de_DadosException{
        AbstractFactoryDAO factoryDAO = new FactoryDAO_JDBC();
        usuarioDAO = factoryDAO.createUsuarioDAO();
        recursoDAO = factoryDAO.createRecursoDAO();
        reservaDAO = factoryDAO.createReservaDAO();
        
        //Criacao do banco de dados
        new CriacaoBancoDados(usuarioDAO, recursoDAO, reservaDAO).criaTabelas();
        
    }

    @Override
    public void insereUsuario(Usuario usuario) throws Banco_de_DadosException {
        usuarioDAO.insere(usuario);
    }

    @Override
    public Usuario buscaUsuario(String numeroUSP) throws Banco_de_DadosException {
        return usuarioDAO.busca(numeroUSP);
    }

    @Override
    public LinkedList<Usuario> listaUsuarios() throws Banco_de_DadosException {
        return usuarioDAO.lista();
    }

    @Override
    public void excluirUsuario(String numeroUSP) throws Banco_de_DadosException {
        usuarioDAO.excluir(numeroUSP);
    }

    @Override
    public boolean verificaQuantCoordenador(String curso) throws Banco_de_DadosException {
        return usuarioDAO.verificaQuantCoordenador(curso);
    }

    @Override
    public void insereRecurso(Recurso recurso) throws Banco_de_DadosException {
        recursoDAO.insere(recurso);
    }

    @Override
    public Recurso buscaRecurso(String nome, String predio, String tipo) throws Banco_de_DadosException {
        return recursoDAO.busca(nome, predio, tipo);
    }

    @Override
    public Recurso buscaRecursoPorID(int idRecurso) throws Banco_de_DadosException {
        return recursoDAO.buscaPorID(idRecurso);
    }

    @Override
    public List<Recurso> listaTodosRecursos() throws Banco_de_DadosException {
        return recursoDAO.listaTodos();
    }

    @Override
    public List<Recurso> listaRecursos(String predio, String tipo) throws Banco_de_DadosException {
        return recursoDAO.lista(predio, tipo);
    }

    @Override
    public void excluirRecurso(Recurso recurso) throws Banco_de_DadosException {
        recursoDAO.excluir(recurso);
    }

    @Override
    public void insereReserva(Reserva reserva) throws Banco_de_DadosException {
        reservaDAO.insere(reserva);
    }

    @Override
    public List<Reserva> listaTodasReservas() throws Banco_de_DadosException {
        return reservaDAO.lista();
    }

    @Override
    public List<Reserva> listaReservasPorUsuario(String numeroUSP) throws Banco_de_DadosException {
        return reservaDAO.listaPorUsuario(numeroUSP);
    }

    @Override
    public void excluirReserva(Reserva reserva) throws Banco_de_DadosException {
        reservaDAO.excluir(reserva);
    }

    @Override
    public List<Reserva> listaReservasMensais(String numeroUSP, String data_ftf) throws Banco_de_DadosException {
        return reservaDAO.listaMensais(numeroUSP, data_ftf);
    }

    @Override
    public List<Reserva> buscaReservaDia(String data_ftf, Recurso rec) throws Banco_de_DadosException {
        return reservaDAO.buscaDia(data_ftf, rec);
    }

    @Override
    public void atualizaReservas() throws Banco_de_DadosException {
        reservaDAO.atualiza();
    }

    @Override
    public void insereLaboratorio(Recurso recurso) throws Banco_de_DadosException {
       recursoDAO.insereLab(recurso);   
    }
}
