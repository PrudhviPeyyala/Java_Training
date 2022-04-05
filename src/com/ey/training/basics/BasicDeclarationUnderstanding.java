package com.ey.training.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// TODO: Auto-generated Javadoc
/**
 * BasicDeclarationUnderstanding is used for add purpose.
 * @author Prudhvi 
 * @since 1.0.1V
 *
 */
public class BasicDeclarationUnderstanding {
	
//	Log log = LogManager.getLogger("");

	/** The Constant ID. */
	public static final int IDEE = 10;
	
	/** The Constant PI. */
	public static final double PI = 3.14;

	/**
	 * main method is used to perform add operation.
	 *
	 * @param args the arguments
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws ArithmeticException the arithmetic exception
	 */
	public static void main(String[] args) throws IOException, ArithmeticException ,IllegalArgumentException ,IllegalStateException {

		int a;
		int b;		

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(isr);
		System.out.println("Enter a value");
//		log.debug("Enter a value");
		a = Integer.parseInt(buffer.readLine());
		System.out.println("Enter b value");
		b = Integer.parseInt(buffer.readLine());	
		int c = a+b;
		System.out.println("Sum of a + b is :" +c);

	}
	
	/**
	 * test data based on params passed.
	 *
	 * @param id the id
	 * @param name the name
	 * @return Integer
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public int test(int id , String name) throws IOException {
		return 0;
	}
}
