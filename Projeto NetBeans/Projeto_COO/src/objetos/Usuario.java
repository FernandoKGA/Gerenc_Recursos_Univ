/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

public class Usuario {
    private String nome;
    private String nUSP; //poderia ser short por questão de tamanho  --(nao temos problemas de armazenamento...)
    private String email;
    private int telefone; //poderia ser short por questão de tamanho  --(nao temos problemas de armazenamento...)
    private Cargos cargo;
    private Cursos curso;
    
    /*Fico na dúvida se precisa ser o nome inteiro ou se vai ser só uma sigla. 
    A principio, vou fazer como sigla, e depois eu penso em como vou alterar*/

    private enum Cargos{
        ALUNO_GRAD, ALUNO_POS_GRAD, PROFESSOR, COORDENADOR, REITOR, SECRETARIO, BIBLIOTECARIO }

    private enum Cursos{
        SI, MKT, GPP, OBS, GA, BTC, EFS, LZT, LCN, GER, TM }

    public Usuario(){
    }
    
    public Usuario(String nome, String nUSP,String email, String telefone, String curso, String cargo){
        Usuario u = new Usuario();
        u.setNome(nome);
        u.setNUSP(nUSP);
        u.setEmail(email);
        u.setTelefone(telefone);
        u.setCurso(curso);
        u.setCargo(cargo);
    }
    
    //getters e setters
    public String getNome(){
        return this.nome;
    }
    public String getNUSP(){
        return this.nUSP;
    }
    public int getTelefone(){
        return this.telefone;
    }
    public String getEmail(){
        return this.email;
    }
    public String getCurso(){
        return this.curso.name();
        //Se no BD estiver SI, vai aparecer SI.
    }
    public String getCargo(){
        return this.cargo.name();
        //Se no BD estiver FUNCIONARIO, vai aparecer FUNCIONARIO
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
        if(telefone.length() != 11){
            System.out.println("Telefone incorreto - Coloque DDD + números, apenas em numerais");
        }
        else{
            this.telefone = Integer.parseInt(telefone);
        }
        //ainda tem verificações a fazer!
    }
    
    //enums - estou tratando da forma correta? :thinking:   --(Pelo o que o Freire disse a mim, sim...)
    public void setCurso(String a){
        for(Cursos cursos : Cursos.values()){
            if(cursos.toString().equalsIgnoreCase(a)){
                this.curso = cursos;
            }
        }
    }
    
    public void setCargo(String a){
        for(Cargos cargos : Cargos.values()){
            if(cargos.toString().equalsIgnoreCase(a)){
                this.cargo = cargos;
            }
        }
    }
}