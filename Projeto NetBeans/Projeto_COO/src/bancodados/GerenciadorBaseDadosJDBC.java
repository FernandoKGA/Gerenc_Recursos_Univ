package bancodados;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import objetos.*;
import bancodados.dao.*;
import bancodados.dao.jdbc.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GerenciadorBaseDadosJDBC extends ConectorJDBC implements
        GerenciadorBaseDados {

    private static Propriedades_BD prop;
    private static final String bancodados = "Dioniso";
    private static boolean jaCriouBD;

    public GerenciadorBaseDadosJDBC() throws Banco_de_DadosException {
        super(DB.MYSQL);
        try {
            prop = new Propriedades_BD();
            criaBancoDeDados();
            criaTabelaUsuario();
            criaTabelaRecurso();
            criaTabelaReserva();
        } catch (IOException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Erro na leitura"
                    + " do arquivo de propriedades!");
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException(
                    "Erro ao tentar criar o banco de dados.");
        }
    }

    @Override
    protected String getUser() {
        return prop.getUser();
    }

    @Override
    protected String getPassword() {
        return prop.getPassword();
    }

    @Override
    protected String getDbHost() {
        return prop.getHost();
    }

    @Override
    protected String getDbName() {
        return jaCriouBD ? prop.getDb_name() : "";
    }

    //-----------CRIACAO DO BANCO-----------
    private void criaBancoDeDados() throws SQLException, Banco_de_DadosException {
        abreConexaoSemBD();
        jaCriouBD = true;
        String wtf = getDbName();
        String query = String.format("CREATE DATABASE IF NOT EXISTS %s", wtf);
        preparaComandoSQL(query);
        pstmt.execute();
        fechaConexao();
    }

    private void criaTabelaUsuario() throws SQLException, Banco_de_DadosException {
        abreConexao();
        String query = "CREATE TABLE IF NOT EXISTS `USUARIO` ("
                + " `IDUSUARIO` int(10) unsigned NOT NULL AUTO_INCREMENT,"
                + " `NOME` varchar(50) NOT NULL,"
                + " `NUSP` varchar(11) NOT NULL,"
                + " `EMAIL` varchar(50) NOT NULL,"
                + " `CARGO` VARCHAR(20) NOT NULL,"
                + " `CURSO` VARCHAR(3) NOT NULL,"
                + " `TELEFONE` varchar(11) NOT NULL,"
                + " PRIMARY KEY (`IDUSUARIO`),"
                + " UNIQUE KEY `NUSP` (`NUSP`),"
                + " UNIQUE KEY `TELEFONE_UNIQUE` (`TELEFONE`),"
                + " UNIQUE KEY `EMAIL_UNIQUE` (`EMAIL`))";
        preparaComandoSQL(query);
        pstmt.execute();
        fechaConexao();
    }

    private void criaTabelaRecurso() throws SQLException, Banco_de_DadosException {
        abreConexao();
        String query = "CREATE TABLE IF NOT EXISTS `RECURSO` ("
                + "`IDRECURSO` int(10) unsigned NOT NULL AUTO_INCREMENT,"
                + "`NOME` varchar(50) NOT NULL,"
                + "`PREDIO` varchar(50) NOT NULL,"
                + "`TIPO` varchar(50) NOT NULL,"
                + "`CURSO` varchar(50),"
                + "PRIMARY KEY (`IDRECURSO`),"
                + "UNIQUE KEY `IDRECURSO_UNIQUE` (`IDRECURSO`))";
        preparaComandoSQL(query);
        pstmt.execute();
        fechaConexao();
    }

    private void criaTabelaReserva() throws SQLException, Banco_de_DadosException {
        abreConexao();
        String query = "CREATE TABLE IF NOT EXISTS `RESERVA` ("
                + "`IDRESERVA` int(10) unsigned NOT NULL AUTO_INCREMENT,"
                + "`HINICIO` varchar(5) NOT NULL,"
                + "`HFIM` varchar(5) NOT NULL,"
                + "`DATA` date NOT NULL,"
                + "`ID_RECURSO` int(10) unsigned NOT NULL,"
                + "`ID_USUARIO` int(10) unsigned NOT NULL,"
                + "`FINALIZADA` tinyint(4) NOT NULL,"
                + "PRIMARY KEY (`IDRESERVA`),"
                + "UNIQUE KEY `IDRESERVA_UNIQUE` (`IDRESERVA`),"
                + "KEY `ID_RECURSO_idx` (`ID_RECURSO`),"
                + "KEY `ID_USUARIO_idx` (`ID_USUARIO`),"
                + "CONSTRAINT `fk_ID_RECURSO_1` FOREIGN KEY (`ID_RECURSO`) REFERENCES `RECURSO` (`IDRECURSO`) ON DELETE NO ACTION ON UPDATE NO ACTION,"
                + "CONSTRAINT `fk_ID_USUARIO_1` FOREIGN KEY (`ID_USUARIO`) REFERENCES `USUARIO` (`IDUSUARIO`) ON DELETE NO ACTION ON UPDATE NO ACTION)";
        preparaComandoSQL(query);
        pstmt.execute();
        fechaConexao();
    }

    // ---------------  USUARIO  -----------------------
    /*public void insereUsuario(Usuario usuario) throws Banco_de_DadosException {
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
        preparaComandoSQL("select * from USUARIO where NUSP='" + numeroUSP + "'");
        Usuario usuario = null;

        try {
            rs = pstmt.executeQuery();

            if (rs.next()) {
                //baseado na ordem do SQL
                String id_usuario = rs.getString(1);
                String nome = rs.getString(2);
                String nusp = rs.getString(3);
                String email = rs.getString(4);
                String cargo = rs.getString(5);
                String curso = rs.getString(6);
                String telefone = rs.getString(7);
                usuario = new Usuario();
                usuario.setCargo(cargo);
                usuario.setId_Usuario(id_usuario);
                System.out.println("ID USUARIO: " + id_usuario);
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
        preparaComandoSQL("select * from USUARIO");

        try {
            rs = pstmt.executeQuery();

            while (rs.next()) {
                String NUSP = rs.getString(2);
                String nome = rs.getString(3);
                String telefone = rs.getString(4);
                String email = rs.getString(5);
                String cargo = rs.getString(6);
                String curso = rs.getString(7);
                Usuario usuario = new Usuario();
                usuario.setNome(nome);
                usuario.setNUSP(NUSP);
                usuario.setTelefone(telefone);
                usuario.setEmail(email);
                usuario.setCargo(cargo);
                usuario.setCurso(curso);
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
        String query = String.format("DELETE FROM USUARIO WHERE "
                + "NUSP = '%s' ", nUSP);
        System.out.println(query);
        try {
            preparaComandoSQL(query);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Problemas ao ler os parâmetros da consulta.");
        }
    }*/
    @Override
    public boolean verificaQuantCoordenador(String curso) throws Banco_de_DadosException {
        try {
            abreConexao();
            preparaComandoSQL("SELECT COUNT(nome) FROM USUARIO WHERE CURSO=? AND CARGO="
                    + "'COORDENADOR'");
            pstmt.setString(1, curso);
            rs = pstmt.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    int quantidade = rs.getInt(1);
                    if (quantidade >= 2) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException();
        }
    }

    // -----------------  RECURSO  -------------------------
    @Override
    public void insereRecurso(Recurso recurso) throws Banco_de_DadosException {
        abreConexao();
        preparaComandoSQL("insert into RECURSO (NOME, PREDIO, TIPO) values (?, ?, ?)");

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

    @Override
    public List<Recurso> listaRecursos(String predio, String tipo) throws Banco_de_DadosException {
        List<Recurso> recursos = new LinkedList<>();
        try {
            abreConexao();
            preparaComandoSQL("SELECT NOME,IDRECURSO FROM RECURSO WHERE PREDIO = ? AND TIPO = ?");
            pstmt.setString(1, predio);
            pstmt.setString(2, tipo);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                String nome = rs.getString(1); //nome
                String idrecurso = rs.getString(2); //idrecurso
                Recurso r = new Recurso();
                r.setNome(nome);
                r.setId_Recurso(idrecurso);
                r.setPredio(predio);
                r.setTipo(tipo);
                recursos.add(r);
            }
            fechaConexao();
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Problemas ao ler o resultado da consulta.");
        }
        return recursos;
    }

    @Override
    public List<Recurso> listaRecursos() throws Banco_de_DadosException {
        List<Recurso> recursos = new ArrayList<>();
        try {
            abreConexao();
            preparaComandoSQL("SELECT * FROM RECURSO");
            rs = pstmt.executeQuery();
            while (rs.next()) {
                String recNome = rs.getString(2); //nome
                String recPredio = rs.getString(3); //predio
                String recTipo = rs.getString(4);  //tipo
                Recurso r = new Recurso();
                r.setNome(recNome);
                r.setPredio(recPredio);
                r.setTipo(recTipo);
                recursos.add(r);
            }
            fechaConexao();
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Problemas ao ler o resultado da consulta.");
        }
        return recursos;
    }

    @Override
    public Recurso buscaRecurso(String nome, String predio, String tipo) throws Banco_de_DadosException {
        Recurso r = null;
        try {
            abreConexao();
            preparaComandoSQL("SELECT IDRECURSO FROM RECURSO "
                    + "WHERE NOME=? AND PREDIO=? AND TIPO=?");
            pstmt.setString(1, nome);
            pstmt.setString(2, predio);
            pstmt.setString(3, tipo);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                String idrecurso = rs.getString(1);
                r = new Recurso();
                r.setNome(nome);
                r.setPredio(predio);
                r.setTipo(tipo);
                r.setId_Recurso(idrecurso);
            }
            fechaConexao();
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Problemas ao ler o resultado da consulta.");
        }
        return r;
    }

    @Override
    public Recurso buscaRecursoID(int idRecurso) throws Banco_de_DadosException {
        Recurso r = null;
        try {
            abreConexao();
            preparaComandoSQL("SELECT NOME,PREDIO,TIPO FROM RECURSO WHERE IDRECURSO=?");
            pstmt.setInt(1, idRecurso);
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
            fechaConexao();
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Problemas ao ler o resultado da consulta.");
        }
        return r;
    }

    @Override
    public void excluirRecurso(Recurso r) throws Banco_de_DadosException {
        preparaComandoSQL("DELETE FROM  RECURSO WHERE NOME=? AND PREDIO=? AND TIPO=?");
        try {
            abreConexao();
            pstmt.setString(1, r.getNome());
            pstmt.setString(2, r.getPredio());
            pstmt.setString(3, r.getTipo());
            pstmt.executeUpdate();
            fechaConexao();
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Problemas ao ler os parâmtros da consulta.");
        }
    }

    // ------------------- VARIAÇÃO PARA RECURSO - LABORATÓRIO -----------------
    @Override
    public void insereLaboratorio(Laboratorio l) throws Banco_de_DadosException {
        try {
            abreConexao();
            preparaComandoSQL("insert into Recurso (nome, predio, tipo, curso) values (?, ?, ?, ?)");

            pstmt.setString(1, l.getNome());
            pstmt.setString(2, l.getPredio());
            pstmt.setString(3, l.getTipo()); //que obviamente vai ser LABORATORIO
            pstmt.setString(4, l.getCurso());
            pstmt.execute();
            fechaConexao();
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Erro ao setar os parâmetros da consulta.");
        }

        fechaConexao();
    }

    // -------------------- FIM DO RECURSO -----------------------
    // ----------------------  RESERVA  --------------------------
    @Override
    public void insereReserva(Reserva reserva) throws Banco_de_DadosException {

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
    public List<Reserva> listaReservasDoUsuario(String numeroUSP) throws Banco_de_DadosException {
        List<Reserva> reservaUsuario = new ArrayList<>();
        try {
            abreConexao();
            usuarioDAO usuariodao = new usuarioDAO_JDBC();
            Usuario u = usuariodao.busca(numeroUSP);
            System.out.println(u.getNUSP());
            if (u != null) {
                int idu = Integer.parseInt(u.getId_Usuario());
                preparaComandoSQL("SELECT IDRESERVA,HINICIO,HFIM,DATA,ID_RECURSO,NOME,PREDIO,TIPO,CURSO,FINALIZADA "
                        + "FROM RESERVA INNER JOIN RECURSO ON RESERVA.ID_RECURSO=RECURSO.IDRECURSO "
                        + "WHERE ID_USUARIO = ? AND DATA >= DATE(NOW()) AND FINALIZADA = FALSE;");
                pstmt.setInt(1, idu);
                rs = pstmt.executeQuery();
                while (rs.next()) {
                    Reserva r = new Reserva();
                    r.setHoraInicio(rs.getString(2));
                    r.setHoraFim(rs.getString(3));
                    r.setData(rs.getString(4));
                    Recurso rec = new Recurso();
                    rec.setId_Recurso(rs.getString(5));
                    rec.setNome(rs.getString(6));
                    rec.setPredio(rs.getString(7));
                    rec.setTipo(rs.getString(8));
                    r.setRecurso(rec);
                    r.setUsuario(u);
                    reservaUsuario.add(r);
                }
            }
            fechaConexao();
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Problemas para obter lista de"
                    + " reservas do usuário!");
        }
        return reservaUsuario;
    }

    @Override
    public List<Reserva> listaReservasMensaisDoUsuario(String numeroUSP,
            String data_ftf) throws Banco_de_DadosException {
        List<Reserva> reservaUsuario = new ArrayList<>();

        try {
            abreConexao();
            usuarioDAO usuariodao = new usuarioDAO_JDBC();
            Usuario u = usuariodao.busca(numeroUSP);
            if (u.getId_Usuario() != null) {
                int idu = Integer.parseInt(u.getId_Usuario());
                preparaComandoSQL("SELECT IDRESERVA,HINICIO,HFIM,DATA,ID_RECURSO,NOME,PREDIO,TIPO,CURSO,FINALIZADA "
                        + "FROM RESERVA INNER JOIN RECURSO"
                        + " ON RESERVA.ID_RECURSO=RECURSO.IDRECURSO "
                        + "WHERE ID_USUARIO = ? AND DATA >= ? AND FINALIZADA = FALSE;");
                pstmt.setInt(1, idu);
                pstmt.setString(2, data_ftf);
                rs = pstmt.executeQuery();
                while (rs.next()) {
                    Reserva r = new Reserva();
                    r.setHoraInicio(rs.getString(2));
                    r.setHoraFim(rs.getString(3));
                    r.setData(rs.getString(4));
                    Recurso rec = new Recurso();
                    rec.setId_Recurso(rs.getString(5));
                    rec.setNome(rs.getString(6));
                    rec.setPredio(rs.getString(7));
                    rec.setTipo(rs.getString(8));   
                    r.setRecurso(rec);
                    r.setUsuario(u);
                    reservaUsuario.add(r);
                }
            }
            fechaConexao();
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Problema para obter a lista mensal"
                    + " do usuário!");
        }
        return reservaUsuario;
    }

    @Override
    public Reserva buscaReserva() throws Banco_de_DadosException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Reserva> buscaReservasDiaRec(String data_ftf, Recurso rec)
            throws Banco_de_DadosException {
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
                    usuarioDAO usuariodao = new usuarioDAO_JDBC();
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
    public List<Reserva> listaReservas() throws Banco_de_DadosException {
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
    public void excluirReserva(Reserva r) throws Banco_de_DadosException {
        try {
            abreConexao();
            preparaComandoSQL("DELETE FROM RESERVA WHERE DATA=? "
                    + "AND HINICIO=? AND HFIM=? AND ID_RECURSO=? AND ID_USUARIO=?");
            pstmt.setString(1, r.getData());
            pstmt.setString(2, r.getHoraInicio());
            pstmt.setString(3, r.getHoraFim());
            pstmt.setString(4, r.getRecurso().getId_Recurso());
            pstmt.setString(5, r.getUsuario().getId_Usuario());
            pstmt.execute();
            fechaConexao();
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Problemas ao ler os parâmtros da consulta.");
        }
    }

    @Override
    public void atualizaReservas() throws Banco_de_DadosException {
        Date data_agora = new Date();
        String data = (String) new SimpleDateFormat("yyyy-MM-dd HH:mm").format(data_agora);
        String hora = data.substring(11, data.length());
        try {
            abreConexao();
            preparaComandoSQL("UPDATE RESERVA SET FINALIZADA=TRUE "
                + "WHERE DATA < DATE(NOW()) AND FINALIZADA=FALSE");
            pstmt.executeUpdate();
            preparaComandoSQL("UPDATE RESERVA SET FINALIZADA=TRUE "
                    + "WHERE DATA = DATE(NOW()) AND HINICIO <= ? AND FINALIZADA=FALSE");
            pstmt.setString(1, hora);
            pstmt.executeUpdate();
            fechaConexao();
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Problemas ao ler os parâmtros da consulta.");
        }
    }
}
