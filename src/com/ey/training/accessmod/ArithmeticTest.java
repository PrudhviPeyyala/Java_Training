package com.ey.training.accessmod;

import java.util.function.BiFunction;

public class ArithmeticTest {
	
	public static void main(String[] args) {
		
		ArithmeticTest obj = new ArithmeticTest();
		
		BiFunction<Integer, Integer, Integer> biFunc1 = (a,b) -> {return Arithmetic.add(a, b);};
		
		BiFunction<Float, Float, Float> biFunc2 = (a,b) -> {return Arithmetic.add(a,b);};
		
		Integer x = biFunc1.apply(1, 2);
		
		Float y = biFunc2.apply(2.5f, 2.5f);
		
		System.out.println( x + " - "+y);
		
	}
	

}
