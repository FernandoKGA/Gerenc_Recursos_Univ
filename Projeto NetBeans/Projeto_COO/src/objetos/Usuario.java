/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

public class Usuario {
    private int id_usuario;
    private String nome;
    private String nUSP; //poderia ser short por questão de tamanho  --(nao temos problemas de armazenamento...)
    private String email;
    private String telefone; //poderia ser short por questão de tamanho  --(nao temos problemas de armazenamento...)
    private String cargo;
    private Curso curso;
    
    /*Fico na dúvida se precisa ser o nome inteiro ou se vai ser só uma sigla. 
    A principio, vou fazer como sigla, e depois eu penso em como vou alterar*/


    public Usuario(){
    }
    
    public Usuario(String nome, String nUSP,
            String email, String telefone, Curso curso, String cargo){
        this.id_usuario = 0;
        this.setNome(nome);
        this.setNUSP(nUSP);
        this.setEmail(email);
        this.setTelefone(telefone);
        if(curso != null){
            this.setCurso(curso);
        }
        if(cargo != null){
            this.setCargo(cargo);
        }
    }
    
    //Getters
    public int getId_Usuario(){
        return this.id_usuario;
    }
    
    public String getNome(){
        return this.nome;
    }
    public String getNUSP(){
        return this.nUSP;
    }
    public String getTelefone(){
        return this.telefone;
    }
    public String getEmail(){
        return this.email;
    }
    public Curso getCurso(){
        return this.curso;
    }
    public String getCargo(){
        return this.cargo;
    }    
    public void setId_Usuario(int id_usuario){
        this.id_usuario = id_usuario;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setNUSP(String nUSP){
        this.nUSP = nUSP;
    }

    public void setEmail(String email){
        this.email = email;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    //enums - estou tratando da forma correta? :thinking:   --(Pelo o que o Freire disse a mim, sim...)
    public void setCurso(Curso a){
        this.curso = a;
    }
    
    public void setCargo(String a){
        this.cargo = a;
    }
    
    /*
    public void setUsuarioGeral(String id_usuario, String nome, String nUSP,
            String email, String telefone, String curso, String cargo){
        this.id_usuario = id_usuario;
        this.nome = nome;
        this.nUSP = nUSP;
        this.email = email;
        this.telefone = telefone;
        if(curso != null){
            this.curso = curso;
        }
        if(cargo != null){
            this.cargo = cargo;
        }
    }*/
}