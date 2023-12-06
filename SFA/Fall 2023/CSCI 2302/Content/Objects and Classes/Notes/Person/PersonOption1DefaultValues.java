/*Java version: 8
 *This is a Person Object/Class with default values
 *
 * */



public class PersonOption1DefaultValues {

	private String name;
	private char sex;
	private String address;

	//no-args Constructor - also called default Constructor
	PersonOption1DefaultValues(){
		// you can provide the default values to the states/data of the object/class here
		// for example
		this.name = "John Doe";
		this.sex = 'M';
		this.address = "no address";
	}
	/* if you do not provide any Constructors when you create an object/class,
	 *the compiler will provide a no-args/default constructor */

	PersonOption1DefaultValues(String name, char sex, String address){
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
}// end of PersonOption1DefaultValues Object/Class
