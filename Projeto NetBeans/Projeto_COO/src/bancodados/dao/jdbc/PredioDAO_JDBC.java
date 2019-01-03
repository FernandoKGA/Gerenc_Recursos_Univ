/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodados.dao.jdbc;

import bancodados.Banco_de_DadosException;
import bancodados.Log;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import objetos.Predio;
import bancodados.dao.PredioDAO;

/**
 *
 * @author fernando-karchiloff
 */
public class PredioDAO_JDBC extends ConectorDAO_JDBC implements PredioDAO{

    public PredioDAO_JDBC() throws Banco_de_DadosException{
        super();
    }
    
    @Override
    public void insere(Predio predio) throws Banco_de_DadosException {
        
        preparaComandoSQL("INSERT INTO PREDIOS (NOME) VALUES (?)");
        
        try{
            pstmt.setString(1, predio.getNome());
            pstmt.execute();
        }
        catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Erro ao setar os parâmetros "
                    + "de inserção.");
        }
        
        fechaConexao();
    }

    @Override
    public Predio busca(String nome) throws Banco_de_DadosException {
        Predio predio = null;
        try{
            preparaComandoSQL("SELECT IDPREDIO FROM PREDIOS "
                    + "WHERE NOME=?");
            pstmt.setString(1, nome);
            
            rs = pstmt.executeQuery();
            while(rs.next()){
                int idPredio = rs.getInt(1);
                predio = new Predio();
                predio.setId_predio(idPredio);
                predio.setNome(nome);
            }
        }
        catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Problemas ao ler resultado da"
                    + " consulta.");
        }
        
        fechaConexao();
        
        return predio;
    }

    @Override
    public Predio buscaPorID(int idPredio) throws Banco_de_DadosException {
        Predio predio = null;
        try{
            preparaComandoSQL("SELECT NOME FROM PREDIOS "
                    + "WHERE IDPREDIO=?");
            pstmt.setInt(1, idPredio);
            
            rs = pstmt.executeQuery();
            while(rs.next()) {
                String nome = rs.getString(1);
                predio = new Predio();
                predio.setId_predio(idPredio);
                predio.setNome(nome);
            }
        }
        catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Problemas ao ler resultado da"
                    + " consulta.");
        }
        
        fechaConexao();
        
        return predio;
    }

    @Override
    public List<Predio> listaTodos() throws Banco_de_DadosException {
        List<Predio> predios = new ArrayList<>();
        try{
            preparaComandoSQL("SELECT * FROM PREDIOS");
            rs = pstmt.executeQuery();
            while(rs.next()) {
                int idPredio = rs.getInt(1);
                String nome = rs.getString(2);
                Predio predio = new Predio();
                predio.setId_predio(idPredio);
                predio.setNome(nome);
                predios.add(predio);
            }
        }
        catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Problemas ao ler resultado da"
                    + " consulta.");
        }
        fechaConexao();
        
        return predios;
    }

    @Override
    public void excluir(Predio predio) throws Banco_de_DadosException {
        preparaComandoSQL("DELETE FROM PREDIOS WHERE NOME=?");
        try{
            pstmt.setString(1, predio.getNome());
            pstmt.executeUpdate();
        }
        catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Problemas ao ler resultado da"
                    + " consulta.");
        }
        
        fechaConexao();
    }
}
