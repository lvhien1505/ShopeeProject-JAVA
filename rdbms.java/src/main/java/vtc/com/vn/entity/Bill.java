package vtc.com.vn.entity;

public class Bill {
    private int order_ID;
    private int customer_ID;
    private String customer_Name;
    private String SĐT;
    private int product_ID;
    private String product_Name;
    private double price;
    private int amount;
    private String payment_Type;
    private String DC_Ship;
    private String order_Date;
    private String Shipping_Name;
    private String Ship_Date;
    private String Ship_Price;
    private double total;
    private String customer_Notes;
    private String order_Status;

    public Bill(){

    }
    public Bill(int order_ID, int customer_ID,String customer_Name,String SĐT,int product_ID,String product_Name,double price,int amount,String payment_Type,String DC_Ship,String order_Date,String Shipping_Name,String Ship_Date,String Ship_Price,double total,String customer_Notes,String order_Status){
       this.order_ID=order_ID;
       this.customer_ID=customer_ID;
       this.customer_Name=customer_Name;
       this.SĐT=SĐT;
       this.product_ID=product_ID;
       this.product_Name=product_Name;
       this.price=price;
       this.amount=amount;
       this.payment_Type=payment_Type;
       this.DC_Ship=DC_Ship;
       this.order_Date=order_Date;
       this.Shipping_Name=Shipping_Name;
       this.Ship_Date=Ship_Date;
       this.Ship_Price=Ship_Price;
       this.total=total;
       this.customer_Notes=customer_Notes;
       this.order_Status=order_Status;
       
    }
    public int getOrder_ID() {
        return order_ID;
    }
    public void setOrder_ID(int order_ID) {
        this.order_ID = order_ID;
    }
    public int getCustomer_ID() {
        return customer_ID;
    }
    public void setCustomer_ID(int customer_ID) {
        this.customer_ID = customer_ID;
    }
    public String getCustomer_Name() {
        return customer_Name;
    }
    public void setCustomer_Name(String customer_Name) {
        this.customer_Name = customer_Name;
    }
    public String getSĐT() {
        return SĐT;
    }
    public void setSĐT(String sĐT) {
        SĐT = sĐT;
    }
    public int getProduct_ID() {
        return product_ID;
    }
    public void setProduct_ID(int product_ID) {
        this.product_ID = product_ID;
    }
    public String getProduct_Name() {
        return product_Name;
    }
    public void setProduct_Name(String product_Name) {
        this.product_Name = product_Name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public String getPayment_Type() {
        return payment_Type;
    }
    public void setPayment_Type(String payment_Type) {
        this.payment_Type = payment_Type;
    }
    public String getDC_Ship() {
        return DC_Ship;
    }
    public void setDC_Ship(String dC_Ship) {
        DC_Ship = dC_Ship;
    }
    public String getOrder_Date() {
        return order_Date;
    }
    public void setOrder_Date(String order_Date) {
        this.order_Date = order_Date;
    }
    public String getShipping_Name() {
        return Shipping_Name;
    }
    public void setShipping_Name(String shipping_Name) {
        Shipping_Name = shipping_Name;
    }
    public String getShip_Date() {
        return Ship_Date;
    }
    public void setShip_Date(String ship_Date) {
        Ship_Date = ship_Date;
    }
    public String getShip_Price() {
        return Ship_Price;
    }
    public void setShip_Price(String ship_Price) {
        Ship_Price = ship_Price;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public String getCustomer_Notes() {
        return customer_Notes;
    }
    public void setCustomer_Notes(String customer_Notes) {
        this.customer_Notes = customer_Notes;
    }
    public String getOrder_Status() {
        return order_Status;
    }
    public void setOrder_Status(String order_Status) {
        this.order_Status = order_Status;
    }

}