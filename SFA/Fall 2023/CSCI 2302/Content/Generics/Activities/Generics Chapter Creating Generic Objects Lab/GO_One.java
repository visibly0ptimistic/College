/*
   Victor Ejiasi
   
   CSCI 2302-001
   
   Java version:  18
   
   Purpose:  the purpose of this program is to create generic objects
   
   Input:  the input is hard coded
   
   
   Output:  the output is printed to the screen/console
   
   Other associated files: GO_One.java, Ejiasiv_GenericObjects.java
   
   Sample Run:
   
   
*/

public class GO_One<T> {
    private T data;
    private static int count = 0;

    public GO_One(T data) {
        this.data = data;
        count++;
    }

    public void printData() {
        System.out.println(data);
    }

    public static int getCount() {
        return count;
    }
}
