package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface UserDAO extends Remote {

    boolean insertUser(User1 user) throws RemoteException;
    
}
