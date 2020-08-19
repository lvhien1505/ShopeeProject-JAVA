package vtc.com.vn.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import vtc.com.vn.application.CommandLineTableGui;
import vtc.com.vn.connection.JDBCConnection;
import vtc.com.vn.entity.Category;

public class CategoryModel {
    static List<Category> CTE= new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public ArrayList<Category>Select()throws SQLException{
        Connection connection=JDBCConnection.getJDBConnection();
        Statement statement=connection.createStatement();
        ArrayList<Category>List= new ArrayList<>();
        try {
            String sql="call Select_Category();";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int category_ID= rs.getInt(1);
                int PP_ID=rs.getInt(2);
                String PP_Name=rs.getString(3);
                String Category_Name=rs.getString(4);

                List.add(new Category(category_ID, PP_ID, PP_Name, Category_Name));

            }
            return List;
        } catch (SQLException ex) {
            //TODO: handle exception
            ex.printStackTrace();
        }finally{
            try {
                statement.close();
            } catch (SQLException ex) {
                //TODO: handle exception
            }
        }
        return null;
    }
    public static void select_Category()throws SQLException{
        CTE= new CategoryModel().Select();
        CommandLineTableGui CTG = new CommandLineTableGui();
        CTG.setShowVerticalLines(true);
        CTG.setHeaders("Category_ID", "PP_ID", "PP_Name", "Category_Name");
        for (int i = 0; i < CTE.size(); i++) {
            CTG.addRow(String.valueOf(CTE.get(i).getCategory_ID()),String.valueOf(CTE.get(i).getPP_ID()),
            String.valueOf(CTE.get(i).getPP_Name()),String.valueOf(CTE.get(i).getCategory_Name()));
        }
        CTG.print();
    }
}