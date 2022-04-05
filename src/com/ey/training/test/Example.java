package com.ey.training.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Example {
	
	@BeforeClass
	public static void beforeTest() {
		
//		database connect = ;
		System.out.println("This is a before class");
	}
	
	@Before
	public  void setData() {
		System.out.println("This is a before method");
	}

	@Test
	@Ignore
	public void test1() {
		ExampleJUniTest obj = new ExampleJUniTest();
		String result = obj.concat("Hello ", "World");
		
		assertEquals("Hello World",result);
	}
	
	@After
	public void delData() {
		System.out.println("This is a after method");
	}
	
	@Before
	public  void setData2() {
		System.out.println("This is a before method");
	}

	@Test
	public void test2() {
		ExampleJUniTest obj = new ExampleJUniTest();
		String result = obj.concat("Hello HI  ", "World");
		
		assertEquals("Hello HI  World",result);
	}
	
	@After
	public void delData2() {
		System.out.println("This is a after method");
	}
	
	
	@AfterClass
	public static void afterTest() {
		
		//connect.close();
		System.out.println("This is a after class");
	}
}
