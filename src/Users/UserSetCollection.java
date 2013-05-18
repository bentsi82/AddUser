/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import Serialization.Serializer;
import java.util.*;

/**
 *
 * @author Bentsi
 */
public class UserSetCollection<User>{
    
    private Set<User> userset;

    
    public UserSetCollection()
    {
        Set<User> saveduserset = Serializer.deserialzeUserSet();
        
        if (saveduserset != null)
            userset = saveduserset;
        else
            userset = new LinkedHashSet<User>();
        
    }
    
    public void addUser(User user)
    {
        userset.add(user);
    }
    
    public Set<User> getUserSet() {
        return userset;
    }
}
