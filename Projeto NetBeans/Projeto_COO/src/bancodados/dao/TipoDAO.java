/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodados.dao;

import bancodados.Banco_de_DadosException;
import java.util.List;
import objetos.Tipo;

/**
 *
 * @author fernando-karchiloff
 */
public interface TipoDAO {
    public void insere(Tipo tipo) throws Banco_de_DadosException;
    public Tipo busca(String nome) throws Banco_de_DadosException;
    public Tipo buscaPorID(int idRecurso) throws Banco_de_DadosException;
    public List<Tipo> listaTodos() throws Banco_de_DadosException;
    public void excluir(Tipo tipo) throws Banco_de_DadosException;
}
