package objetos;

public class Reserva {

    private String nome;
    private Tipos tipo;
    private Predios predio;

    private enum Tipos {
    } //Quais são os tipos mesmo?

    private enum Predios {
        CB,I1,I3,I5,M7,A2,INCUB    } //que predios que a gente vai ter? Eita

    public Reserva() {
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
