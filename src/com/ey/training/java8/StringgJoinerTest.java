package com.ey.training.java8;

import java.util.StringJoiner;

public class StringgJoinerTest {

	public static void main(String[] args) {
		
		StringJoiner joiner = new StringJoiner("::","{","}");
		
		joiner.add("eleme1");
		joiner.add("eleme2");
		joiner.add("eleme3");
		
		
		System.out.println(joiner);
	}

}
