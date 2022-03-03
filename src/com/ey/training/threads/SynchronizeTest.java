package com.ey.training.threads;

public class SynchronizeTest {

	public static void main(String[] args) {
		SendMessage obj = new SendMessage();
		ThreadSend t1 = new ThreadSend("Thread1 Test", obj);
		ThreadSend t2 = new ThreadSend("Thread2 Test", obj);
		t1.start();  // core
		t2.start();  // core
	}
}

class SendMessage {
	//i dont want this method to be accessed by two or more threads at a time 
	public void send(String message) throws InterruptedException {  ///suppose t1 is accessing until t1 is released the lock, t2 cant access this. 
		SendMessage obj = new SendMessage();
		System.out.println("sending message .. "+message);
		Thread.sleep(1000);  // t1 - idle   //daemon threads will run in backend  //garbage collector
		System.out.println("sent message .. "+message);
	}
}

class ThreadSend extends Thread{
	
	String message;
	SendMessage sendMessage;
	
	public ThreadSend(String msg,SendMessage sendMessage) {
		this.message = msg;
		this.sendMessage = sendMessage;
	}
	
	public void run() {
		//one thread should access at a time
		synchronized (sendMessage) {
			try {
				sendMessage.send(message);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
