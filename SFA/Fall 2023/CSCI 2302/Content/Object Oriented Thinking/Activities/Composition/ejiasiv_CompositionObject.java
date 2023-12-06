/*
   Name:  Victor Ejiasi
   
   java version:  18
   
   Purpose:  To understand and apply the composition object concept
      The LiveRedOakLeaf is an object that cannot exist on its own, it needs a 
         TexasRedOakTree object to exist, thus the relationship is a composition relationship
         where the TexasRedOakTree object is made up of LiveRedOakLeaf objects.
   
   input:  hard coded into the program
   
   output:  to the screen/console
   
   sample run:
      LiveRedOakLeaf object, the leaf type is Deciduous and the leaf shape is Pointed Lobed.
   A TexasRedOakTree, composed parts are:  
      Taproot system, and its bark is dark gray to black with platelike scales and its leaf - 
      LiveRedOakLeaf object, the leaf type is Deciduous and the leaf shape is Pointed Lobed.


*/

import java.io.*;
import java.util.*;

public class ejiasiv_CompositionObject{
   public static void main(String[] args) {
   
      // complete step 4 here
      LiveRedOakLeaf lrol = new LiveRedOakLeaf();
      
      // Invoke the lrol toString method.
      System.out.println(lrol.toString());

      // Instantiate a TexasRedOakTree object using the identifier of trot.
      TexasRedOakTree trot = new TexasRedOakTree();
      
      // Invoke the trot toString method.
      System.out.println(trot.toString());

   }// end main
} // end class CompositionObject

//**********************************************************************************
//               LiveRedOakLeaf object
//**********************************************************************************
class LiveRedOakLeaf{
   
   //data field dictionary/database
   private String leafType = "Deciduous";
   private String leafShape = "Pointed Lobed";
   
   public LiveRedOakLeaf(){} // default, no-args constructor
   
   public String getLeafType(){
      return this.leafType;
   }// end getLeafType
   
   public String getLeafShape(){
      return this.leafShape;
   }// end getLeafShape
   
   @Override
   public String toString(){
      return "LiveRedOakLeaf object, the leaf type is " + this.leafType + " and the leaf shape is " + this.leafShape + ".";
   } // end toString
   
}// end LiveRedOakLeaf class

//************************************************************************************
//               TexasRedOakTree object  
// (composistion object, it has-a LiveRedOakLeaf, this object cannot exist on its own)
//************************************************************************************
class TexasRedOakTree{

   // complete the code here for step 3
   private LiveRedOakLeaf leaf = new LiveRedOakLeaf(); // Composition
   private String rootType = "Taproot";
   private String bark = "dark gray to black with platelike scales";
   
   public TexasRedOakTree(){} // default, no-args constructor
   
   public LiveRedOakLeaf getLeaf(){
      return this.leaf;
   }
   
   public String getRootType(){
      return this.rootType;
   }
   
   public String getBark(){
      return this.bark;
   }

   @Override
   public String toString(){
      return "A TexasRedOakTree, composed parts are:  " + this.rootType + " system, and its bark is " + this.bark + " and its leaf - " + leaf.toString();
   }// end toString


}// end TexasRedOakTree class