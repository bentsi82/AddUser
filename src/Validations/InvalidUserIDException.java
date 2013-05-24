/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Validations;


/**
 *
 * @author Bentsi
 */
public class InvalidUserIDException extends Exception {
    
    private String error;
    
    public InvalidUserIDException(String message) 
    { 
        super(message); 
        error = message;
    }
    
     public String getError()
    {
      return error;
    }
}
