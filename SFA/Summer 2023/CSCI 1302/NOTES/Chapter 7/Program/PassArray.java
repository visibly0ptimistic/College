public class PassArray {

     public static void main (String args[]) {
       String[] names = { "Dennis", "Grace", "Bjarne", "James" };
       printNames(names);
       System.out.println("----------");
       changeNames(names);
       printNames(names);
   }// end main

    public static void changeNames(String [] ary) {
      int i = 0;
      ary[i] = "Ritchie";
      i++;
      ary[i] = "Hopper";
      i++;
      ary[i] = "Stroustrup";
      i++;
      ary[i] = "Gosling";
    }// end changeNames

    public static void printNames(String [] ary){
    	for(int i = ary.length-1; i >=0 ; i--){
    		System.out.println(ary[i]);
    	}
    }// end printNames


}// end class