/*  Creates an Employee Object
 *
 *  This object extends Student (student extends Person)
 */

public class Employee extends Student {

  private double wage;
  private String dept;

  public Employee (String name){
  	super(name);
  }

  public Employee (String name, String sex, int birthYear, int gradYear, String major, double wage, String dept) {
    super(name, sex, birthYear, gradYear, major);
    this.wage = wage;
    this.dept = dept;
  }// close Employee

  // setters
    public void setDept (String dept){
    	this. dept = dept;
    }// close dept

    public void setWage (double wage){
    	this. wage = wage;
    }// close wage

    // getters
    public String getDept() {
      return this. dept;
    }// close dept

     public double getWage() {
      return this. wage;
    }// close wage

     //override
     @Override
  public String toString () {
       return super.toString() + " \n\tWorks in the dept: " + " " + this.dept + " \n\tEarning wage: " + " " + this.wage;

  }// close toString

}// close Employee









