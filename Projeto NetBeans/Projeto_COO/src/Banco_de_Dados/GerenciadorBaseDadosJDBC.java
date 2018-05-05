package Banco_de_Dados;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import objetos.*;

public class GerenciadorBaseDadosJDBC extends ConectorJDBC implements
        GerenciadorBaseDados {

    private static final String PASSWORD = "";
    private static final String USER = "root";
    private static final String HOST = "localhost";
    private static final String DB_NAME = "coo2018";
    private boolean jaCriouBD;

    public GerenciadorBaseDadosJDBC() throws Banco_de_DadosException {
        super(DB.MYSQL);

        try {
            criaBancoDeDados();
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException(
                    "Erro ao tentar criar o banco de dados.");
        }
    }

    protected String getUser() {
        return USER;
    }

    @Override
    protected String getPassword() {
        return PASSWORD;
    }

    @Override
    protected String getDbHost() {
        return HOST;
    }

    @Override
    protected String getDbName() {
        return jaCriouBD ? DB_NAME : "";
    }

    public void insereUsuario(Usuario usuario) throws Banco_de_DadosException {
        abreConexao();
        preparaComandoSQL("insert into Usuario (nome, nusp, email, telefone, tipo, curso) values (?, ?, ?, ?)");

        try {
            //NOME
            pstmt.setString(1, usuario.getNome());
            pstmt.setString(2, usuario.getNUSP());
            pstmt.setString(3, usuario.getEmail());
            pstmt.setInt(4, usuario.getTelefone());
            pstmt.setString(5, usuario.getCurso());
            pstmt.setString(6, usuario.getCargo());
            pstmt.execute();
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Erro ao setar os parâmetros da consulta.");
        }

        fechaConexao();
    }

    public void insereRecurso(Recurso recurso) throws Banco_de_DadosException {
        abreConexao();
        preparaComandoSQL("insert into Recurso (nome, predio, tipo) values (?, ?, ?)");

        try {
            pstmt.setString(1, recurso.getNome());
            pstmt.setString(2, recurso.getPredio());
            pstmt.setString(3, recurso.getTipo());
            pstmt.execute();
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Erro ao setar os parâmetros da consulta.");
        }

        fechaConexao();
    }
    
    public void insereReserva(Reserva reserva) throws Banco_de_DadosException {
       abreConexao();
        preparaComandoSQL("INSERT INTO RESERVA(hinicio, hfim, data, id_recurso, id_usuario, finalizada) VALUES(?,?,?,?,?,false)");
    }

    public Usuario buscaUsuario(String numeroUSP) throws Banco_de_DadosException {
        abreConexao();
        preparaComandoSQL("select * from Usuario where NUSP='" + numeroUSP + "'");
        Usuario usuario = null;

        try {
            rs = pstmt.executeQuery();

            if (rs.next()) {
                //baseado na ordem do SQL
                String nome = rs.getString(1);
                String nusp = rs.getString(2);
                String email = rs.getString(3);
                String cargo = rs.getString(4);
                String curso = rs.getString(5);
                String telefone = rs.getString(6);
                //Usuario(String nome, String nUSP,String email, String telefone, String curso, String cargo){
                usuario = new Usuario(nome, nusp, email, telefone, curso, cargo);
            }
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException(
                    "Problemas ao ler o resultado da consulta.");
        }

        fechaConexao();
        return usuario;
    }

    public LinkedList<Usuario> listaUsuarios() throws Banco_de_DadosException {
        LinkedList<Usuario> usuarios = new LinkedList<Usuario>();
        abreConexao();
        preparaComandoSQL("select codigo, nome from Usuario");

        try {
            rs = pstmt.executeQuery();

            while (rs.next()) {
                int codigo = rs.getInt(1);
                String nome = rs.getString(2);
                //Usuario usuario = new Usuario(nome, codigo);
                //usuarios.add(usuario);
            }
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException(
                    "Problemas ao ler o resultado da consulta.");
        }
        fechaConexao();
        return usuarios;
    }

    public List<Recurso> listaRecursos(String predio, String tipo) throws Banco_de_DadosException {
        List<Recurso> recursos = null;
        try {
            preparaComandoSQL("SELECT * FROM recurso WHERE PREDIO = '?' AND TIPO = '?'");
            pstmt.setString(1, predio);
            pstmt.setString(2, tipo);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                String nome = rs.getString(1); //nome
                String recTipo = rs.getString(2);
                String recPredio = rs.getString(3);
                Recurso r = new Recurso();
                r.setNome(nome);
                r.setPredio(recPredio);
                r.setTipo(recTipo);
                recursos.add(r);
            }
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Problemas ao ler o resultado da consulta.");
        }
        return recursos;
    }

    public List<Recurso> listaRecursos() throws Banco_de_DadosException {
        List<Recurso> recursos = null;
        try {
            preparaComandoSQL("SELECT * FROM Recursos");
            rs = pstmt.executeQuery();
            while (rs.next()) {
                String nome = rs.getString(1); //nome
                String recTipo = rs.getString(2);
                String recPredio = rs.getString(3);
                Recurso r = new Recurso();
                r.setNome(nome);
                r.setPredio(recPredio);
                r.setTipo(recTipo);
                recursos.add(r);
            }
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Problemas ao ler o resultado da consulta.");
        }
        return recursos;
    }


    public List<Reserva> listaReservasDoUsuario(String numeroUSP) throws Banco_de_DadosException {
        List<Reserva> reservaUsuario = null;
        try {
            preparaComandoSQL("SELECT IDUSUARIO FROM USUARIO WHERE NUSP='" + numeroUSP + "'");
            rs = pstmt.executeQuery();
            int a = 0; //apenas para existir
            while (rs.next()) {
                a = rs.getInt(1);
            }
            preparaComandoSQL("SELECT * FROM RESERVA WHERE ID_USUARIO=?");
            pstmt.setInt(1, a);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                //PEGAR CADA RESERVA E COLOCAR NA RESERVAUSUARIO
            }
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("");
        }
        return reservaUsuario;
    }

    private void criaBancoDeDados() throws SQLException, Banco_de_DadosException {
        abreConexao();
        jaCriouBD = true;
        preparaComandoSQL("create database if not exists " + getDbName());
        pstmt.execute();
        fechaConexao();
    }

    @Override
    public Reserva buscaReserva() throws Banco_de_DadosException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Reserva> listaReservas() throws Banco_de_DadosException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
