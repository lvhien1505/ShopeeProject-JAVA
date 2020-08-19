package vtc.com.vn.entity;

public class Product_Option {
    private int product_ID;
    private  String product_Code;
    private  String Product_Name;
    private String PO_Name;
    private String option_Name;

    public Product_Option(){

    }

    public Product_Option(int product_ID,String product_Code,String Product_Name,String PO_Name,String option_Name){
       this.product_ID=product_ID;
       this.product_Code=product_Code;
       this.Product_Name=Product_Name;
       this.PO_Name=PO_Name;
       this.option_Name=option_Name;
        
    }
    public int getProduct_ID() {
        return product_ID;
    }
    public void setProduct_ID(int product_ID) {
        this.product_ID = product_ID;
    }
    public String getProduct_Code() {
        return product_Code;
    }
    public void setProduct_Code(String product_Code) {
        this.product_Code = product_Code;
    }
    public String getProduct_Name() {
        return Product_Name;
    }
    public void setProduct_Name(String product_Name) {
        Product_Name = product_Name;
    }
    public String getPO_Name() {
        return PO_Name;
    }
    public void setPO_Name(String pO_Name) {
        PO_Name = pO_Name;
    }
    public String getOption_Name() {
        return option_Name;
    }
    public void setOption_Name(String option_Name) {
        this.option_Name = option_Name;
    }
}