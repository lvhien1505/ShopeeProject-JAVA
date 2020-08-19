package vtc.com.vn.entity;

public class Pay {
    private int pay_ID ;
    private String payment_Type;
    public Pay(){

    }
    public Pay(int pay_ID,String payment_Type){
       this.pay_ID=pay_ID;
       this.payment_Type=payment_Type;
    }
    public int getPay_ID() {
        return pay_ID;
    }
    public void setPay_ID(int pay_ID) {
        this.pay_ID = pay_ID;
    }
    public String getPayment_Type() {
        return payment_Type;
    }
    public void setPayment_Type(String payment_Type) {
        this.payment_Type = payment_Type;
    }
}