/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

public class Recurso {

    private String nome;
    private Tipos tipo; //via enum?
    private Predios predio; //via enum?

    private enum Tipos {
    } //Quais são os tipos mesmo?

    private enum Predios {
    } //que predios que a gente vai ter? Eita

    public Recurso() {

    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public Tipos getTipo() {
        return tipo;
    }

    public Predios getPredio() {
        return predio;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        for(Tipos tipos : Tipos.values()){
            if(tipos.toString().equalsIgnoreCase(tipo)){
                this.tipo = tipos;
            }
        }
    }

    public void setPredio(String predio) {
        for(Predios predios : Predios.values()){
            if(predios.toString().equalsIgnoreCase(predio)){
                this.predio = predios;
            }
        }
    }

}
