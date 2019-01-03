/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodados.dao;

import bancodados.Banco_de_DadosException;
import java.util.List;
import objetos.Predio;

/**
 *
 * @author fernando-karchiloff
 */
public interface PredioDAO {
    public void insere(Predio predio) throws Banco_de_DadosException;
    public Predio busca(String nome) throws Banco_de_DadosException;
    public Predio buscaPorID(int idPredio) throws Banco_de_DadosException;
    public List<Predio> listaTodos() throws Banco_de_DadosException;
    public void excluir(Predio predio) throws Banco_de_DadosException;
}
