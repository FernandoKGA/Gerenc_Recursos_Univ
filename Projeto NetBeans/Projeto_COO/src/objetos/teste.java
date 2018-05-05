/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author informatica
 */
public class teste {

    public static void main(String[] args) {
        Recurso s = new Recurso();
        s.setNome("João");
        s.setPredio("I1");
        s.setTipo("SALA");
        try{
            String predio = s.getPredio();
            System.out.println(predio);
        }catch(NullPointerException e){
            System.out.println("Não foi encontrado, por favor tente novamente!");
        }
    }
}
