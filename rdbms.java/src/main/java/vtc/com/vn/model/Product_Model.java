package vtc.com.vn.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import vtc.com.vn.application.ClearTheScreen;
import vtc.com.vn.application.CommandLineTableGui;
import vtc.com.vn.application.Menu;
import vtc.com.vn.connection.JDBCConnection;
import vtc.com.vn.entity.Product;
import vtc.com.vn.util.Validate;

public class Product_Model {
    static List<Product> PR = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    // ------------------------------------------------------------Query------------------------------------------------------------
    public ArrayList<Product> select() throws SQLException {
        Connection connection = JDBCConnection.getJDBConnection();
        Statement statement = connection.createStatement();
        ArrayList<Product> List = new ArrayList<>();
        try {
            String sql = "call product_details('Thời Trang Nam');";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int a = rs.getInt(1);
                String h = rs.getString(2);
                String b = rs.getString(3);
                String c = rs.getString(4);
                String k = rs.getString(5);
                double d = rs.getDouble(6);
                double e = rs.getDouble(7);
                String f = rs.getString(8);
                String g = rs.getString(9);
                int i = rs.getInt(10);
                List.add(new Product(a, h, b, c, k, d, e, f, g, i));

            }
            return List;
        } catch (SQLException ex) {
            // TODO: handle exception
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                // TODO: handle exception
            }
        }
        return null;
    }

    public ArrayList<Product> select1() throws SQLException {
        Connection connection = JDBCConnection.getJDBConnection();
        Statement statement = connection.createStatement();
        ArrayList<Product> List = new ArrayList<>();
        try {
            String sql = "call product_details('Đồ Điện Tử');";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int a = rs.getInt(1);
                String h = rs.getString(2);
                String b = rs.getString(3);
                String c = rs.getString(4);
                String k = rs.getString(5);
                double d = rs.getDouble(6);
                double e = rs.getDouble(7);
                String f = rs.getString(8);
                String g = rs.getString(9);
                int i = rs.getInt(10);
                List.add(new Product(a, h, b, c, k, d, e, f, g, i));

            }
            return List;
        } catch (SQLException ex) {
            // TODO: handle exception
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                // TODO: handle exception
            }
        }
        return null;
    }

    public ArrayList<Product> select2() throws SQLException {
        Connection connection = JDBCConnection.getJDBConnection();
        Statement statement = connection.createStatement();
        ArrayList<Product> List = new ArrayList<>();
        try {
            String sql = "call product_details('Thời Trang Nữ');";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int a = rs.getInt(1);
                String h = rs.getString(2);
                String b = rs.getString(3);
                String c = rs.getString(4);
                String k = rs.getString(5);
                double d = rs.getDouble(6);
                double e = rs.getDouble(7);
                String f = rs.getString(8);
                String g = rs.getString(9);
                int i = rs.getInt(10);
                List.add(new Product(a, h, b, c, k, d, e, f, g, i));
            }
            return List;
        } catch (SQLException ex) {
            // TODO: handle exception
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                // TODO: handle exception
            }
        }
        return null;
    }

    public ArrayList<Product> select3() throws SQLException {
        Connection connection = JDBCConnection.getJDBConnection();
        Statement statement = connection.createStatement();
        ArrayList<Product> List = new ArrayList<>();
        try {
            String sql = "call product_details('Thiết bị điện da dụng');";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int a = rs.getInt(1);
                String h = rs.getString(2);
                String b = rs.getString(3);
                String c = rs.getString(4);
                String k = rs.getString(5);
                double d = rs.getDouble(6);
                double e = rs.getDouble(7);
                String f = rs.getString(8);
                String g = rs.getString(9);
                int i = rs.getInt(10);
                List.add(new Product(a, h, b, c, k, d, e, f, g, i));
            }
            return List;
        } catch (SQLException ex) {
            // TODO: handle exception
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                // TODO: handle exception
            }
        }
        return null;
    }

    public ArrayList<Product> select4() throws SQLException {
        Connection connection = JDBCConnection.getJDBConnection();
        Statement statement = connection.createStatement();
        ArrayList<Product> List = new ArrayList<>();
        try {
            String sql = "call product_details('Đồng Hồ');";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int a = rs.getInt(1);
                String h = rs.getString(2);
                String b = rs.getString(3);
                String c = rs.getString(4);
                String k = rs.getString(5);
                double d = rs.getDouble(6);
                double e = rs.getDouble(7);
                String f = rs.getString(8);
                String g = rs.getString(9);
                int i = rs.getInt(10);
                List.add(new Product(a, h, b, c, k, d, e, f, g, i));

            }
            return List;
        } catch (SQLException ex) {
            // TODO: handle exception
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                // TODO: handle exception
            }
        }
        return null;
    }

    public ArrayList<Product> select5() throws SQLException {
        Connection connection = JDBCConnection.getJDBConnection();
        Statement statement = connection.createStatement();
        ArrayList<Product> List = new ArrayList<>();
        try {
            String sql = "call product_details('Bách Hóa online');";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int a = rs.getInt(1);
                String h = rs.getString(2);
                String b = rs.getString(3);
                String c = rs.getString(4);
                String k = rs.getString(5);
                double d = rs.getDouble(6);
                double e = rs.getDouble(7);
                String f = rs.getString(8);
                String g = rs.getString(9);
                int i = rs.getInt(10);
                List.add(new Product(a, h, b, c, k, d, e, f, g, i));

            }
            return List;
        } catch (SQLException ex) {
            // TODO: handle exception
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                // TODO: handle exception
            }
        }
        return null;
    }

    public ArrayList<Product> select6() throws SQLException {
        Connection connection = JDBCConnection.getJDBConnection();
        Statement statement = connection.createStatement();
        ArrayList<Product> List = new ArrayList<>();
        try {
            String sql = "call product_details('Chăm Sóc Thú Cưng');";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int a = rs.getInt(1);
                String h = rs.getString(2);
                String b = rs.getString(3);
                String c = rs.getString(4);
                String k = rs.getString(5);
                double d = rs.getDouble(6);
                double e = rs.getDouble(7);
                String f = rs.getString(8);
                String g = rs.getString(9);
                int i = rs.getInt(10);
                List.add(new Product(a, h, b, c, k, d, e, f, g, i));
            }
            return List;
        } catch (SQLException ex) {
            // TODO: handle exception
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                // TODO: handle exception
            }
        }
        return null;
    }

    public ArrayList<Product> select7() throws SQLException {
        Connection connection = JDBCConnection.getJDBConnection();
        Statement statement = connection.createStatement();
        ArrayList<Product> List = new ArrayList<>();
        try {
            String sql = "call product_details('Đồ Chơi');";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int a = rs.getInt(1);
                String h = rs.getString(2);
                String b = rs.getString(3);
                String c = rs.getString(4);
                String k = rs.getString(5);
                double d = rs.getDouble(6);
                double e = rs.getDouble(7);
                String f = rs.getString(8);
                String g = rs.getString(9);
                int i = rs.getInt(10);
                List.add(new Product(a, h, b, c, k, d, e, f, g, i));

            }
            return List;
        } catch (SQLException ex) {
            // TODO: handle exception
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                // TODO: handle exception
            }
        }
        return null;
    }

    public ArrayList<Product> select8() throws SQLException {
        Connection connection = JDBCConnection.getJDBConnection();
        Statement statement = connection.createStatement();
        ArrayList<Product> List = new ArrayList<>();
        try {
            String sql = "call product_details('Sức Khỏe Và Sắc Đẹp');";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int a = rs.getInt(1);
                String h = rs.getString(2);
                String b = rs.getString(3);
                String c = rs.getString(4);
                String k = rs.getString(5);
                double d = rs.getDouble(6);
                double e = rs.getDouble(7);
                String f = rs.getString(8);
                String g = rs.getString(9);
                int i = rs.getInt(10);
                List.add(new Product(a, h, b, c, k, d, e, f, g, i));

            }
            return List;
        } catch (SQLException ex) {
            // TODO: handle exception
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                // TODO: handle exception
            }
        }
        return null;
    }

    public ArrayList<Product> select9() throws SQLException {
        Connection connection = JDBCConnection.getJDBConnection();
        Statement statement = connection.createStatement();
        ArrayList<Product> List = new ArrayList<>();
        try {
            String sql = "call product_details('Voucher và Dịch Vụ');";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int a = rs.getInt(1);
                String h = rs.getString(2);
                String b = rs.getString(3);
                String c = rs.getString(4);
                String k = rs.getString(5);
                double d = rs.getDouble(6);
                double e = rs.getDouble(7);
                String f = rs.getString(8);
                String g = rs.getString(9);
                int i = rs.getInt(10);
                List.add(new Product(a, h, b, c, k, d, e, f, g, i));
            }
            return List;
        } catch (SQLException ex) {
            // TODO: handle exception
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                // TODO: handle exception
            }
        }
        return null;
    }

    public ArrayList<Product> select10() throws SQLException {
        Connection connection = JDBCConnection.getJDBConnection();
        Statement statement = connection.createStatement();
        ArrayList<Product> List = new ArrayList<>();
        try {
            String sql = "call product_details('Sản Phẩm Khác');";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int a = rs.getInt(1);
                String h = rs.getString(2);
                String b = rs.getString(3);
                String c = rs.getString(4);
                String k = rs.getString(5);
                double d = rs.getDouble(6);
                double e = rs.getDouble(7);
                String f = rs.getString(8);
                String g = rs.getString(9);
                int i = rs.getInt(10);
                List.add(new Product(a, h, b, c, k, d, e, f, g, i));

            }
            return List;
        } catch (SQLException ex) {
            // TODO: handle exception
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                // TODO: handle exception
            }
        }
        return null;
    }

    public ArrayList<Product> select12() throws SQLException {
        Connection connection = JDBCConnection.getJDBConnection();
        Statement statement = connection.createStatement();
        ArrayList<Product> List = new ArrayList<>();
        try {
            String sql = "call product_details('Ô Tô-Xe Đạp-Xe Máy');";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int a = rs.getInt(1);
                String h = rs.getString(2);
                String b = rs.getString(3);
                String c = rs.getString(4);
                String k = rs.getString(5);
                double d = rs.getDouble(6);
                double e = rs.getDouble(7);
                String f = rs.getString(8);
                String g = rs.getString(9);
                int i = rs.getInt(10);
                List.add(new Product(a, h, b, c, k, d, e, f, g, i));

            }
            return List;
        } catch (SQLException ex) {
            // TODO: handle exception
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                // TODO: handle exception
            }
        }
        return null;
    }

    public ArrayList<Product> select13() throws SQLException {
        Connection connection = JDBCConnection.getJDBConnection();
        Statement statement = connection.createStatement();
        ArrayList<Product> List = new ArrayList<>();
        try {
            String sql = "call product_details('Nhà Sách Online');";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int a = rs.getInt(1);
                String h = rs.getString(2);
                String b = rs.getString(3);
                String c = rs.getString(4);
                String k = rs.getString(5);
                double d = rs.getDouble(6);
                double e = rs.getDouble(7);
                String f = rs.getString(8);
                String g = rs.getString(9);
                int i = rs.getInt(10);
                List.add(new Product(a, h, b, c, k, d, e, f, g, i));

            }
            return List;
        } catch (SQLException ex) {
            // TODO: handle exception
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                // TODO: handle exception
            }
        }
        return null;
    }
    
    public ArrayList<Product> select11(String product_Portfolio) throws SQLException {
        Connection connection = JDBCConnection.getJDBConnection();
        Statement statement = connection.createStatement();
        ArrayList<Product> List = new ArrayList<>();
        try {
            String sql = "call Search_Product4('"+product_Portfolio+"%"+"');";
            ResultSet rs = statement.executeQuery(sql);
            System.out.println(sql);
            while (rs.next()) {
                int a = rs.getInt(1);
                String h = rs.getString(2);
                String b = rs.getString(3);
                String c = rs.getString(4);
                String k = rs.getString(5);
                double d = rs.getDouble(6);
                double e = rs.getDouble(7);
                String f = rs.getString(8);
                String g = rs.getString(9);
                int i = rs.getInt(10);
                List.add(new Product(a, h, b, c, k, d, e, f, g, i));

            }
            return List;
        } catch (SQLException ex) {
            // TODO: handle exception
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                // TODO: handle exception
            }
        }
        return null;
    }
    public ArrayList<Product> Search(String coder) throws SQLException{
          Connection connection=JDBCConnection.getJDBConnection();
          Statement statement= connection.createStatement();
          ArrayList<Product> List= new ArrayList<>();
          try {
              String sql="call product_details3('"+coder+"');";
              ResultSet rs= statement.executeQuery(sql);
              while (rs.next()) {
                int a = rs.getInt(1);
                String h = rs.getString(2);
                String b = rs.getString(3);
                String c = rs.getString(4);
                String k = rs.getString(5);
                double d = rs.getDouble(6);
                double e = rs.getDouble(7);
                String f = rs.getString(8);
                String g = rs.getString(9);
                int i = rs.getInt(10);
                List.add(new Product(a, h, b, c, k, d, e, f, g, i));
              }
              return List;
          } catch (SQLException ex) {
              //TODO: handle exception
              ex.printStackTrace();
          }finally{
              try {
                  connection.close();
              } catch (SQLException ex) {
                  //TODO: handle exception
              }
          }
          return null;
    }
    public ArrayList<Product> Search1(double K_Price ,double C_Price)throws SQLException{
        Connection connection=JDBCConnection.getJDBConnection();
        Statement statement= connection.createStatement();
        ArrayList<Product> list= new ArrayList<>();
        try {
             String sql="call product_details4("+K_Price+","+C_Price+");";
             ResultSet rs= statement.executeQuery(sql);
             while (rs.next()) {
                int a = rs.getInt(1);
                String h = rs.getString(2);
                String b = rs.getString(3);
                String c = rs.getString(4);
                String k = rs.getString(5);
                double d = rs.getDouble(6);
                double e = rs.getDouble(7);
                String f = rs.getString(8);
                String g = rs.getString(9);
                int i = rs.getInt(10);
                list.add(new Product(a, h, b, c, k, d, e, f, g, i));
             }
             return list;
        } catch (SQLException ex) {
            //TODO: handle exception
            ex.printStackTrace();
        }finally{
            try {
                connection.close();
            } catch (SQLException ex) {
                //TODO: handle exception
            }
        }
        return null;
        
    }
    public ArrayList<Product> Search2(String like)throws SQLException{
         Connection connection= JDBCConnection.getJDBConnection();
         Statement statement= connection.createStatement();
         ArrayList<Product> list= new ArrayList<>();
         try {
             String sql="call Search_Product3('"+like+"%"+"');";
             ResultSet rs= statement.executeQuery(sql);
             while (rs.next()) {
                int a = rs.getInt(1);
                String h = rs.getString(2);
                String b = rs.getString(3);
                String c = rs.getString(4);
                String k = rs.getString(5);
                double d = rs.getDouble(6);
                double e = rs.getDouble(7);
                String f = rs.getString(8);
                String g = rs.getString(9);
                int i = rs.getInt(10);
                list.add(new Product(a, h, b, c, k, d, e, f, g, i));
             }
             return list;
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
         return list;
    }
    public ArrayList<Product> Search3(String DanhMuc,String name,double K_price,double C_price)throws SQLException{
         Connection connection= JDBCConnection.getJDBConnection();
         Statement statement= connection.createStatement();
         ArrayList<Product> list= new ArrayList<>();
         try {
             String sql="call Search_Product5('"+DanhMuc+"%"+"','"+name+"%"+"',"+K_price+","+C_price+");";
             ResultSet rs= statement.executeQuery(sql);
             while (rs.next()) {
                int a = rs.getInt(1);
                String h = rs.getString(2);
                String b = rs.getString(3);
                String c = rs.getString(4);
                String k = rs.getString(5);
                double d = rs.getDouble(6);
                double e = rs.getDouble(7);
                String f = rs.getString(8);
                String g = rs.getString(9);
                int i = rs.getInt(10);
                list.add(new Product(a, h, b, c, k, d, e, f, g, i));
             }
             return list;
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
         return list;
    }
    public ArrayList<Product> select14() throws SQLException {
        Connection connection = JDBCConnection.getJDBConnection();
        Statement statement = connection.createStatement();
        ArrayList<Product> List = new ArrayList<>();
        try {
            String sql = "call product_details2();";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int a = rs.getInt(1);
                String h = rs.getString(2);
                String b = rs.getString(3);
                String c = rs.getString(4);
                String k = rs.getString(5);
                double d = rs.getDouble(6);
                double e = rs.getDouble(7);
                String f = rs.getString(8);
                String g = rs.getString(9);
                int i = rs.getInt(10);
                List.add(new Product(a, h, b, c, k, d, e, f, g, i));

            }
            return List;
        } catch (SQLException ex) {
            // TODO: handle exception
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                // TODO: handle exception
            }
        }
        return null;
    }
    public ArrayList<Product> Search4(String category) throws SQLException {
        Connection connection = JDBCConnection.getJDBConnection();
        Statement statement = connection.createStatement();
        ArrayList<Product> List = new ArrayList<>();
        try {
            String sql = "call Search_Product6('"+category+"%"+"');";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int a = rs.getInt(1);
                String h = rs.getString(2);
                String b = rs.getString(3);
                String c = rs.getString(4);
                String k = rs.getString(5);
                double d = rs.getDouble(6);
                double e = rs.getDouble(7);
                String f = rs.getString(8);
                String g = rs.getString(9);
                int i = rs.getInt(10);
                List.add(new Product(a, h, b, c, k, d, e, f, g, i));
            }
            return List;
        } catch (SQLException ex) {
            // TODO: handle exception
        } finally {
            try {
                connection.close();
            } catch (SQLException ex) {
                // TODO: handle exception
            }
        }
        return null;
    }


    // -------------------------------------------------------------Interface----------------------------------------------------
    public static void select_Product() throws SQLException {
        PR = new Product_Model().select();
        CommandLineTableGui CTG = new CommandLineTableGui();
        CTG.setShowVerticalLines(true);
        CTG.setHeaders("Product_ID", "product_Code", "product_Name", "product portfolio", "category_Name", "price",
                "promotion_price", "date_created", "product_status", "view_counts");
        for (int i = 0; i < PR.size(); i++) {
            CTG.addRow(String.valueOf(PR.get(i).getProduct_ID()), String.valueOf(PR.get(i).getProduct_Code()),
                    String.valueOf(PR.get(i).getProduct_Name()), String.valueOf(PR.get(i).getCategory_Name()),
                    String.valueOf(PR.get(i).getPP_name()), String.valueOf(PR.get(i).getPrice()),
                    String.valueOf(PR.get(i).getPromotion_price()), String.valueOf(PR.get(i).getDate_created()),
                    String.valueOf(PR.get(i).getProduct_status()), String.valueOf(PR.get(i).getView_counts()));
        }
        CTG.print();
    }

    public static void select_Product1() throws SQLException {
        PR = new Product_Model().select1();
        CommandLineTableGui CTG = new CommandLineTableGui();
        CTG.setShowVerticalLines(true);
        CTG.setHeaders("Product_ID", "product_Code", "product_Name", "product portfolio", "category_Name", "price",
                "promotion_price", "date_created", "product_status", "view_counts");
        for (int i = 0; i < PR.size(); i++) {
            CTG.addRow(String.valueOf(PR.get(i).getProduct_ID()), String.valueOf(PR.get(i).getProduct_Code()),
                    String.valueOf(PR.get(i).getProduct_Name()), String.valueOf(PR.get(i).getCategory_Name()),
                    String.valueOf(PR.get(i).getPP_name()), String.valueOf(PR.get(i).getPrice()),
                    String.valueOf(PR.get(i).getPromotion_price()), String.valueOf(PR.get(i).getDate_created()),
                    String.valueOf(PR.get(i).getProduct_status()), String.valueOf(PR.get(i).getView_counts()));
        }
        CTG.print();
    }

    public static void select_Product2() throws SQLException {
        PR = new Product_Model().select2();
        CommandLineTableGui CTG = new CommandLineTableGui();
        CTG.setShowVerticalLines(true);
        CTG.setHeaders("Product_ID", "product_Code", "product_Name", "product portfolio", "category_Name", "price",
                "promotion_price", "date_created", "product_status", "view_counts");
        for (int i = 0; i < PR.size(); i++) {
            CTG.addRow(String.valueOf(PR.get(i).getProduct_ID()), String.valueOf(PR.get(i).getProduct_Code()),
                    String.valueOf(PR.get(i).getProduct_Name()), String.valueOf(PR.get(i).getCategory_Name()),
                    String.valueOf(PR.get(i).getPP_name()), String.valueOf(PR.get(i).getPrice()),
                    String.valueOf(PR.get(i).getPromotion_price()), String.valueOf(PR.get(i).getDate_created()),
                    String.valueOf(PR.get(i).getProduct_status()), String.valueOf(PR.get(i).getView_counts()));
        }
        CTG.print();
    }

    public static void select_Product3() throws SQLException {
        PR = new Product_Model().select3();
        CommandLineTableGui CTG = new CommandLineTableGui();
        CTG.setShowVerticalLines(true);
        CTG.setHeaders("Product_ID", "product_Code", "product_Name", "product portfolio", "category_Name", "price",
                "promotion_price", "date_created", "product_status", "view_counts");
        for (int i = 0; i < PR.size(); i++) {
            CTG.addRow(String.valueOf(PR.get(i).getProduct_ID()), String.valueOf(PR.get(i).getProduct_Code()),
                    String.valueOf(PR.get(i).getProduct_Name()), String.valueOf(PR.get(i).getCategory_Name()),
                    String.valueOf(PR.get(i).getPP_name()), String.valueOf(PR.get(i).getPrice()),
                    String.valueOf(PR.get(i).getPromotion_price()), String.valueOf(PR.get(i).getDate_created()),
                    String.valueOf(PR.get(i).getProduct_status()), String.valueOf(PR.get(i).getView_counts()));
        }
        CTG.print();
    }

    public static void select_Product4() throws SQLException {
        PR = new Product_Model().select4();
        CommandLineTableGui CTG = new CommandLineTableGui();
        CTG.setShowVerticalLines(true);
        CTG.setHeaders("Product_ID", "product_Code", "product_Name", "product portfolio", "category_Name", "price",
                "promotion_price", "date_created", "product_status", "view_counts");
        for (int i = 0; i < PR.size(); i++) {
            CTG.addRow(String.valueOf(PR.get(i).getProduct_ID()), String.valueOf(PR.get(i).getProduct_Code()),
                    String.valueOf(PR.get(i).getProduct_Name()), String.valueOf(PR.get(i).getCategory_Name()),
                    String.valueOf(PR.get(i).getPP_name()), String.valueOf(PR.get(i).getPrice()),
                    String.valueOf(PR.get(i).getPromotion_price()), String.valueOf(PR.get(i).getDate_created()),
                    String.valueOf(PR.get(i).getProduct_status()), String.valueOf(PR.get(i).getView_counts()));
        }
        CTG.print();
    }

    public static void select_Product5() throws SQLException {
        PR = new Product_Model().select5();
        CommandLineTableGui CTG = new CommandLineTableGui();
        CTG.setShowVerticalLines(true);
        CTG.setHeaders("Product_ID", "product_Code", "product_Name", "product portfolio", "category_Name", "price",
                "promotion_price", "date_created", "product_status", "view_counts");
        for (int i = 0; i < PR.size(); i++) {
            CTG.addRow(String.valueOf(PR.get(i).getProduct_ID()), String.valueOf(PR.get(i).getProduct_Code()),
                    String.valueOf(PR.get(i).getProduct_Name()), String.valueOf(PR.get(i).getCategory_Name()),
                    String.valueOf(PR.get(i).getPP_name()), String.valueOf(PR.get(i).getPrice()),
                    String.valueOf(PR.get(i).getPromotion_price()), String.valueOf(PR.get(i).getDate_created()),
                    String.valueOf(PR.get(i).getProduct_status()), String.valueOf(PR.get(i).getView_counts()));
        }
        CTG.print();
    }

    public static void select_Product6() throws SQLException {
        PR = new Product_Model().select6();
        CommandLineTableGui CTG = new CommandLineTableGui();
        CTG.setShowVerticalLines(true);
        CTG.setHeaders("Product_ID", "product_Code", "product_Name", "product portfolio", "category_Name", "price",
                "promotion_price", "date_created", "product_status", "view_counts");
        for (int i = 0; i < PR.size(); i++) {
            CTG.addRow(String.valueOf(PR.get(i).getProduct_ID()), String.valueOf(PR.get(i).getProduct_Code()),
                    String.valueOf(PR.get(i).getProduct_Name()), String.valueOf(PR.get(i).getCategory_Name()),
                    String.valueOf(PR.get(i).getPP_name()), String.valueOf(PR.get(i).getPrice()),
                    String.valueOf(PR.get(i).getPromotion_price()), String.valueOf(PR.get(i).getDate_created()),
                    String.valueOf(PR.get(i).getProduct_status()), String.valueOf(PR.get(i).getView_counts()));
        }
        CTG.print();
    }

    public static void select_Product7() throws SQLException {
        PR = new Product_Model().select7();
        CommandLineTableGui CTG = new CommandLineTableGui();
        CTG.setShowVerticalLines(true);
        CTG.setHeaders("Product_ID", "product_Code", "product_Name", "product portfolio", "category_Name", "price",
                "promotion_price", "date_created", "product_status", "view_counts");
        for (int i = 0; i < PR.size(); i++) {
            CTG.addRow(String.valueOf(PR.get(i).getProduct_ID()), String.valueOf(PR.get(i).getProduct_Code()),
                    String.valueOf(PR.get(i).getProduct_Name()), String.valueOf(PR.get(i).getCategory_Name()),
                    String.valueOf(PR.get(i).getPP_name()), String.valueOf(PR.get(i).getPrice()),
                    String.valueOf(PR.get(i).getPromotion_price()), String.valueOf(PR.get(i).getDate_created()),
                    String.valueOf(PR.get(i).getProduct_status()), String.valueOf(PR.get(i).getView_counts()));
        }
        CTG.print();
    }

    public static void select_Product8() throws SQLException {
        PR = new Product_Model().select8();
        CommandLineTableGui CTG = new CommandLineTableGui();
        CTG.setShowVerticalLines(true);
        CTG.setHeaders("Product_ID", "product_Code", "product_Name", "product portfolio", "category_Name", "price",
                "promotion_price", "date_created", "product_status", "view_counts");
        for (int i = 0; i < PR.size(); i++) {
            CTG.addRow(String.valueOf(PR.get(i).getProduct_ID()), String.valueOf(PR.get(i).getProduct_Code()),
                    String.valueOf(PR.get(i).getProduct_Name()), String.valueOf(PR.get(i).getCategory_Name()),
                    String.valueOf(PR.get(i).getPP_name()), String.valueOf(PR.get(i).getPrice()),
                    String.valueOf(PR.get(i).getPromotion_price()), String.valueOf(PR.get(i).getDate_created()),
                    String.valueOf(PR.get(i).getProduct_status()), String.valueOf(PR.get(i).getView_counts()));
        }
        CTG.print();
    }

    public static void select_Product9() throws SQLException {
        PR = new Product_Model().select9();
        CommandLineTableGui CTG = new CommandLineTableGui();
        CTG.setShowVerticalLines(true);
        CTG.setHeaders("Product_ID", "product_Code", "product_Name", "product portfolio", "category_Name", "price",
                "promotion_price", "date_created", "product_status", "view_counts");
        for (int i = 0; i < PR.size(); i++) {
            CTG.addRow(String.valueOf(PR.get(i).getProduct_ID()), String.valueOf(PR.get(i).getProduct_Code()),
                    String.valueOf(PR.get(i).getProduct_Name()), String.valueOf(PR.get(i).getCategory_Name()),
                    String.valueOf(PR.get(i).getPP_name()), String.valueOf(PR.get(i).getPrice()),
                    String.valueOf(PR.get(i).getPromotion_price()), String.valueOf(PR.get(i).getDate_created()),
                    String.valueOf(PR.get(i).getProduct_status()), String.valueOf(PR.get(i).getView_counts()));
        }
        CTG.print();
    }

    public static void select_Product10() throws SQLException {
        PR = new Product_Model().select10();
        CommandLineTableGui CTG = new CommandLineTableGui();
        CTG.setShowVerticalLines(true);
        CTG.setHeaders("Product_ID", "product_Code", "product_Name", "product portfolio", "category_Name", "price",
                "promotion_price", "date_created", "product_status", "view_counts");
        for (int i = 0; i < PR.size(); i++) {
            CTG.addRow(String.valueOf(PR.get(i).getProduct_ID()), String.valueOf(PR.get(i).getProduct_Code()),
                    String.valueOf(PR.get(i).getProduct_Name()), String.valueOf(PR.get(i).getCategory_Name()),
                    String.valueOf(PR.get(i).getPP_name()), String.valueOf(PR.get(i).getPrice()),
                    String.valueOf(PR.get(i).getPromotion_price()), String.valueOf(PR.get(i).getDate_created()),
                    String.valueOf(PR.get(i).getProduct_status()), String.valueOf(PR.get(i).getView_counts()));
        }
        CTG.print();
    }

    public static void select_Product12() throws SQLException {
        PR = new Product_Model().select12();
        CommandLineTableGui CTG = new CommandLineTableGui();
        CTG.setShowVerticalLines(true);
        CTG.setHeaders("Product_ID", "product_Code", "product_Name", "product portfolio", "category_Name", "price",
                "promotion_price", "date_created", "product_status", "view_counts");
        for (int i = 0; i < PR.size(); i++) {
            CTG.addRow(String.valueOf(PR.get(i).getProduct_ID()), String.valueOf(PR.get(i).getProduct_Code()),
                    String.valueOf(PR.get(i).getProduct_Name()), String.valueOf(PR.get(i).getCategory_Name()),
                    String.valueOf(PR.get(i).getPP_name()), String.valueOf(PR.get(i).getPrice()),
                    String.valueOf(PR.get(i).getPromotion_price()), String.valueOf(PR.get(i).getDate_created()),
                    String.valueOf(PR.get(i).getProduct_status()), String.valueOf(PR.get(i).getView_counts()));
        }
        CTG.print();
    }

    public static void select_Product13() throws SQLException {
        PR = new Product_Model().select13();
        CommandLineTableGui CTG = new CommandLineTableGui();
        CTG.setShowVerticalLines(true);
        CTG.setHeaders("Product_ID", "product_Code", "product_Name", "product portfolio", "category_Name", "price",
                "promotion_price", "date_created", "product_status", "view_counts");
        for (int i = 0; i < PR.size(); i++) {
            CTG.addRow(String.valueOf(PR.get(i).getProduct_ID()), String.valueOf(PR.get(i).getProduct_Code()),
                    String.valueOf(PR.get(i).getProduct_Name()), String.valueOf(PR.get(i).getCategory_Name()),
                    String.valueOf(PR.get(i).getPP_name()), String.valueOf(PR.get(i).getPrice()),
                    String.valueOf(PR.get(i).getPromotion_price()), String.valueOf(PR.get(i).getDate_created()),
                    String.valueOf(PR.get(i).getProduct_status()), String.valueOf(PR.get(i).getView_counts()));
        }
        CTG.print();
    }

    public static void select_Product11() throws SQLException {
            System.out.println("Enter product_Portfolio:");
            String product_Portfolio = sc.nextLine();
            PR = new Product_Model().select11(product_Portfolio);
        CommandLineTableGui CTG = new CommandLineTableGui();
        CTG.setShowVerticalLines(true);
        CTG.setHeaders("Product_ID", "product_Code", "product_Name", "product portfolio", "category_Name", "price",
                "promotion_price", "date_created", "product_status", "view_counts");
        for (int i = 0; i < PR.size(); i++) {
            CTG.addRow(String.valueOf(PR.get(i).getProduct_ID()), String.valueOf(PR.get(i).getProduct_Code()),
                    String.valueOf(PR.get(i).getProduct_Name()), String.valueOf(PR.get(i).getCategory_Name()),
                    String.valueOf(PR.get(i).getPP_name()), String.valueOf(PR.get(i).getPrice()),
                    String.valueOf(PR.get(i).getPromotion_price()), String.valueOf(PR.get(i).getDate_created()),
                    String.valueOf(PR.get(i).getProduct_status()), String.valueOf(PR.get(i).getView_counts()));
        }
        CTG.print();
    }

    
    public static void Ask_The_Customer() throws SQLException {
        boolean check = true;
        while (check) {
            System.out.println("Khách Hàng Có Muốn Mua Không(y/n)?");
            String yn = sc.nextLine();
            switch (yn) {
                case "y":
                    ClearTheScreen.clrscr();
                    OrderModel.add_orders1();
                    Order_Details_Model.add_order_details();
                    check = false;
                    break;
                case "n":
                    ClearTheScreen.clrscr();
                    Menu.HomePage();    
                    check = false;
                    break;
                default:
                    ClearTheScreen.clrscr();
                    System.out.println("There is no function for this. Re-enter:");
                    check = true;
                    break;
            }
        }

    }
    public static void Search_Product()throws SQLException{
        boolean check=true;
        while (check) {
            System.out.println("Enter Product_Code:");
            String product_Code=sc.nextLine();
            PR= new Product_Model().Search(product_Code);
            int kt=0;
            for (int i = 0; i < PR.size() ; i++) {
                if (PR.get(i).getProduct_Code().equals(product_Code)) {
                     kt=1;
                }
            }
            if (kt==1) {
                System.out.println("Product_Code Hợp Lệ!");
                check=false;
            }
            else{
                System.out.println("Product_Code Không Tồn Tại! Mời Nhập Lại:");
                check=true;
            }
        }
       
        CommandLineTableGui CTG = new CommandLineTableGui();

        CTG.setShowVerticalLines(true);
        CTG.setHeaders("Product_ID", "product_Code", "product_Name", "product portfolio", "category_Name", "price",
                "promotion_price", "date_created", "product_status", "view_counts");
        for (int i = 0; i < PR.size(); i++) {
            CTG.addRow(String.valueOf(PR.get(i).getProduct_ID()), String.valueOf(PR.get(i).getProduct_Code()),
                    String.valueOf(PR.get(i).getProduct_Name()), String.valueOf(PR.get(i).getCategory_Name()),
                    String.valueOf(PR.get(i).getPP_name()), String.valueOf(PR.get(i).getPrice()),
                    String.valueOf(PR.get(i).getPromotion_price()), String.valueOf(PR.get(i).getDate_created()),
                    String.valueOf(PR.get(i).getProduct_status()), String.valueOf(PR.get(i).getView_counts()));
        }
        CTG.print();

    }
    public static void Search_Product2()throws SQLException{
        System.out.println("Enter K_Price:");
        double K_price= Double.parseDouble(new Validate().checkINT());
        System.out.println("Enter C_Price:");
        double C_Price=Double.parseDouble(new Validate().checkINT());
        PR= new Product_Model().Search1(K_price, C_Price);
        CommandLineTableGui CTG = new CommandLineTableGui();
        CTG.setShowVerticalLines(true);
        CTG.setHeaders("Product_ID", "product_Code", "product_Name", "product portfolio", "category_Name", "price",
                "promotion_price", "date_created", "product_status", "view_counts");
        for (int i = 0; i < PR.size(); i++) {
            CTG.addRow(String.valueOf(PR.get(i).getProduct_ID()), String.valueOf(PR.get(i).getProduct_Code()),
                    String.valueOf(PR.get(i).getProduct_Name()), String.valueOf(PR.get(i).getCategory_Name()),
                    String.valueOf(PR.get(i).getPP_name()), String.valueOf(PR.get(i).getPrice()),
                    String.valueOf(PR.get(i).getPromotion_price()), String.valueOf(PR.get(i).getDate_created()),
                    String.valueOf(PR.get(i).getProduct_status()), String.valueOf(PR.get(i).getView_counts()));
        }
        CTG.print();
    }
    public static void Search_Product4()throws SQLException{
        System.out.println("Enter Product_Portfolio:");
        String dm=new Validate().checkEmpty();
        System.out.println("Enter Product_Name:");
        String name=new Validate().checkEmpty();
        System.out.println("Enter K_Price:");
        double K_price= Double.parseDouble(new Validate().checkINT());
        System.out.println("Enter C_Price:");
        double C_Price=Double.parseDouble(new Validate().checkINT());
        PR=new Product_Model().Search3(dm, name, K_price, C_Price);
        CommandLineTableGui CTG = new CommandLineTableGui();
        CTG.setShowVerticalLines(true);
        CTG.setHeaders("Product_ID", "product_Code", "product_Name", "product portfolio", "category_Name", "price",
                "promotion_price", "date_created", "product_status", "view_counts");
        for (int i = 0; i < PR.size(); i++) {
            CTG.addRow(String.valueOf(PR.get(i).getProduct_ID()), String.valueOf(PR.get(i).getProduct_Code()),
                    String.valueOf(PR.get(i).getProduct_Name()), String.valueOf(PR.get(i).getCategory_Name()),
                    String.valueOf(PR.get(i).getPP_name()), String.valueOf(PR.get(i).getPrice()),
                    String.valueOf(PR.get(i).getPromotion_price()), String.valueOf(PR.get(i).getDate_created()),
                    String.valueOf(PR.get(i).getProduct_status()), String.valueOf(PR.get(i).getView_counts()));
        }
        CTG.print();
    }
    public static void Search_Product3()throws SQLException{
        System.out.println("Enter Product_Name:");
        String name=new Validate().checkEmpty();
        PR=new Product_Model().Search2(name);
        CommandLineTableGui CTG = new CommandLineTableGui();
        CTG.setShowVerticalLines(true);
        CTG.setHeaders("Product_ID", "product_Code", "product_Name", "product portfolio", "category_Name", "price",
                "promotion_price", "date_created", "product_status", "view_counts");
        for (int i = 0; i < PR.size(); i++) {
            CTG.addRow(String.valueOf(PR.get(i).getProduct_ID()), String.valueOf(PR.get(i).getProduct_Code()),
                    String.valueOf(PR.get(i).getProduct_Name()), String.valueOf(PR.get(i).getCategory_Name()),
                    String.valueOf(PR.get(i).getPP_name()), String.valueOf(PR.get(i).getPrice()),
                    String.valueOf(PR.get(i).getPromotion_price()), String.valueOf(PR.get(i).getDate_created()),
                    String.valueOf(PR.get(i).getProduct_status()), String.valueOf(PR.get(i).getView_counts()));
        }
        CTG.print();
    }
    public static void Search_Product5()throws SQLException{
        System.out.println("Enter Category_Name:");
        String category=new Validate().checkEmpty();
        PR=new Product_Model().Search4(category);
        CommandLineTableGui CTG = new CommandLineTableGui();
        CTG.setShowVerticalLines(true);
        CTG.setHeaders("Product_ID", "product_Code", "product_Name", "product portfolio", "category_Name", "price",
                "promotion_price", "date_created", "product_status", "view_counts");
        for (int i = 0; i < PR.size(); i++) {
            CTG.addRow(String.valueOf(PR.get(i).getProduct_ID()), String.valueOf(PR.get(i).getProduct_Code()),
                    String.valueOf(PR.get(i).getProduct_Name()), String.valueOf(PR.get(i).getCategory_Name()),
                    String.valueOf(PR.get(i).getPP_name()), String.valueOf(PR.get(i).getPrice()),
                    String.valueOf(PR.get(i).getPromotion_price()), String.valueOf(PR.get(i).getDate_created()),
                    String.valueOf(PR.get(i).getProduct_status()), String.valueOf(PR.get(i).getView_counts()));
        }
        CTG.print();
    }
}
