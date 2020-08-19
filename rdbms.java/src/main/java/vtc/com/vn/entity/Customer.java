package vtc.com.vn.entity;

public class Customer {
    private int customer_ID ;
    private String customer_Name;
    private String email;
    private String pass;
    private String phone_Number;
    private String address;
    private String customer_Status;

    public Customer(){

    }
    public Customer(int customer_ID,String customer_Name,String email,String pass,String phone_Number,String address,String customer_Status){

        this.customer_ID=customer_ID;
        this.customer_Name=customer_Name;
        this.email=email;
        this.pass=pass;
        this.phone_Number=phone_Number;
        this.address=address;
        this.customer_Status=customer_Status;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    public String getPhone_Number() {
        return phone_Number;
    }
    public void setPhone_Number(String phone_Number) {
        this.phone_Number = phone_Number;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCustomer_Status() {
        return customer_Status;
    }
    public void setCustomer_Status(String customer_Status) {
        this.customer_Status = customer_Status;
    }
}