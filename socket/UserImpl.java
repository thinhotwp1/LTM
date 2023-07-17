/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socket;


import config.MySQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ThinhLD
 */
public class UserImpl implements UserDAO {

    private static UserImpl sInstance;

    public static UserImpl getInstance() {
        if (sInstance == null) {
            sInstance = new UserImpl();
        }
        return sInstance;
    }

    @Override
    public void createTableUser() {
        // create if not exist
        // table user (tenTaiKhoan,matKhau,tenNhanVien,role,force_update_matKhau)
        PreparedStatement ps = null;
        Connection conn = MySQLConnection.getInstance().getConnection();
        //.. coding
        String sql = "CREATE TABLE IF NOT EXISTS tbl_user (\n"
                + "    userName     VARCHAR(45),\n"
                + "    passWord         VARCHAR(45),\n"
                + "    address     VARCHAR(45),\n"
                + "    birthday     VARCHAR(45),\n"
                + "    sex     VARCHAR(45),\n"
                + "    PRIMARY KEY (userName)\n"
                + ");";
        try {
            ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            conn.commit();
        } catch (SQLException ex) {
            System.out.println("Loi khi tao bang user:\n" + ex);
        } finally {
            MySQLConnection.getInstance().closePrepareStatement(ps);
//            MySQLConnection.getInstance().closeConn(conn);
        }
    }


    @Override
    public List<User1> getListUser1(String tenTaiKhoan) {
        List<User1> users = new ArrayList<>();
        //get list 
        String sql = "SELECT * FROM tbl_user where userName= ?";

        Connection conn = MySQLConnection.getInstance().getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

            
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, tenTaiKhoan);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                String userName = rs.getString("userName");
                String passWord = rs.getString("passWord");
                String address = rs.getString("address");
                String birthday = rs.getString("birthday");
                String sex = rs.getString("sex");
                users.add(new User1(userName, passWord, address, birthday, sex));
            }
        } catch (SQLException ex) {
            System.out.println("Loi khi lay list user" + ex);
        } finally {
            MySQLConnection.getInstance().closeResultSet(rs);
            MySQLConnection.getInstance().closePrepareStatement(ps);
//            MySQLConnection.getInstance().closeConn(conn);
        }
        return users;
    }
    @Override
    public boolean insertUser(User1 user) {
        boolean status = false;
        //insert ,check exist user, role
        if (findOne(user.getUserName()) == null) {
//            if (!checkRole(user.getRoleId())) {
            String sql = "INSERT INTO t_user(userName, passWord, address, birthday, sex) VALUES (?,?,?,?,?);";
            Connection conn = MySQLConnection.getInstance().getConnection();
            PreparedStatement ps = null;

            try {
                ps = conn.prepareStatement(sql);
                ps.setString(1, user.getUserName());
                ps.setString(2, user.getPassWord());
                ps.setString(3, user.getAddress());
                ps.setString(4, user.getBirthday());
                ps.setString(5, user.getSex());
                ps.executeUpdate();
                conn.commit();
                status = true;
            } catch (SQLException ex) {
                System.out.println("Loi khi insert user:\n" + ex);
            } finally {
                MySQLConnection.getInstance().closePrepareStatement(ps);
//                MySQLConnection.getInstance().closeConn(conn);
            }
        }
        return status;
    }
    @Override
    public User1 findOne(String tenTaiKhoan) {
        String sql = "SELECT * FROM t_user WHERE userName = ?";
        Connection conn = MySQLConnection.getInstance().getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, tenTaiKhoan);
            rs = ps.executeQuery();
            if (rs.next()) {
                String userName = rs.getString("userName");
                String passWord = rs.getString("passWord");
                String address = rs.getString("address");
                String birthday = rs.getString("birthday");
                String sex = rs.getString("sex");
                return new User1(userName, passWord, address, birthday, sex);
            } else {
                return null;
            }
        } catch (SQLException ex) {
            System.out.println("Loi khi tim tai khoan:\n" + ex);
        } finally {
            MySQLConnection.getInstance().closeResultSet(rs);
            MySQLConnection.getInstance().closePrepareStatement(ps);
//            MySQLConnection.getInstance().closeConn(conn);
        }
        return null;
    }
}
