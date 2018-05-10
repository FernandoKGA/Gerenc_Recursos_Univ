/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import bancodados.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import objetos.*;

/**
 *
 * @author RocketLion
 */
public class RegrasNegocio extends RegrasNegocioException {

    //Conversa diretamente com o bancodados.GerenciadorBaseDados
    private GerenciadorBaseDadosJDBC baseDados;

    public RegrasNegocio() throws RegrasNegocioException {
        try {
            baseDados = new GerenciadorBaseDadosJDBC();
        } catch (Banco_de_DadosException e) {
            throw new RegrasNegocioException(e);
        }
    }

    public List<Usuario> listaUsuarios() throws RegrasNegocioException {
        try {
            return baseDados.listaUsuarios();
        } catch (Banco_de_DadosException e) {
            e.printStackTrace();
            throw new RegrasNegocioException("Não foi possível"
                    + " conectar ao Banco de Dados.");
        }
    }

    public boolean verificaCoordenador(String curso, String cargo) throws RegrasNegocioException {
            List<Usuario> a = listaUsuarios();
            for (Usuario user : a) {
                if (user.getCargo().equals(cargo) && user.getCurso().equals(curso))return false;
            }
            return true;
    }

    public void cadastraUsuario(String nome, String nUSP,
            String email, String telefone, String curso,
            String cargo) throws RegrasNegocioException {
        Usuario u = new Usuario();
        u.setNome(nome);
        u.setNUSP(nUSP);
        u.setEmail(email);
        u.setTelefone(telefone);
        u.setCurso(curso);
        u.setCargo(cargo);
        System.out.println("Criou ususario");
        try {
            baseDados.insereUsuario(u);
        } catch (Banco_de_DadosException e) {
            e.printStackTrace();
            throw new RegrasNegocioException("Não foi possível"
                    + " conectar ao Banco de Dados.");
        }
    }

    public void cadastraRecurso(String nome, String tipo, String predio)
            throws RegrasNegocioException {
        Recurso rs = new Recurso();
        rs.setNome(nome);
        rs.setTipo(tipo);
        rs.setPredio(predio);

        try {
            baseDados.insereRecurso(rs);
        } catch (Banco_de_DadosException e) {
            e.printStackTrace();
            throw new RegrasNegocioException("Não foi possível "
                    + "conectar ao Banco de Dados.");
        }
    }

    public void cadastraReserva(String horaInicio, String horaFim, String data, Usuario usuario, Recurso recurso) throws RegrasNegocioException {

        try {
            Reserva r = new Reserva();
            r.setData(data);
            r.setHoraInicio(horaInicio);
            r.setHoraFim(horaFim);
            r.setUsuario(usuario);
            r.setRecurso(recurso);

            baseDados.insereReserva(r);
        } catch (Banco_de_DadosException e) {
            e.printStackTrace();
            throw new RegrasNegocioException("Não foi possível conectar "
                    + "ao banco de dados.");
        }
    }
    
    public Usuario buscaUsuario(String nusp) throws Banco_de_DadosException{
        return baseDados.buscaUsuario(nusp);
    }
    
    public void excluirUsuario(String nusp) throws RegrasNegocioException {
        try {
            baseDados.excluirUsuario(nusp);
        } catch (Banco_de_DadosException ex) {
            Log.gravaLog(ex);
            throw new RegrasNegocioException("Não foi possível conectar ao banco de dados.");
        }
    } 

}
