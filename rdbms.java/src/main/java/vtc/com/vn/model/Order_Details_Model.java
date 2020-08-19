package vtc.com.vn.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import vtc.com.vn.connection.JDBCConnection;
import vtc.com.vn.entity.Order_Details;
import vtc.com.vn.util.Validate;

public class Order_Details_Model {
    static List<Order_Details> ORD = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public void insert_Order_Details(Order_Details details) throws SQLException {
        PreparedStatement preparedStatement = null;
        Connection connection = JDBCConnection.getJDBConnection();
        try {
            String sql = "insert into order_details(order_ID,product_ID,amount) values(?,?,?)";
            preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setInt(1, details.getOrders_ID());
            preparedStatement.setInt(2, details.getProduct_ID());
            preparedStatement.setInt(3, details.getAmount());
            preparedStatement.execute();
        } catch (SQLException ex) {
            // TODO: handle exception
            ex.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException ex) {
                // TODO: handle exception
            }
        }
    }

    public void Update(Order_Details details, int id) throws SQLException {
        PreparedStatement preparedStatement = null;
        Connection connection = JDBCConnection.getJDBConnection();
        try {
            String sql = "UPDATE shopee.order_details SET product_ID = ?, amount = ? WHERE product_ID=" + id
                    + " and order_ID = ?";
            preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setInt(1, details.getProduct_ID());
            preparedStatement.setInt(2, details.getAmount());
            preparedStatement.setInt(3, details.getOrders_ID());
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            // TODO: handle exception
            ex.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException ex) {
                // TODO: handle exception
            }

        }
    }

    public void Delete(Order_Details details) throws SQLException {
        PreparedStatement preparedStatement = null;
        Connection connection = JDBCConnection.getJDBConnection();
        try {
            String sql = "Delete from order_details where order_ID=? and product_ID=?;";
            preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setInt(1, details.getOrders_ID());
            preparedStatement.setInt(2, details.getProduct_ID());
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            // TODO: handle exception
            ex.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException ex) {
                // TODO: handle exception
            }
        }
    }

    public ArrayList<Order_Details> Select() throws SQLException {
        Connection connection = JDBCConnection.getJDBConnection();
        Statement statement = connection.createStatement();
        ArrayList<Order_Details> List = new ArrayList<>();
        try {
            String sql = "call Select_Order_Details();";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int orders_ID = rs.getInt(1);
                int product_ID = rs.getInt(2);
                int amount = rs.getInt(3);
                List.add(new Order_Details(orders_ID, product_ID, amount));
            }
            return List;
        } catch (SQLException ex) {
            // TODO: handle exception
            ex.printStackTrace();
        } finally {
            try {
                 statement.close();
            } catch (SQLException ex) {
                // TODO: handle exception
            }
        }
        return null;
    }

    public static void add_order_details() throws SQLException {
        Order_Details ods = new Order_Details();
        Order_Details_Model odm = new Order_Details_Model();
        System.out.println("Enter Order_ID:");
        int orders_ID = Integer.parseInt(new Validate().checkINT());
        ods.setOrders_ID(orders_ID);
        System.out.println("Enter Product_ID:");
        int product_ID = Integer.parseInt(new Validate().checkINT());
        ods.setProduct_ID(product_ID);
        System.out.println("Enter Amount:");
        int amount = Integer.parseInt(new Validate().checkINT());
        ods.setAmount(amount);
        ORD.add(ods);
        odm.insert_Order_Details(ods);
    }

    public static void Update_Order_Details() throws SQLException {
        Order_Details ods = new Order_Details();
        Order_Details_Model odm = new Order_Details_Model();
        System.out.println("Enter Product_ID:");
        int product_ID = Integer.parseInt(new Validate().checkINT());
        ods.setProduct_ID(product_ID);
        System.out.println("Enter Order_ID:");
        int orders_ID = Integer.parseInt(new Validate().checkINT());
        ods.setOrders_ID(orders_ID);
        ORD = new Order_Details_Model().Select();
        System.out.println("Update Product_ID:");
        int ID = Integer.parseInt(new Validate().checkINT());
        ods.setProduct_ID(ID);
        System.out.println("Update Amount:");
        int amount = Integer.parseInt(new Validate().checkINT());
        ods.setAmount(amount);
        ORD.add(ods);
        odm.Update(ods, product_ID);
    }

    public static void Delete_Order_Details() throws SQLException {
        Order_Details ods = new Order_Details();
        Order_Details_Model odm = new Order_Details_Model();
        System.out.println("Enter Order_ID:");
        int order_ID = Integer.parseInt(new Validate().checkINT());
        ods.setOrders_ID(order_ID);
        System.out.println("Enter Product_ID:");
        int product_ID = Integer.parseInt(new Validate().checkINT());
        ods.setProduct_ID(product_ID);

        ORD.add(ods);
        odm.Delete(ods);
    }
}