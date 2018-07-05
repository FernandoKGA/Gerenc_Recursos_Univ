/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

public class Recurso {

    private String id_recurso;
    private String nome;
    private Tipos tipo;
    private Predios predio;
    private String curso;
    
    private enum Tipos {
        SALA, LABORATÓRIO, AUDITÓRIO 
    } 

    private enum Predios {
        CB,I1,I3,I5,M7,A2,INCUB 
    } 

    public Recurso() {
    }
    
    public Recurso(String id_recurso, String nome, String tipo, String predio, String curso){
        this.id_recurso = id_recurso;
        this.nome = nome;
        setTipo(tipo);
        setPredio(predio);
        this.curso = curso;
    }
    
    //Getters
    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo.toString();
    }

    public String getPredio() {
        return predio.name();
    }
    
    public String getId_Recurso(){
        return this.id_recurso;
    }
    
    public String getCurso() {
        return curso;
    }
    
    //Setters
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        for(Tipos tipos : Tipos.values()){
            if(tipos.name().equalsIgnoreCase(tipo)){
                this.tipo = tipos;
            }
        }
    }

    public void setPredio(String predio) {
        for(Predios predios : Predios.values()){
            if(predios.name().equalsIgnoreCase(predio)){
                this.predio = predios;
            }
        }
    }    
    
    public void setId_Recurso(String id_recurso){
        this.id_recurso = id_recurso;
    }
    
    public void imprimeENUM(){
        for(Predios predios: Predios.values()){
            System.out.println(predios.name());
        }
    }
    
    public void setRecursoGeral(String id_recurso, String nome, String tipo, String predio, String curso){
        this.id_recurso = id_recurso;
        this.nome = nome;
        setTipo(tipo);
        setPredio(predio);
        this.curso = curso;
    }

    
}
