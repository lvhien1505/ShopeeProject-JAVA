package vtc.com.vn.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import vtc.com.vn.application.CommandLineTableGui;
import vtc.com.vn.connection.JDBCConnection;
import vtc.com.vn.entity.Pay;

public class PayModel {
    static List<Pay> PAY= new ArrayList<>();
    public ArrayList<Pay>select()throws SQLException{
        Connection connection=JDBCConnection.getJDBConnection();
        Statement statement= connection.createStatement();
        ArrayList<Pay>List= new ArrayList<>();
        try {
            String sql="call Select_Pay();";
            ResultSet rs= statement.executeQuery(sql);
            while (rs.next()) {
                int pay_ID=rs.getInt(1);
                String payment_Type =rs.getString(2);
                List.add(new Pay(pay_ID, payment_Type));

            }
            return List;
        } catch (SQLException ex) {
            //TODO: handle exception
            ex.printStackTrace();
        }finally{
            try {
                // connection.close();
                statement.close();
            } catch (SQLException ex) {
                //TODO: handle exception
            }
        }
        return null;
    }
    public static void Select_Pay()throws SQLException{
        PAY=new PayModel().select();
        CommandLineTableGui CTG = new CommandLineTableGui();
        CTG.setShowVerticalLines(true);
        CTG.setHeaders("Pay_ID","Payment_Type");
        for (int i = 0; i < PAY.size(); i++) {
            CTG.addRow(String.valueOf(PAY.get(i).getPay_ID()),String.valueOf(PAY.get(i).getPayment_Type()));
        }
        CTG.print();
    }
}