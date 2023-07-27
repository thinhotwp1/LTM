/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmi;

import config.MySQLConnection;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ThinhLD
 */
public class UserImpl extends UnicastRemoteObject implements UserDAO {

    private static UserImpl sInstance;

    public static UserImpl getInstance() throws RemoteException {
        if (sInstance == null) {
            sInstance = new UserImpl();
        }
        return sInstance;
    }

    protected UserImpl() throws RemoteException {
        super();
    }

    @Override
    public boolean insertUser(User1 user) {
        boolean status = false;
        //insert ,check exist user, role
//            if (!checkRole(user.getRoleId())) {
        String sql = "INSERT INTO tbl_user(userName, passWord, address, birthday, sex) VALUES (?,?,?,?,?);";
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

        return status;
    }
}
