/*
 *

Input:  Hard coded in
Output:	to the screen

Sample Run:
	Name:  Polly Sex:  female Birth Year: 1997
		Graduation Year: 2018
		Major: CS
		Works in the dept:  Computer Science
		Earning wage:  7.5
	Name: EastonSex: nullBirth Year: 0
		Graduation Year: 0
		Major: null
		Works in the dept:  null
		Earning wage:  0.0
	Name: EastonSex: MaleBirth Year: 2000
		Graduation Year: 2018
		Major: CS
		Works in the dept:  CoSM
		Earning wage:  8.0
 */


import java.*;
import java.util.*;

public class DemoInheritPoly {
  public static void main (String [] args) {

	/*	The format of the default toString method of the Object is:
		Class Name, “@”, and the hex version of the object’s hashcode concatenated into a string.
		The default hashCode method in Object is typically implemented by
		converting the memory address of the object into an integer.
	*/

	//Create Employee Polly
    Employee polly = new Employee(" Polly ", " female ", 1997, 2018, "CS", 7.50, "Computer Science");
    System.out.println("Polly's memory location: " + polly.toString());

    // Create Employee Easton
    Employee easton = new Employee("Easton");
    System.out.println("Easton's place: " + easton.toString());

	// make the super class object point to the sub class object
    Student student = easton;
    System.out.println("Student's place: " + easton.toString());

    // are they equal?
    System.out.println("are Easton & Student equal? " + easton.equals(student));


    // make a super class object point to the sub class object
    Person person = easton;
    System.out.println("Person's place: " + person.toString());

    // are they equal?
    System.out.println("are Easton & Person equal? " + easton.equals(person));


	easton.setSex("Male");
	easton.setBirthYear(2000);
	easton.setMajor("CS");
	easton.setGradYear(2018);
	easton.setDept("CoSM");
	easton.setWage(8.00);
	System.out.println("Person's place: " + person.toString());
	// still pointing to the sub class object; prints the sub class place in memory


	System.out.println();
	//using polymorphic calls
	display(polly);
	display(easton);

	Employee lumberjack = new Employee("Lumberjack", "male", 2017, 2018, "CS", 200.00, "CS");
	display(lumberjack);

		//if a Student - print Student info
		if(lumberjack instanceof Student){
			System.out.println("Student object info: ");
			System.out.println("Graduation year: " + lumberjack.getGradYear() + " Major: " + lumberjack.getMajor());
		}



	Person sfa = new Person("sfa");
	display(sfa);

	Instructor ladyjack = new Instructor("Ladyjack", "female", 2017, "CS", 1000000.00);
	display(ladyjack);

		// if an Instructor - print Instructor info
		if(ladyjack instanceof Instructor){
			System.out.println("Instructor object info: ");
			System.out.println("Degree: " + ladyjack.getDegree() + " Salary: " + ladyjack.getSalary());
		}




  }// end main

  public static void display(Person p){
  		System.out.println("Display Method");
		System.out.println("Person object info: ");
		System.out.println("Name: " + p.getName() + " Sex: " + p.getSex() + " Birth Year: " + p.getBirthYear());

		if (p instanceof Student){
			System.out.println("Student instanceof!");
			System.out.println("Graduation year: " + ((Student)p).getGradYear() + " Major: " + ((Student)p).getMajor());
		}

		if(p instanceof Instructor){
			System.out.println("Instructor instanceof!");
			System.out.println("Earned a degree in: " + ((Instructor)p).getDegree() + " Has a salary of: " + ((Instructor)p).getSalary());
		}

  }// end display



}// end DemoInheritPoly





