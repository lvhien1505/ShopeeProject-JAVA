package vtc.com.vn.entity;

public class TB_Option {
   private int optionID;
   private String optionName;

   public TB_Option(){

   }
   public TB_Option(int optionID,String optionName){
         this.optionID=optionID;
         this.optionName=optionName;
   }
   public int getOptionID() {
       return optionID;
   }
   public void setOptionID(int optionID) {
       this.optionID = optionID;
   }
   public String getOptionName() {
       return optionName;
   }
   public void setOptionName(String optionName) {
       this.optionName = optionName;
   }

}