package dao;

import model.User;

import java.util.List;
import model.User1;

public interface UserDAO {
    void createTableUser();

    void deleteTbl();

    boolean insertUser(User user);
    
    int updateInfor(String username, String fullname, String pass);

    boolean deleteUser(String username);

    List<User> getListUser();
    
    List<User1> getListUser1(String username);
    
    int countListUser();

    User findOne(String username);
    
    boolean checkAccount(String username, String password);
}
