package my.server;

import my.interfaces.InterfaceOne;
import my.database.Database;
import javax.ejb.Stateless;
import my.utilities.User;

@Stateless
public class SomeBean implements InterfaceOne{

    public void getSome() {
        System.out.println("DO IT");
        Database test = new Database();
    }

    public User getUser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
