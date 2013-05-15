/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

/**
 *
 * @author Bentsi
 */
public class User {
    
    private static int countUsers;
    private String ID;
    private String Username;
    private String Password;
    private String Mail;
    private String Phone;
    
    
    public User()
    {
        ID = String.format("USR_" + "%d", ++countUsers); // id will be set automatically
    }
    
    public User(String name, String mail, String phone, String password)
    {
        ID = String.format("USR_" + "%d", ++countUsers); // id will be set automatically
        
        
        //need validation
        
        
        Username = name;
        Mail = mail;
        Phone = phone;
        Password = password;
    }

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @return the Username
     */
    public String getUsername() {
        return Username;
    }

    /**
     * @param Username the Username to set
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * @return the Mail
     */
    public String getMail() {
        return Mail;
    }

    /**
     * @param Mail the Mail to set
     */
    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    /**
     * @return the Phone
     */
    public String getPhone() {
        return Phone;
    }

    /**
     * @param Phone the Phone to set
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    @Override
    public String toString() {
        return "User{" + "ID=" + ID + ", Name=" + Username + ", Password=" + Password + ", Mail=" + Mail + ", Phone=" + Phone + '}';
    }
    
    
}
