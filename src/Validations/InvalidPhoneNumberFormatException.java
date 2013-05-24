/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Validations;


/**
 *
 * @author Bentsi
 */
public class InvalidPhoneNumberFormatException extends Exception{
    
    private String error;
    
    public InvalidPhoneNumberFormatException(String message) 
    { 
        super(message); 
        error = message;
    }
    
     public String getError()
    {
      return error;
    }
}
