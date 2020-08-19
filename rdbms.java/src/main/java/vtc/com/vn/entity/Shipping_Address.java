package vtc.com.vn.entity;

public class Shipping_Address {
    private int address_ID ;
    private int customer_ID;
    private String address_Details;

    public Shipping_Address(){

    }
    public Shipping_Address(int address_ID, int customer_ID, String address_Details){
          this.address_ID=address_ID;
          this.customer_ID=customer_ID;
          this.address_Details=address_Details;
    }
    public int getAddress_ID() {
        return address_ID;
    }
    public void setAddress_ID(int address_ID) {
        this.address_ID = address_ID;
    }
    public int getCustomer_ID() {
        return customer_ID;
    }
    public void setCustomer_ID(int customer_ID) {
        this.customer_ID = customer_ID;
    }
    public String getAddress_Details() {
        return address_Details;
    }
    public void setAddress_Details(String address_Details) {
        this.address_Details = address_Details;
    }
}