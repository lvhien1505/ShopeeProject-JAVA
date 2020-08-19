package vtc.com.vn.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import vtc.com.vn.connection.JDBCConnection;
import vtc.com.vn.entity.Option_Details;
import vtc.com.vn.util.Validate;

public class OptionDetailsModel {
    static List<Option_Details>OD= new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public void Insert(Option_Details od)throws SQLException{
          Connection connection=JDBCConnection.getJDBConnection();
          PreparedStatement preparedStatement=null;
          try {
              String sql="Insert Into product_option(options_ID,Product_ID,PO_Name)values(?,?,?)";
              preparedStatement=(PreparedStatement)connection.prepareStatement(sql);
              preparedStatement.setInt(1, od.getOptions_ID());
              preparedStatement.setInt(2, od.getProduct_ID());
              preparedStatement.setString(3, od.getPO_Name());
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
    public static void Insert_Product_Option()throws SQLException{
        Option_Details od= new Option_Details();
        OptionDetailsModel odm= new OptionDetailsModel();
        System.out.println("Enter Option_ID:");
        int options_ID=Integer.parseInt(new Validate().checkINT());
        od.setOptions_ID(options_ID);
        System.out.println("Enter Product_ID:");
        int Product_ID=Integer.parseInt(new Validate().checkINT());
        od.setProduct_ID(Product_ID);
        System.out.println("Enter PO_Name:");
        String PO_Name=new Validate().checkEmpty();
        od.setPO_Name(PO_Name);
        OD.add(od);
        odm.Insert(od);

    }
}