package org.learn.inheritance;

public class Childclass extends Parentclass {
	int c;
	public Childclass() {
		System.out.println("Contructor of Childclass");
		c=3;
	}
	public void Childclassmethod() {
		System.out.println("Method of Childclass");
	}
	
	  public void Parentclassmethod() {
	  System.out.println("Method of Parentclass in child class"); }
	 
}
