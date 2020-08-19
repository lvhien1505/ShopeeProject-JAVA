package vtc.com.vn.entity;

public class Option_Details {
     private int options_ID;
     private int Product_ID;
     private String PO_Name;

     public Option_Details(){

     }
     public Option_Details(int options_ID,int Product_ID,String PO_Name){
          this.options_ID=options_ID;
          this.Product_ID=Product_ID;
          this.PO_Name=PO_Name;
     }
     public int getOptions_ID() {
         return options_ID;
     }
     public void setOptions_ID(int options_ID) {
         this.options_ID = options_ID;
     }
     public int getProduct_ID() {
         return Product_ID;
     }
     public void setProduct_ID(int product_ID) {
         Product_ID = product_ID;
     }
     public String getPO_Name() {
         return PO_Name;
     }
     public void setPO_Name(String pO_Name) {
         PO_Name = pO_Name;
     }
}