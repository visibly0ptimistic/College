/*
   Victor Ejiasi
   
   CSCI 2302-001
   
   Java version:  18
   
   Purpose:  this program creates generic objects
   
   Input:  the input is hard coded
   
   
   Output:  the output is printed to the screen/console
   
   Other associated files: GO_One.java, Ejiasiv_GenericObjects.java
   
   Sample Run:
         
   
   
*/

public class GO_Two<T1, T2> {
    private T1 data1;
    private T2 data2;
    private static int count = 0;

    public GO_Two(T1 data1, T2 data2) {
        this.data1 = data1;
        this.data2 = data2;
        count++;
    }

    public void printData() {
        System.out.println(data1 + "     " + data2);
    }

    public static int getCount() {
        return count;
    }
}
