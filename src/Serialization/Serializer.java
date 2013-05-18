/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Set;

/**
 *
 * @author Bentsi
 */
public class Serializer {
    
    public static void serializeUserSet(Set userset){
 
        try{

             FileOutputStream fout = new FileOutputStream(System.getProperty("user.dir") + "\\Files\\UserSet.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fout);   
             oos.writeObject(userset);
             oos.close();

        }catch(Exception ex){
             ex.printStackTrace();
        }
   }
    
   public static Set deserialzeUserSet(){
 
        try{

            FileInputStream fin = new FileInputStream(System.getProperty("user.dir") + "\\Files\\UserSet.ser");
            ObjectInputStream ois = new ObjectInputStream(fin);
            Set userset = (Set) ois.readObject();
            ois.close();

            return userset;

        }catch(Exception ex){
            ex.toString();
            return null;
        } 
   } 
    
}
