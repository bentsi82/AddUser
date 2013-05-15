/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import java.util.*;

/**
 *
 * @author Bentsi
 */
public class UserCollection<User> implements Comparator<User>{
    
    private static Set<User> userlist;

    
    public UserCollection()
    {
        userlist = new HashSet<User>();
    }
    
    public int compare(User usr1, User usr2){
       return usr1. - User.getSalary();
    }
    
    public static void addUser(User u)
    {
        userlist.add(u);
    }
    
    public static Set<User> getUserlist() {
        return userlist;
    }
}
