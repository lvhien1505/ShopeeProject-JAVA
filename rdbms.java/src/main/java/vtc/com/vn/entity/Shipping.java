package vtc.com.vn.entity;

public class Shipping {
    private int Shipping_ID ;
    private String Shipping_Name;
    private String Shipping_Date;
    private double price;
    private String Shipping_Status;

    public Shipping(){

    }
    public Shipping(int Shipping_ID,String Shipping_Name,String Shipping_Date,double price,String Shipping_Status){
       this.Shipping_ID=Shipping_ID;
       this.Shipping_Name=Shipping_Name;
       this.Shipping_Date=Shipping_Date;
       this.price=price;
       this.Shipping_Status=Shipping_Status;
    }
    public int getShipping_ID() {
        return Shipping_ID;
    }
    public void setShipping_ID(int shipping_ID) {
        Shipping_ID = shipping_ID;
    }
    public String getShipping_Name() {
        return Shipping_Name;
    }
    public void setShipping_Name(String shipping_Name) {
        Shipping_Name = shipping_Name;
    }
    public String getShipping_Date() {
        return Shipping_Date;
    }
    public void setShipping_Date(String shipping_Date) {
        Shipping_Date = shipping_Date;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getShipping_Status() {
        return Shipping_Status;
    }
    public void setShipping_Status(String shipping_Status) {
        Shipping_Status = shipping_Status;
    }
}