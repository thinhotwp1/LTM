
package rmi;

import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class SimpleServerProgram {
 
   public static void main(String args[]) {
 
       try {
            UserDAO userDAO = new UserImpl();

            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("userDAO",  userDAO);

            System.out.println("Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
   }
}
