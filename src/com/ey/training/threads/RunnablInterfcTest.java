package com.ey.training.threads;

public class RunnablInterfcTest {

	public static void main(String[] args) {
		RunnablTest rt = new RunnablTest();
		Thread t = new Thread(rt);
		t.start();
	}

}

class RunnablTest implements Runnable{

	@Override
	public void run() {
		System.out.println("Run method call using runnbale interface");
	}
	
}
