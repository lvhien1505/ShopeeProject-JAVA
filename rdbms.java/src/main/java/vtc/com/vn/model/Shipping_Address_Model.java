package vtc.com.vn.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import vtc.com.vn.application.CommandLineTableGui;
import vtc.com.vn.connection.JDBCConnection;
import vtc.com.vn.entity.Shipping_Address;
import vtc.com.vn.util.Validate;

public class Shipping_Address_Model {
    static List<Shipping_Address> SAD= new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public ArrayList<Shipping_Address> select(int id)throws SQLException{
        Connection connection=JDBCConnection.getJDBConnection();
        Statement statement=connection.createStatement();
        ArrayList<Shipping_Address> List= new ArrayList<>();
        try {
            String sql=" call Select_Shipping_Address("+id+");";
            ResultSet rs= statement.executeQuery(sql);
            while (rs.next()) {
                int address_ID=rs.getInt(1);
                int customer_ID=rs.getInt(2);
                String address_Details=rs.getString(3);
                List.add(new Shipping_Address(address_ID, customer_ID, address_Details));

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
    public void insert(Shipping_Address SAD)throws SQLException{
         PreparedStatement preparedStatement=null;
         Connection connection=JDBCConnection.getJDBConnection();
         try {
             String sql="insert into shipping_address(customer_ID,address_Details) values(?,?)";
             preparedStatement=(PreparedStatement)connection.prepareStatement(sql);
             preparedStatement.setInt(1, SAD.getCustomer_ID());
             preparedStatement.setString(2, SAD.getAddress_Details());
             preparedStatement.execute();
         } catch (SQLException ex) {
             //TODO: handle exception
             ex.printStackTrace();
         }finally{
             try {
                 preparedStatement.close();
             } catch (SQLException ex) {
                 //TODO: handle exception
             }
         }
    }
    // public ArrayList<Shipping_Address> select2()throws SQLException{
    //     Connection connection=JDBCConnection.getJDBConnection();
    //     Statement statement= connection.createStatement();
    // }
    public static void Select_Shipping_Address()throws SQLException{
        System.out.println("Enter Customer_ID:");
        int customer_ID=Integer.parseInt(new Validate().checkINT());
        SAD= new Shipping_Address_Model().select(customer_ID);
        CommandLineTableGui CTG = new CommandLineTableGui();
        CTG.setShowVerticalLines(true);
        CTG.setHeaders("Address_ID","Customer_ID","Address_Details");
        for (int i = 0; i < SAD.size(); i++) {
            CTG.addRow(String.valueOf(SAD.get(i).getAddress_ID()),String.valueOf(SAD.get(i).getCustomer_ID()),String.valueOf(SAD.get(i).getAddress_Details()));
        }
        CTG.print();
    }
    public static void Insert_Shipping_Address()throws SQLException{
        Shipping_Address SA= new Shipping_Address();
        Shipping_Address_Model SAM= new Shipping_Address_Model();
        System.out.println("Enter Customer_ID:");
        int customer_ID=Integer.parseInt(new Validate().checkINT());
        SA.setCustomer_ID(customer_ID);
        System.out.println("Enter Address_Details:");
        String address_Details=new Validate().checkEmpty();
        SAD.add(SA);
        SA.setAddress_Details(address_Details);
        SAM.insert(SA);


    }
} 