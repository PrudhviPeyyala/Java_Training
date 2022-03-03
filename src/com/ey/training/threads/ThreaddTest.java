package com.ey.training.threads;

public class ThreaddTest {

	public static void main(String[] args) {
		
		ThreaddRunTest t1 = new ThreaddRunTest();
		t1.start();   // #run()
		
	}
	
}
class ThreaddRunTest extends Thread{
	
	public void run() {
		
		System.out.println("Thread call using thread class");
	}
}