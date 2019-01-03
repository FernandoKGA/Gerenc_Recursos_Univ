/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import bancodados.*;
import bancodados.dao.*;
import bancodados.dao.jdbc.FachadaDAO_JDBC;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import objetos.*;

/**
 *
 * @author RocketLion
 */
public class RegrasNegocio extends RegrasNegocioException {

    private final FachadaDAO fachadaDAO;

    public RegrasNegocio() throws RegrasNegocioException {
        try {
            fachadaDAO = new FachadaDAO_JDBC();
        } catch (Banco_de_DadosException e) {
            throw new RegrasNegocioException(e);
        }
    }
    // ------------- TIPOS -------------------------
    
    public void insereTipo(Tipo tipo) throws RegrasNegocioException{
        try{
            fachadaDAO.insereTipo(tipo);
        }
        catch (Banco_de_DadosException e) {
            e.printStackTrace();
            throw new RegrasNegocioException("Não foi possível"
                    + " conectar ao Banco de Dados.");
        }
    }
    
    public Tipo buscaTipo(String nome) throws RegrasNegocioException{
        try{
            return fachadaDAO.buscaTipo(nome);
        }
        catch (Banco_de_DadosException e) {
            e.printStackTrace();
            throw new RegrasNegocioException("Não foi possível"
                    + " conectar ao Banco de Dados.");
        }
    }
    
    public Tipo buscaTipoPorID(int idTipo) throws RegrasNegocioException{
        try{
            return fachadaDAO.buscaTipoPorID(idTipo);
        }
        catch (Banco_de_DadosException e) {
            e.printStackTrace();
            throw new RegrasNegocioException("Não foi possível"
                    + " conectar ao Banco de Dados.");
        }
    }
    
    public List<Tipo> listaTipos() throws RegrasNegocioException{
        try{
            return fachadaDAO.listaTipos();
        }
        catch (Banco_de_DadosException e) {
            e.printStackTrace();
            throw new RegrasNegocioException("Não foi possível"
                    + " conectar ao Banco de Dados.");
        }
    }
    
    public void excluirTipo(Tipo tipo) throws RegrasNegocioException{
        try{
            fachadaDAO.excluiTipo(tipo);
        }
        catch (Banco_de_DadosException e) {
            e.printStackTrace();
            throw new RegrasNegocioException("Não foi possível"
                    + " conectar ao Banco de Dados.");
        }
    }
    // ------------- FIM TIPOS ---------------------
    
    // ------------- CURSOS ------------------------
    public void insereCurso(Curso curso) throws RegrasNegocioException{
        try{
            fachadaDAO.insereCurso(curso);
        }
        catch (Banco_de_DadosException e) {
            e.printStackTrace();
            throw new RegrasNegocioException("Não foi possível"
                    + " conectar ao Banco de Dados.");
        }
    }
    
    public Curso buscaCurso(String nome) throws RegrasNegocioException{
        try{
            return fachadaDAO.buscaCurso(nome);
        }
        catch (Banco_de_DadosException e) {
            e.printStackTrace();
            throw new RegrasNegocioException("Não foi possível"
                    + " conectar ao Banco de Dados.");
        }
    }
    
    public Curso buscaCursoPorID(int idCurso) throws RegrasNegocioException{
        try{
            return fachadaDAO.buscaCursoPorID(idCurso);
        }
        catch (Banco_de_DadosException e) {
            e.printStackTrace();
            throw new RegrasNegocioException("Não foi possível"
                    + " conectar ao Banco de Dados.");
        }
    }
    
    public List<Curso> listaCursos() throws RegrasNegocioException{
        try{
            return fachadaDAO.listaCursos();
        }
        catch (Banco_de_DadosException e) {
            e.printStackTrace();
            throw new RegrasNegocioException("Não foi possível"
                    + " conectar ao Banco de Dados.");
        }
    }
    
