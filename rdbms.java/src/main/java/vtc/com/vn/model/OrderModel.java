package vtc.com.vn.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import vtc.com.vn.application.ClearTheScreen;
import vtc.com.vn.application.Menu;
import vtc.com.vn.connection.JDBCConnection;
import vtc.com.vn.entity.Order;
import vtc.com.vn.util.Validate;


public class OrderModel {
    static List<Order> ORD= new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public void insert_order(Order ord)throws SQLException{
        PreparedStatement preparedStatement=null;
        Connection connection = JDBCConnection .getJDBConnection();
        try {
            String sql="insert into orders(customer_ID,pay_ID,address_ID,Shipping_ID,order_Date,customer_Notes,order_status)values(?,?,?,?,?,?,?)";
            preparedStatement=(PreparedStatement)connection.prepareStatement(sql);
            preparedStatement.setInt(1, ord.getCustomer_ID());
            preparedStatement.setInt(2, ord.getPay_ID());
            preparedStatement.setInt(3, ord.getAddress_ID());
            preparedStatement.setInt(4, ord.getShipping_ID());
            preparedStatement.setString(5, ord.getOrder_date());
            preparedStatement.setString(6, ord.getCustomer_Note());
            preparedStatement.setString(7, ord.getOrder_Status());
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
    public void update(Order ord)throws SQLException{
       PreparedStatement preparedStatement=null;
       Connection connection=JDBCConnection.getJDBConnection();
       try {
           String sql="Update orders set pay_ID=?,address_ID=?,Shipping_ID=?,customer_Notes=? where customer_ID=? and order_ID=? ";
           preparedStatement=(PreparedStatement)connection.prepareStatement(sql);
           preparedStatement.setInt(1, ord.getPay_ID());
           preparedStatement.setInt(2, ord.getAddress_ID());
           preparedStatement.setInt(3, ord.getShipping_ID());
           preparedStatement.setString(4, ord.getCustomer_Note());
           preparedStatement.setInt(5, ord.getCustomer_ID());
           preparedStatement.setInt(6, ord.getOrder_ID());
           preparedStatement.executeUpdate();
       } catch (SQLException ex) {
           //TODO: handle exception
           ex.printStackTrace();
       }finally{
           try {
               preparedStatement.close();
               connection.close();
           } catch (SQLException ex) {
               //TODO: handle exception
           }
       }
    }
    public void Update2(Order ord,int or_ID,int cus_ID)throws SQLException{
          PreparedStatement preparedStatement=null;
          Connection connection=JDBCConnection.getJDBConnection();
          try {
              String sql="Update orders set order_status=? where order_ID="+or_ID+" and customer_ID="+cus_ID+"";
              preparedStatement=(PreparedStatement)connection.prepareStatement(sql);
              preparedStatement.setString(1, ord.getOrder_Status());
              preparedStatement.executeUpdate();
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
    public static void Update_Order_Status()throws SQLException{
        OrderModel orm= new OrderModel();
        Order or= new Order();
        boolean type=true;
        while (type) {
            System.out.println("Do You Want To Pay?(y/n)");
            String yn=sc.nextLine();
            switch (yn) {
                case "y":
                    ClearTheScreen.clrscr();
                    System.out.println("Enter Order_ID:");
                    int or_ID= Integer.parseInt(new Validate().checkINT());
                    System.out.println("Enter Customer_ID:");
                    int cus_ID=Integer.parseInt(new Validate().checkINT());
                    or.setOrder_Status("Đã Thanh Toán!");
                    orm.Update2(or, or_ID, cus_ID);
                    Bill_Model.select_Bill2(cus_ID, or_ID);
                    System.out.println("  /----------------------------------------/");
                    System.out.println(" /          Thanh Toán Thành Công         /");
                    System.out.println("/----------------------------------------/");
                    type=false;
                    break;
                case "n":
                    ClearTheScreen.clrscr();
                    Menu.Pay();
                    type=false;
                    break;
                default:
                    System.out.println("There is no function for this!");
                    type=true;
                    break;
            }
        }
    }
    public ArrayList<Order> select(int customer_id)throws SQLException{
        Connection connection=JDBCConnection.getJDBConnection();
        Statement statement=connection.createStatement();
        ArrayList<Order>List= new ArrayList<>();
        try {
            String sql=" call Select_Order("+customer_id+"); ";
            ResultSet rs=statement.executeQuery(sql);
            while (rs.next()) {
                int Order_ID=rs.getInt(1);
                int customer_ID =rs.getInt(2);
                int Pay_ID=rs.getInt(3);
                int address_ID=rs.getInt(4);
                int Shipping_ID=rs.getInt(5);
                String order_date=rs.getString(6);
                String customer_Note=rs.getString(7);
                String order_Status=rs.getString(8);
                List.add(new Order(Order_ID, customer_ID, Pay_ID, address_ID, Shipping_ID, order_date, customer_Note, order_Status));
            }
            return List;

        } catch (SQLException ex) {
            //TODO: handle exception
            ex.printStackTrace();
        }finally{
            try {
                connection.close();
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
        return null;
    }
    public static void add_orders1()throws SQLException{
        Order ord= new Order();
        OrderModel orm= new OrderModel();
        System.out.println("Enter Customer_ID:");
        int customer_ID= Integer.parseInt(new Validate().checkINT());
        ord.setCustomer_ID(customer_ID);
        ord.setPay_ID(1);
        ord.setAddress_ID(1);
        ord.setShipping_ID(1);
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        // Trả về giá trị từ 0 - 11
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        ord.setOrder_date(""+year+"-"+(month+1)+"-"+day);
        ord.setCustomer_Note("Không có Phản Hồi Gì!");
        ord.setOrder_Status("Chưa Thanh Toán!");
        ORD.add(ord);
        orm.insert_order(ord);
        ORD=new OrderModel().select(customer_ID);
        for (int i = 0; i < ORD.size(); i++) {
            System.out.println("Order_ID của Bạn:"+ORD.get(i).getOrder_ID());
        }
  
        
    }
    public static void update_Order()throws SQLException{
       Order ord= new Order();
       OrderModel orm= new OrderModel();
       System.out.println("Enter Customer_ID:");
       int customer_ID = Integer.parseInt(new Validate().checkINT());
       ord.setCustomer_ID(customer_ID);
       System.out.println("Enter Order_ID:");
       int order_ID=Integer.parseInt(new Validate().checkINT());
       ord.setOrder_ID(order_ID);
       System.out.println("Enter Pay_ID:");
       int pay_ID= Integer.parseInt(new Validate().checkINT());
       ord.setPay_ID(pay_ID);
       System.out.println("Enter Address_ID: ");
       int address_ID= Integer.parseInt(new Validate().checkINT());
       ord.setAddress_ID(address_ID);
       System.out.println("Enter Shipping_ID:");
       int shipping_ID=Integer.parseInt(new Validate().checkINT());
       ord.setShipping_ID(shipping_ID);
       System.out.println("Enter Customer's_feedback:");
       String customer_Note=sc.nextLine();
       ord.setCustomer_Note(customer_Note);
       ORD.add(ord);
       orm.update(ord);
    }
}