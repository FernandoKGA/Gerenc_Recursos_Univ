/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodados.dao;

import bancodados.Banco_de_DadosException;
import java.util.LinkedList;
import objetos.Usuario;

/**
 *
 * @author Lucas
 */
public interface UsuarioDAO {
    public void insere(Usuario usuario) throws Banco_de_DadosException;
    public Usuario busca(String numeroUSP) throws Banco_de_DadosException;
    public LinkedList<Usuario> lista() throws Banco_de_DadosException;
    public void excluir(String nUSP) throws Banco_de_DadosException;
    public boolean verificaQuantCoordenador(String curso) throws Banco_de_DadosException;
}
