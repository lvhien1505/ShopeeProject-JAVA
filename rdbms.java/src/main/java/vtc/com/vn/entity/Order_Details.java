package vtc.com.vn.entity;

public class Order_Details {
    private int orders_ID ;
    private int product_ID;
    private int amount;

    public Order_Details(){

    }
    public Order_Details(int orders_ID,int product_ID,int amount){
          this.orders_ID=orders_ID;
          this.product_ID=product_ID;
          this.amount=amount;

    }
    public int getOrders_ID() {
        return orders_ID;
    }
    public void setOrders_ID(int orders_ID) {
        this.orders_ID = orders_ID;
    }
    public int getProduct_ID() {
        return product_ID;
    }
    public void setProduct_ID(int product_ID) {
        this.product_ID = product_ID;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
}