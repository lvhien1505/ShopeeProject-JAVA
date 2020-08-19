package vtc.com.vn.entity;

public class Product_Details {
    private int Product_ID ;
    private String product_Code;
    private String product_Name ;
    private int category_ID;
    private double price;
    private double promotion_price;
    private String Product_description;
    private String date_created;
    private String product_status;
    private int view_counts;


    public Product_Details(){

    }
    public Product_Details(int Product_ID,String product_Code,String product_Name,int category_ID, double price,double promotion_price,String Product_description,String date_created,String product_status,int view_counts){
        this.Product_ID=Product_ID;
        this.product_Code=product_Code;
        this.product_Name=product_Name;
        this.category_ID=category_ID;
        this.price=price;
        this.promotion_price=promotion_price;
        this.Product_description=Product_description;
        this.date_created=date_created;
        this.product_status=product_status;
        this.view_counts=view_counts;
    }
    public int getProduct_ID() {
        return Product_ID;
    }
    public void setProduct_ID(int product_ID) {
        Product_ID = product_ID;
    }
    public String getProduct_Code() {
        return product_Code;
    }
    public void setProduct_Code(String product_Code) {
        this.product_Code = product_Code;
    }
    public String getProduct_Name() {
        return product_Name;
    }
    public void setProduct_Name(String product_Name) {
        this.product_Name = product_Name;
    }
    public int getCategory_ID() {
        return category_ID;
    }
    public void setCategory_ID(int category_ID) {
        this.category_ID = category_ID;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPromotion_price() {
        return promotion_price;
    }
    public void setPromotion_price(double promotion_price) {
        this.promotion_price = promotion_price;
    }
    public String getProduct_description() {
        return Product_description;
    }
    public void setProduct_description(String product_description) {
        Product_description = product_description;
    }
    public String getDate_created() {
        return date_created;
    }
    public void setDate_created(String date_created) {
        this.date_created = date_created;
    }
    public String getProduct_status() {
        return product_status;
    }
    public void setProduct_status(String product_status) {
        this.product_status = product_status;
    }
    public int getView_counts() {
        return view_counts;
    }
    public void setView_counts(int view_counts) {
        this.view_counts = view_counts;
    }
}