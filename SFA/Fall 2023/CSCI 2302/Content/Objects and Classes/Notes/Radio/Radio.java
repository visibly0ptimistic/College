/*
 *  This program is an example of an object Radio.
 *
 *   *
 *
 **/

import java.io.*;
import java.util.*;

public class Radio {

    private int volume = 1;           //1-10
    private double frequency = 82.0;  //82-127
    private boolean on = false;

    public Radio(){
        this(true, 1, 82.0);
        //setOn(true);
        //setVolume(1);
        //setFrequency(126);
    }

    public Radio(double frequency){
        this(true, 1, frequency);
        //setOn(true);
        //setVolume(1);
        //setFrequency(frequency);
    }

    public Radio(int volume, double frequency){
        this(true, volume, frequency);
        //setOn(true);
        //setVolume(volume);
        //setFrequency(frequency);
    }

    public Radio(boolean on, int volume, double frequency){
    	setOn(on);
    	setVolume(volume);
        setFrequency(frequency);
    }

    public void setVolume(int volume){
        if(on && volume >= 1 && volume <= 10)
            this.volume = volume;
    }

    public int getVolume(){
    	if(on)
        	return this.volume;
        else{
        	System.out.println("sorry, the radio is off");
        	return 0;
        }
    }

    public void setFrequency(double frequency){
        if (on && frequency >= 82 && frequency <= 127)
            this.frequency = frequency;
    }

    public double getFrequency(){
    	if(on)
        	return this.frequency;
        else{
        	System.out.println("sorry, the radio is off");
        	return 0;
        }
    }

    public void setOn(boolean on){
    	this.on = on;
    }

    public boolean getOn(){
    	return on;
    }

    public void turnOn(){
    	this.on = true;
    }

    public void turnOff(){
    	this.on = false;
    }

    public boolean isOn(){
    	return on;
    }

}