/* This creates a Student Object
 *
 *  This inherits from Person
 *		Employee inherits from Student
 */



public class Student extends Person {

  private int gradYear;
  private String major;

  public Student(){}

  public Student (String name){
  	super(name);
  }

  public Student (String name, String sex, int birthYear, int gradYear, String major) {
    super(name, sex, birthYear);
    this.gradYear = gradYear;
    this.major = major;
  }// close public student

  // setters
    public void setMajor (String major){
    this. major = major;
    }// close major

    public void setGradYear (int gradYear){
    this. gradYear = gradYear;
    }// close gradYear

    // getters
    public String getMajor() {
      return this. major;
    }// close major

     public int getGradYear() {
      return this. gradYear;
    }// close gradYear

     //override
     @Override
  public String toString () {
       return super.toString() + "\n\tGraduation Year: " + " "+ this.gradYear + " \n\tMajor: "+ " "+ this.major;

  }// close toString

}// close Student









