package vtc.com.vn.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import vtc.com.vn.application.CommandLineTableGui;
import vtc.com.vn.connection.JDBCConnection;
import vtc.com.vn.entity.TB_Option;
import vtc.com.vn.util.Validate;

public class TB_Option_Model {
    static List<TB_Option> TO= new ArrayList<>();
    static Scanner sc= new Scanner(System.in);

    public ArrayList<TB_Option>select()throws SQLException{
         Connection connection= JDBCConnection.getJDBConnection();
         Statement statement= connection.createStatement();
         ArrayList<TB_Option> List= new ArrayList<>();
         try {
             String sql="SELECT * FROM shopee.tb_options;";
             ResultSet rs= statement.executeQuery(sql);
             while (rs.next()) {
                 int optionID= rs.getInt(1);
                 String optionName=rs.getString(2);
                 List.add(new TB_Option(optionID, optionName));
             }

             return List;
            
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
         return null;
    }
    public void Insert(TB_Option to)throws SQLException{
           Connection connection=JDBCConnection.getJDBConnection();
           PreparedStatement preparedStatement=null;
           try {
               String sql="insert into tb_options(options_ID,options_Name)values(?,?)";
               preparedStatement=(PreparedStatement)connection.prepareStatement(sql);
               preparedStatement.setInt(1, to.getOptionID());
               preparedStatement.setString(2, to.getOptionName());
               preparedStatement.execute();
           } catch (SQLException ex) {
               //TODO: handle exceptione
               ex.printStackTrace();
           }finally{
               try {
                   preparedStatement.close();
               } catch (SQLException ex) {
                   //TODO: handle exception
               }
           }
    }
    public static void Select_TB_Option()throws SQLException{
        TO= new TB_Option_Model().select();
        CommandLineTableGui CTG = new CommandLineTableGui();
        CTG.setShowVerticalLines(true);
        CTG.setHeaders("Option_ID","Option_Name");
        for (int i = 0; i < TO.size(); i++) {
            CTG.addRow(String.valueOf(TO.get(i).getOptionID()),String.valueOf(TO.get(i).getOptionName()));
        }
        CTG.print();
    }
    public static void Insert_TB_Option()throws SQLException{
        TB_Option to = new TB_Option();
        TB_Option_Model tom= new TB_Option_Model();
        boolean check=true;
        while (check) {
            System.out.println("Enter Options_ID:");
            int Option_ID=Integer.parseInt(new Validate().checkINT());
            to.setOptionID(Option_ID);
            TO= new TB_Option_Model().select();
            int kt=0;
            for (int i = 0; i < TO.size(); i++) {
                if (TO.get(i).getOptionID()==Option_ID) {
                    kt=1;
                }
            }
            if (kt==1) {
                System.out.println("Options_ID đã Tồn Tại! Mời Nhập Lại: ");
                check=true;
            }
            else{
                System.out.println("Options_ID Hợp Lệ!");
                check=false;
            }
        }
        System.out.println("Enter Option_Name:");
        String option_Name= new Validate().checkEmpty();
        to.setOptionName(option_Name);
        TO.add(to);
        tom.Insert(to);
        System.out.println("  /----------------------------------------/");
        System.out.println(" /          Add New Successfully          /");
        System.out.println("/----------------------------------------/");
    }
}