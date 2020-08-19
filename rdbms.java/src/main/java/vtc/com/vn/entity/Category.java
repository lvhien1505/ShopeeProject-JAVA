package vtc.com.vn.entity;

/**
 * Category
 */
public class Category {
    private int category_ID;
    private int PP_ID;
    private String PP_Name;
    private String Category_Name;

    public Category() {

    }

    public Category(int category_ID, int PP_ID, String PP_Name, String Category_Name) {
        this.category_ID = category_ID;
        this.PP_ID = PP_ID;
        this.PP_Name = PP_Name;
        this.Category_Name = Category_Name;
    }

    public int getCategory_ID() {
        return category_ID;
    }

    public void setCategory_ID(int category_ID) {
        this.category_ID = category_ID;
    }

    public int getPP_ID() {
        return PP_ID;
    }

    public void setPP_ID(int pP_ID) {
        PP_ID = pP_ID;
    }

    public String getPP_Name() {
        return PP_Name;
    }

    public void setPP_Name(String pP_Name) {
        PP_Name = pP_Name;
    }

    public String getCategory_Name() {
        return Category_Name;
    }

    public void setCategory_Name(String category_Name) {
        Category_Name = category_Name;
    }
}