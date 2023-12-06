/*Java version: 8
 *This program is Batman's Utility Belt to be used by him,
 * it is a aggregation relationship
 * the utility belt can exist without being part of Batman
 * and Batman has-a utility belt
 *
 * */

import java.io.*;
import java.util.*;

public class BatmanUtiltityBelt {

	private String batarangs = "explosive"; // explosive, electric, remote-controlled
	private boolean cryptographicSequencer; // hacked into or not
	private boolean smokePellets; // in use or not

	BatmanUtiltityBelt(){
		System.out.println("Default utility belt");
	}

	BatmanUtiltityBelt(String batarangs, boolean cryptographicSequencer, boolean smokePellets){
		this.batarangs = batarangs;
		this.cryptographicSequencer = cryptographicSequencer;
		this.smokePellets = smokePellets;
		System.out.println("Specific utility belt made");
	}

	public void setBatarangs(String batarangs){
		this.batarangs = batarangs;
	}

	public void setCryptographicSequencer(boolean cryptographicSequencer){
		this.cryptographicSequencer = cryptographicSequencer;
	}

	public void setSmokePellets(boolean smokePellets){
		this.smokePellets = smokePellets;
	}

	public String getBatarangs(){
		return this.batarangs;
	}

	public boolean getCryptographicSequencer(){
		return this.cryptographicSequencer;
	}

	public boolean getSmokePellets(){
		return this.smokePellets;
	}
	@Override
	public String toString(){
		return "Batman's utility belt is currently stocked with: " + this.batarangs + " Batarangs, cryptographicSequencer, and smokePellets";
	}

}// end of BatmanUtiltityBelt
