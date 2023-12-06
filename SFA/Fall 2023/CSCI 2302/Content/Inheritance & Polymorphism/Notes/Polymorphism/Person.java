/* Creates a Person Object
 *
 * use with Student -> Employee Objects
 *     and with Instructor Objects
 */




public class Person {

  private String name;
  private String sex;
  private int birthYear;

  public Person(){}

  public Person(String name){
  	this.name = name;
  }

  public Person(String name, String sex, int birthYear) {
    this.name = name;
    this.sex = sex;
    this.birthYear = birthYear;
  }// close public Person

  public void setName (String name) {
    this. name = name;
  }// close name

  public void setSex (String sex) {
    this. sex = sex;
  }// close sex

  public void setBirthYear (int birthYear) {
    this. birthYear = birthYear;
  }// close birthYear

    //getters

  public String getName (){
    return this. name;
  }// close getname

  public String getSex () {
    return this. sex;
  }// close getsex

  public int getBirthYear (){
    return this. birthYear;
  }// close getbirthYear


 // @Override
 public String toString () {
    return "Name: " + this. name + "  Sex: " + this. sex + "  Birth Year: " + this. birthYear;
 }

}// close Person


