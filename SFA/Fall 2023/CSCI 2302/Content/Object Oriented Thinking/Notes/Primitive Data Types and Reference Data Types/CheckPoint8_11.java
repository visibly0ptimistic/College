/*Java version: 8
 * check point #8 & 11 page 97
 *
 *
 * */

import java.io.*;
import java.util.*;

public class CheckPoint8_11 {
  public static void main(String[] args) throws IOException {

  	//#8
  	Integer ia = new Integer("23");
  	System.out.println(ia);

  	Integer ib = new Integer(23);
  	System.out.println(ib);

  	Integer ic = Integer.valueOf("23");
  	System.out.println(ic);

  	Integer id = Integer.parseInt("23", 8);
  	System.out.println(id);

  	//Double ie = new Double();
  	System.out.println("No suitable constructor found for Double(no arguements) - remember no default constructor only explicit!");

  	Double if8 = Double.valueOf("23.45");
  	System.out.println(if8);

  	int ig = (Integer.valueOf("23")).intValue();
  	System.out.println("ig " + ig);

  	double ih = (Double.valueOf("23.4")).doubleValue();
  	System.out.println(ih);

  	double ii = (Double.valueOf("23.4")).intValue();
  	System.out.println("ii " + ii);

  	String sj = (Double.valueOf("23.4")).toString();
  	System.out.println(sj);

	//#11
	System.out.println(Integer.parseInt("10"));

	System.out.println(Integer.parseInt("10", 10));

	System.out.println(Integer.parseInt("10", 16));

	System.out.println(Integer.parseInt("11"));

	System.out.println(Integer.parseInt("11", 10));

	System.out.println(Integer.parseInt("11", 16));

	//***********************************
	System.out.println("2 " + Integer.parseInt("111", 2));

	System.out.println("8 " + Integer.parseInt("111", 8));

	System.out.println("10 " + Integer.parseInt("111", 10));

	System.out.println("16 " + Integer.parseInt("111", 16));




  }// end main
}// end of CheckPoint8_11
