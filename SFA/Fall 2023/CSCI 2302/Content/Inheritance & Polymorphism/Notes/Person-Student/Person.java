/*Java version: 8
 *This is a Person Object/Class
 *
 * */



public class Person {

	private String name;
	private char sex;
	private String address;

	Person(){}

	Person(String name, char sex, String address){
		this.name = name;
		this.sex = sex;
		this.address = address;
	}

	// setters/mutators & getters/accessors

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void setSex(char sex){
		this.sex = sex;
	}

	public char getSex(){
		return this.sex;
	}

	public void setAddress(String address){
		this.name = address;
	}

	public String getAddress(){
		return this.address;
	}

	@Override
	public String toString(){
		return this.name + ", " + this.sex + ", Address:  " + this.address;
	}
}// end of Person Object/Class
