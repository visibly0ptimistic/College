/*Java version: 8
 *
 *
 * Sample input: hard coded into the program
 *
 * Sample run/output: to the screen
 *		Default utility belt
		Batman created! with specific tools on the utility belt
		Batman aka Bruce Wayne
			Batman's utility belt is currently stocked with: explosive Batarangs, cryptographicSequencer, and smokePellets
		Batman is using the batarangs feature of the belt.
		Boom! on the villian
		Ka-Pow!  Batman is using the Keysi fighting style.
		Default utility belt
		Batman's utility belt is currently stocked with: electric Batarangs, cryptographicSequencer, and smokePellets
 *
 * This is an example of aggregation relationship - each object can exist independently of each other
 * Batman uses the utility belt, therefore Batman has-a BatmanUtilityBelt
 *
 * */

import java.io.*;
import java.util.*;

public class ClassRelationshipLab_AggregationRelationship {
  public static void main(String[] args) throws IOException {

  	Batman bm = new Batman("explosive", true, true);
  	System.out.println(bm.toString());

  	bm.usingBelt("batarangs");

  	bm.handToHandFighting("Keysi");

  	BatmanUtiltityBelt ub = new BatmanUtiltityBelt();
  	ub.setBatarangs("electric");
  	System.out.println(ub.toString());


  }// end main
}// end of ClassRelationshipLab
