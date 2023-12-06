//
import java.io.*;
import java.util.*;
import java.math.*;

public class AddPenny_BigDecimal {
	public static void main (String[] args){

		//BigDecimal penny = new BigDecimal(0.01);
		BigDecimal penny = new BigDecimal("0.01");
		System.out.println("penny value: " + penny);

		//BigDecimal dollar = new BigDecimal(0.0);
		BigDecimal dollar = new BigDecimal("0.0");
		System.out.println("Dollar at the start: " + dollar);

		for(int x = 0; x < 100;  x++){
			dollar = dollar.add(penny);
			System.out.println(dollar);
		}

		System.out.println("In the end the dollar is " + dollar);

	}// end main
}// end AddPenny_BigDecimal