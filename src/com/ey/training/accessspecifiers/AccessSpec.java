package com.ey.training.accessspecifiers;

import java.util.logging.Logger;

public class AccessSpec {
	
	public void pubMethod(Logger log) {
		System.out.println("This is  a public method");
		log.info("This is  a public method");
	}
	
	private void priMethod() {
		System.out.println("This is  a private method");
	}
	
	protected void protMethod(Logger log) {
		System.out.println("This is a protected method");
		log.info("This is a protected method");
	}
	
	void defMethod() {
		System.out.println("This is a default method");
	}

}
