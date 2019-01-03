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
import objetos.Curso;
import objetos.Predio;
import objetos.Recurso;
import objetos.Reserva;
import objetos.Tipo;
import objetos.Usuario;

/**
 *
 * @author Fernando Karchiloff
 */
public class FachadaDAO_JDBC implements FachadaDAO{
    
    private final TipoDAO tipoDAO;
    private final CursoDAO cursoDAO;
    private final PredioDAO predioDAO;
    private final UsuarioDAO usuarioDAO;
    private final RecursoDAO recursoDAO;
    private final ReservaDAO reservaDAO;
    
    public FachadaDAO_JDBC() throws Banco_de_DadosException{
        AbstractFactoryDAO factoryDAO = new FactoryDAO_JDBC();
        tipoDAO = factoryDAO.createTipoDAO();
        cursoDAO = factoryDAO.createCursoDAO();
        predioDAO = factoryDAO.createPredioDAO();
        usuarioDAO = factoryDAO.createUsuarioDAO();
        recursoDAO = factoryDAO.createRecursoDAO();
        reservaDAO = factoryDAO.createReservaDAO();
        
        //Criacao do banco de dados
        new CriacaoBancoDados(tipoDAO, cursoDAO, predioDAO, usuarioDAO,
                recursoDAO, reservaDAO).criaTabelas();
    }
    
    @Override
    public void insereTipo(Tipo tipo) throws Banco_de_DadosException {
        tipoDAO.insere(tipo);
    }

    @Override
    public Tipo buscaTipo(String nome) throws Banco_de_DadosException {
        return tipoDAO.busca(nome);
    }

    @Override
    public Tipo buscaTipoPorID(int idTipo) throws Banco_de_DadosException {
        return tipoDAO.buscaPorID(idTipo);
    }

    @Override
    public List<Tipo> listaTipos() throws Banco_de_DadosException {
        return tipoDAO.listaTodos();
    }

    @Override
    public void excluiTipo(Tipo tipo) throws Banco_de_DadosException {
        tipoDAO.excluir(tipo);
    }

    @Override
    public void insereCurso(Curso curso) throws Banco_de_DadosException {
        cursoDAO.insere(curso);
    }

    @Override
    public Curso buscaCurso(String nome) throws Banco_de_DadosException {
        return cursoDAO.busca(nome);
    }

    @Override
    public Curso buscaCursoPorID(int idCurso) throws Banco_de_DadosException {
        return cursoDAO.buscaPorID(idCurso);
    }

    @Override
    public List<Curso> listaCursos() throws Banco_de_DadosException {
        return cursoDAO.listaTodos();
    }

    @Override
    public void excluiCurso(Curso curso) throws Banco_de_DadosException {
        cursoDAO.excluir(curso);
    }

    @Override
    public void inserePredio(Predio predio) throws Banco_de_DadosException {
        predioDAO.insere(predio);
    }

    @Override
    public Predio buscaPredio(String nome) throws Banco_de_DadosException {
        return predioDAO.busca(nome);
    }

    @Override
    public Predio buscaPredioPorID(int idPredio) throws Banco_de_DadosException {
        return predioDAO.buscaPorID(idPredio);
    }

    @Override
    public List<Predio> listaPredios() throws Banco_de_DadosException {
        System.out.println("jdbc");
        return predioDAO.listaTodos();
    }

    @Override
    public void excluiPredio(Predio predio) throws Banco_de_DadosException {
        predioDAO.excluir(predio);
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
    public boolean verificaQuantCoordenador(Curso curso) throws Banco_de_DadosException {
        return usuarioDAO.verificaQuantCoordenador(curso);
    }

    @Override
    public void insereRecurso(Recurso recurso) throws Banco_de_DadosException {
        recursoDAO.insere(recurso);
    }

    @Override
    public Recurso buscaRecurso(String nome, Predio predio, Tipo tipo) throws Banco_de_DadosException {
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
    public List<Recurso> listaRecursos(Predio predio, Tipo tipo) throws Banco_de_DadosException {
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
