/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodados;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import bancodados.ConectorJDBC.DB;
/**
 *
 * @author Fernando Karchiloff
 */
public class Propriedades_BD  {
    
    private String password;
    private String user;
    private String host;
    private String db_name;
    private DB database;
    public Propriedades_BD() throws IOException {
	Properties propriedades = new Properties();
	FileInputStream file = new FileInputStream(
			"src/bancodados/propriedades_bd.properties");
	propriedades.load(file);
        setPassword(propriedades.getProperty("PASSWORD"));
        setUser(propriedades.getProperty("USER"));
        setHost(propriedades.getProperty("HOST"));
        setDb_name(propriedades.getProperty("DB_NAME"));
        setDatabase(propriedades.getProperty("DATABASE").equals("mysql") ? 
                DB.MYSQL : DB.POSTGRES);
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    private void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    private void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the host
     */
    public String getHost() {
        return host;
    }

    /**
     * @param host the host to set
     */
    private void setHost(String host) {
        this.host = host;
    }

    /**
     * @return the db_name
     */
    public String getDb_name() {
        return db_name;
    }

    /**
     * @param db_name the db_name to set
     */
    private void setDb_name(String db_name) {
        this.db_name = db_name;
    }
    
    public DB getDatabase(){
        return this.database;
    }
    
    private void setDatabase(DB database){
        this.database = database;
    }
    
}
