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
import vtc.com.vn.entity.Shipping;

public class ShippingModel {
    static List<Shipping> SHIP= new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public ArrayList<Shipping>select()throws SQLException{
        Connection connection=JDBCConnection.getJDBConnection();
        Statement statement= connection.createStatement();
        ArrayList<Shipping> List= new ArrayList<>();
        try {
            String sql=" call select_Shipping_Model();";
            ResultSet rs= statement.executeQuery(sql);
            while (rs.next()) {
                int Shipping_ID= rs.getInt(1);
                String Shipping_Name=rs.getString(2);
                String Shipping_Date=rs.getString(3);
                double price=rs.getDouble(4);
                String Shipping_Status=rs.getString(5);

                List.add(new Shipping(Shipping_ID, Shipping_Name, Shipping_Date, price, Shipping_Status));
            }
            return List;
        } catch (SQLException ex) {
            //TODO: handle exception
            ex.printStackTrace();
        }finally{
            try {
                statement.close();
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
        return null;
    }
    public static void Select_Shipping()throws SQLException{
        SHIP= new ShippingModel().select();
        CommandLineTableGui CTG = new CommandLineTableGui();
        CTG.setShowVerticalLines(true);
        CTG.setHeaders("Shipping_ID","Shipping_Name","Shipping_Date","Shipping_Price","Shipping_Status");
        for (int i = 0; i < SHIP.size(); i++) {
            CTG.addRow(String.valueOf(SHIP.get(i).getShipping_ID()),String.valueOf(SHIP.get(i).getShipping_Name()),String.valueOf(SHIP.get(i).getShipping_Date()),String.valueOf(SHIP.get(i).getPrice()),String.valueOf(SHIP.get(i).getShipping_Status()));
        }
        CTG.print();
    }
     
}