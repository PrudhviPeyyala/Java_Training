package com.ey.training.accessmod;

// TODO: Auto-generated Javadoc
/**
 * The Class StaticUtilization.
 */
public class StaticUtilization {
	
	 /** The a. */
 	final int a =10;
	
	 static {
		System.out.println("This is a static block");
	}
	
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		System.out.println("HEllo");
		
		StaticUtilization.myStaticMethod(); 
		
		
	}
	
	/**
	 * My static method.
	 */
	static void myStaticMethod() {
		
		System.out.println("static method");
	}

}
