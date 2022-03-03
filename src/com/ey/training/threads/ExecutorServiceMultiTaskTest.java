package com.ey.training.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class ExecutorServiceMultiTaskTest {

	public static void main(String[] args) {
		
		AddNumTask task1 = new AddNumTask(10, 20, 10000);
		AddNumTask task2 = new AddNumTask(300, 400, 20000);
		
		FutureTask<Integer> future1 = new FutureTask<>(task1);
		FutureTask<Integer> future2 = new FutureTask<>(task2);
		
		ExecutorService serv = Executors.newFixedThreadPool(2);
		serv.execute(future1);
		serv.execute(future2);
		
		while(true) {
			try {
				if(!future1.isDone()) {
					System.out.println("Task1 output ::"+ future1.get());
				}
				if(!future2.isDone()) {
					System.out.println("Waiting for task2 for completion");
					System.out.println("Task2 output ::" + future2.get());
				}
				
				if((future1.isDone()  || future1.isCancelled()) && (future2.isDone()||future2.isCancelled())) {
					System.out.println("both tasks done");
					System.out.println("shutting down service...!");
					serv.shutdown();
					return;
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}

class AddNumTask implements Callable<Integer>{

	int a, b ;
	long sleeptime;
	
	public AddNumTask(int a , int b , long st) {
		this.a = a;
		this.b = b;
		this.sleeptime = st;
	}
	
	@Override
	public Integer call() throws Exception {
		Thread.sleep(sleeptime);
		return a+b;
	}
	
}