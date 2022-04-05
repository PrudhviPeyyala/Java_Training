package com.ey.training.basics;

public class SampleProgramAccessor {

	public static void main(String[] args) {
		//object for SampleProgram class
		//using new operator you can create a object for a class.
		//classname obj = new classname();
		//(.) member operator which is used to access members using object
		//Object is the top class for all the classes in java.
//		log.warn("make sure closing db connection");
		System.out.println("make sure closing db connection");
		try {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i <1000; i++) {
			
			System.out.println("make sure closing db connection"  + i);
			SampleProgram obj = new SampleProgram();
			obj.addTwoValues();
			obj.subTwoValues();
		}
		
		
//		log.info("Performance Time :: "+(System.currentTimeMillis() - startTime));
		
//		log.debug("Performance Time :: "+(System.currentTimeMillis() - startTime));
		
//		obj = null; //unused objects]
		}catch(Exception e) {
//			log.error(e.getMessage());
		}
	}
}
