/*

*/

public class TestCoaster{
   public static void main(String[] args){
      
      Coaster c1 = new Coaster();
      System.out.println(c1);
      System.out.println(c1.getColor());
      c1.setColor("purple and silver");
      System.out.println(c1.getColor());
      
   }// end main
}// end class

class Coaster{
   
   // states
   private String color;
   private String shape;
   private String design;
   
   // behaviors
   public Coaster(){}  // default, no-args construtor
   
   public Coaster(String color, String shape, String design){
      this.color = color;
      this.shape = shape;
      this.design = design;
   }
   
   public void setColor(String color){
      this.color = color;
   }
   
   public void setShape(String shape){
      this.shape = shape;
   }
   
   public void setDesign(String design){
      this.design = design;
   }
   
   public String getColor(){
      return this.color;
   }
   
   public String getShape(){
      return this.shape;
   }
   
   public String getDesign(){
      return this.design;
   }
   
   public boolean inUse(){
      return false;
   }
   
   public boolean stored(){
      return true;
   }      
   
}// end class Coaster