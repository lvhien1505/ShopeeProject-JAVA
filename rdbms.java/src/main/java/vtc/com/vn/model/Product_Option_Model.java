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
import vtc.com.vn.entity.Product_Option;

public class Product_Option_Model {
    static List<Product_Option> POT= new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public ArrayList<Product_Option> Select(String Code)throws SQLException{
        Connection connection=JDBCConnection.getJDBConnection();
        Statement statement= connection.createStatement();
        ArrayList<Product_Option> List= new ArrayList<>();
        try {
            String sql="call Product_Option('"+Code+"');";
            ResultSet rs= statement.executeQuery(sql);
            while (rs.next()) {
                int product_ID = rs.getInt(1);
                String product_Code=rs.getString(2);
                String Product_Name=rs.getString(3);
                String PO_Name=rs.getString(4);
                String option_Name=rs.getString(5);

                List.add(new Product_Option(product_ID, product_Code, Product_Name, PO_Name, option_Name));
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
    public static void Select_Product_Option()throws SQLException{
        
        boolean check=true;
        while (check) {
            System.out.println("Enter Product_Code:");
            String Code= sc.nextLine();
            POT= new Product_Option_Model().Select(Code);
            int kt=0;
            for (int i = 0; i < POT.size(); i++) {
                if (POT.get(i).getProduct_Code().equals(Code)) {
                    kt =1;
                }
            }
            if (kt==1) {
                System.out.println("Product_Code Hợp Lê!");
                check=false;
            }
            else{
                System.out.println("Product_Code Không Tồn Tại!");
                check=true;
            }
        }
         CommandLineTableGui CTG = new CommandLineTableGui();
         CTG.setShowVerticalLines(true);
         CTG.setHeaders("Product_ID", "Product_Code", "Product_Name", "PO_Name", "Option_Name");
         for (int i = 0; i < POT.size(); i++) {
             CTG.addRow(String.valueOf(POT.get(i).getProduct_ID()),String.valueOf(POT.get(i).getProduct_Code()),
             String.valueOf(POT.get(i).getProduct_Name()),String.valueOf(POT.get(i).getPO_Name()),String.valueOf(POT.get(i).getOption_Name()));
         }
         CTG.print();
    }
}