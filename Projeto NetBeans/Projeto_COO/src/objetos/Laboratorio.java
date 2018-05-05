/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.ArrayList;

/**
 *
 * @author informatica
 */
public class Laboratorio extends Recurso{
    
    private String curso;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public boolean verificaLaboratorio(Laboratorio l, Usuario u){
        //vai fazer um método que faz esse processo na RegrasNegocio
        //return RegrasNegocio.verificaLaboratorio(l, u); 
        return true;
    }
    
}
