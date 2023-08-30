package org.learn.inheritance;

public class Grandchildclass extends Childclass {
	int g;
	public Grandchildclass() {
		System.out.println("Contructor of Grandchildclass");
		g=3;
	}

	public void Grandchildclassmethod() {
		System.out.println("Method of Grandchildclass");
	}
}
