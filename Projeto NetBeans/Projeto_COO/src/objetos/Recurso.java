/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

public class Recurso {

    private int id_recurso;
    private String nome;
    private Tipo tipo;
    private Predio predio;
    private Curso curso;
    
    public Recurso() {
    }
    
    public Recurso(String nome, Tipo tipo, Predio predio, Curso curso){
        this.id_recurso = id_recurso;  //O QUE EH ISSO?
        this.nome = nome;
        setTipo(tipo);
        setPredio(predio);
        this.curso = curso;
    }
    
    //Getters
    public String getNome() {
        return nome;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Predio getPredio() {
        return predio;
    }
    
    public int getId_Recurso(){
        return this.id_recurso;
    }
    
    public Curso getCurso() {
        return curso;
    }
    
    //Setters
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public void setPredio(Predio predio) {
        this.predio = predio;
    }    
    
    public void setId_Recurso(int id_recurso){
        this.id_recurso = id_recurso;
    }
    
    public void setRecursoGeral(int id_recurso, String nome, Tipo tipo, Predio predio, Curso curso){
        this.id_recurso = id_recurso;
        this.nome = nome;
        setTipo(tipo);
        setPredio(predio);
        this.curso = curso;
    }
    
}
