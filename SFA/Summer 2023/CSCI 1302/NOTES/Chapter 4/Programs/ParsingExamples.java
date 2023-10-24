/**
 *
 */


public class ParsingExamples {

    public static void main (String [] args) {

    	String num = "123";

    	// how to get into a number that can be used in math equations?
    	//The methods format:  matchingReturnDatatType identifier = DataTypeClassName.parseDataType(stringIDname);
    	int stringNumInt = Integer.parseInt(num);

    	// the String num still exists and now there is a variable that holds that value as a number
    	System.out.println("String num: " + num);
    	System.out.println("the String value stored as an int variable: " + stringNumInt);

    	// as a double
    	double stringNumDouble = Double.parseDouble(num);
    	System.out.println("the String value stored as a double variable: " + stringNumDouble);

    }// end main
}// end ParsingExamples