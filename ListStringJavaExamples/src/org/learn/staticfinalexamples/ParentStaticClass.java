package org.learn.staticfinalexamples;

public class ParentStaticClass {
	int nonStaticVariable=100;
	static int staticVariable=10;

	public static void staticExample() {
		System.out.println("Static Function in Parent");
	}
	
	public void nonstaticExample() {
		System.out.println("Non Static Function in Parent");
	}
}