    public void excluirCurso(Curso curso) throws RegrasNegocioException{
        try{
            fachadaDAO.excluiCurso(curso);
        }
        catch (Banco_de_DadosException e) {
            e.printStackTrace();
            throw new RegrasNegocioException("Não foi possível"
                    + " conectar ao Banco de Dados.");
        }
    }
    // ------------- FIM CURSOS --------------------
    
    // ------------- PREDIOS -----------------------
    public void inserePredio(Predio predio) throws RegrasNegocioException{
        try{
            fachadaDAO.inserePredio(predio);
        }
        catch (Banco_de_DadosException e) {
            e.printStackTrace();
            throw new RegrasNegocioException("Não foi possível"
                    + " conectar ao Banco de Dados.");
        }
    }
    
    public Predio buscaPredio(String nome) throws RegrasNegocioException{
        try{
            return fachadaDAO.buscaPredio(nome);
        }
        catch (Banco_de_DadosException e) {
            e.printStackTrace();
            throw new RegrasNegocioException("Não foi possível"
                    + " conectar ao Banco de Dados.");
        }
    }
    
    public Predio buscaPredioPorID(int idPredio) throws RegrasNegocioException{
        try{
            return fachadaDAO.buscaPredioPorID(idPredio);
        }
        catch (Banco_de_DadosException e) {
            e.printStackTrace();
            throw new RegrasNegocioException("Não foi possível"
                    + " conectar ao Banco de Dados.");
        }
    }
    
    public List<Predio> listaPredios() throws RegrasNegocioException{
        try{
            System.out.println("listando");
            return fachadaDAO.listaPredios();
        }
        catch (Banco_de_DadosException e) {
            e.printStackTrace();
            throw new RegrasNegocioException("Não foi possível"
                    + " conectar ao Banco de Dados.");
        }
    }
    
    public void excluirPredio(Predio predio) throws RegrasNegocioException{
        try{
            fachadaDAO.excluiPredio(predio);
        }
        catch (Banco_de_DadosException e) {
            e.printStackTrace();
            throw new RegrasNegocioException("Não foi possível"
                    + " conectar ao Banco de Dados.");
        }
    }
    // ------------- FIM PREDIOS -------------------

    // ------------- USUARIO -----------------------
            
    public void cadastraUsuario(String nome, String nUSP,
            String email, String telefone, Curso curso,
            String cargo) throws RegrasNegocioException {
        Usuario u = new Usuario();
        u.setNome(nome);
        u.setNUSP(nUSP);
        u.setEmail(email);
        u.setTelefone(telefone);
        u.setCurso(curso);
        u.setCargo(cargo);
        try {
            fachadaDAO.insereUsuario(u);
        } catch (Banco_de_DadosException e) {
            e.printStackTrace();
            throw new RegrasNegocioException("Não foi possível"
                    + " conectar ao Banco de Dados.");
        }
    }

    public List<Usuario> listaUsuarios() throws RegrasNegocioException {
        try {
            return fachadaDAO.listaUsuarios();
        } catch (Banco_de_DadosException e) {
            e.printStackTrace();
            throw new RegrasNegocioException("Não foi possível"
                    + " conectar ao Banco de Dados.");
        }
    }

    public Usuario buscaUsuario(String nusp) throws RegrasNegocioException {
        try {
            return fachadaDAO.buscaUsuario(nusp);
        } catch (Banco_de_DadosException ex) {
            Log.gravaLog(ex);
            throw new RegrasNegocioException("Não foi possível conectar ao banco de dados.");
        }
    }

    public void excluirUsuario(String nusp) throws RegrasNegocioException {
        try {
            fachadaDAO.excluirUsuario(nusp);
        } catch (Banco_de_DadosException ex) {
            Log.gravaLog(ex);
            throw new RegrasNegocioException("Não foi possível conectar ao banco de dados.");
        }
    }

    // ---------------------------- FIM USUARIO ----------------------------
    // ---------------------------- RECURSO ----------------------------
    public void cadastraRecurso(String nome, Tipo tipo, Predio predio)
            throws RegrasNegocioException {
        Recurso rs = new Recurso();
        rs.setNome(nome);
        rs.setTipo(tipo);
        rs.setPredio(predio);

        try {
            fachadaDAO.insereRecurso(rs);
        } catch (Banco_de_DadosException e) {
            e.printStackTrace();
            throw new RegrasNegocioException("Não foi possível "
                    + "conectar ao Banco de Dados.");
        }
    }

