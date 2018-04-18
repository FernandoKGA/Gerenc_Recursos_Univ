/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;
public class Usuario {
    private String nome;
    private int nUSP; //poderia ser short por questão de tamanho
    private int telefone; //poderia ser short por questão de tamanho
    private String cargo;
    private String curso;
    
    private enum Cargos{
        ALUNO, PROFESSOR, COORDENADOR
    }
    
    /*Fico na dúvida se precisa ser o nome inteiro ou se vai ser só uma sigla. 
      A principio, vou fazer como sigla, e depois eu penso em como vou alterar*/
    private enum Cursos{
        BIOTEC, LCN, EFS, GERONTO, GA, GPP, LZT, MKT, OBS, SI, TM
    }

    public Usuario(){
    }
    
    public Usuario(String nome, int nUSP, String telefone, String curso, String cargo){
        Usuario u = new Usuario();
        u.setNome(nome);
        u.setNUSP(nUSP);
    }
    
    //getters e setters
    public String getNome(){
        return this.nome;
    }
    public int getNUSP(){
        return this.nUSP;
    }
    public int getTelefone(){
        return this.telefone;
    }
    public String getCurso(){
        return this.curso;
    }
    public String getCargo(){
        return this.cargo;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setNUSP(int nUSP){
        this.nUSP = nUSP;
    }
    
    //exige uma verificação de caracteres - não pode ter letra
    public void setTelefone(String telefone){
        if(telefone.length() != 11){
            System.out.println("Telefone incorreto - COloque DDD + números, apenas em numerais");
        }
        
        //ainda tem verificações a fazer!
        this.telefone = Integer.parseInt(telefone);
    }
    
    //enums - estou tratando da forma correta? :thinking:
    public void setCurso(String a){
        for(Cursos cursos : Cursos.values()){
            if(cursos.toString().equalsIgnoreCase(a)){
                this.curso = a;
            }
        }
    }
    
    public void setCargo(String a){
        for(Cargos cargos : Cargos.values()){
            if(cargos.toString().equalsIgnoreCase(a)){
                this.cargo = a;
            }
        }
    }
    
    
    
}
