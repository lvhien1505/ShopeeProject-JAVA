package vtc.com.vn.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import vtc.com.vn.application.ClearTheScreen;
import vtc.com.vn.application.CommandLineTableGui;
import vtc.com.vn.connection.JDBCConnection;
import vtc.com.vn.entity.Customer;
import vtc.com.vn.util.Validate;

public class CustomerModel {
    static List<Customer> CM = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public ArrayList<Customer> SelectRecords(String email,String pass) throws SQLException {
        Connection connection = JDBCConnection.getJDBConnection();
        Statement statement = connection.createStatement();
        ArrayList<Customer> List = new ArrayList<>();
        try {
            String sql = "call select_Customer('"+email+"','"+pass+"');";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int customer_ID = rs.getInt(1);
                String customer_Name = rs.getString(2);
                String mail = rs.getString(3);
                String password = rs.getString(4);
                String phone_Number = rs.getString(5);
                String address = rs.getString(6);
                String customer_Status = rs.getString(7);
                List.add(new Customer(customer_ID, customer_Name, mail, password, phone_Number, address, customer_Status));
            }
            return List;
        } catch (SQLException ex) {
            // TODO: handle exception
            ex.printStackTrace();

        } finally {
            try {
               statement.close();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        return null;
    }
    public ArrayList<Customer> check_customer()throws SQLException{
        Connection connection = JDBCConnection.getJDBConnection();
        Statement statement = connection.createStatement();
        ArrayList<Customer> List = new ArrayList<>();
        try {
            String sql = "call Select_Customer2();";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int customer_ID = rs.getInt(1);
                String customer_Name = rs.getString(2);
                String mail = rs.getString(3);
                String password = rs.getString(4);
                String phone_Number = rs.getString(5);
                String address = rs.getString(6);
                String customer_Status = rs.getString(7);
                List.add(new Customer(customer_ID, customer_Name, mail, password, phone_Number, address, customer_Status));
            }
            return List;
        } catch (SQLException ex) {
            // TODO: handle exception
            ex.printStackTrace();

        } finally {
            try {
                statement.close();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        return null;
    }

    public static void LogIn() throws SQLException {
        Customer cmr = new Customer();
        // boolean check = true;
        
            System.out.println("Enter Email:");
            String email = sc.nextLine();
            cmr.setEmail(email);
            System.out.println("Enter Password:");
            String pass = sc.nextLine();
            cmr.setPass(pass);
            CM= new CustomerModel().SelectRecords(email, pass);
        //     int kt = 0;
        //     for (int i = 0; i < CM.size(); i++) {
        //         if (CM.get(i).getEmail().equals(email) && CM.get(i).getPass().equals(pass)) {
        //             kt = 1;
        //         }
        //     }
        //     if (kt == 1) {
        //         System.out.println("Email and Password is correct!");
        //         check = false;
            
        //     } else {
        //         System.out.println("Email or Password is wrong!");
        //         check = true;
            
        //     }
            
        // }
        ClearTheScreen.clrscr();
        CommandLineTableGui CTG= new CommandLineTableGui();
        CTG.setShowVerticalLines(true);
        CTG.setHeaders("Customer_Name","Email","Phone_Number","Address","Customer_Status");
        for (int i = 0; i <CM.size() ; i++) {
            CTG.addRow(String.valueOf(CM.get(i).getCustomer_Name()),String.valueOf(CM.get(i).getEmail()),String.valueOf(CM.get(i).getPhone_Number()),String.valueOf(CM.get(i).getAddress()),String.valueOf(CM.get(i).getCustomer_Status()));
        }
        CTG.print();
    }


    public void insert_customer(Customer cm)throws SQLException{
        PreparedStatement preparedStatement= null;
        Connection connection= JDBCConnection.getJDBConnection();
        try {
            String sql="insert into customer (customer_Name,email,user_pass,phone_Number,address,customer_Status)values(?,?,?,?,?,?)";
            preparedStatement =(PreparedStatement)connection.prepareStatement(sql);
            preparedStatement.setString(1, cm.getCustomer_Name());
            preparedStatement.setString(2, cm.getEmail());
            preparedStatement.setString(3, cm.getPass());
            preparedStatement.setString(4, cm.getPhone_Number());
            preparedStatement.setString(5, cm.getAddress());
            preparedStatement.setString(6, cm.getCustomer_Status());
            preparedStatement.execute();
        } catch (SQLException ex) {
            //TODO: handle exception
            ex.printStackTrace();
        }finally{
            try {
                preparedStatement.close();
                
            } catch (SQLException ez) {
                //TODO: handle exception
            }
        }
    }
      
    public static void add_Customer()throws SQLException{
        Customer cm= new Customer();
        CustomerModel cml=  new CustomerModel();
        System.out.println("Enter Customer_Name: ");
        String customer_Name=new Validate().checkString();
        cm.setCustomer_Name(customer_Name);
        boolean check=true;
        while (check) {
            System.out.println("Enter Email:");
            String email=new Validate().checkEMail();
            cm.setEmail(email);
            CM=new CustomerModel().check_customer();
            int kt=0;
            for (int i = 0; i < CM.size(); i++) {
                if (CM.get(i).getEmail().equals(email)) {
                    kt=1;
                }
            }
            if (kt==1) {
                System.out.println("Email Đã Tồn Tại! Mời Nhập Lại:");
                check=true;
            }
            else{
                System.out.println("Email Hợp Lệ!");
                check=false;
            }
        }
        
        System.out.println("Enter password: ");
        String pass=new Validate().check_PassWord();
        cm.setPass(pass);
        boolean ch=true;
        while (ch) {
            System.out.println("Enter Phone_Number:");
            String phone_number=new Validate().check_SĐT();
            cm.setPhone_Number(phone_number);
            CM=new CustomerModel().check_customer();
            int k=0;
            for (int i = 0; i < CM.size(); i++) {
                if (CM.get(i).getPhone_Number().equals(phone_number)) {
                    k=1;
                }
            }
            if (k==1) {
                System.out.println("Số Điện Thoại Trùng Với Người Dùng Khác! Mời Nhập Lại:");
                ch=true;
            }
            else{
                System.out.println("Số Điện Thoại Hợp Lệ!");
                ch=false;
            }
        }
       
        System.out.println("Enter Address:");
        String address=sc.nextLine();
        cm.setAddress(address);
        System.out.println("Enter Customer_Status:");
        String customer_status=sc.nextLine();
        cm.setCustomer_Status(customer_status);
        CM.add(cm);
        cml.insert_customer(cm);
        ClearTheScreen.clrscr();
        System.out.println("  /-------------------------------------------/");
        System.out.println(" /        Registration Successful            /");
        System.out.println("/-------------------------------------------/");
        String choice=sc.nextLine();
        System.out.println("  ====>>>Press enter to continue........."+choice);
    }
    
}