    public Recurso buscaRecurso(String nome, Predio predio, Tipo tipo) throws RegrasNegocioException {
        try {
            return fachadaDAO.buscaRecurso(nome, predio, tipo);
        } catch (Banco_de_DadosException e) {
            e.printStackTrace();
            throw new RegrasNegocioException("Não foi possível"
                    + " conectar ao Banco de Dados.");
        }
    }

    public List<Recurso> listaRecursos() throws RegrasNegocioException {
        try {
            return fachadaDAO.listaTodosRecursos();
        } catch (Banco_de_DadosException e) {
            e.printStackTrace();
            throw new RegrasNegocioException("Não foi possível"
                    + " conectar ao Banco de Dados.");
        }
    }

    public List<Recurso> listaRecursos(Predio predio, Tipo tipo) throws RegrasNegocioException {
        try {
            return fachadaDAO.listaRecursos(predio, tipo);
        } catch (Banco_de_DadosException e) {
            e.printStackTrace();
            throw new RegrasNegocioException("Não foi possível"
                    + " conectar ao Banco de Dados.");
        }
    }

    public void cadastraLaboratorio(String nome, Tipo tipo, Predio predio, Curso curso)
            throws RegrasNegocioException {
        Recurso lb = new Recurso();
        lb.setNome(nome);
        lb.setTipo(tipo);
        lb.setPredio(predio);
        lb.setCurso(curso);

        try {
            fachadaDAO.insereLaboratorio(lb);
        } catch (Banco_de_DadosException e) {
            e.printStackTrace();
            throw new RegrasNegocioException("Não foi possível "
                    + "conectar ao Banco de Dados.");
        }
    }

    public void excluirRecurso(Recurso r) throws RegrasNegocioException {
        try {
            fachadaDAO.excluirRecurso(r);
        } catch (Banco_de_DadosException e) {
            e.printStackTrace();
            throw new RegrasNegocioException("Não foi possível"
                    + " conectar ao Banco de Dados.");
        }
    }
    // ---------------------------- FIM RECURSO ----------------------------

    // ---------------------------- RESERVA ----------------------------
    public void cadastraReserva(String horaInicio, String horaFim, String data,
            Usuario usuario, Recurso recurso) throws RegrasNegocioException {

        try {
            Reserva r = new Reserva();
            r.setData(data);
            r.setHoraInicio(horaInicio);
            r.setHoraFim(horaFim);
            r.setUsuario(usuario);
            r.setRecurso(recurso);

            fachadaDAO.insereReserva(r);
        } catch (Banco_de_DadosException e) {
            e.printStackTrace();
            throw new RegrasNegocioException("Não foi possível conectar "
                    + "ao banco de dados.");
        }
    }

