/*  This creates an Instructor Object
 *
 *	Instructor inherits from Person
 */


public class Instructor extends Person {

  private String degree;
  private double salary;

  public Instructor (String name){
  	super(name);
  }

  public Instructor (String name, String sex, int birthYear, String degree, double salary) {
    super (name, sex, birthYear);
    this. degree = degree;
    this. salary = salary;
  }

    //setters
    public void setDegree (String degree){
    this. degree = degree;
    }

    public void setSalary (double salary){
    this. salary = salary;
    }

    //getters
    public String getDegree() {
      return this. degree;
    }

     public double getSalary() {
      return this. salary;
    }

  //override
  @Override
  public String toString () {
    return super.toString() + "\ndegree" +  this.degree + "" + "salary" +  this.salary;
  }



}// close Instructor



