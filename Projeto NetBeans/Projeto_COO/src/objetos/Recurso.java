/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

public class Recurso {

    private String nome;
    private Tipos tipo;
    private Predios predio;

    private enum Tipos {
        SALA, LABORATORIO, AUDITORIO 
    } 

    private enum Predios {
        CB,I1,I3,I5,M7,A2,INCUB 
    } 

    public Recurso() {
    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo.name();
    }

    public String getPredio() {
        return predio.name();
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
       try{ 
        for(Predios predios : Predios.values()){
            if(predios.name().equalsIgnoreCase(predio)){
                System.out.println("ACHOU!");
                this.predio = predios;
            }
        }
       }catch(Exception e){
           e.printStackTrace();
       }
    }
    
    public void imprimeENUM(){
        for(Predios predios: Predios.values()){
            System.out.println(predios.name());
        }
    }

}
