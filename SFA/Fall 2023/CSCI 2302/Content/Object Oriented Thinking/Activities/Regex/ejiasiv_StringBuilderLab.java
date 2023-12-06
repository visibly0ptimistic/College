/*
   Victor Ejiasi

   CSCI 2302-001
   
   Java version:  18
   
   Purpose:  This program explores the functionalities of Java's StringBuilder class. It demonstrates string manipulation methods append, replace, and insert while showing the flexibility and efficiency of StringBuilder over the String class.
   
   Input:  
        The input values are hard-coded, they are declared directly in the code and do not come from an external source.
   
   Output:  
        The output goes to the console, displaying properties of StringBuilder instances like memory location, length, and capacity.
   
   Other associated files:  
        None
   
   Sample Run:  
        The program is supposed to print the memory locations, lengths, and capacities of StringBuilder instances before and after manipulation. It demonstrates how to convert a StringBuilder to a String and vice versa.
*/



public class ejiasiv_StringBuilderLab {

    public static void main(String[] args) {

        // 1: Declare and assign a String with the value "affect".
        String affect = "affect";
        
        // 2: Display the memory location of the 'affect' string.
        System.out.println("Memory location of affect: " + System.identityHashCode(affect));
        
        // 3: Reassign the value to "effect" and display the memory location.
        affect = "effect";
        System.out.println("Memory location of effect: " + System.identityHashCode(affect));
        
        // 4: Instantiate a StringBuilder object with the value "affect".
        StringBuilder sbAffect = new StringBuilder("affect");
        
        // 5: Display memory location of StringBuilder.
        System.out.println("Memory location of StringBuilder: " + System.identityHashCode(sbAffect));
        
        // 6: Modify "affect" to "effect" and display memory location.
        sbAffect.replace(0, 1, "e");
        System.out.println("Memory location after modification: " + System.identityHashCode(sbAffect));
        
        // 7: Display the number of characters.
        System.out.println("Character count in StringBuilder: " + sbAffect.length());
        
        // 8: Display current capacity.
        System.out.println("StringBuilder's capacity: " + sbAffect.capacity());
        
        // 9: Append text.
        sbAffect.append(" is the result of change.");
        
        // 10: Length and capacity post-append.
        System.out.println("Character count after append: " + sbAffect.length());
        System.out.println("Capacity after append: " + sbAffect.capacity());
        
        // 11: Trim to size and display.
        sbAffect.trimToSize();
        System.out.println("Character count after trim: " + sbAffect.length());
        System.out.println("Capacity after trim: " + sbAffect.capacity());
        
        // 12: Convert to String and display memory.
        String strFromSb = sbAffect.toString();
        System.out.println("Memory location of converted string: " + System.identityHashCode(strFromSb));
        
        // 13: New StringBuilder.
        StringBuilder sbStephen = new StringBuilder("Stephen");
        
        // 14: Use the insert method.
        sbStephen.insert(6, "n F. Austi");
        
        // Display the final state of sbStephen
        System.out.println("Final content of sbStephen: " + sbStephen.toString());
    }
}
