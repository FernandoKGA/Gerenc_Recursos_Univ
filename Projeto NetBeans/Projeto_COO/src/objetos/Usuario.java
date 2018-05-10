/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

public class Usuario {
    private String id_usuario;
    private String nome;
    private String nUSP; //poderia ser short por questão de tamanho  --(nao temos problemas de armazenamento...)
    private String email;
    private String telefone; //poderia ser short por questão de tamanho  --(nao temos problemas de armazenamento...)
    private String cargo;
    private String curso;
    
    /*Fico na dúvida se precisa ser o nome inteiro ou se vai ser só uma sigla. 
    A principio, vou fazer como sigla, e depois eu penso em como vou alterar*/


    public Usuario(){
    }
    
    
    //Getters
    public String getId_Usuario(){
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
    public String getCurso(){
        return this.curso;
    }
    public String getCargo(){
        return this.cargo;
    }    
    public void setId_Usuario(String id_usuario){
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
    
    //exige uma verificação de caracteres - não pode ter letra
    public void setTelefone(String telefone){
        this.telefone = telefone;
        //ainda tem verificações a fazer!
    }
    
    //enums - estou tratando da forma correta? :thinking:   --(Pelo o que o Freire disse a mim, sim...)
    public void setCurso(String a){
        this.curso = a;
    }
    
    public void setCargo(String a){
        this.cargo = a;
    }
}