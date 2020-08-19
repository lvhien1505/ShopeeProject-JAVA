package vtc.com.vn.application;

import java.sql.SQLException;
import java.util.Scanner;

import vtc.com.vn.model.Bill_Model;
import vtc.com.vn.model.CartModel;
import vtc.com.vn.model.CategoryModel;
import vtc.com.vn.model.CustomerModel;
import vtc.com.vn.model.OptionDetailsModel;
import vtc.com.vn.model.OrderModel;
import vtc.com.vn.model.Order_Details_Model;
import vtc.com.vn.model.PayModel;
import vtc.com.vn.model.ProductDetailsModel;
import vtc.com.vn.model.Product_Model;
import vtc.com.vn.model.Product_Option_Model;
import vtc.com.vn.model.ShippingModel;
import vtc.com.vn.model.Shipping_Address_Model;
import vtc.com.vn.model.TB_Option_Model;

/**
 * Menu
 */
public class Menu {

    static Scanner sc = new Scanner(System.in);

    public static void ShowMenu() throws SQLException {
        String choice;
        while (true) {
            System.out.println("  ~~~~~~~~~~~~~~~~~~~~~~~~~~Welcome to our Shopee~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("═════════════════════════════════════════════════════════════════════════════");
            System.out.println("|1.Home Page                                                                |");
            System.out.println("|---------------------------------------------------------------------------|");
            System.out.println("|2.Product Details                                                          |");
            System.out.println("|---------------------------------------------------------------------------|");
            System.out.println("|3.Search                                                                   |");
            System.out.println("|---------------------------------------------------------------------------|");
            System.out.println("|4.Customer                                                                 |");
            System.out.println("|---------------------------------------------------------------------------|");
            System.out.println("|0.Exit The Program                                                         |");
            System.out.println("|---------------------------------------------------------------------------|");
            System.out.println("═════════════════════════════════════════════════════════════════════════════");
            System.out.println("   ==>>Inviting You To Choose:            ");
            choice = sc.nextLine();
            switch (choice) {
                case "1":
                    ClearTheScreen.clrscr();
                    HomePage();
                    break;
                case "2":
                    ClearTheScreen.clrscr();
                    Product_Details();
                    break;
                case "3":
                    ClearTheScreen.clrscr();
                    Search();
                    break;
                case "4":
                    ClearTheScreen.clrscr();
                    Customer();
                    break;
                case "0":
                    ClearTheScreen.clrscr();
                    System.out.println("Bye. See You Again!");
                    System.exit(0);
                    break;
                default:
                    ClearTheScreen.clrscr();
                    System.out.println("There is no function for this. Re-enter:");
                    break;
            }
        }

    }

    public static void HomePage() throws SQLException {
        String choice;
        while (true) {
            System.out.println("----------------------------List Of Products----------------------------");
            System.out.println("|1.Đồ Điện Tử                                                           |");
            System.out.println("|-----------------------------------------------------------------------|");
            System.out.println("|2.Thời Trang Nam                                                       |");
            System.out.println("|-----------------------------------------------------------------------|");
            System.out.println("|3.Thời Trang Nữ                                                        |");
            System.out.println("|-----------------------------------------------------------------------|");
            System.out.println("|4.Thời Trang Điện Da Dụng                                              |");
            System.out.println("|-----------------------------------------------------------------------|");
            System.out.println("|5.Đồng Hồ                                                              |");
            System.out.println("|-----------------------------------------------------------------------|");
            System.out.println("|6.Bách Hóa Online                                                      |");
            System.out.println("|-----------------------------------------------------------------------|");
            System.out.println("|7.Chăm Sóc Thú Cưng                                                    |");
            System.out.println("|-----------------------------------------------------------------------|");
            System.out.println("|8.Đồ Chơi                                                              |");
            System.out.println("|-----------------------------------------------------------------------|");
            System.out.println("|9.Sức Khỏe Và Sắc Đẹp                                                  |");
            System.out.println("|-----------------------------------------------------------------------|");
            System.out.println("|10.Voucher Và Dịch Vụ                                                  |");
            System.out.println("|-----------------------------------------------------------------------|");
            System.out.println("|11.Sản Phẩm Khác                                                       |");
            System.out.println("|-----------------------------------------------------------------------|");
            System.out.println("|12.Ô Tô-Xe Đạp-Xe Máy                                                  |");
            System.out.println("|-----------------------------------------------------------------------|");
            System.out.println("|13.Nhà Sách online                                                     |");
            System.out.println("|-----------------------------------------------------------------------|");
            System.out.println("|0.Back to main menu                                                    |");
            System.out.println("|-----------------------------------------------------------------------|");
            System.out.println("   ==>>Inviting You To Choose:            ");
            choice = sc.nextLine();
            switch (choice) {
                case "1":
                    ClearTheScreen.clrscr();
                    Product_Model.select_Product1();
                    Product_Model.Ask_The_Customer();

                    break;
                case "2":
                    ClearTheScreen.clrscr();
                    Product_Model.select_Product();
                    Product_Model.Ask_The_Customer();
                    break;
                case "3":
                    ClearTheScreen.clrscr();

                    Product_Model.select_Product2();
                    Product_Model.Ask_The_Customer();
                    break;
                case "4":
                    ClearTheScreen.clrscr();

                    Product_Model.select_Product3();
                    Product_Model.Ask_The_Customer();

                    break;
                case "5":
                    ClearTheScreen.clrscr();

                    Product_Model.select_Product4();
                    Product_Model.Ask_The_Customer();

                    break;
                case "6":
                    ClearTheScreen.clrscr();

                    Product_Model.select_Product5();
                    Product_Model.Ask_The_Customer();

                    break;
                case "7":
                    ClearTheScreen.clrscr();

                    Product_Model.select_Product6();
                    Product_Model.Ask_The_Customer();

                    break;
                case "8":
                    ClearTheScreen.clrscr();

                    Product_Model.select_Product7();
                    Product_Model.Ask_The_Customer();

                    break;
                case "9":
                    ClearTheScreen.clrscr();

                    Product_Model.select_Product8();
                    Product_Model.Ask_The_Customer();

                    break;
                case "10":
                    ClearTheScreen.clrscr();

                    Product_Model.select_Product9();
                    Product_Model.Ask_The_Customer();

                    break;
                case "11":
                    ClearTheScreen.clrscr();

                    Product_Model.select_Product10();
                    Product_Model.Ask_The_Customer();

                    break;
                case "12":
                    ClearTheScreen.clrscr();

                    Product_Model.select_Product12();
                    Product_Model.Ask_The_Customer();

                    break;
                case "13":
                    ClearTheScreen.clrscr();

                    Product_Model.select_Product13();
                    Product_Model.Ask_The_Customer();

                    break;
                case "0":
                    ClearTheScreen.clrscr();

                    ShowMenu();
                    break;

                default:
                    ClearTheScreen.clrscr();
                    System.out.println("There is no function for this. Re-enter:");
                    break;
            }

        }

    }

    public static void Product_Details() throws SQLException {
        String choice;
        while (true) {
            System.out.println("--------------------------Product_Details--------------------------");
            System.out.println("|1.Thêm Mới Sản Phẩm                                              |");
            System.out.println("|-----------------------------------------------------------------|");
            System.out.println("|2.Update Sản Phẩm                                                |");
            System.out.println("|-----------------------------------------------------------------|");
            System.out.println("|3.Xem Option Sản Phẩm                                            |");
            System.out.println("|-----------------------------------------------------------------|");
            System.out.println("|4.Xem Thể Loại Sản Phẩm                                          |");
            System.out.println("|-----------------------------------------------------------------|");
            System.out.println("|5.List Option                                                    |");
            System.out.println("|-----------------------------------------------------------------|");
            System.out.println("|6.Thêm Mới Option Sản Phẩm                                       |");
            System.out.println("|-----------------------------------------------------------------|");
            System.out.println("|0.Back to main menu                                              |");
            System.out.println("|-----------------------------------------------------------------|");
            System.out.println("   ==>>Inviting You To Choose:            ");
            choice = sc.nextLine();
            switch (choice) {
                case "1":
                    ClearTheScreen.clrscr();
                    ProductDetailsModel.add_Product();
                    break;
                case "2":
                    ClearTheScreen.clrscr();
                    ProductDetailsModel.Update_Product();
                    break;
                case "3":
                    ClearTheScreen.clrscr();
                    Product_Option_Model.Select_Product_Option();
                    break;
                case "4":
                    ClearTheScreen.clrscr();
                    CategoryModel.select_Category();
                    break;
                case "5":
                    ClearTheScreen.clrscr();
                    List_Option();
                    break;
                case "6":
                    ClearTheScreen.clrscr();
                    OptionDetailsModel.Insert_Product_Option();
                    break;
                case "0":
                    ClearTheScreen.clrscr();
                    ShowMenu();
                    break;
                default:
                    ClearTheScreen.clrscr();
                    System.out.println("There is no function for this .Re-Enter:");
                    break;
            }

        }

    }

    public static void Search() throws SQLException {
        String choice;
        while (true) {
            System.out.println("--------------------Search Product------------------");
            System.out.println("|1.Theo Mã Sản Phẩm                                |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("|2.Theo Danh Mục Sản Phẩm                          |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("|3.Theo Phạm Vi Giá                                |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("|4.Theo Tên Sản Phẩm                               |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("|5.Theo Thể Loại Sản Phẩm                          |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("|6.Theo Danh Mục,Tên Sản Phẩm Và Phạm Vi Giá       |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("|0.Back to main menu                               |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("   ==>>Inviting You To Choose:            ");
            choice = sc.nextLine();
            switch (choice) {
                case "1":
                    ClearTheScreen.clrscr();
                    Product_Model.Search_Product();
                    break;
                case "2":
                    ClearTheScreen.clrscr();
                    Product_Model.select_Product11();
                    break;
                case "3":
                    ClearTheScreen.clrscr();
                    Product_Model.Search_Product2();
                    break;
                case "4":
                    ClearTheScreen.clrscr();
                    Product_Model.Search_Product3();
                    break;
                case "5":
                    ClearTheScreen.clrscr();
                    Product_Model.Search_Product5();
                    break;
                case "6":
                    ClearTheScreen.clrscr();
                    Product_Model.Search_Product4();
                    break;
                case "0":
                    ClearTheScreen.clrscr();
                    ShowMenu();
                    break;
                default:
                    ClearTheScreen.clrscr();
                    System.out.println("There is no function for this.Re-Enter:");
                    break;
            }
        }

    }

    public static void Customer() throws SQLException {
        String choice;
        while (true) {
            System.out.println("------------------------Customer------------------------");
            System.out.println("|1.Thông Tin Cá Nhân                                   |");
            System.out.println("|------------------------------------------------------|");
            System.out.println("|2.Lịch Sử Mua Hàng                                    |");
            System.out.println("|------------------------------------------------------|");
            System.out.println("|3.Đăng Kí                                             |");
            System.out.println("|------------------------------------------------------|");
            System.out.println("|4.Giỏ Hàng                                            |");
            System.out.println("|------------------------------------------------------|");
            System.out.println("|5.Địa Chỉ Ship Hàng                                   |");
            System.out.println("|------------------------------------------------------|");
            System.out.println("|6.Thêm Địa Chỉ Ship Hàng                              |");
            System.out.println("|------------------------------------------------------|");
            System.out.println("|0.Back to main menu                                   |");
            System.out.println("|------------------------------------------------------|");
            System.out.println("   ==>>Inviting You To Choose:            ");
            choice = sc.nextLine();
            switch (choice) {
                case "1":
                    ClearTheScreen.clrscr();
                    CustomerModel.LogIn();
                    break;
                case "2":
                    ClearTheScreen.clrscr();
                    Bill_Model.selectBIll();
                    break;
                case "3":
                    ClearTheScreen.clrscr();
                    CustomerModel.add_Customer();
                    break;
                case "4":
                    ClearTheScreen.clrscr();
                    cart();
                    break;
                case "0":
                    ClearTheScreen.clrscr();
                    ShowMenu();
                    break;
                case "5":
                    ClearTheScreen.clrscr();
                    Shipping_Address_Model.Select_Shipping_Address();
                    break;
                case "6":
                    ClearTheScreen.clrscr();
                    Shipping_Address_Model.Insert_Shipping_Address();
                    break;
                default:
                    ClearTheScreen.clrscr();
                    System.out.println("There is no function for this .Re-Enter:");
                    break;
            }
        }

    }

    public static void cart() throws SQLException {
        String choice;
        System.out.println("--------------------------CART-------------------------");
        System.out.println("|1.Xem Giỏ Hàng                                       |");
        System.out.println("|-----------------------------------------------------|");
        System.out.println("|2.Thêm Sản Phẩm Vào Giỏ Hàng                         |");
        System.out.println("|-----------------------------------------------------|");
        System.out.println("|3.Update Giỏ Hàng                                    |");
        System.out.println("|-----------------------------------------------------|");
        System.out.println("|4.Xóa Sản Phẩm Khỏi Giỏ Hàng                         |");
        System.out.println("|-----------------------------------------------------|");
        System.out.println("|5.PAY                                                |");
        System.out.println("|-----------------------------------------------------|");
        System.out.println("|0.Back to main menu                                  |");
        System.out.println("|-----------------------------------------------------|");
        System.out.println("   ==>>Inviting You To Choose:            ");
        choice = sc.nextLine();
        switch (choice) {
            case "1":
                ClearTheScreen.clrscr();
                CartModel.Select_Cart();
                break;
            case "2":
                ClearTheScreen.clrscr();
                Order_Details_Model.add_order_details();
                break;
            case "3":
                ClearTheScreen.clrscr();
                Order_Details_Model.Update_Order_Details();
                break;
            case "4":
                ClearTheScreen.clrscr();
                Order_Details_Model.Delete_Order_Details();
                break;
            case "5":
                ClearTheScreen.clrscr();
                Pay();
                break;
            case "0":
                ClearTheScreen.clrscr();
                Customer();
                break;

            default:
                ClearTheScreen.clrscr();
                System.out.println("There is no function for this .Re-Enter:");
                break;
        }
    }

    public static void Pay() throws SQLException {
        String choice;
        while (true) {
            System.out.println("---------------------PAY--------------------");
            System.out.println("|1.Thanh Toán                               |");
            System.out.println("|-------------------------------------------|");
            System.out.println("|2.Kiểu Thanh Toán                          |");
            System.out.println("|-------------------------------------------|");
            System.out.println("|3.Dịch Vụ Giao Hàng                        |");
            System.out.println("|-------------------------------------------|");
            System.out.println("|0.Back to main menu                        |");
            System.out.println("|-------------------------------------------|");
            System.out.println("   ==>>Inviting You To Choose:            ");
            choice = sc.nextLine();
            switch (choice) {
                case "1":
                    ClearTheScreen.clrscr();
                    OrderModel.update_Order();
                    ClearTheScreen.clrscr();
                    Bill_Model.select_Bill();
                    OrderModel.Update_Order_Status();
                    break;
                case "2":
                    ClearTheScreen.clrscr();
                    PayModel.Select_Pay();
                    break;
                case "3":
                    ClearTheScreen.clrscr();
                    ShippingModel.Select_Shipping();
                    break;
                case "0":
                    ClearTheScreen.clrscr();
                    cart();
                    break;
                default:
                    ClearTheScreen.clrscr();
                    System.out.println("There is no function for this .Re-Enter:");
                    break;
            }
        }

    }
    public static void List_Option()throws SQLException{
        String choice;
        while (true) {
            System.out.println("------------------------List_Option------------------------");
            System.out.println("|1.Xem Danh Sách Option                                   |");
            System.out.println("|---------------------------------------------------------|");
            System.out.println("|2.Thêm Mới Option                                        |");
            System.out.println("|---------------------------------------------------------|");
            System.out.println("|0.Back to main menu                                      |");
            System.out.println("|---------------------------------------------------------|");
            System.out.println("   ==>>Inviting You To Choose:            ");
            choice=sc.nextLine();
            switch (choice) {
                case "1":
                    ClearTheScreen.clrscr();
                    TB_Option_Model.Select_TB_Option();
                    break;
                case "2":
                    ClearTheScreen.clrscr();
                    TB_Option_Model.Insert_TB_Option();
                    break;
                case "0":
                    ClearTheScreen.clrscr();
                    Product_Details();
                    break;
            
                default:
                    ClearTheScreen.clrscr();
                    System.out.println("There is no function for this .Re-Enter:");
                    break;
            } 
        }
        
    }
}