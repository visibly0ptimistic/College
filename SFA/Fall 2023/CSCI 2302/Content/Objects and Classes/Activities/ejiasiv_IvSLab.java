/**
 * Java version 8
 *    
 * Name: Victor Ejiasi
   Date: 9/12/23
   Course Section: CSCI 2301-001
   Purpose:  This lab is to demonstrate the scope of variables, 
         to be able to identify an instance variable and a static variable, 
         and how to access/use those variables. 
         
   Input:  hard coded
   
   Output:  to the screen
   
   Sample run:
 *
 *
 */


public class ejiasiv_IvSLab {

	/*
	* the below variables are STATIC variables
	* static variables have to be outside any method and have to use the STATIC modifier with it.
     static variables have the scope of the class 
	*/
	static int staticIntVariable;

	static String staticStringVariable;

    /*
	* the below variable is INSTANCE variable of the class - as it is outside any method and it is
	* not using STATIC modifier with it. It is using the default access modifier.
     This instance variable has the scope of the class.
	*/
    int instanceOfClassVariable;

    public static void main(String [] args) {

		/*
		* the below variable is a LOCAL variable as it is defined inside method in
		* class. The only modifier that can be applied on local variable is final.
		* 		*
		* Note: Local variables need to be initialize before they can be used.
		* Which is not true for Static variable.
		*/
		String localVariable = "CSCI 2302";
		System.out.println("localVariable:  " + localVariable);

		System.out.println("Step #1:");
		// Step #1:  Try to print instanceOfClassVariable here
        // This will throw a compile-time error as instance variables can't be accessed directly inside a static method.
        // System.out.println(instanceOfClassVariable);


		System.out.println("Step #2:");
		// Step #2:  declare a static variable here, if you cannot, tell me why.
        // We can't declare a static variable inside a method. Static variables should be declared at the class level.
        // static int someStaticVar;  // Uncommenting this will cause an error.
        System.out.println("Cannot declare a static variable inside a method.");


		/*
		 * the below variable is an OBJECT variable, an object of this class,
		 * which is an instance of this class
		 */
      // YOU NEED to CHANGE this data type of this variable to match the name of the class!!!!
		ejiasiv_IvSLab obj = new ejiasiv_IvSLab();


		/*
		* Static variables can be accessed in two way.
		* 1- Via the class name - provided below for you (the proper way to use static variables)
		* 2- Via an object of the class (which you will do in step 3)
		*/
		System.out.println("static variable being accessed by the class:  " + ejiasiv_IvSLab.staticIntVariable);
		System.out.println();
		System.out.println("static variable being accessed by the class: (increased by 1)  " + ++ejiasiv_IvSLab.staticIntVariable);
		System.out.println();
		System.out.println("static String variable being accessed by the class: " + ejiasiv_IvSLab.staticStringVariable);
		System.out.println();
		System.out.println("static variable being accessed by creating a new class object: " + new ejiasiv_IvSLab().staticIntVariable);
		System.out.println();

		System.out.println("Step #3:");
		/* Step #3:  write the above Java statements to print the static variables here by accessing
		 * the variables through an object variable (this variable:  IvSLab obj = new IvSLab(); ) 
       */
        System.out.println("staticIntVariable through object: " + obj.staticIntVariable);
        System.out.println("staticStringVariable through object: " + obj.staticStringVariable);



		System.out.println("Step #4:");
		/* Instance variables can only be accessed through an object of the class
		 */
		// Step #4: Print the class� instance variable inside main using the variable, obj (this variable:  IvSLab obj = new IvSLab(); ).
        System.out.println("instanceOfClassVariable through object: " + obj.instanceOfClassVariable);



		// the below statement will not compile
		//System.out.println("instanceOfVariable being accessed by the class: " + IvSLab.instanceOfClassVariable);
		// Step #5: In a S.O.P statement, state why not
      System.out.println("Step #5:");
        // The following line will not compile because we are trying to access an instance variable directly through the class name.
        // System.out.println("instanceOfVariable being accessed by the class: " + ejiasiv_IvSLab.instanceOfClassVariable);
        System.out.println("The code won't compile because we are trying to access an instance variable directly through the class name.");

		method();

    }// end main

    public static void method(){

    	System.out.println("Step #6:");
    	// Step #6:  print the all the variables we used in this program here
    	// if you cannot print a variable -tell me why

        // Accessing static variables directly as we are in a static method
        System.out.println("Direct access to staticIntVariable: " + staticIntVariable);
        System.out.println("Direct access to staticStringVariable: " + staticStringVariable);

        // To access instance variables, we need to create an object
        ejiasiv_IvSLab obj = new ejiasiv_IvSLab();
        System.out.println("Accessing instanceOfClassVariable through object in method: " + obj.instanceOfClassVariable);

        // We can't directly access local variables of another method.
        // System.out.println(localVariable);  // This will cause an error.
        System.out.println("Cannot directly access local variables of another method.");




    }// end method

}// end IvSLab