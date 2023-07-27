package model;

import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User1 implements Serializable{
    
    private String userName;
    private String passWord;
    private String address;
    private String birthday;
    private String sex;

    public User1(String userName, String passWord, String address, String birthday, String sex) {
        this.userName = userName;
        this.passWord = passWord;
        this.address = address;
        this.birthday = birthday;
        this.sex = sex;
    }

    
}