    public boolean cadastraReserva(ArrayList<String> horarios, String data_ftf,
            Recurso rec, Usuario usuario) throws RegrasNegocioException {
        List<Reserva> listaReservasDiaRec;
        try {
            if (permiteAluguelTipo(usuario, rec)) {
                //Verifica o cargo do usuario para alugar
                if (permiteAluguelNumResvMensal(usuario, data_ftf)) {
                    //Verifica se o usuario pode alugar
                    if (!temResvMesmoHorarioUsuario(horarios, usuario, data_ftf)) {
                        //Verifica se o usuario ja tem reservas nesse horario
                        listaReservasDiaRec = fachadaDAO.buscaReservaDia(data_ftf, rec);
                        //Puxa se tem reservas desse recurso
                        if (!listaReservasDiaRec.isEmpty()) {
                            if (!temResvMesmoHorarioRecurso(horarios, listaReservasDiaRec)) {
                                //Se tem reservas para aquele recurso, verifica por aqui
                                //Entra caso nao tenha
                                if (verificaHorasConsecutivas(horarios)) {
                                    //Limita QUALQUER usuario de selecionar mais de 2 horas
                                    System.out.println(data_ftf);
                                    horarios = ordenaHorarios(horarios);
                                    if (verificaHorarioMesmoDia(horarios, data_ftf)) {
                                        System.out.println("msm dia");
                                    }
                                    for (String hora : horarios) {
                                        String h_inicio = hora.substring(0, 5);
                                        System.out.println(h_inicio);
                                        String h_fim = hora.substring(8, hora.length());
                                        System.out.println(h_fim);
                                        Reserva resv = new Reserva();
                                        resv.setData(data_ftf);
                                        resv.setHoraInicio(h_inicio);
                                        resv.setHoraFim(h_fim);
                                        resv.setRecurso(rec);
                                        resv.setUsuario(usuario);
                                        fachadaDAO.insereReserva(resv);
                                    }
                                    fachadaDAO.atualizaReservas();
                                    return true;
                                } else {
                                    return false;
                                }
                            }
                            //Joga para o return de fora.
                        } else {
                            //Se não tem reserva naquele dia daquele recurso
                            if (verificaHorasConsecutivas(horarios)) {
                                //Limita QUALQUER usuario de selecionar mais de 2 horas
                                horarios = ordenaHorarios(horarios);

                                for (String hora : horarios) {
                                    String h_inicio = hora.substring(0, 5);
                                    System.out.println(h_inicio);
                                    String h_fim = hora.substring(8, hora.length());
                                    System.out.println(h_fim);
                                    Reserva resv = new Reserva();
                                    resv.setData(data_ftf);
                                    resv.setHoraInicio(h_inicio);
                                    resv.setHoraFim(h_fim);
                                    resv.setRecurso(rec);
                                    resv.setUsuario(usuario);
                                    //baseDados.insereReserva(resv);
                                    fachadaDAO.insereReserva(resv);
                                }
                                //fachadaDAO.atualiza();
                                fachadaDAO.atualizaReservas();
                                return true;
                            } else {
                                //fachadaDAO.atualiza();
                                fachadaDAO.atualizaReservas();
                                return false;
                            }
                        }
                    } else {
                        //Mensagem eh mostrada na funcao temResvMesmoHorarioUsuario
                        fachadaDAO.atualizaReservas();
                        return false;
                    }
                    //Usar o horarios para separar as reservas
                    //Como verificar mais do que uma sequencia de duas reservas
                    //Reserva reserva = new Reserva();
                    //baseDados.insereReserva(reserva);
                } else {
                    JOptionPane.showMessageDialog(null, "Este usuário chegou "
                            + "ao limite da cota mensal do mês indicado na data.");
                    fachadaDAO.atualizaReservas();
                    return false;
                }
            } else {
                if (usuario.getCargo().equalsIgnoreCase("ALUNO")) {
                    JOptionPane.showMessageDialog(null, "Alunos não podem alugar recurso do tipo "
                            + rec.getTipo() + " no prédio " + rec.getPredio() + "!");
                }else if(usuario.getCargo().equalsIgnoreCase("PROFESSOR")){
                    JOptionPane.showMessageDialog(null, "Professor de curso diferente do laboratório - " + rec.getCurso());
                }

                fachadaDAO.atualizaReservas();
                return false;
            }
        } catch (Banco_de_DadosException e) {
            Log.gravaLog(e);
            throw new RegrasNegocioException("Não foi possível conectar "
                    + "ao banco de dados.");
        }
        return false; //Nao permite cadastramento qualquer problema de excessao
    }

    public List<Reserva> buscaReservasDiaRec(String data_ftf, Recurso rec)
            throws RegrasNegocioException {
        try {
            return fachadaDAO.buscaReservaDia(data_ftf, rec);
        } catch (Banco_de_DadosException e) {
            Log.gravaLog(e);
            throw new RegrasNegocioException("Não foi possível conectar "
                    + "ao banco de dados.");
        }
    }

