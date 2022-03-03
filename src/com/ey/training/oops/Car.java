package com.ey.training.oops;

public interface Car {
	
	public static final int a = 10;
	
	public abstract void getEngineDetails();
	
	public abstract void getModel();
	
	public abstract void getVersion();
	
	//java 8  only abstract , default & static methods allowed inside interface in java8
	static String getColor() {
		return "red";
	}
		
	
	default void test1() {
		System.out.println("this is red");
	}
	
	//java9 - we can concrete methods inside interfaces
	
//	public void test() {  // only abstract , default & static methods allowed inside interface in java8
//		
//	}
}
