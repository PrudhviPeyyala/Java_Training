package com.ey.training.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceFutureTaskTest {

	public static void main(String[] args) {
		
		PrintMessageTask task1 = new PrintMessageTask("This is task one..!");
		
		ExecutorService serv = Executors.newFixedThreadPool(3);
		Future<String> result = serv.submit(task1);
		
		//statements //db call
		try {
			System.out.println(result.get());
		}catch(Exception e) {
			System.out.println("Exception occured while submitting the task");
			e.printStackTrace();
		}
		
		serv.shutdown();
	}
}
class PrintMessageTask implements Callable<String>{
	
	private String message;
	
	public PrintMessageTask(String message) {
		this.message = message;
	}

	@Override
	public String call() throws Exception {
		
		return message ;
	}
	
}