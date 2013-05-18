/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Validations;

import java.util.InputMismatchException;

/**
 *
 * @author Bentsi
 */
public class InvalidUserPasswordException extends InputMismatchException {
    
    private String error;
    
    public InvalidUserPasswordException(String message) 
    { 
        super(message); 
        error = message;
    }
    
     public String getError()
    {
      return error;
    }
}
