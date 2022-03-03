package com.ey.training.threads;

import java.util.Scanner;

public class InterThreadCommunicationTest {

	public static void main(String[] args) throws InterruptedException {
		
		ReadWrite obj = new ReadWrite();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					obj.read();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					obj.write();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	}

}
class ReadWrite{
	
	public void read() throws InterruptedException {
		
		synchronized (this) {
			
			System.out.println("Thread is running");
			
			wait();
			
			System.out.println("resumed the process");
		}
	}
	
	public void write() throws InterruptedException {
		
		Thread.sleep(1000);
		
		Scanner sc = new Scanner(System.in);
		
		synchronized (this) {
			System.out.println("please ennter some key to restart process of waiting thread");
			
			String str = sc.nextLine();
			
			System.out.println("Entered value , resuming process..." + str);
			
			notify();
			
		}
	}
}