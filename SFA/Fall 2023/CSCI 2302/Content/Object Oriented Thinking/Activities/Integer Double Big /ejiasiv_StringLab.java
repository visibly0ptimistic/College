    /*
    Victor Ejiasi

    CSCI 2302-001
    
    Java version:  18

    Purpose:  The program is used to demonstrate an understanding of Java String class. Tasks are performed that include creating, manipulating, and comparing strings it provides insights into the behaviors of the String class in Java.

    Input:  The input for this program is hard-coded.

    Output:  The output is the results of each task and explanations about the String class.

    Other associated files: None.

    Sample Run:  The program executes each task, printing the results and explanations.
*/

public class ejiasiv_StringLab {
    public static void main(String[] args) {
        
        // 1
        System.out.println("1: The String class has 16 constructors according to Oracle’s documentation.\n");
        
        // 2
        System.out.println("2: The String class is immutable. When a method that changes the String is invoked, a new String object is returned.\n");
        
        // 3
        System.out.println("3: A literal String (interned string) is a String that is created in the String pool, and String objects with the same value point to the same object in the pool. "
                           + "A String object is created in the heap, and each String object has its own memory location.\n");
        
        // 4
        String strObj = new String("CSCI 2302");
        System.out.println("4: " + strObj + "\n");
        
        // 5
        System.out.println("5: " + strObj.toString() + "\n");
        
        // 6
        String strLiteral = "CSCI 2302";
        System.out.println("6: " + strLiteral + "\n");
        
        // 7
        System.out.println("7: " + strLiteral.toString() + "\n");
        
        // 8 & 9
        String strNumbers = "1302,2302,2311,2314,3302,3323";
        String[] strArray = strNumbers.split(",");
        
        // 10
        System.out.println("10: ");
        for(String str: strArray) System.out.println(str);
        System.out.println();
        
        // 11 & 12
        System.out.println("11 & 12: Strings can be compared using equals(), compareTo(), and == operator. Using equals() method is preferred when comparing the contents of the String. The compareTo() method compares two strings lexicographically. The == operator compares the memory locations, not the contents.\n");
        
        // 13
        System.out.println("13: Comparing using equals(): " + strObj.equals(strLiteral));
        System.out.println("Comparing using compareTo(): " + (strObj.compareTo(strLiteral) == 0));
        System.out.println("Comparing using == operator: " + (strObj == strLiteral) + "\n");
        
        // 14
        String mississippi = "Mississippi";
        System.out.println("14: ");
        System.out.println("First occurrence of i: " + mississippi.indexOf('i'));
        System.out.println("Last occurrence of i: " + mississippi.lastIndexOf('i'));
        System.out.println("Replace i with a: " + mississippi.replace('i', 'a'));
        System.out.println("Replace ss with xx: " + mississippi.replace("ss", "xx"));
        System.out.println("Replace first p with m: " + mississippi.replaceFirst("p", "m"));
        System.out.println("Replace all ps with qs: " + mississippi.replaceAll("p", "q") + "\n");
        
        // 15
        String lumberjacks = "Lumberjacks";
        String ladyjacks = "Ladyjacks";
        System.out.println("15: ");
        System.out.println("Starts with L: " + lumberjacks.startsWith("L") + ", " + ladyjacks.startsWith("L"));
        System.out.println("Ends with jacks: " + lumberjacks.endsWith("jacks") + ", " + ladyjacks.endsWith("jacks"));
        System.out.println("Contains jack: " + lumberjacks.contains("jack") + ", " + ladyjacks.contains("jack") + "\n");
        
        // 16
        String texas = "Texas";
        System.out.println("16: ");
        System.out.println("Substring: " + texas.substring(1, 4));
        System.out.println("Contains exa: " + texas.contains("exa") + "\n");
    }
}
