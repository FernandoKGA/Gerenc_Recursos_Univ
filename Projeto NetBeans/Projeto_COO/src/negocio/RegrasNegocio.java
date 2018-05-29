/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import bancodados.*;
import bancodados.dao.*;
import bancodados.dao.jdbc.usuarioDAO_JDBC;
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
    private usuarioDAO usuariodao;

    public RegrasNegocio() throws RegrasNegocioException {
        try {
            baseDados = new GerenciadorBaseDadosJDBC();
            usuariodao = new usuarioDAO_JDBC();
            
        } catch (Banco_de_DadosException e) {
            throw new RegrasNegocioException(e);
        }
    }

    // ------------- USUARIO -----------------------
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
            usuariodao.insere(u);
        } catch (Banco_de_DadosException e) {
            e.printStackTrace();
            throw new RegrasNegocioException("Não foi possível"
                    + " conectar ao Banco de Dados.");
        }
    }

    public List<Usuario> listaUsuarios() throws RegrasNegocioException {
        try {
            return usuariodao.lista();
        } catch (Banco_de_DadosException e) {
            e.printStackTrace();
            throw new RegrasNegocioException("Não foi possível"
                    + " conectar ao Banco de Dados.");
        }
    }

    public Usuario buscaUsuario(String nusp) throws RegrasNegocioException {
        try {
            return usuariodao.busca(nusp);
        } catch (Banco_de_DadosException ex) {
            Log.gravaLog(ex);
            throw new RegrasNegocioException("Não foi possível conectar ao banco de dados.");
        }
    }

    public void excluirUsuario(String nusp) throws RegrasNegocioException {
        try {
            usuariodao.excluir(nusp);
        } catch (Banco_de_DadosException ex) {
            Log.gravaLog(ex);
            throw new RegrasNegocioException("Não foi possível conectar ao banco de dados.");
        }
    }

    // ---------------------------- FIM USUARIO ----------------------------
    // ---------------------------- RECURSO ----------------------------
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

    public List<Recurso> listaRecursos() throws RegrasNegocioException {
        try {
            return baseDados.listaRecursos();
        } catch (Banco_de_DadosException e) {
            e.printStackTrace();
            throw new RegrasNegocioException("Não foi possível"
                    + " conectar ao Banco de Dados.");
        }
    }
    
    public List<Recurso> listaRecursos(String predio, String tipo) throws RegrasNegocioException{
        try {
            return baseDados.listaRecursos(predio,tipo);
        } catch (Banco_de_DadosException e) {
            e.printStackTrace();
            throw new RegrasNegocioException("Não foi possível"
                    + " conectar ao Banco de Dados.");
        }
    }

    public void cadastraLaboratorio(String nome, String tipo, String predio, String curso)
            throws RegrasNegocioException {
        Laboratorio lb = new Laboratorio();
        lb.setNome(nome);
        lb.setTipo(tipo);
        lb.setPredio(predio);
        lb.setCurso(curso);

        try {
            baseDados.insereLaboratorio(lb);
        } catch (Banco_de_DadosException e) {
            e.printStackTrace();
            throw new RegrasNegocioException("Não foi possível "
                    + "conectar ao Banco de Dados.");
        }
    }
    
    public void excluirRecurso(Recurso r) throws RegrasNegocioException {
        try {
            baseDados.excluirRecurso(r);
        } catch (Banco_de_DadosException e) {
            e.printStackTrace();
            throw new RegrasNegocioException("Não foi possível"
                    + " conectar ao Banco de Dados.");
        }
    }
    // ---------------------------- FIM RECURSO ----------------------------
    
    // ---------------------------- RESERVA ----------------------------
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

    public List<Reserva> listaReservasDoUsuario(String numeroUSP) throws RegrasNegocioException {
        try {
            return baseDados.listaReservasDoUsuario(numeroUSP);
        } catch (Banco_de_DadosException ex) {
            Log.gravaLog(ex);
            throw new RegrasNegocioException("Não foi possível conectar ao banco de dados.");
        }
    }
    
    public void atualizaReservas() throws RegrasNegocioException {
        try {
            baseDados.atualizaReservas();
        } catch (Banco_de_DadosException ex) {
            Log.gravaLog(ex);
            throw new RegrasNegocioException("Não foi possível conectar ao banco de dados.");
        }
    }

    // ---------------------------- FIM RESERVA ----------------------------
    
    //Métodos derivados diretamente das Regras de Negócio
    public boolean verificaCoordenador(String curso) throws RegrasNegocioException {
        List<Usuario> a = listaUsuarios();
        try{
            return baseDados.verificaCoordenador(curso);
        }
        catch (Banco_de_DadosException e) {
            Log.gravaLog(e);
            throw new RegrasNegocioException(e);
        }
    }
    

    public boolean permiteAluguelTipo(Usuario u, Recurso r) {
        String cargoUsu = u.getCargo();
        String tipoRec = r.getTipo();

        if (cargoUsu.equalsIgnoreCase("ALUNO")) {
            if (tipoRec.equalsIgnoreCase("LABORATORIO") || tipoRec.equalsIgnoreCase("AUDITORIO")) {
                return false; //porque a regra diz que laboratórios são reservados a professores.
            }
            return true;
        } else if (cargoUsu.equalsIgnoreCase("PROFESSOR")) {
            if (r instanceof Laboratorio) {
                //Isso aqui é possível de fazer? Fica o questionamento
                String curso = ((Laboratorio) r).getCurso();
                if (curso.equalsIgnoreCase(u.getCurso())) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return true; //quando o cargoUsu é igual a COORDENADOR
    }

    public boolean permiteAluguelNumero(Usuario u) throws RegrasNegocioException {
        //Este método só é necessário para verificação para Usuários e Professores.
        String cargo = u.getCargo();
        if (cargo.equalsIgnoreCase("COORDENADOR")) {
            return true;
        }
        try {
            List<Reserva> a = baseDados.listaReservasDoUsuario(u.getNUSP());
            if (a != null) //estamos fazendo dessa forma pela forma que estamos iniciando
            {
                return true;
            }
            return false;
        } catch (Banco_de_DadosException e) {
            Log.gravaLog(e);
            throw new RegrasNegocioException("Não foi possível conectar ao banco de dados.");
        }

    }

}
