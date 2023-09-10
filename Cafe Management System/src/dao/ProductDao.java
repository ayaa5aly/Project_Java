package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Product;

public class ProductDao {

    public static void Save(Product product) {
        String query = "insert into product (name, category, price) values('" + product.getName() + "', '" + product.getCategory() + "', '" + product.getPrice() + "')";
        DBOperations.setDataOrDelete(query, "Product Add Successfully.");
    }

    public static ArrayList<Product> getAllRecords() {
        ArrayList<Product> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DBOperations.getData("select * from product");
            while (rs.next()) {
                Product product = new Product();
                product.setId(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setCategory(rs.getString("category"));
                product.setPrice(rs.getString("price"));
                arrayList.add(product);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    public static void Update(Product product){
        String query = "update product set name = '" + product.getName() + "', category = '" + product.getCategory() + "', price = '" + product.getPrice() + "' where id = '" + product.getId() + "'";
        DBOperations.setDataOrDelete(query, "Product Updated Successfully.");
    }
    
    public static void Delete(String id){
        String query = "Delete from product where id = '" + id + "'";
        DBOperations.setDataOrDelete(query, "Product Deleted Successfully.");
    }
    
    public static ArrayList<Product> getAllRecordsByCategory(String category) {
        ArrayList<Product> arraylist = new ArrayList<>();
        try {
            ResultSet rs = DBOperations.getData("select * from product where category ='" + category + "'");
            while (rs.next()) {
                Product product = new Product();
                product.setName(rs.getString("name"));
                arraylist.add(product);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arraylist;
    }
    
    public static ArrayList<Product> filterProductByname(String name, String category) {
        ArrayList<Product> arraylist = new ArrayList<>();
        try {
            ResultSet rs = DBOperations.getData("select * from product where name like '%" + name + "%'and category ='" + category + "'");
            while (rs.next()) {
                Product product = new Product();
                product.setName(rs.getString("name"));
                arraylist.add(product);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arraylist;
    }
    
    public static Product getProductByname(String name) {
        Product product = new Product();
        try {
            ResultSet rs = DBOperations.getData("select * from product where name = '" + name + "'");
            while (rs.next()) {
                product.setName(rs.getString(2));
                product.setCategory(rs.getString(3));
                product.setPrice(rs.getString(4));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return product;
    }
}
