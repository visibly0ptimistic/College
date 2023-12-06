/*
 *
 **/


import java.io.*;
import java.util.*;


public class Student extends Person{
  private String major;
  private String classification;

  Student(String name, char sex, String address, String major, String classification){
    super(name, sex, address);
    this.major = major;
    this.classification = classification;
  }

  public String getMajor(){
    return this.major;
  }

  public String getClassification(){
    return this.classification;
  }

  public void setMajor(String major){
    this.major = major;
  }

  public void SetClassification( String classification){
    this.classification = classification;
  }

  @Override
  public String toString(){//overriding the toString() method
    return super.toString() + ", Major:  " + this.major + ", Classification:  " + this.classification;
  }

}// end class Student