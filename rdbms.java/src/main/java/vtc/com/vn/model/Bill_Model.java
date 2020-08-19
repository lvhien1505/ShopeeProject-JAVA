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
import vtc.com.vn.entity.Bill;
import vtc.com.vn.util.Validate;

public class Bill_Model {
    static List<Bill> BILL = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
//  ---------------------------------------------------Query--------------------------------------------------------
    public ArrayList<Bill> select(int customerID, int orderID) throws SQLException {
        Connection connection = JDBCConnection.getJDBConnection();
        Statement statement = connection.createStatement();
        ArrayList<Bill> list = new ArrayList<>();
        try {
            String sql = "call Bill(" + customerID + "," + orderID + ");";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int order_ID = rs.getInt(1);
                int customer_ID = rs.getInt(2);
                String customer_Name = rs.getString(3);
                String SĐT = rs.getString(4);
                int product_ID = rs.getInt(5);
                String product_Name = rs.getString(6);
                double price = rs.getDouble(7);
                int amount = rs.getInt(8);
                String payment_Type = rs.getString(9);
                String DC_Ship = rs.getString(10);
                String order_Date=rs.getString(11);
                String Shipping_Name = rs.getString(12);
                String Ship_Date = rs.getString(13);
                String Ship_Price = rs.getString(14);
                double total = rs.getDouble(15);
                String customer_Notes=rs.getString(16);
                String order_Status = rs.getString(17);
                list.add(new Bill(order_ID, customer_ID, customer_Name, SĐT, product_ID, product_Name, price, amount,
                        payment_Type, DC_Ship,order_Date,Shipping_Name, Ship_Date, Ship_Price, total,customer_Notes ,order_Status));
            }
            return list;
        } catch (SQLException ex) {
            // TODO: handle exception
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


    public ArrayList<Bill> select2(int customerID) throws SQLException {
        Connection connection = JDBCConnection.getJDBConnection();
        Statement statement = connection.createStatement();
        ArrayList<Bill> list = new ArrayList<>();
        try {
            String sql = "call Bill2("+customerID+");";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int order_ID = rs.getInt(1);
                int customer_ID = rs.getInt(2);
                String customer_Name = rs.getString(3);
                String SĐT = rs.getString(4);
                int product_ID = rs.getInt(5);
                String product_Name = rs.getString(6);
                double price = rs.getDouble(7);
                int amount = rs.getInt(8);
                String payment_Type = rs.getString(9);
                String DC_Ship = rs.getString(10);
                String order_Date=rs.getString(11);
                String Shipping_Name = rs.getString(12);
                String Ship_Date = rs.getString(13);
                String Ship_Price = rs.getString(14);
                double total = rs.getDouble(15);
                String customer_Notes=rs.getString(16);
                String order_Status = rs.getString(17);
                list.add(new Bill(order_ID, customer_ID, customer_Name, SĐT, product_ID, product_Name, price, amount,
                        payment_Type, DC_Ship,order_Date,Shipping_Name, Ship_Date, Ship_Price, total,customer_Notes ,order_Status));
            }
            return list;
        } catch (SQLException ex) {
            // TODO: handle exception
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
    // ------------------------------------------------------------interface--------------------------------------------------------
    public static void select_Bill()throws SQLException{
        System.out.println("Enter Customer_ID:");
        int customerID= Integer.parseInt(new Validate().checkINT());
        System.out.println("Enter Order_ID:");
        int orderID=Integer.parseInt(new Validate().checkINT());
        BILL= new Bill_Model().select(customerID, orderID);
        for (int i = 0; i < BILL.size(); i++) { 
            System.out.println("|------------------------------------------------------------");
            System.out.println("| Order_ID        |"+"    "+BILL.get(i).getOrder_ID());
            System.out.println("|------------------------------------------------------------");
            System.out.println("| Customer_ID     |"+"    "+BILL.get(i).getCustomer_ID());
            System.out.println("|------------------------------------------------------------");
            System.out.println("| Customer_Name   |"+"    "+BILL.get(i).getCustomer_ID());
            System.out.println("|------------------------------------------------------------");
            System.out.println("| Phone_Number    |"+"    "+BILL.get(i).getSĐT());
            System.out.println("|------------------------------------------------------------");
            System.out.println("| Product_ID      |"+"    "+ BILL.get(i).getProduct_ID());
            System.out.println("|------------------------------------------------------------");
            System.out.println("| Product_Name    |"+"    "+BILL.get(i).getProduct_Name());
            System.out.println("|------------------------------------------------------------");
            System.out.println("| Price           |"+"    "+BILL.get(i).getPrice());
            System.out.println("|------------------------------------------------------------");
            System.out.println("| Amount          |"+"    "+BILL.get(i).getAmount());
            System.out.println("|------------------------------------------------------------");
            System.out.println("| Payment_Type    |"+"    "+BILL.get(i).getPayment_Type());
            System.out.println("|------------------------------------------------------------");
            System.out.println("| Address_Ship    |"+"    "+BILL.get(i).getDC_Ship());
            System.out.println("|------------------------------------------------------------");
            System.out.println("| Order_Date      |"+"    "+BILL.get(i).getOrder_Date());
            System.out.println("|------------------------------------------------------------");
            System.out.println("| Shipping_Name   |"+"    "+BILL.get(i).getShipping_Name());
            System.out.println("|------------------------------------------------------------");
            System.out.println("| Shipping_Date   |"+"    "+BILL.get(i).getShip_Date());
            System.out.println("|------------------------------------------------------------");
            System.out.println("| Shipping_Price  |"+"    "+BILL.get(i).getShip_Price());
            System.out.println("|------------------------------------------------------------");
            System.out.println("| Total           |"+"    "+BILL.get(i).getTotal());
            System.out.println("|------------------------------------------------------------");
            System.out.println("| Customer_Note   |"+"    "+BILL.get(i).getCustomer_Notes());
            System.out.println("|------------------------------------------------------------");
            System.out.println("| Status          |"+"    "+BILL.get(i).getOrder_Status());
            System.out.println("|------------------------------------------------------------");
        }
    }
    public static void select_Bill2(int customerID,int orderID)throws SQLException{
        // System.out.println("Enter Customer_ID:");
        // int customerID= Integer.parseInt(sc.nextLine());
        // System.out.println("Enter Order_ID:");
        // int orderID=Integer.parseInt(sc.nextLine());
        BILL= new Bill_Model().select(customerID, orderID);
        for (int i = 0; i < BILL.size(); i++) {
            System.out.println("|------------------------------------------------------------");
            System.out.println("| Order_ID        |"+"    "+BILL.get(i).getOrder_ID());
            System.out.println("|------------------------------------------------------------");
            System.out.println("| Customer_ID     |"+"    "+BILL.get(i).getCustomer_ID());
            System.out.println("|-------------------------------------------------------------");
            System.out.println("| Customer_Name   |"+"    "+BILL.get(i).getCustomer_ID());
            System.out.println("|------------------------------------------------------------");
            System.out.println("| Phone_Number    |"+"    "+BILL.get(i).getSĐT());
            System.out.println("|------------------------------------------------------------");
            System.out.println("| Product_ID      |"+"    "+BILL.get(i).getProduct_ID());
            System.out.println("|------------------------------------------------------------");
            System.out.println("| Product_Name    |"+"    "+BILL.get(i).getProduct_Name());
            System.out.println("|------------------------------------------------------------");
            System.out.println("| Price           |"+"    "+BILL.get(i).getPrice());
            System.out.println("|------------------------------------------------------------");
            System.out.println("| Amount          |"+"    "+BILL.get(i).getAmount());
            System.out.println("|------------------------------------------------------------");
            System.out.println("| Payment_Type    |"+"    "+BILL.get(i).getPayment_Type());
            System.out.println("|------------------------------------------------------------");
            System.out.println("| Address_Ship    |"+"    "+BILL.get(i).getDC_Ship());
            System.out.println("|------------------------------------------------------------");
            System.out.println("| Order_Date      |"+"    "+BILL.get(i).getOrder_Date());
            System.out.println("|------------------------------------------------------------");
            System.out.println("| Shipping_Name   |"+"    "+BILL.get(i).getShipping_Name());
            System.out.println("|------------------------------------------------------------");
            System.out.println("| Shipping_Date   |"+"    "+BILL.get(i).getShip_Date());
            System.out.println("|------------------------------------------------------------");
            System.out.println("| Shipping_Price  |"+"    "+BILL.get(i).getShip_Price());
            System.out.println("|------------------------------------------------------------");
            System.out.println("| Total           |"+"    "+BILL.get(i).getTotal());
            System.out.println("|------------------------------------------------------------");
            System.out.println("| Customer_Note   |"+"    "+BILL.get(i).getCustomer_Notes());
            System.out.println("|------------------------------------------------------------");
            System.out.println("| Status          |"+"    "+BILL.get(i).getOrder_Status());
            System.out.println("|------------------------------------------------------------");
        }
    }
    public static void selectBIll()throws SQLException{
        System.out.println("Enter Customer_ID:");
        int customerID=Integer.parseInt(new Validate().checkINT());
        // System.out.println("Enter Enter Order_ID:");
        // int orderID=Integer.parseInt(new Validate().checkINT());
        BILL=new Bill_Model().select2(customerID);
        CommandLineTableGui CTG = new CommandLineTableGui();
        CTG.setShowVerticalLines(true);
        CTG.setHeaders("Customer_Name", "SĐT", "Pro_Name",
                "Price", "Amount", "Pay", "Ship_Address","Order_Date","Ship_Name","Ship_Date","Ship_Price","Total");
        for (int i = 0; i < BILL.size(); i++) {
            CTG.addRow(String.valueOf(BILL.get(i).getCustomer_Name()),
            String.valueOf(BILL.get(i).getSĐT()),
            String.valueOf(BILL.get(i).getProduct_Name()),String.valueOf(BILL.get(i).getPrice()),
            String.valueOf(BILL.get(i).getAmount()),String.valueOf(BILL.get(i).getPayment_Type()),
            String.valueOf(BILL.get(i).getDC_Ship()),String.valueOf(BILL.get(i).getOrder_Date()),
            String.valueOf(BILL.get(i).getShipping_Name()),String.valueOf(BILL.get(i).getShip_Price()),
            String.valueOf(BILL.get(i).getShip_Date()),String.valueOf(BILL.get(i).getTotal()));
        }
        CTG.print();
    }
}