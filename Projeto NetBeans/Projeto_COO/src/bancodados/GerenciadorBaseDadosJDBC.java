package bancodados;

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
    private static final String DB_NAME = "Dioniso";
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

    private void criaBancoDeDados() throws SQLException, Banco_de_DadosException {
        abreConexao();
        jaCriouBD = true;
        preparaComandoSQL("create database if not exists " + getDbName());
        pstmt.execute();
        fechaConexao();
    }

    // ---------------  USUARIO  -----------------------
    public void insereUsuario(Usuario usuario) throws Banco_de_DadosException {
        abreConexao();
        preparaComandoSQL("insert into USUARIO (NOME, NUSP, EMAIL, TELEFONE, CARGO, CURSO) values (?, ?, ?, ?, ?, ?)");

        try {
            pstmt.setString(1, usuario.getNome());
            pstmt.setString(2, usuario.getNUSP());
            pstmt.setString(3, usuario.getEmail());
            pstmt.setString(4, usuario.getTelefone());
            pstmt.setString(5, usuario.getCargo());
            pstmt.setString(6, usuario.getCurso());
            pstmt.execute();
            //comentario
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Erro ao setar os parâmetros da consulta.");
        }

        fechaConexao();
    }

    public Usuario buscaUsuario(String numeroUSP) throws Banco_de_DadosException {
        abreConexao();
        preparaComandoSQL("select * from Usuario where NUSP='" + numeroUSP + "'");
        Usuario usuario = null;

        try {
            rs = pstmt.executeQuery();

            if (rs.next()) {
                //baseado na ordem do SQL
                String id_usuario = rs.getString(0);
                String nome = rs.getString(1);
                String nusp = rs.getString(2);
                String email = rs.getString(3);
                String cargo = rs.getString(4);
                String curso = rs.getString(5);
                String telefone = rs.getString(6);
                //Usuario(String nome, String nUSP,String email, String telefone, String curso, String cargo){
                usuario = new Usuario();
                usuario.setCargo(cargo);
                usuario.setId_Usuario(id_usuario);
                usuario.setNUSP(nusp);
                usuario.setNome(nome);
                usuario.setCurso(curso);
                usuario.setEmail(email);
                usuario.setTelefone(telefone);
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
        preparaComandoSQL("select nUSP, nome from Usuario");

        try {
            rs = pstmt.executeQuery();

            while (rs.next()) {
                String id_usuario = rs.getString(0);
                String NUSP = rs.getString(1);
                String nome = rs.getString(2);
                Usuario usuario = new Usuario();
                usuario.setId_Usuario(id_usuario);
                usuario.setNome(nome);
                usuario.setNUSP(NUSP);
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException(
                    "Problemas ao ler o resultado da consulta.");
        }
        fechaConexao();
        return usuarios;
    }
    
        public void excluirUsuario(String nUSP) throws Banco_de_DadosException {
        preparaComandoSQL("DELETE FROM USUARIO WHERE NUSP='?'");
        try {
            pstmt.setString(1, nUSP);
            rs = pstmt.executeQuery();
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Problemas ao ler os parâmtros da consulta.");
        }
    }


    // -----------------  RECURSO  -------------------------
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
        public List<Recurso> listaRecursos(String predio, String tipo) throws Banco_de_DadosException {
        List<Recurso> recursos = null;
        try {
            preparaComandoSQL("SELECT nome FROM recurso WHERE PREDIO = '?' AND TIPO = '?'");
            pstmt.setString(1, predio);
            pstmt.setString(2, tipo);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                String nome = rs.getString(1); //nome
                Recurso r = new Recurso();
                r.setNome(nome);
                r.setPredio(predio);
                r.setTipo(tipo);
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

    public Recurso buscaRecurso(int idRecurso) throws Banco_de_DadosException {
        Recurso r = null;
        try {
            preparaComandoSQL("SELECT NOME,PREDIO,TIPO FROM Recursos WHERE IDRECURSO=?");
            rs = pstmt.executeQuery();
            while (rs.next()) {
                String nome = rs.getString(1);
                String predio = rs.getString(2);
                String tipo = rs.getString(3);
                r = new Recurso();
                r.setNome(nome);
                r.setPredio(predio);
                r.setTipo(tipo);
            }
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Problemas ao ler o resultado da consulta.");
        }
        return r;
    }

    // ----------------------  RESERVA  --------------------------
    public void insereReserva(Reserva reserva) throws Banco_de_DadosException {
        abreConexao();
        preparaComandoSQL("INSERT INTO RESERVA(hinicio, hfim, data, id_recurso, id_usuario, finalizada) VALUES(?,?,?,?,?,?)");

        try {
            pstmt.setString(1, reserva.getHoraInicio());
            pstmt.setString(2, reserva.getHoraFim());
            pstmt.setString(3, reserva.getData());
            pstmt.setString(4, reserva.getRecurso().getId_Recurso());
            pstmt.setString(5, reserva.getUsuario().getId_Usuario());
            pstmt.setBoolean(6, false);
            pstmt.execute();
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Erro ao definir os parâmetros da query.");
        }
    }



    public List<Reserva> listaReservasDoUsuario(String numeroUSP) throws Banco_de_DadosException {
        List<Reserva> reservaUsuario = null;
        try {
            Usuario u = buscaUsuario(numeroUSP);
            preparaComandoSQL("SELECT * FROM RESERVA WHERE ID_USUARIO='?'");
            pstmt.setString(1, u.getId_Usuario());
            rs = pstmt.executeQuery();
            while (rs.next()) {
                Reserva r = new Reserva();
                r.setHoraInicio(rs.getString(2));
                r.setHoraFim(rs.getString(3));
                r.setData(rs.getString(4));
                Recurso rec = buscaRecurso(rs.getInt(5));
                r.setRecurso(rec);
                reservaUsuario.add(r);
            }
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("");
        }
        return reservaUsuario;
    }

    @Override
    public Reserva buscaReserva() throws Banco_de_DadosException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Reserva> listaReservas() throws Banco_de_DadosException {
        List<Reserva> resultado = null;
        preparaComandoSQL("SELECT * FROM RESERVAS;");
        try {
            rs = pstmt.executeQuery();
            while (rs.next()) {
                Reserva r = new Reserva();
                r.setHoraInicio(rs.getString(2)); //isso vai dar certo depois
                r.setHoraFim(rs.getString(3));
                r.setData(rs.getString(4));

                Recurso rc = new Recurso();
                rc.setId_Recurso(rs.getString(5));

                Usuario u = new Usuario();
                u.setId_Usuario(rs.getString(6));

                r.setRecurso(rc);
                r.setUsuario(u);

                resultado.add(r);
            }
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Problemas ao ler os parâmetros da consulta.");
        }
        return resultado;
    }

    public void excluirRecurso(Recurso r) throws Banco_de_DadosException {
        preparaComandoSQL("DELETE FROM  RECURSO WHERE NOME=? AND PREDIO=? AND TIPO=?");
        try {
            pstmt.setString(1, r.getNome());
            pstmt.setString(2, r.getPredio());
            pstmt.setString(3, r.getTipo());
            rs = pstmt.executeQuery();
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Problemas ao ler os parâmtros da consulta.");
        }
    }

    public void excluirReserva(Reserva r) throws Banco_de_DadosException {
        preparaComandoSQL("DELETE FROM RESERVA WHERE DATA=? AND HINICIO=? AND HFIM=? AND ID_RECURSO=?");
        try {
            pstmt.setString(1, r.getData());
            pstmt.setString(2, r.getHoraInicio());
            pstmt.setString(3, r.getHoraFim());
            pstmt.setString(4, r.getRecurso().getId_Recurso());
            rs = pstmt.executeQuery();
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Problemas ao ler os parâmtros da consulta.");
        }
    }

}
