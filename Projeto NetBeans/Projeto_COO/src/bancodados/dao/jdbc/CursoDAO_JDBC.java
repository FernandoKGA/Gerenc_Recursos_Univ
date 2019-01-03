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
import objetos.Curso;
import bancodados.dao.CursoDAO;

/**
 *
 * @author fernando-karchiloff
 */
public class CursoDAO_JDBC extends ConectorDAO_JDBC implements CursoDAO{

    public CursoDAO_JDBC() throws Banco_de_DadosException{
        super();
    }
    
    @Override
    public void insere(Curso curso) throws Banco_de_DadosException {
        
        try{
            preparaComandoSQL("INSERT INTO CURSOS (NOME) VALUES (?)");
            pstmt.setString(1, curso.getNome());
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
    public Curso busca(String nome) throws Banco_de_DadosException {
        Curso curso = null;
        try{
            preparaComandoSQL("SELECT IDCURSO FROM CURSOS "
                    + "WHERE NOME=?");
            pstmt.setString(1, nome);
            
            rs = pstmt.executeQuery();
            while(rs.next()){
                int idCurso = rs.getInt(1);
                curso = new Curso();
                curso.setId_curso(idCurso);
                curso.setNome(nome);
            }
        }
        catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Problemas ao ler resultado da"
                    + " consulta.");
        }
        
        fechaConexao();
        
        return curso;    }

    @Override
    public Curso buscaPorID(int idCurso) throws Banco_de_DadosException {
        Curso curso = null;
        try{
            preparaComandoSQL("SELECT NOME FROM CURSOS "
                    + "WHERE IDCURSO=?");
            pstmt.setInt(1, idCurso);
            
            rs = pstmt.executeQuery();
            while(rs.next()) {
                String nome = rs.getString(1);
                curso = new Curso();
                curso.setId_curso(idCurso);
                curso.setNome(nome);
            }
        }
        catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Problemas ao ler resultado da"
                    + " consulta.");
        }
        
        fechaConexao();
        
        return curso;
    }

    @Override
    public List<Curso> listaTodos() throws Banco_de_DadosException {
        
        List<Curso> cursos = new ArrayList<>();
        try{
            preparaComandoSQL("SELECT * FROM CURSOS");
            rs = pstmt.executeQuery();
            while(rs.next()) {
                int idCurso = rs.getInt(1);
                String nome = rs.getString(2);
                Curso curso = new Curso();
                curso.setId_curso(idCurso);
                curso.setNome(nome);
                cursos.add(curso);
            }
        }
        catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Problemas ao ler resultado da"
                    + " consulta.");
        }
        fechaConexao();
        
        return cursos;    
    }

    @Override
    public void excluir(Curso curso) throws Banco_de_DadosException {
        
        try{
            preparaComandoSQL("DELETE FROM CURSOS WHERE NOME=?");
            pstmt.setString(1, curso.getNome());
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
