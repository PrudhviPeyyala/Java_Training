package com.ey.training.threads;

public class DaemonTest extends Thread{

	public static void main(String[] args) {
		
		DaemonTest t1 = new DaemonTest();
		DaemonTest t2 = new DaemonTest();
		
		t1.setDaemon(true);
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.setName("Daemon thread ");
		t2.setName("user thread ");
		t1.start();
		t2.start();
		
	}
	
	public void run() {
		
		for (int i = 0; i < 30; i++) {
			System.out.println(this.getName() + " - "+i);
		}
		
	}

}
