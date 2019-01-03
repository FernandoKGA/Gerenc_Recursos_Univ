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
import objetos.Recurso;
import bancodados.dao.RecursoDAO;
import objetos.Curso;
import objetos.Predio;
import objetos.Tipo;

/**
 *
 * @author ferna
 */
public class RecursoDAO_JDBC extends ConectorDAO_JDBC implements RecursoDAO{

    public RecursoDAO_JDBC() throws Banco_de_DadosException{
        super();
    }
    
    @Override
    public void insere(Recurso recurso) throws Banco_de_DadosException {
        abreConexao();
        preparaComandoSQL("insert into RECURSO (NOME, ID_PREDIO, ID_TIPO) values (?, ?, ?)");

        try {
            pstmt.setString(1, recurso.getNome());
            pstmt.setString(2, recurso.getPredio().getNome());
            pstmt.setString(3, recurso.getTipo().getNome());
            pstmt.execute();
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Erro ao setar os parâmetros da consulta.");
        }

        fechaConexao();    
    }

    @Override
    public void insereLab(Recurso r) throws Banco_de_DadosException {
        try {
            abreConexao();
            preparaComandoSQL("insert into RECURSO (NOME, ID_PREDIO, ID_TIPO, ID_CURSO)"
                    + " values (?, ?, ?, ?)");

            pstmt.setString(1, r.getNome());
            pstmt.setString(2, r.getPredio().getNome());
            pstmt.setString(3, r.getTipo().getNome()); //que obviamente vai ser LABORATORIO
            System.out.println(r.getCurso().getNome());
            pstmt.setString(4, r.getCurso().getNome());
            pstmt.execute();
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Erro ao setar os parâmetros da consulta.");
        }

        fechaConexao();
    }


    @Override
    public Recurso busca(String nome, Predio predio, Tipo tipo) throws Banco_de_DadosException {
        Recurso r = null;
        try {
            preparaComandoSQL("SELECT IDRECURSO FROM RECURSO "
                    + "WHERE NOME=? AND ID_PREDIO=? AND ID_TIPO=?");
            pstmt.setString(1, nome);
            pstmt.setString(2, predio.getNome());
            pstmt.setString(3, tipo.getNome());
            rs = pstmt.executeQuery();
            while (rs.next()) {
                int idRecurso = rs.getInt(1);
                r = new Recurso();
                r.setNome(nome);
                r.setPredio(predio);
                r.setTipo(tipo);
                r.setId_Recurso(idRecurso);
                System.out.println("BUSCA RECURSO_DAOJDBC: " + r.getId_Recurso());
            }
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Problemas ao ler o resultado da consulta.");
        }
        fechaConexao();
        
        return r;
    }

    @Override
    public Recurso buscaPorID(int idRecurso) throws Banco_de_DadosException {
     Recurso r = null;
        try {
            preparaComandoSQL("SELECT NOME,ID_PREDIO,ID_TIPO FROM RECURSO "
                    + "WHERE IDRECURSO=?");
            pstmt.setInt(1, idRecurso);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                String nome = rs.getString(1);
                String predio = rs.getString(2);
                String tipo = rs.getString(3);
                r = new Recurso();
                r.setNome(nome);
                Predio pred = new Predio(predio);
                r.setPredio(pred);
                Tipo t = new Tipo(tipo);
                r.setTipo(t);
                r.setId_Recurso(idRecurso);
            }
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Problemas ao ler o resultado da consulta.");
        }
        fechaConexao();
        
        return r;
    }

    @Override
    public List<Recurso> listaTodos() throws Banco_de_DadosException {
    List<Recurso> recursos = new ArrayList<>();
        try {
            preparaComandoSQL("SELECT * FROM RECURSO");
            rs = pstmt.executeQuery();
            while (rs.next()) {
                int idRecurso = rs.getInt(1);
                String nome = rs.getString(2); //nome
                String predio = rs.getString(3); //predio
                String tipo = rs.getString(4);  //tipo
                Recurso r = new Recurso();
                r.setNome(nome);
                Predio pred = new Predio(predio);
                r.setPredio(pred);
                Tipo t = new Tipo(tipo);
                r.setTipo(t);
                r.setId_Recurso(idRecurso);
                recursos.add(r);
            }
            
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Problemas ao ler o resultado da consulta.");
        }
        fechaConexao();
        
        return recursos;    
    }

    @Override
    public List<Recurso> lista(Predio predio, Tipo tipo) throws Banco_de_DadosException {
        List<Recurso> recursos = new LinkedList<>();
        try {
            preparaComandoSQL("SELECT NOME,IDRECURSO,ID_CURSO FROM RECURSO"
                    + " WHERE ID_PREDIO = ? AND ID_TIPO = ?");
            System.out.println(predio);
            pstmt.setString(1, predio.getNome());
            pstmt.setString(2, tipo.getNome());
            rs = pstmt.executeQuery();
            while (rs.next()) {
                String nome = rs.getString(1); //nome
                int idRecurso = rs.getInt(2); //idrecurso
                String curso_nome = rs.getString(3);
                Curso curso = new Curso(curso_nome);
                Recurso r = new Recurso();
                r.setNome(nome);
                r.setId_Recurso(idRecurso);
                r.setPredio(predio);
                r.setTipo(tipo);
                r.setCurso(curso);
                if(r.getCurso() != null){
                    System.out.println("TEM UM CURSO: " + r.getCurso().getNome());
                }
                recursos.add(r);
            }
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Problemas ao ler o resultado da consulta.");
        }
        fechaConexao();
        
        return recursos;   
    }

    @Override
    public void excluir(Recurso recurso) throws Banco_de_DadosException {
        System.out.println("DELETE FROM RECURSO WHERE NOME = " + recurso.getNome() + " AND PREDIO = " + recurso.getPredio() + " AND TIPO = " + recurso.getTipo());
        preparaComandoSQL("DELETE FROM RECURSO WHERE NOME=? AND ID_PREDIO=? "
                + "AND ID_TIPO=?");
        try {
            pstmt.setString(1, recurso.getNome());
            pstmt.setString(2, recurso.getPredio().getNome());
            pstmt.setString(3, recurso.getTipo().getNome());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            Log.gravaLog(e);
            throw new Banco_de_DadosException("Problemas ao ler os parâmtros da consulta.");    
        }
        fechaConexao();
    }   
    
}
