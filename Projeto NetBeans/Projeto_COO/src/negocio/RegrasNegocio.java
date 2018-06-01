/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import bancodados.*;
import bancodados.dao.*;
import bancodados.dao.jdbc.usuarioDAO_JDBC;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
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

    public List<Recurso> listaRecursos(String predio, String tipo) throws RegrasNegocioException {
        try {
            return baseDados.listaRecursos(predio, tipo);
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

    public boolean cadastraReserva(ArrayList<String> horarios, String data_ftf,
            Recurso rec, Usuario usuario) throws RegrasNegocioException {
        List<Reserva> listaReservasDiaRec;
        ArrayList<String> listaHorariosConcatenados;
        try {
            if (permiteAluguelTipo(usuario, rec)) {
                if (permiteAluguelNumResvMensal(usuario, data_ftf)) {
                    //VERIFICAR SE OS HORARIOS TEM MESMO FORMATO E MESMO TAMANHO PARA COMPARAR
                    listaReservasDiaRec = baseDados.buscaReservasDiaRec(data_ftf, rec);
                    listaHorariosConcatenados = concatenaHorarios(listaReservasDiaRec);
                    for(String hora : horarios){
                        for(String h_concat : listaHorariosConcatenados){
                            if(hora.equalsIgnoreCase(h_concat)){
                                JOptionPane.showMessageDialog(null,"Existe uma "
                                        + "reserva no mesmo horário das: "+hora);
                                return false;
                            }
                        }
                    }
                    //Reserva reserva = new Reserva();
                    //baseDados.insereReserva(reserva);
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "Este usuário chegou "
                            + "ao limite da cota mensal do mês indicado na data.");
                    return false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuário de cargo "
                        + usuario.getCargo() + " não pode alugar recurso do tipo "
                        + rec.getTipo() + "!");
                return false;
            }
        } catch (Banco_de_DadosException e) {
            Log.gravaLog(e);
            throw new RegrasNegocioException("Não foi possível conectar "
                    + "ao banco de dados.");
        }
    }

    public List<Reserva> buscaReservasDiaRec(String data_ftf, Recurso rec)
            throws RegrasNegocioException {
        try {
            return baseDados.buscaReservasDiaRec(data_ftf, rec);
        } catch (Banco_de_DadosException e) {
            Log.gravaLog(e);
            throw new RegrasNegocioException("Não foi possível conectar "
                    + "ao banco de dados.");
        }
    }

    public List<Reserva> listaReservasDoUsuario(String numeroUSP) throws RegrasNegocioException {
        try {
            return baseDados.listaReservasDoUsuario(numeroUSP);
        } catch (Banco_de_DadosException ex) {
            Log.gravaLog(ex);
            throw new RegrasNegocioException("Não foi possível conectar ao banco"
                    + " de dados.");
        }
    }

    public List<Reserva> listaReservasMensaisDoUsuario(String numeroUSP,
            String mes) throws RegrasNegocioException {

        try {
            return baseDados.listaReservasMensaisDoUsuario(numeroUSP, mes);
        } catch (Banco_de_DadosException e) {
            Log.gravaLog(e);
            throw new RegrasNegocioException("Não foi possível conectar ao banco"
                    + " de dados.");
        }
    }

    public List<Reserva> listaReservas() throws RegrasNegocioException {
        try {
            return baseDados.listaReservas();
        } catch (Banco_de_DadosException e) {
            Log.gravaLog(e);
            throw new RegrasNegocioException("Não foi possível conectar ao banco"
                    + " de dados.");
        }
    }

    public void excluirReserva(Reserva r) throws RegrasNegocioException {
        try {
            baseDados.excluirReserva(r);
        } catch (Banco_de_DadosException e) {
            Log.gravaLog(e);
            throw new RegrasNegocioException("Não foi possível conectar ao banco"
                    + " de dados.");
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
    //---------------------------Regras de Negócio---------------------------
    public boolean verificaQuantCoordenador(String curso) throws RegrasNegocioException {
        /*
            Caso existam dois coordenadores no curso, retorna true.
            Contrário, false.
         */
        try {
            return baseDados.verificaQuantCoordenador(curso);
        } catch (Banco_de_DadosException e) {
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

    public boolean permiteAluguelNumResvMensal(Usuario u, String data_ftf) throws RegrasNegocioException {
        //Este método só é necessário para verificação para Alunos
        int numMaxResvMensal = 5;
        String cargo = u.getCargo();
        if (cargo.equalsIgnoreCase("COORDENADOR")
                || cargo.equalsIgnoreCase("PROFESSOR")) {
            return true;
        }
        try {
            List<Reserva> a = baseDados.listaReservasMensaisDoUsuario(u.getNUSP(), data_ftf);
            if (a != null) //estamos fazendo dessa forma pela forma que estamos iniciando
            {
                if (a.size() < numMaxResvMensal) {
                    return true;
                } else {
                    return false;  //Se tiver 5 ou mais reservas.
                }
            }
            return true; //Caso nao tenha nenhuma reserva no mes.
        } catch (Banco_de_DadosException e) {
            Log.gravaLog(e);
            throw new RegrasNegocioException("Não foi possível conectar ao banco de dados.");
        }
    }
    
    public boolean verificaHorasConsecutivas(ArrayList<String> horarios){
        for(String hora : horarios){
        
        }
        return false;
    }

    //-----------------Auxiliares----------------------
    private ArrayList<String> concatenaHorarios(List<Reserva> listaReservasDiaRec) {
        ArrayList<String> listaHorariosConcatenados = new ArrayList<>();
        if (!listaReservasDiaRec.isEmpty()) {
            for (Reserva resv : listaReservasDiaRec) {
                String h_inicio = resv.getHoraInicio();
                String h_fim = resv.getHoraFim();
                String concat = h_inicio + " - " + h_fim;
                listaHorariosConcatenados.add(concat);
            }
            return listaHorariosConcatenados;
        }
        return null;
    }
}
