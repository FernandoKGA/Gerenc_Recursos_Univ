package bancodados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public abstract class ConectorJDBC {

    protected enum DB {
        MYSQL, POSTGRES;
    }

    // MySQL
    private static final String MYSQL_DRIVER = "com.mysql.jdbc.Driver";
    private static final String MYSQL_URL = "jdbc:mysql";

    // Postgres
    private static final String POSTGRES_DRIVER = "org.postgresql.Driver";
    private static final String POSTGRES_URL = "jdbc:postgresql";

    private DB db;
    protected Connection con;
    protected PreparedStatement pstmt;
    protected ResultSet rs;

    protected abstract String getDbHost();

    protected abstract String getDbName();

    protected abstract String getUser();

    protected abstract String getPassword();

    protected DB getDB() {
        return this.db;
    }

    protected ConectorJDBC(DB db) throws Banco_de_DadosException {
        this.db = db;
        String dbDriver = this.db == DB.MYSQL ? MYSQL_DRIVER : POSTGRES_DRIVER;

        try {
            Class.forName(dbDriver);
        } catch (ClassNotFoundException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException(
                    "Problemas no acesso ao banco de dados.");
        }
    }

    protected ConectorJDBC() throws Banco_de_DadosException {
        //versão simples para uso no ConectorDaoJDBC    
    }

    protected void setaDB(DB db) {
        this.db = db;
    }

    protected void abreConexao() throws Banco_de_DadosException {
        String dbURL = this.db == DB.MYSQL ? MYSQL_URL : POSTGRES_URL;
        try {
            //?autoReconnect=true&useSSL=false RESOLVE O PROBLEMA DE SSL, USAR COM CUIDADO
            con = DriverManager.getConnection(dbURL + "://" + getDbHost() + "/"
                    + getDbName() + "?autoReconnect=true&useSSL=false", getUser(), getPassword());
        } catch (SQLException e) {
            Log.gravaLog(e);
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados");
            throw new Banco_de_DadosException(
                    "Problemas no acesso ao banco de dados.");
        }
    }

    protected void abreConexaoSemBD() throws Banco_de_DadosException {
        String dbURL = this.db == DB.MYSQL ? MYSQL_URL : POSTGRES_URL;
        try {
            //?autoReconnect=true&useSSL=false   RESOLVE O PROBLEMA DE SSL
            con = DriverManager.getConnection(dbURL + "://" + getDbHost() + "/"
                    + "?autoReconnect=true&useSSL=false", getUser(), getPassword());
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException(
                    "Problemas no acesso ao banco de dados.");
        }
    }

    protected void fechaConexao() throws Banco_de_DadosException {
        try {
            if (rs != null) {
                rs.close();
                rs = null;
            }

            if (pstmt != null) {
                pstmt.close();
                pstmt = null;
            }

            if (con != null) {
                con.close();
                con = null;
            }

        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException(
                    "Problemas no acesso ao banco de dados.");
        }

    }

    protected void preparaComandoSQL(String sql) throws Banco_de_DadosException {
        try {
            abreConexao();
            if (con != null) {
                pstmt = con.prepareStatement(sql);
            } else {
                System.out.println("? prep sql");
            }
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Problemas no acesso ao banco de dados.");
        }
    }
}
