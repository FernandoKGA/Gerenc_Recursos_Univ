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
import java.util.List;
import objetos.Tipo;
import bancodados.dao.TipoDAO;

/**
 *
 * @author fernando-karchiloff
 */
public class TipoDAO_JDBC extends ConectorDAO_JDBC implements TipoDAO{

    public TipoDAO_JDBC() throws Banco_de_DadosException{
        super();
    }
    
    @Override
    public void insere(Tipo tipo) throws Banco_de_DadosException {
        
        try{
            preparaComandoSQL("INSERT INTO TIPOS (NOME) VALUES (?)");
            pstmt.setString(1, tipo.getNome());
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
    public Tipo busca(String nome) throws Banco_de_DadosException {
        
        Tipo tipo = null;
        try{
            preparaComandoSQL("SELECT IDTIPO FROM TIPOS "
                    + "WHERE NOME=?");
            pstmt.setString(1, nome);
            
            rs = pstmt.executeQuery();
            while(rs.next()){
                int idTipo = rs.getInt(1);
                tipo = new Tipo();
                tipo.setId_tipo(idTipo);
                tipo.setNome(nome);
            }
        }
        catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Problemas ao ler resultado da"
                    + " consulta.");
        }
        
        fechaConexao();
        
        return tipo;
    }

    @Override
    public Tipo buscaPorID(int idTipo) throws Banco_de_DadosException {
        
        Tipo tipo = null;
        try{
            preparaComandoSQL("SELECT NOME FROM TIPOS "
                    + "WHERE IDTIPO=?");
            pstmt.setInt(1, idTipo);
            
            rs = pstmt.executeQuery();
            while(rs.next()) {
                String nome = rs.getString(1);
                tipo = new Tipo();
                tipo.setId_tipo(idTipo);
                tipo.setNome(nome);
            }
        }
        catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Problemas ao ler resultado da"
                    + " consulta.");
        }
        
        fechaConexao();
        
        return tipo;
    }

    @Override
    public List<Tipo> listaTodos() throws Banco_de_DadosException {
        
        List<Tipo> tipos = new ArrayList<>();
        try{
            preparaComandoSQL("SELECT * FROM TIPOS");
            rs = pstmt.executeQuery();
            while(rs.next()) {
                int idTipo = rs.getInt(1);
                String nome = rs.getString(2);
                Tipo tipo = new Tipo();
                tipo.setId_tipo(idTipo);
                tipo.setNome(nome);
                tipos.add(tipo);
            }
        }
        catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Problemas ao ler resultado da"
                    + " consulta.");
        }
        fechaConexao();
        
        return tipos;
    }

    @Override
    public void excluir(Tipo tipo) throws Banco_de_DadosException {
        
        try{
            preparaComandoSQL("DELETE FROM TIPOS WHERE NOME=?");
            pstmt.setString(1, tipo.getNome());
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