    public List<Reserva> listaReservasDoUsuario(String numeroUSP) throws RegrasNegocioException {
        try {
            return fachadaDAO.listaReservasPorUsuario(numeroUSP);
        } catch (Banco_de_DadosException ex) {
            Log.gravaLog(ex);
            throw new RegrasNegocioException("Não foi possível conectar ao banco"
                    + " de dados.");
        }
    }

    public List<Reserva> listaReservasMensaisDoUsuario(String numeroUSP,
            String ano_mes_dia) throws RegrasNegocioException {
        try {
            return fachadaDAO.listaReservasMensais(numeroUSP, ano_mes_dia);
        } catch (Banco_de_DadosException e) {
            Log.gravaLog(e);
            throw new RegrasNegocioException("Não foi possível conectar ao banco"
                    + " de dados.");
        }
    }

    public List<Reserva> listaReservas() throws RegrasNegocioException {
        try {
            return fachadaDAO.listaTodasReservas();
        } catch (Banco_de_DadosException e) {
            Log.gravaLog(e);
            throw new RegrasNegocioException("Não foi possível conectar ao banco"
                    + " de dados.");
        }
    }

    public void excluirReserva(Reserva r) throws RegrasNegocioException {
        try {
            fachadaDAO.excluirReserva(r);
        } catch (Banco_de_DadosException e) {
            Log.gravaLog(e);
            throw new RegrasNegocioException("Não foi possível conectar ao banco"
                    + " de dados.");
        }
    }

    public void atualizaReservas() throws RegrasNegocioException {
        try {
            fachadaDAO.atualizaReservas();
        } catch (Banco_de_DadosException ex) {
            Log.gravaLog(ex);
            throw new RegrasNegocioException("Não foi possível conectar ao banco de dados.");
        }
    }

    // ---------------------------- FIM RESERVA ----------------------------
    //---------------------------Regras de Negócio---------------------------
    public boolean verificaQuantCoordenador(Curso curso) throws RegrasNegocioException {
        try {
            return fachadaDAO.verificaQuantCoordenador(curso);
        } catch (Banco_de_DadosException e) {
            Log.gravaLog(e);
            throw new RegrasNegocioException(e);
        }
    }

