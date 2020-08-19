package vtc.com.vn.entity;

public class Cart {
    private int order_ID;
    private int customer_ID;
    private int product_ID;
    private String product_Name;
    private double price;
    private int amount;

    public Cart(){

    }
    public Cart(int order_ID,int customer_ID,int product_ID,String product_Name, double price,int amount){
        this.order_ID=order_ID;
        this.customer_ID=customer_ID;
        this.product_ID=product_ID;
        this.product_Name=product_Name;
        this.price=price;
        this.amount=amount;
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
}