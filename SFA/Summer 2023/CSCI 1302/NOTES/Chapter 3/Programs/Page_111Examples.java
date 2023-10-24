public class Page_111Examples {

   public static void main(String args[]){
   	
   		//3.30
   		int x = 3, y = 3;
   		
   		switch(x+3){
   			case 6: System.out.println("case 6: " + (y = 1)); //break;
   			default: System.out.println("default: " + (y += 1));
   		}
   		
   		if ((x+3) == 6)
   			System.out.println("if: " + (y = 1));
   		else
   			System.out.println("else: " + (y += 1));
   		
   		
   		int radius = 2;
   		boolean valid;
   		
   		if (radius > 0)
			valid = true;
		else
			valid = false;
		
		System.out.println("if/else - valid is " + valid);
		
		valid = (radius > 0) ? true : false ;
		System.out.println("conditional expression - valid is " + valid);
   		
   		
   		//page 115 ~3.38
   		System.out.printf("%8s%-8s\n", "Java", "Java");
   		
   		
   		//3.32
   		String dayName = "";
   		int dayOfWeek = 3;
   		
   		switch(dayOfWeek){
   			case 0: dayName = "Sunday"; break;
   			case 1: dayName = "Monday"; break;
   			case 2: dayName = "Tuesday"; break;
   			case 3: dayName = "Wednesday"; break;
   			case 4: dayName = "Thursday"; break;
   			case 5: dayName = "Friday"; break;
   			case 6: dayName = "Saturday"; break;
   		}
   		
   		System.out.println("The day of the week is " + dayName);
   		
   		
   		
    }
    
    
}