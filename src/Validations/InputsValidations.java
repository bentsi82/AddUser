/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;
import java.util.*;
import Users.User;

/**
 *
 * @author Bentsi
 */
public class InputsValidations {
    
    
    public static void validateID(String field, Set userset) throws InvalidUserIDException
    {
        int numtotal = 0;
        int numtmp;
		
        for (int i=0 ; i<field.length() ; i++)
        {
            if (i % 2 == 0)
                numtmp = field.charAt(i)-48;
            else
                numtmp = (field.charAt(i)-48)*2;
            
            if (numtmp > 9)
                numtmp = (numtmp%10) + (numtmp/10);
            
            numtotal+= numtmp;
        }

        if (field.charAt(0)-48 != 0 || numtotal % 10 != 0)
        {
            throw new InvalidUserIDException("ID Error: Ilegal ID Number");
        }
        
        for (Object obj : userset)
            if (((User)obj).getID().equalsIgnoreCase(field))
                throw new InvalidUserIDException("ID Error: ID Already Exists In The System");
    }
    
    public static void validateUserName(String field, Set userset) throws InvalidUserNameException
    {
        if (field.length() == 0)
            throw new InvalidUserNameException("Name Error: Fill In Your Name");
        
        if (field.length() > 15)
            throw new InvalidUserNameException("Name Error: Must Be Under 15 Characters");
        
        for (Object obj : userset)
            if (((User)obj).getUsername().equalsIgnoreCase(field))
                throw new InvalidUserNameException("Name Error: Name Already Exists In The System");
    }
    
    public static void validateEmail(String field, Set userset) throws InvalidEmailAddressException
    {
        final String EMAIL_PATTERN = 
            "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(field);
        
        if (!matcher.matches())
            throw new InvalidEmailAddressException("Email Error: Ilegal Mail Format");
        
        for (Object obj : userset)
            if (((User)obj).getMail().equalsIgnoreCase(field))
                throw new InvalidEmailAddressException("Email Error: Address Already Exists In The System");
    }
    
    public static void validatePhone(String field) throws InvalidPhoneNumberFormatException
    {
        if (field.charAt(0)-48 != 0 ||
            field.charAt(1)-48 != 5 ||
            field.charAt(2)-48 == 1 ||
            field.charAt(0)-48 == 5)
              throw new InvalidPhoneNumberFormatException("Phone Error: Ilegal Number"); 
    }
    
    public static void validatePassword(char[] pass, char[] confirm) throws InvalidUserPasswordException
    {
        boolean bgletter = false, smletter = false, digit = false;
        
        for (char c : pass)
        {
            if (c >= 'a' && c <= 'z')
                smletter = true;
            
            if (c >= 'A' && c <= 'Z')
                bgletter = true;
            
            if (c >= '0' && c <= '9')
                digit = true;
        }
        
        if (!smletter || !bgletter || !digit)
            throw new InvalidUserNameException("Password Error: Must Be At Least 1 Small Letter, 1 Big Letter, 1 Digit");
        
        if (!Arrays.equals(pass, confirm))
            throw new InvalidUserNameException("Password Error: Not The Same Password");
    }
    
}
