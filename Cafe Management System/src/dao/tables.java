package dao;

import javax.swing.JOptionPane;

public class tables {

    public static void main(String[] args) {
        try {
            String userTable = "CREATE TABLE user (id INT  AUTO_INCREMENT, name VARCHAR(255), email VARCHAR(255) UNIQUE, mobilenumber VARCHAR(255), address VARCHAR(255), password VARCHAR(255), securityquestion VARCHAR(255), answer VARCHAR(255), status VARCHAR(255), PRIMARY KEY (id))";
            DBOperations.setDataOrDelete(userTable, "User Table Created Successfully.");

            String adminDetails = "insert into user (name, email, mobilenumber, address, password, securityquestion, answer, status) values('anas', 'anas@gmail.com', '01010101010', 'Egypt', '2192003', 'What is the name of the team?', 'NoName', 'true')";
            DBOperations.setDataOrDelete(adminDetails, "Admin Details Added Successfully.");

            String categoryTable = "create table category(id INT AUTO_INCREMENT, name VARCHAR(255), PRIMARY KEY (id))";
            DBOperations.setDataOrDelete(categoryTable, "Category Table Created Successfully.");
            
            String productTable = "create table product(id INT AUTO_INCREMENT, name VARCHAR(255), category VARCHAR(255), price VARCHAR(255), PRIMARY KEY (id))";
            DBOperations.setDataOrDelete(productTable, "Product Table Created Successfully.");
            
            String billTable = "create table bill(id INT AUTO_INCREMENT, name VARCHAR(255), mobilenumber VARCHAR(255), email VARCHAR(255), date VARCHAR(255), total VARCHAR(255), Created_By VARCHAR(255), PRIMARY KEY (id))";
            DBOperations.setDataOrDelete(billTable, "Bill Table Created Successfully.");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