    public boolean permiteAluguelTipo(Usuario u, Recurso r) {
        String cargoUsu = u.getCargo();
        System.out.println(cargoUsu);
        String tipoRec = r.getTipo().getNome();

        if (cargoUsu.equalsIgnoreCase("ALUNO")) {
            if (tipoRec.equalsIgnoreCase("LABORATÓRIO") || tipoRec.equalsIgnoreCase("AUDITORIO") || r.getPredio().getNome().equalsIgnoreCase("A2") || r.getPredio().getNome().equalsIgnoreCase("A3")) {
                return false; //porque a regra diz que laboratórios são reservados a professores.
            }
            return true;
        } else if (cargoUsu.equalsIgnoreCase("PROFESSOR")) {
            if (tipoRec.equalsIgnoreCase("LABORATÓRIO")) {
                //Isso aqui é possível de fazer? Fica o questionamento
                String curso = r.getCurso().getNome();
                System.out.println("VERIFICANDO CURSO - " + r.getCurso() + " = " + u.getCurso() + "?");
                if (curso.equalsIgnoreCase(u.getCurso().getNome())) {
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
            List<Reserva> a = fachadaDAO.listaReservasMensais(u.getNUSP(), data_ftf);
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

    public boolean temResvMesmoHorarioUsuario(ArrayList<String> horarios, Usuario usr,
            String ano_mes_dia) throws RegrasNegocioException {
        List<Reserva> listaMensal;
        ArrayList<String> horariosConcatenados;
        try {
            listaMensal = fachadaDAO.listaReservasMensais(usr.getNUSP(), ano_mes_dia);
            horariosConcatenados = concatenaHorarios(listaMensal);
            if (horariosConcatenados != null) {
                for (String hora : horarios) {
                    for (String h_resv : horariosConcatenados) {
                        if (hora.equalsIgnoreCase(h_resv)) {
                            JOptionPane.showMessageDialog(null, "Usuário já tem reserva"
                                    + " no horário: " + hora);
                            return true; //Quando tem no mesmo horário
                        }
                    }
                }
                return false;
            }
            return false;
        } catch (Banco_de_DadosException e) {
            Log.gravaLog(e);
            throw new RegrasNegocioException("Não foi possível conectar ao banco"
                    + " de dados.");
        }
    }

    public boolean temResvMesmoHorarioRecurso(ArrayList<String> horarios,
            List<Reserva> listaReservasDiaRec) {
        ArrayList<String> listaHorariosConcatenados;
        listaHorariosConcatenados = concatenaHorarios(listaReservasDiaRec);
        if (listaHorariosConcatenados != null) {
            for (String hora : horarios) {
                for (String h_concat : listaHorariosConcatenados) {
                    if (hora.equalsIgnoreCase(h_concat)) {
                        JOptionPane.showMessageDialog(null, "Existe uma "
                                + "reserva no mesmo horário das: " + hora);
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public boolean verificaHorasConsecutivas(ArrayList<String> horarios) {
        int[] horas = ordenaHorariosParaComparar(horarios);
        if (horas != null) {
            int i = 0;
            int h_con = 1;
            while ((i < horas.length - 1) && (h_con < 4)) {
                if ((horas[i] + 1) == horas[i + 1]) {
                    h_con++;
                } else {
                    h_con = 1;
                }
                i++;
            }
            if (h_con >= 3) {
                JOptionPane.showMessageDialog(null, "Mais de 2 horas consecutivas "
                        + "selecionadas.");
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    private boolean verificaHorarioMesmoDia(ArrayList<String> horarios, String data_ftf) {
        Date data_agora = new Date();
        String data = (String) new SimpleDateFormat("HH:mm").format(data_agora);
        System.out.println("data_ftf: " + data_ftf);
        System.out.println("hora :" + data);
        return true;
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

    private int[] ordenaHorariosParaComparar(ArrayList<String> horarios) {
        if (horarios != null) {
            int array[] = new int[horarios.size()];
            String array_string[] = new String[horarios.size()];
            for (int i = 0; i < array.length; i++) {
                String sk = horarios.get(i);
                String s = sk.substring(0, 2);
                int h = Integer.parseInt(s);
                array[i] = h;
                array_string[i] = sk;
            }
            int max = array.length;
            for (int i = 1; i < max; i++) {
                int aux = array[i];
                String aux_string = array_string[i];
                int j = i;
                while ((j > 0) && (aux < array[j - 1])) {
                    array[j] = array[j - 1];
                    array_string[j] = array_string[j - 1];
                    j--;
                }
                array[j] = aux;
                array_string[j] = aux_string;
            }
            ArrayList<String> lista_ordenada = new ArrayList<>();
            for (int i = 0; i < horarios.size(); i++) {
                lista_ordenada.add(i, array_string[i]);
            }
            horarios = lista_ordenada;
            return array;
        }
        return null;
    }

    private ArrayList<String> ordenaHorarios(ArrayList<String> horarios) {
        if (horarios != null) {
            int array[] = new int[horarios.size()];
            String array_string[] = new String[horarios.size()];
            for (int i = 0; i < array.length; i++) {
                String sk = horarios.get(i);
                String s = sk.substring(0, 2);
                int h = Integer.parseInt(s);
                array[i] = h;
                array_string[i] = sk;
            }
            int max = array.length;
            for (int i = 1; i < max; i++) {
                int aux = array[i];
                String aux_string = array_string[i];
                int j = i;
                while ((j > 0) && (aux < array[j - 1])) {
                    array[j] = array[j - 1];
                    array_string[j] = array_string[j - 1];
                    j--;
                }
                array[j] = aux;
                array_string[j] = aux_string;
            }
            ArrayList<String> lista_ordenada = new ArrayList<>();
            for (int i = 0; i < horarios.size(); i++) {
                lista_ordenada.add(i, array_string[i]);
            }
            horarios = lista_ordenada;
            return horarios;
        }
        return null;
    }
}
