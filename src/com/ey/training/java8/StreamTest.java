package com.ey.training.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {
		
		List<Integer> numList = Arrays.asList(10,4,17,1,2,3,4,5,6,7,8);
		
	
		numList.stream().forEach(x -> System.out.println(x));
		
		numList.stream().forEach(System.out::println);
		
		//print only even numbers from a collection using lambda's
		
//		numList.stream().filter(x -> x%2 == 0).forEach(System.out::println);
		
//		long count = numList.stream().count();
		
//		System.out.println(count);
		
//		Integer sum = numList.stream().reduce(0, (a,b)-> a+b);
//		System.out.println(sum);
		
//		 Integer mul = numList.stream().reduce(1, (a,b)-> a*b);
//		
//		 System.out.println(mul);
		
		List<Integer> li = numList.stream().filter(x -> x%2 == 0).collect(Collectors.toList());
//		System.out.println(li);
		
		numList.stream().map(val -> val+5).forEach(System.out::println);
		
		List<String> strList = Arrays.asList("Java","Python","Jdk","JRE","DotNet");
		
//		List<Map<String,List<Integer>>> str
		
//		strList.stream().filter(x->x.startsWith("J")).map(y -> y.toUpperCase()).forEach(z->System.out.println(z));
		
		Optional<String> obj = strList.stream().filter(x->x.startsWith("J")).findFirst();
		String str = obj.get();
		System.out.println(str);
		
		String obj1 = strList.stream().filter(x->x.startsWith("j")).findAny().orElse("no value");
		System.out.println(obj1);
		
		
		
	}

}
