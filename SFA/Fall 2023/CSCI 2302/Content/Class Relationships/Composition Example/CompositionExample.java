/* Java version: 8
 * An example of composition - where an object is made up of (a compositon of) another object or
 *		is an object that can't exist on its own
 *
 * Sample input: hard coded into program
 *
 * Sample run/output: to the screen
 *	speaker has: Woofer's size is 5.5, Tweeter's size is 4.0,
 *		GrillCloth's size is 12.0, and SpeakerBox's size is 10.0
 *
 *
 * */

import java.io.*;
import java.util.*;

public class CompositionExample {
  public static void main(String[] args) throws IOException {

	Speaker sp = new Speaker(5.5, 4.0, 12.0, 10.0);
	System.out.println(sp.toString());

	Woofer w = new Woofer(6.5);
	System.out.println(w.toString());

	Tweeter t = new Tweeter(10.0);
	System.out.println(t.toString());

	GrillCloth cg = new GrillCloth(7.0);
	System.out.println(cg.toString());

	SpeakerBox sb = new SpeakerBox(5.0);
	System.out.println(sb.toString());

  }// end main
}// end of Template

//*********************************************************

/* a Speaker is made up of parts: a woofer, a tweeter, a grill cloth, and a speaker box
 *  it cannot exist without those parts, but those parts can exists witout being in a speaker
 *  therefore, a speaker is a composition of other parts
 */
class Speaker{
	// the data types that make up a speaker
	private Woofer wf;
	private Tweeter tw;
	private GrillCloth gc;
	private SpeakerBox sb;

	// creation of the speaker with those objects
	Speaker(double wSize, double tSize, double gcSize, double sbSize){
		wf = new Woofer(wSize);
		tw = new Tweeter(tSize);
		gc = new GrillCloth(gcSize);
		sb = new SpeakerBox(sbSize);
	}

	public String toString(){
		return "speaker has: " + wf.toString() + ", " + tw.toString() + ", " + gc.toString() + ", and " + sb.toString();
	}
}// end Speaker
//*********************************************************
// a Woofer makes up part of a speaker, but can also be its own object
class Woofer{
	private double size;
	Woofer(double size){
		this.size = size;
	}
	public void setWSize(double size){
		this.size = size;
	}
	public double getWSize(){
		return this.size;
	}
	@Override
	public String toString(){
		return "Woofer's size is " + this.size;
	}
}// end Woofer
//*********************************************************
// a Tweeter makes up part of a speaker, but can also be its own object
class Tweeter{
	private double size;
	Tweeter(double size){
		this.size = size;
	}
	public void setTSize(double size){
		this.size = size;
	}
	public double getTSize(){
		return this.size;
	}
	@Override
	public String toString(){
		return "Tweeter's size is " + this.size;
	}
}// end Tweeter
//*********************************************************
// a GrillCloth makes up part of a speaker, but can also be its own object
class GrillCloth{
	private double size;
	GrillCloth(double size){
		this.size = size;
	}
	public void setGCSize(double size){
		this.size = size;
	}
	public double getGCSize(){
		return this.size;
	}
	@Override
	public String toString(){
		return "GrillCloth's size is " + this.size;
	}
}// end GrillCloth
//*********************************************************
// a SpeakerBox makes up part of a speaker, but can also be its own object
class SpeakerBox{
	private double size;
	SpeakerBox(double size){
		this.size = size;
	}
	public void setSBSize(double size){
		this.size = size;
	}
	public double getSBSize(){
		return this.size;
	}
	@Override
	public String toString(){
		return "SpeakerBox's size is " + this.size;
	}
}// end SpeakerBox