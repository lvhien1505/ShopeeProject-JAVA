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
import vtc.com.vn.entity.Product_Details;
import vtc.com.vn.util.Validate;

public class ProductDetailsModel {
    static Scanner sc = new Scanner(System.in);
    static List<Product_Details> PD = new ArrayList<>();

    // -----------------------------------------------------------Query--------------------------------------------------------
    public void insertRecord(Product_Details prd) throws SQLException {
        PreparedStatement preparedStatement = null;
        Connection connection = JDBCConnection.getJDBConnection();
        try {
            String sql = "insert into shopee.product(product_Code,Product_Name,category_ID,price,promotion_price,Product_description,date_created,product_status,view_counts) values(?,?,?,?,?,?,?,?,?)";
            preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setString(1, prd.getProduct_Code());
            preparedStatement.setNString(2, prd.getProduct_Name());
            preparedStatement.setInt(3, prd.getCategory_ID());
            preparedStatement.setDouble(4, prd.getPrice());
            preparedStatement.setDouble(5, prd.getPromotion_price());
            preparedStatement.setString(6, prd.getProduct_description());
            preparedStatement.setString(7, prd.getDate_created());
            preparedStatement.setString(8, prd.getProduct_status());
            preparedStatement.setInt(9, prd.getView_counts());
            preparedStatement.execute();

        } catch (SQLException ex) {
            // TODO: handle exception
            ex.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
                connection.close();
            } catch (SQLException ex) {
                // TODO: handle exception
            }
        }
    }

    public void UpdateRecord(Product_Details prd) throws SQLException {
        PreparedStatement preparedStatement = null;
        Connection connection = JDBCConnection.getJDBConnection();
        try {
            String sql = "UPDATE product SET Product_Name=?,category_ID=?,price=?,promotion_price=?,Product_description=?,date_created=?,product_status=?,view_counts=? Where product_Code=?";
            preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setString(1, prd.getProduct_Name());
            preparedStatement.setInt(2, prd.getCategory_ID());
            preparedStatement.setDouble(3, prd.getPrice());
            preparedStatement.setDouble(4, prd.getPromotion_price());
            preparedStatement.setString(5, prd.getProduct_description());
            preparedStatement.setString(6, prd.getDate_created());
            preparedStatement.setString(7, prd.getProduct_status());
            preparedStatement.setInt(8, prd.getView_counts());
            preparedStatement.setString(9, prd.getProduct_Code());
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            // TODO: handle exception
            ex.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
                connection.close();
            } catch (SQLException ex) {
                // TODO: handle exception
            }
        }
    }

    public ArrayList<Product_Details> Select() throws SQLException {
        Connection connection = JDBCConnection.getJDBConnection();
        Statement statement = connection.createStatement();
        ArrayList<Product_Details> List = new ArrayList<>();
        try {
            String sql = "select * from product";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int Product_ID = rs.getInt(1);
                String Product_Code = rs.getString(2);
                String Product_Name = rs.getString(3);
                int Category_ID = rs.getInt(4);
                double Price = rs.getDouble(5);
                double promotion_price = rs.getDouble(6);
                String Product_description = rs.getString(7);
                String Date_Created = rs.getString(8);
                String product_Status = rs.getString(9);
                int view_counts = rs.getInt(10);
                List.add(new Product_Details(Product_ID, Product_Code, Product_Name, Category_ID, Price,
                        promotion_price, Product_description, Date_Created, product_Status, view_counts));

            }
            return List;
        } catch (SQLException ex) {
            // TODO: handle exception
            ex.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        return null;

    }
    //  đây anh

    // ---------------------------------------------------------interface------------------------------------------------------
    public static void add_Product() throws SQLException {
        Product_Details pdd = new Product_Details();
        ProductDetailsModel pdm = new ProductDetailsModel();
        while (true) {
            System.out.println("---------------------------------Thêm Mới Sản Phẩm--------------------------------");
            boolean check = true;
            while (check) {
                System.out.print("1.Enter product_Code:");
                String product_Code = sc.nextLine();
                pdd.setProduct_Code(product_Code);
                PD = new ProductDetailsModel().Select();
                int kt = 0;
                for (int i = 0; i < PD.size(); i++) {
                    if (PD.get(i).getProduct_Code().equals(product_Code)) {
                        kt = 1;
                    }
                }
                if (kt == 1) {
                    System.out.println("Product_Code Đã Tồn Tại! MỜi Nhập Lại:");
                    check = true;
                } else {
                    System.out.println("Product_Code Hợp Lệ!");
                    check = false;
                }
            }

            System.out.print("2.Enter product_Name:");
            String product_Name = sc.nextLine();
            pdd.setProduct_Name(product_Name);
            boolean ch = true;
            while (ch) {
                System.out.print("3.Enter category_ID:");
                int category_ID = Integer.parseInt(new Validate().checkINT());
                pdd.setCategory_ID(category_ID);
                PD = new ProductDetailsModel().Select();
                int k = 0;
                for (int i = 0; i < PD.size(); i++) {
                    if (PD.get(i).getCategory_ID() == category_ID) {
                        k = 1;
                    }
                }
                if (k == 1) {
                    System.out.println("Category_ID Hợp Lệ!");
                    ch = false;
                } else {
                    System.out.println("Category_ID Không Tồn Tại!");
                    ch = true;
                }
            }

            System.out.print("4.Enter price:");
            double price = Double.parseDouble(new Validate().checkINT());
            pdd.setPrice(price);
            System.out.print("5.Enter promotion_price: ");
            double promotion_price = Double.parseDouble(new Validate().checkINT());
            pdd.setPromotion_price(promotion_price);
            System.out.print("6.Enter Product_description: ");
            String product_description = new Validate().checkEmpty();
            pdd.setProduct_description(product_description);
            Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            // Trả về giá trị từ 0 - 11
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);
            pdd.setDate_created("" + year + "-" + (month + 1) + "-" + day);
            System.out.print("8.Enter product_Status:");
            String product_status = new Validate().checkEmpty();
            pdd.setProduct_status(product_status);
            System.out.print("9.Enter View_Counts:");
            int view_counts = Integer.parseInt(new Validate().checkINT());
            pdd.setView_counts(view_counts);
            PD.add(pdd);
            pdm.insertRecord(pdd);
            ClearTheScreen.clrscr();
            System.out.println("  /--------------------------------------------/");
            System.out.println(" /       Add new products successfully        /");
            System.out.println("/--------------------------------------------/'");
            boolean kt = true;

            while (kt) {
                System.out.println("Do you want to continue?(y/n)");
                String yn = sc.nextLine();
                switch (yn) {
                    case "y":
                        ClearTheScreen.clrscr();
                        kt = false;
                        break;
                    case "n":
                        ClearTheScreen.clrscr();
                        Menu.Product_Details();
                        kt = false;
                        break;

                    default:
                        ClearTheScreen.clrscr();
                        System.out.println("There is no function for this!");
                        kt = true;
                        break;
                }

            }
        }

    }

    public static void Update_Product() throws SQLException {
        Product_Details pdd = new Product_Details();
        ProductDetailsModel pdm = new ProductDetailsModel();
        while (true) {
            System.out.println("---------------------------------Update Sản Phẩm--------------------------------");
            boolean check = true;
            while (check) {
                System.out.print("1.Enter product_Code:");
                String product_Code = sc.nextLine();
                pdd.setProduct_Code(product_Code);
                PD = new ProductDetailsModel().Select();
                int kt = 0;
                for (int i = 0; i < PD.size(); i++) {
                    if (PD.get(i).getProduct_Code().equals(product_Code)) {
                        kt = 1;
                    }
                }
                if (kt == 1) {
                    System.out.println("Product_Code Hợp Lệ!");
                    check = false;
                } else {
                    System.out.println("Product_Code Không Tồn Tại!");
                    check = true;
                }
            }

            System.out.print("2.Update product_Name:");
            String product_Name = sc.nextLine();
            pdd.setProduct_Name(product_Name);
            boolean ch = true;
            while (ch) {
                System.out.print("3.Update category_ID:");
                int category_ID = Integer.parseInt(new Validate().checkINT());
                pdd.setCategory_ID(category_ID);
                PD = new ProductDetailsModel().Select();
                int k = 0;
                for (int i = 0; i < PD.size(); i++) {
                    if (PD.get(i).getCategory_ID() == category_ID) {
                        k = 1;
                    }

                }
                if (k == 1) {
                    System.out.println("Category_ID Hợp Lệ!");
                    ch = false;
                } else {
                    System.out.println("Category-ID Không Tồn Tại!");
                    ch = true;
                }
            }

            System.out.print("4.Update price:");
            double price = Double.parseDouble(new Validate().checkINT());
            pdd.setPrice(price);
            System.out.print("5.Update promotion_price: ");
            double promotion_price = Double.parseDouble(new Validate().checkINT());
            pdd.setPromotion_price(promotion_price);
            System.out.print("6.Update Product_description: ");
            String product_description = new Validate().checkEmpty();
            pdd.setProduct_description(product_description);
            Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            // Trả về giá trị từ 0 - 11
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);
            pdd.setDate_created("" + year + "-" + (month + 1) + "-" + day);
            System.out.print("8.Update product_Status:");
            String product_status = new Validate().checkEmpty();
            pdd.setProduct_status(product_status);
            System.out.print("9.Update View_Counts:");
            int view_counts = Integer.parseInt(new Validate().checkINT());
            pdd.setView_counts(view_counts);
            PD.add(pdd);
            pdm.UpdateRecord(pdd);
            ClearTheScreen.clrscr();
            System.out.println("  /--------------------------------------------/");
            System.out.println(" /       Update new products successfully     /");
            System.out.println("/--------------------------------------------/'");
            boolean kt = true;

            while (kt) {
                System.out.println("Do you want to continue?(y/n)");
                String yn = sc.nextLine();
                switch (yn) {
                    case "y":
                        ClearTheScreen.clrscr();
                        kt = false;
                        break;
                    case "n":
                        ClearTheScreen.clrscr();
                        Menu.Product_Details();
                        kt = false;
                        break;

                    default:
                        ClearTheScreen.clrscr();
                        System.out.println("There is no function for this!");
                        kt = true;
                        break;
                }

            }
        }

    }
}