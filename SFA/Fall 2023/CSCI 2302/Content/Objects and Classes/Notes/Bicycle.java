
/* java version 8
 *
 *	When a number of objects are created from the same class blueprint, they each have
 *	their own distinct copies of instance variables. In the case of the Bicycle class,
 *	the instance variables are cadence, gear, and speed. Each Bicycle object has its
 *	own values for these variables, stored in different memory locations.
 *
	Sometimes, you want to have variables that are common to all objects.
	This is accomplished with the static modifier. Fields that have the static modifier
	in their declaration are called static fields or class variables. They are associated
	with the class, rather than with any object. Every instance of the class shares a class
	variable, which is in one fixed location in memory. Any object can change the value of a
	class variable, but class variables can also be manipulated without creating an instance of the class.

	For example, suppose you want to create a number of Bicycle objects and assign each a serial number,
	beginning with 1 for the first object. This ID number is unique to each object and is therefore an
	instance variable. At the same time, you need a field to keep track of how many Bicycle objects have
	been created so that you know what ID to assign to the next one. Such a field is not related to
	any individual object, but to the class as a whole. For this you need a class variable, numberOfBicycles.

	Class variables are referenced by the class name itself, as in
		Bicycle.numberOfBicycles
	You can also refer to static fields with an object reference like
		myBike.numberOfBicycles
	but this is discouraged because it does not make it clear that they are class variables.

	The Java programming language supports static methods as well as static variables. Static methods,
	which have thestatic modifier in their declarations, should be invoked with the class name,
	without the need for creating an instance of the class, as in
		ClassName.methodName(args)
	You can also refer to static methods with an object reference like
		instanceName.methodName(args)
	but this is discouraged because it does not make it clear that they are class methods.


 *
 *
 */

import java.util.*;


public class Bicycle {

    private int cadence;
    private int gear;
    private int speed;

    private int id;

    private static int numberOfBicycles = 0;


    public Bicycle(int startCadence,
                   int startSpeed,
                   int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;

        id = ++numberOfBicycles;
    }

    public int getID() {
        return id;
    }

    public static int getNumberOfBicycles() {
        return numberOfBicycles;
    }

    public int getCadence() {
        return cadence;
    }

    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public int getGear(){
        return gear;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public int getSpeed() {
        return speed;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }
}

