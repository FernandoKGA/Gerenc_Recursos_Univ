package bancodados.dao.jdbc;

import java.io.IOException;

import bancodados.Banco_de_DadosException;
import bancodados.ConectorJDBC;
import bancodados.Propriedades_BD;

public class ConectorDAO_JDBC extends ConectorJDBC {

    private static String PASSWORD;
    private static String USER;
    private static String HOST;
    private static String DB_NAME;
    private static DB DATABASE;
    protected static boolean jaCriouBD;

    public ConectorDAO_JDBC() throws Banco_de_DadosException {
        super(DATABASE.MYSQL);
        try {
            Propriedades_BD propriedades_bd = new Propriedades_BD();
            PASSWORD = propriedades_bd.getPassword();
            USER = propriedades_bd.getUser();
            HOST = propriedades_bd.getHost();
            DB_NAME = propriedades_bd.getDb_name();
            DATABASE = propriedades_bd.getDatabase();
            if(DATABASE.equals("mysql")) setaDB(DATABASE);
            else setaDB(DATABASE);
            
        } catch (IOException e) {
            throw new Banco_de_DadosException(
                    "Problemas ao tentar ler o arquivo database_config.properties");
        }
    }

    @Override
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
        return DB_NAME;
    }
    
    @Override
    protected DB getDB() {
        return DATABASE;
    }
}
