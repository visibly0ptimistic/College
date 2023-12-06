/*Java version: 8
 *This program creates Person Object/Class
 *
 *Example run:
 *	lumberjack's states:
	Name: Stephen Austin
	Sex: M
	Address: 1936 North Street


	noPerson's states:
	Name: null
	Sex:
	Address: null


	defaultPerson_Option1's states:
	Name: John Doe
	Sex: M
	Address: no address


	father_Option1's states without being set:
	Name: John Doe
	Sex: M
	Address: no address

	father_Option1's states after being set:
	Name: East Texas
	Sex: M
	Address: no address


	defaultPerson_Option2's states:
	Name: Jane Doe
	Sex: F
	Address: no address


	meme_Option2's states:
	Name: Meme
	Sex: ?
	Address: internet
 *
 * */



public class TestPerson{
	public static void main(String[] args){

		// creating a Person with values for the states
		Person lumberjack = new Person("Stephen Austin" , 'M', "1936 North Street");
		System.out.println("lumberjack's states:  ");
		System.out.println("Name: " + lumberjack.getName());
		System.out.println("Sex: " + lumberjack.getSex());
		System.out.println("Address: " + lumberjack.getAddress());
		System.out.println();
		System.out.println();

		// creating a Person with no values for the states
		Person noPerson = new Person();
		System.out.println("noPerson's states:  ");
		System.out.println("Name: " + noPerson.getName());
		System.out.println("Sex: " + noPerson.getSex());
		System.out.println("Address: " + noPerson.getAddress());
		System.out.println();
		System.out.println();

		// creating a Person - with default values of the option 1 style
		PersonOption1DefaultValues defaultPerson_Option1 = new PersonOption1DefaultValues();
		System.out.println("defaultPerson_Option1's states:  ");
		System.out.println("Name: " + defaultPerson_Option1.getName());
		System.out.println("Sex: " + defaultPerson_Option1.getSex());
		System.out.println("Address: " + defaultPerson_Option1.getAddress());
		System.out.println();
		System.out.println();

		//creating a Person - using the option 1 style of defauls but providing values for the states
		PersonOption1DefaultValues father_Option1 = new PersonOption1DefaultValues();
		System.out.println("father_Option1's states without being set:  ");
		System.out.println("Name: " + father_Option1.getName());
		System.out.println("Sex: " + father_Option1.getSex());
		System.out.println("Address: " + father_Option1.getAddress());
		System.out.println();
		father_Option1.setName("Father of Texas");
		father_Option1.setSex('M');
		father_Option1.setAddress("East Texas");
		System.out.println("father_Option1's states after being set:  ");
		System.out.println("Name: " + father_Option1.getName());
		System.out.println("Sex: " + father_Option1.getSex());
		System.out.println("Address: " + father_Option1.getAddress());
		System.out.println();
		System.out.println();

		// creating a Person - with default values of the option 2 style
		PersonOption2DefaultValues defaultPerson_Option2 = new PersonOption2DefaultValues();
		System.out.println("defaultPerson_Option2's states:  ");
		System.out.println("Name: " + defaultPerson_Option2.getName());
		System.out.println("Sex: " + defaultPerson_Option2.getSex());
		System.out.println("Address: " + defaultPerson_Option2.getAddress());
		System.out.println();
		System.out.println();

		//creating a Person - using the option 2 style of defauls but providing values for the states
		PersonOption2DefaultValues meme_Option2 = new PersonOption2DefaultValues("Meme", '?', "internet");
		System.out.println("meme_Option2's states:  ");
		System.out.println("Name: " + meme_Option2.getName());
		System.out.println("Sex: " + meme_Option2.getSex());
		System.out.println("Address: " + meme_Option2.getAddress());

	}// end main

}// end of TestPerson
