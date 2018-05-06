/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author RocketLion
 */
public class RegrasNegocioException extends Exception{
    public RegrasNegocioException(){
        super();
    }
    
    public RegrasNegocioException(String msg){
        super(msg);
    }
    
    public RegrasNegocioException(Throwable cause){
        super(cause);
    }
}
