package com.ey.training.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=0,b=0;
		try
		{
		System.out.println("Enter first number:");
		a=Integer.parseInt(br.readLine());
		System.out.println("Enter second number:");
		b=Integer.parseInt(br.readLine());
		}catch(Exception ne)
		{
		    ne.printStackTrace();
		}
		String name="Sivaram";
		
		int c;
		try{
		c=a/b;
		System.out.println("Result:"+c);
		}catch(ArithmeticException ae)
		{
			System.out.println("Division by zero not allowed!");
		}
		try{
		name=null;
		System.out.println("length of name:"+name.length());
		}catch(NullPointerException ne)
		{
			System.out.println("name should not be empty!");
		}
	}

}
