public class Fibonacci {

        public static void main(String[] args){
         int[] arry = {10, 20, 30, 40, 50};
         for(int i = 0; i < arry.length; i++){
             System.out.println("Recursive:");
             System.out.println(fibonacciRecursive(arry[i]));
             System.out.println("Loop:");
             System.out.println(fibonacciLoop(arry[i]));
             System.out.println();
         }
     }
 
     public static long fibonacciRecursive(int n) {
         if (n <= 1) {
             return n;
         } 
         
         else {
             return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
         }
     }
     
     public static long fibonacciLoop(int n) {
         if (n <= 1) {
             return n;
         }
         long current = 1;
         long prev = 1;
 
         for (int i = 2; i <= n; i++) {
             long temp = current;
             current = prev + current;
             prev = temp;
         }
         return current;
     }
 
}