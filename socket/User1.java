package socket;

import java.io.Serializable;

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

    public User1() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User1{" + "userName=" + userName + ", passWord=" + passWord + ", address=" + address + ", birthday=" + birthday + ", sex=" + sex + '}';
    }
    

    
}
