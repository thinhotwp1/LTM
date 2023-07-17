package socket;

import java.util.List;

public interface UserDAO {
    void createTableUser();

    List<User1> getListUser1(String username);
    
    boolean insertUser(User1 user);
    
    User1 findOne(String username);
}
