package org.learn.staticfinalexamples;

public class StaticRunnerClass extends ParentStaticClass {

	int staticRunner=15;
	  public static void staticExample() {
	  System.out.println("Static Function in Child class");
	  }
	  public void normalMethod() {
			System.out.println(this.nonStaticVariable);
	  }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * StaticRunnerClass src = new StaticRunnerClass(); // src.staticExample();
		 * ParentStaticClass.staticExample(); StaticRunnerClass.staticExample();
		 */StaticRunnerClass src = new StaticRunnerClass(); 
		 src.normalMethod();
	
		
	}

}
