/*
 *Java version 8
 *This program is an example of using an object Radio.
 *
 *	Files for this:
 *		Radio.java
 *		UseRadio.java
 *
 *		Compile and run UseRadio.java
 *
 *	example of input:  none - hard coded into the program
 *
 *	example of output:
 *		Radio1's volume is: 1
		Radio2's volume is: 5

		Radio 3 stats:
		the radio is on?  true
		the volume is: 7
		it is set to: 90.1
		Is Radio3 still on?  false
		Since it is off, can I still get the volume & frequency?
		sorry, the radio is off
		the volume is: 0
		sorry, the radio is off
		it is set to: 0.0

		Radio 4 (default settings) stats:
		the volume is: 1
		it is set to: 82.0
  *
 **/

import java.io.*;
import java.util.*;

public class UseRadio {

    public static void main(String[] args) {

        Radio radio1 = new Radio(-5, 90.1);
        Radio radio2 = new Radio(5, 90.1);

        radio1.setVolume(-5);

        System.out.println("Radio1's volume is: " + radio1.getVolume());
        System.out.println("Radio2's volume is: " + radio2.getVolume());

		System.out.println();

		Radio radio3 = new Radio(true, 7, 90.1);
		System.out.println("Radio 3 stats: ");
		System.out.println("the radio is on?  " + radio3.isOn());
		System.out.println("the volume is: " + radio3.getVolume());
		System.out.println("it is set to: " + radio3.getFrequency());
		radio3.turnOff();
		System.out.println("Is Radio3 still on?  " + radio3.isOn());
		System.out.println("Since it is off, can I still get the volume & frequency?");
		System.out.println("the volume is: " + radio3.getVolume());
		System.out.println("it is set to: " + radio3.getFrequency());

		System.out.println();

		Radio radio4 = new Radio();
		System.out.println("Radio 4 (default settings) stats: ");
		System.out.println("the volume is: " + radio4.getVolume());
		System.out.println("it is set to: " + radio4.getFrequency());

    }

}