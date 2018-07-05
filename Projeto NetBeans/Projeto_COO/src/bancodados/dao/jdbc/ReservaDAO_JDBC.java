package bancodados.dao.jdbc;

import bancodados.Banco_de_DadosException;
import bancodados.Log;
//Necessário que haja acesso aos dados dos objetos auxiliares
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import objetos.Recurso;
//Necessário que haja acesso aos objetos auxiliares Reserva e Usuario
import objetos.Reserva;
import objetos.Usuario;
import bancodados.dao.RecursoDAO;
import bancodados.dao.ReservaDAO;
import bancodados.dao.UsuarioDAO;

/**
 *
 * @author ferna
 */
public class ReservaDAO_JDBC extends ConectorDAO_JDBC implements ReservaDAO {

    public ReservaDAO_JDBC() throws Banco_de_DadosException {
        super();
    }
    

    private UsuarioDAO usuariodao;
    private RecursoDAO recursodao;

    @Override
    public void insere(Reserva reserva) throws Banco_de_DadosException {
        try {
            abreConexao();
            preparaComandoSQL("INSERT INTO RESERVA(HINICIO, HFIM, DATA, "
                    + "ID_RECURSO, ID_USUARIO, FINALIZADA) VALUES(?,?,?,?,?,?)");
            pstmt.setString(1, reserva.getHoraInicio());
            pstmt.setString(2, reserva.getHoraFim());
            pstmt.setString(3, reserva.getData());
            pstmt.setString(4, reserva.getRecurso().getId_Recurso());
            pstmt.setString(5, reserva.getUsuario().getId_Usuario());
            pstmt.setBoolean(6, false);
            pstmt.execute();
            fechaConexao();
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Erro ao definir os parâmetros da query.");
        }
    }

    @Override
    public List<Reserva> lista() throws Banco_de_DadosException {
        List<Reserva> resultado = null;
        try {
            abreConexao();
            preparaComandoSQL("SELECT * FROM RESERVAS;");
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
            fechaConexao();
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Problemas ao ler os parâmetros da consulta.");
        }
        return resultado;
    }

    @Override
    public List<Reserva> listaPorUsuario(String nUSP) throws Banco_de_DadosException {
        List<Reserva> reservaUsuario = new ArrayList<>();
        try {
            abreConexao();
            usuariodao = new UsuarioDAO_JDBC();
            Usuario u = usuariodao.busca(nUSP);
            if (u != null) {
                int idu = Integer.parseInt(u.getId_Usuario());
                preparaComandoSQL("SELECT * FROM RESERVA WHERE ID_USUARIO = ? AND DATA > NOW()");
                pstmt.setInt(1, idu);
                rs = pstmt.executeQuery();
                while (rs.next()) {
                    Reserva r = new Reserva();
                    r.setHoraInicio(rs.getString(2));
                    r.setHoraFim(rs.getString(3));
                    r.setData(rs.getString(4));
                    RecursoDAO recursodao = new RecursoDAO_JDBC();
                    Recurso rec = recursodao.buscaPorID(rs.getInt(5));
                    r.setRecurso(rec);
                    reservaUsuario.add(r);
                }
            }
            fechaConexao();
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("");
        }
        return reservaUsuario;
    }

    @Override
    public void excluir(Reserva reserva) throws Banco_de_DadosException {
        try {
            abreConexao();
            preparaComandoSQL("DELETE FROM RESERVA WHERE DATA=? "
                    + "AND HINICIO=? AND HFIM=? AND ID_RECURSO=?");
            pstmt.setString(1, reserva.getData());
            pstmt.setString(2, reserva.getHoraInicio());
            pstmt.setString(3, reserva.getHoraFim());
            pstmt.setString(4, reserva.getRecurso().getId_Recurso());
            rs = pstmt.executeQuery();
            fechaConexao();
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Problemas ao ler os parâmtros da consulta.");
        }
    }

    //Métodos adicionais criados no GerenciadorBaseDadosJDBC
    @Override
    public List<Reserva> listaMensais(String numeroUSP, String data_ftf) throws
            Banco_de_DadosException {
        List<Reserva> reservaUsuario = new ArrayList<>();

        try {
            abreConexao();
            usuariodao = new UsuarioDAO_JDBC();
            Usuario u = usuariodao.busca(numeroUSP);
            if (u.getId_Usuario() != null) {
                int idu = Integer.parseInt(u.getId_Usuario());
                preparaComandoSQL("SELECT * FROM RESERVA WHERE "
                        + "ID_USUARIO = ? AND DATA = MONTH(?)");
                pstmt.setInt(1, idu);
                pstmt.setString(2, data_ftf);
                rs = pstmt.executeQuery();
                while (rs.next()) {
                    Reserva r = new Reserva();
                    r.setHoraInicio(rs.getString(2));
                    r.setHoraFim(rs.getString(3));
                    r.setData(rs.getString(4));
                    recursodao = new RecursoDAO_JDBC();
                    Recurso rec = recursodao.buscaPorID(rs.getInt(5));
                    r.setRecurso(rec);
                    reservaUsuario.add(r);
                }
            }
            fechaConexao();
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("");
        }
        return reservaUsuario;
    }

    @Override
    public List<Reserva> buscaDia(String data_ftf, Recurso rec) throws Banco_de_DadosException {
        List<Reserva> listaReservasDiaRecurso = new ArrayList<>();
        try {
            abreConexao();
            preparaComandoSQL("SELECT * FROM RESERVA WHERE DATA = ? AND ID_RECURSO = ?");
            pstmt.setString(1, data_ftf);
            pstmt.setString(2, rec.getId_Recurso());
            rs = pstmt.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    Reserva r = new Reserva();
                    r.setHoraInicio(rs.getString(2));
                    r.setHoraFim(rs.getString(3));
                    r.setData(rs.getString(4));
                    UsuarioDAO usuariodao = new UsuarioDAO_JDBC();
                    Usuario u = usuariodao.busca(rs.getString(6));
                    r.setUsuario(u);
                    r.setRecurso(rec);
                    listaReservasDiaRecurso.add(r);
                }
            }
            fechaConexao();
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Problemas ao fazer a consulta no"
                    + "banco de dados.");
        }
        return listaReservasDiaRecurso;
    }

    @Override
    public void atualiza() throws Banco_de_DadosException {
        Date data_agora = new Date();
        String data = (String) new SimpleDateFormat("yyyy-MM-dd HH:mm").format(data_agora);
        String ano_mes_dia = data.substring(0, 10);
        String hora = data.substring(11, data.length());
        System.out.println(data);
        System.out.println(ano_mes_dia);
        System.out.println(hora);
        try {
            preparaComandoSQL("UPDATE RESERVA SET FINALIZADA=TRUE "
                    + "WHERE DATA=? AND HINICIO=? AND HFIM=?");
            pstmt.setString(1, ano_mes_dia);
            pstmt.setString(2, hora);
            pstmt.setString(3, hora);
            int i = pstmt.executeUpdate();
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Problemas ao ler os parâmtros da consulta.");
        }
    }
}
