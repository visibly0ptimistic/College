/*
 *  CSC 202
 *  Class relationships
 *
 *  Java version 8
 *
 *  This program creates and defines the behaviors of a superhero.
 *
 *  Batman uses the utility belt, both objects can exist independently
 *	Batman uses the BatmanUtilityBelt - has-a relationship = a aggregation relationship
 *
 */

import java.io.*;
import java.util.*;

public class Batman {

  private String name = "Batman";
  private String alterEgo = "Bruce Wayne";
  private String cape = "black";
  private String science;
  private String device;
  private boolean fear;
  private boolean intimidation;
  // uses the utility belt - has-a utiltiy belt
  BatmanUtiltityBelt ub = new BatmanUtiltityBelt();

  /** default constructor */
  public Batman() {
  	System.out.println("Batman created!");
  }// end constructor

  /** defautl with UtilityBelt constructor */
  public Batman(String batarangs, boolean cryptographicSequencer, boolean smokePellets){
  	ub.setBatarangs(batarangs);
  	ub.setCryptographicSequencer(cryptographicSequencer);
  	ub.setSmokePellets(smokePellets);
    System.out.println("Batman created! with specific tools on the utility belt");
  }// end constructor

//*******

  public void setScience (String science){
    this.science = science;
  }

  public void setDevice (String device){
    this.device = device;
  }

  public void setFear(boolean fear){
    this.fear = fear;
  }

  public void setIntimidation(boolean intimidation){
    this.intimidation = intimidation;
  }

 //*******

  public String getScience(){
    return this.science;
  }

  public String getDevice(){
    return this.device;
  }

  public boolean getFear(){
    return this.fear;
  }

  public boolean getIntimidation(){
    return this.intimidation;
  }

 //*******

 public void usingBelt(String tool){
	System.out.println("Batman is using the " + tool + " feature of the belt.");

	if(tool.equals("batarangs")){
		switch(ub.getBatarangs()){
			case "explosive":		System.out.println("Boom! on the villian");
									break;
			case "electric":		System.out.println("Zap! electric shock to the villian");
									break;
			case "remote-controlled":System.out.println("steering the Batarang");
									break;
			default:
					System.out.println("Didn't get that Batarang today!");
		}
	}
	else if(tool.equals("cryptographicSequencer")){
		ub.setCryptographicSequencer(true);
		System.out.println("Decoding the info now");
		ub.setCryptographicSequencer(false);
	}
	else if(tool.equals("smokePellets")){
		ub.setSmokePellets(true);
		System.out.println("Poof!  Batman is gone!");
		ub.setSmokePellets(false);
	}
	else{
		System.out.println("oops - forgot to load that one on the belt today!");
	}

 }// end usingBelt

 public void handToHandFighting(String style){
	System.out.println("Ka-Pow!  Batman is using the " + style + " fighting style.");
 }// end handToHandFighting

 @Override
 public String toString(){
 	return this.name + " aka " + this.alterEgo + "\n\t" + ub.toString();
 }// end toString

}// end Batman