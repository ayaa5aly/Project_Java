package dao;

import javax.swing.JOptionPane;
import model.User;
import java.sql.*;
import java.util.ArrayList;

public class UserDao {

    public static void save(User user) {
        String query = "insert into user (name,email,mobileNumber,address,password,securityQuestion,answer,status)  Values('" + user.getName() + "', '" + user.getEmail() + "', '" + user.getMobileNumber() + "', '" + user.getAddress() + "', '" + user.getPassword() + "', '" + user.getSecurityQuestion() + "', '" + user.getAnswer() + "', 'false')";
        DBOperations.setDataOrDelete(query, "Registered Successfuly ! Wait for Admin Approval ");
    }

    public static User Login(String Email, String Password) {
        User user = null;
        try {
            ResultSet rs = DBOperations.getData("select * from user where email = '" + Email + "' and password = '" + Password + "'");
            while (rs.next()) {
                user = new User();
                user.setStatus(rs.getString("status"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }

    public static User getSecurityQuestion(String email) {
        User user = null;
        try {
            ResultSet rs = DBOperations.getData("select * from user where email = '" + email + "'");
            while (rs.next()) {
                user = new User();
                user.setSecurityQuestion(rs.getString("securityquestion"));
                user.setAnswer(rs.getString("answer"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }

    public static ArrayList<User> getAllRecords(String email) {
        ArrayList<User> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DBOperations.getData("select * from user where email like '%" + email + "%'");
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setMobileNumber(rs.getString("mobilenumber"));
                user.setAddress(rs.getString("address"));
                user.setSecurityQuestion(rs.getString("securityquestion"));
                user.setStatus(rs.getString("status"));
                arrayList.add(user);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static void ChangeStatus(String email, String Status) {
        String query = "update user set status = '" + Status + "' where email = '" + email + "'";
        DBOperations.setDataOrDelete(query, "Status Changed Successfully.");
    }

    public static void ChangePassord(String email, String OldPassword, String NewPassword) {
        try {
            ResultSet rs = DBOperations.getData("select * from user where email = '" + email + "' and password = '" + OldPassword + "'");
            if (rs.next()) {
                update(email, NewPassword);
            } else {
                JOptionPane.showMessageDialog(null, "Old Password is wrong!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void ChangeSecurityQuestion(String email, String password, String SecurityQuestion, String answer) {
        try {
            ResultSet rs = DBOperations.getData("select * from user where email = '" + email + "' and password = '" + password + "'");
            if (rs.next()) {
                update(email, SecurityQuestion, answer);
            } else {
                JOptionPane.showMessageDialog(null, "Password is wrong!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void update(String email, String newPassword) {
        String query = "update user set password = '" + newPassword + "' where email = '" + email + "'";
        DBOperations.setDataOrDelete(query, "Password Changed Successfully.");
    }

    public static void update(String email, String SecurityQuestion, String answer) {
        String query = "update user set securityquestion = '" + SecurityQuestion + "', answer = '" + answer + "' where email = '" + email + "'";
        DBOperations.setDataOrDelete(query, "Security Question Changed Successfully.");
    }

}
