package vtc.com.vn.entity;

public class Order {
    private int Order_ID;
    private int customer_ID;
    private int Pay_ID;
    private int address_ID;
    private int Shipping_ID;
    private String order_date;
    private String customer_Note;
    private String order_Status;

    public Order() {

    }

    public Order(int Order_ID, int customer_ID, int Pay_ID, int address_ID, int Shipping_ID, String order_date,
            String customer_Note, String order_Status) {
        this.Order_ID = Order_ID;
        this.customer_ID = customer_ID;
        this.Pay_ID = Pay_ID;
        this.address_ID = address_ID;
        this.Shipping_ID = Shipping_ID;
        this.order_date = order_date;
        this.customer_Note = customer_Note;
        this.order_Status = order_Status;

    }

    public int getOrder_ID() {
        return Order_ID;
    }

    public void setOrder_ID(int order_ID) {
        Order_ID = order_ID;
    }

    public int getCustomer_ID() {
        return customer_ID;
    }

    public void setCustomer_ID(int customer_ID) {
        this.customer_ID = customer_ID;
    }

    public int getPay_ID() {
        return Pay_ID;
    }

    public void setPay_ID(int pay_ID) {
        Pay_ID = pay_ID;
    }

    public int getAddress_ID() {
        return address_ID;
    }

    public void setAddress_ID(int address_ID) {
        this.address_ID = address_ID;
    }

    public int getShipping_ID() {
        return Shipping_ID;
    }

    public void setShipping_ID(int shipping_ID) {
        Shipping_ID = shipping_ID;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public String getCustomer_Note() {
        return customer_Note;
    }

    public void setCustomer_Note(String customer_Note) {
        this.customer_Note = customer_Note;
    }

    public String getOrder_Status() {
        return order_Status;
    }

    public void setOrder_Status(String order_Status) {
        this.order_Status = order_Status;
    }
}