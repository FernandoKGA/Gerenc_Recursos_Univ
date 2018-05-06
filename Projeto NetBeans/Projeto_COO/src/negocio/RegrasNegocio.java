/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import bancodados.*;
import objetos.*;

/**
 *
 * @author RocketLion
 */
public class RegrasNegocio extends RegrasNegocioException {

    //Conversa diretamente com o bancodados.GerenciadorBaseDados
    private GerenciadorBaseDados baseDados;

    public RegrasNegocio() throws RegrasNegocioException {
        try {
            baseDados = new GerenciadorBaseDadosJDBC();
        } catch (Banco_de_DadosException e) {
            throw new RegrasNegocioException(e);
        }
    }

    public void cadastraUsuario(String nome, String nUSP,
            String email, String telefone, String curso,
            String cargo) throws RegrasNegocioException {
        Usuario u = new Usuario(nome, nUSP, email, telefone,
                curso, cargo);
        try {
            baseDados.insereUsuario(u);
        } catch (Banco_de_DadosException e) {
            e.printStackTrace();
            throw new RegrasNegocioException("Não foi possível"
                    + " conectar ao Banco de Dados.");
        }
    }
    
    public void cadastraRecurso(String nome, String tipo, String predio)
    throws RegrasNegocioException{
        Recurso rs = new Recurso();
        rs.setNome(nome);
        rs.setTipo(tipo);
        rs.setPredio(predio);
        
        try{
            baseDados.insereRecurso(rs);
        }catch(Banco_de_DadosException e){
            e.printStackTrace();
            throw new RegrasNegocioException("Não foi possível "
                    + "conectar ao Banco de Dados.");
        }
    }
    
    public void cadastraReserva(int horaInicio, int horaFim, String data, int nUSP,
            int idRecurso) throws RegrasNegocioException{
        
        try{
            Reserva r = new Reserva();
            r.setData(data);
            r.setHoraInicio(horaInicio);
            r.setHoraFim(horaFim);
            r.setnUSP(nUSP);
            r.setIdRecurso(idRecurso);
            
            baseDados.insereReserva(r);
        }catch(Banco_de_DadosException e){
            e.printStackTrace();
            throw new RegrasNegocioException("Não foi possível conectar "
                    + "ao banco de dados.");
        }
    }
    
    
}
