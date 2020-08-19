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
import vtc.com.vn.entity.Cart;
import vtc.com.vn.util.Validate;

public class CartModel {
    static List<Cart> CART = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
// --------------------------------------------------------Query--------------------------------------------------------
    public ArrayList<Cart> select(int customerID, int id) throws SQLException {
        Connection connection = JDBCConnection.getJDBConnection();
        Statement statement = connection.createStatement();
        ArrayList<Cart> list = new ArrayList<>();
        try {
            String sql = " call Cart(" + customerID + "," + id + ");";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int order_ID = rs.getInt(1);
                int customer_ID = rs.getInt(2);
                int product_ID = rs.getInt(3);
                String product_Name = rs.getString(4);
                double price = rs.getDouble(5);
                int amount = rs.getInt(6);
                list.add(new Cart(order_ID, customer_ID, product_ID, product_Name, price, amount));
            }
            return list;

        } catch (SQLException ex) {
            // TODO: handle exception
            ex.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                // TODO: handle exception
            }
        }
        return null;
    }
// ---------------------------------------------------------interface------------------------------------------------------------
    public static void Select_Cart() throws SQLException {
        System.out.println("Enter Customer_ID:");
        int customer_ID = Integer.parseInt(new Validate().checkINT());
        System.out.println("Enter Order_ID:");
        int order_ID = Integer.parseInt(new Validate().checkINT());
        CART = new CartModel().select(customer_ID, order_ID);
        CommandLineTableGui CTG = new CommandLineTableGui();
        CTG.setShowVerticalLines(true);
        CTG.setHeaders("Order_ID", "Customer_ID", "Product_ID", "Product_Name", "Price", "Amount");
        for (int i = 0; i < CART.size(); i++) {
            CTG.addRow(String.valueOf(CART.get(i).getOrder_ID()), String.valueOf(CART.get(i).getCustomer_ID()),
                    String.valueOf(CART.get(i).getProduct_ID()), String.valueOf(CART.get(i).getProduct_Name()),
                    String.valueOf(CART.get(i).getPrice()), String.valueOf(CART.get(i).getAmount()));
        }
        CTG.print();
    }
}