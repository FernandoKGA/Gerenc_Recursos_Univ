/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodados.dao;

import bancodados.Banco_de_DadosException;
import java.util.List;
import objetos.Curso;

/**
 *
 * @author fernando-karchiloff
 */
public interface CursoDAO {
    public void insere(Curso curso) throws Banco_de_DadosException;    
    public Curso busca(String nome) throws Banco_de_DadosException;
    public Curso buscaPorID(int idCurso) throws Banco_de_DadosException;
    public List<Curso> listaTodos() throws Banco_de_DadosException;
    public void excluir(Curso curso) throws Banco_de_DadosException;
}
