package dao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Category;
import java.sql.*;
public class CategoryDao {
    public static void save(Category category){
        String query = "insert into category (name) values('"+ category.getName() + "')";
        DBOperations.setDataOrDelete(query, "Category Added Successfully.");
    }
    
    public static ArrayList<Category> getAllRecords(){
        ArrayList<Category>arrayList = new ArrayList<>();
        try{
            ResultSet rs = DBOperations.getData("select * from category");
            while(rs.next()){
                Category category = new Category();
                category.setId(rs.getInt("id"));
                category.setName(rs.getString("name"));
                arrayList.add(category);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    public static void delete(String id){
        String query = "delete from category where id = " + id;
        DBOperations.setDataOrDelete(query, "Category Deleted Successfully.");
    }
}
