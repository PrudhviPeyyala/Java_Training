package com.ey.training.accessmod;

import java.util.logging.Logger;

import com.ey.training.accessspecifiers.AccessSpec;


public class AccessSpecTestInOtherPackage extends AccessSpec{
	
	static Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	public static void main(String[] args) {
		
		AccessSpecTestInOtherPackage obj = new AccessSpecTestInOtherPackage();
		System.out.println(AccessSpecTestInOtherPackage.class.getClassLoader().getResource("logging.properties"));
		obj.test(log);
		System.out.println(log.getName());
		System.out.println(log.getResourceBundleName());
		System.out.println(log.getHandlers());
		System.out.println(log.getParent());
		

	}

	public void test(Logger log) {
		
		AccessSpec obj = new AccessSpec();

		
		obj.pubMethod(log);  // can be accessed anywhere in other package
		//		obj.priMethod();  // can't be accessed in other package
		//		obj.defMethod();  // can't be accessed in other package
		//		obj.protMethod(); // can be accessed anywhere in samepackage 
		
		protMethod(log);
	}

}
