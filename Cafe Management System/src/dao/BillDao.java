package dao;

import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;
import model.Bill;

public class BillDao {

    public static String getId() {
        int id = 1;
        try {
            ResultSet rs = DBOperations.getData("select max(id) from bill");
            if (rs.next()) {
                id = rs.getInt(1);
                id++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return String.valueOf(id);
    }

    public static void save(Bill bill) {
        String query = "insert into bill values('" + bill.getId() + "', '" + bill.getName() + "', '" + bill.getMobilenumber() + "', '" + bill.getEmail() + "', '" + bill.getDate() + "', '" + bill.getTotal() + "', '" + bill.getCreated_By() + "')";
        DBOperations.setDataOrDelete(query, "Bill Details Add Successfully.");
    }

    public static ArrayList<Bill> getAllRecordsByInc(String date) {
        ArrayList<Bill> araryList = new ArrayList<>();
        try {
            ResultSet rs = DBOperations.getData("select * from bill where date like '%" + date + "%'");
            while(rs.next()){
                Bill bill = new Bill();
                bill.setId(rs.getInt("id"));
                bill.setName(rs.getString("name"));
                bill.setMobilenumber(rs.getString("mobilenumber"));
                bill.setEmail(rs.getString("email"));
                bill.setDate(rs.getString("date"));
                bill.setTotal(rs.getString("total"));
                bill.setCreated_By(rs.getString("Created_By"));
                araryList.add(bill);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return araryList;
    }
    
    public static ArrayList<Bill> getAllRecordsByDesc(String date) {
        ArrayList<Bill> araryList = new ArrayList<>();
        try {
            ResultSet rs = DBOperations.getData("select * from bill where date like '%" + date + "%' order By id DESC");
            while(rs.next()){
                Bill bill = new Bill();
                bill.setId(rs.getInt("id"));
                bill.setName(rs.getString("name"));
                bill.setMobilenumber(rs.getString("mobilenumber"));
                bill.setEmail(rs.getString("email"));
                bill.setDate(rs.getString("date"));
                bill.setTotal(rs.getString("total"));
                bill.setCreated_By(rs.getString("Created_By"));
                araryList.add(bill);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return araryList;
    }
}
