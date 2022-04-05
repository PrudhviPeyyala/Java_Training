package com.ey.training.accessspecifiers;

import java.util.logging.Logger;

public class AccessSpecTest {
	
	static Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	public static void main(String[] args) {
		
		AccessSpec obj = new AccessSpec();
		
		obj.pubMethod(log);  // can be accessed anywhere in samepackage
//		obj.priMethod();  // can be accessed only inside the same class
		obj.defMethod();  // can be accessed anywhere in samepackage 
		obj.protMethod(log); // can be accessed anywhere in samepackage 
	}

}
