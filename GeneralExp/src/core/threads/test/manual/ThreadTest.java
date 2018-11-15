package core.threads.test.manual;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import core.threads.MultiThreadFactorial;

public class ThreadTest {
	public static void main(String[] args) throws InterruptedException {
		ExecutorService executor=Executors.newFixedThreadPool(3);
		
		MultiThreadFactorial factorial=new MultiThreadFactorial(10);
		
						
		executor.submit(new MultiThreadFactorial(8));
		executor.submit(new MultiThreadFactorial(6));
		executor.submit(new MultiThreadFactorial(12));
		executor.submit(new MultiThreadFactorial(4));
		executor.submit(new MultiThreadFactorial(3));
		executor.submit(new MultiThreadFactorial(14));
		executor.submit(new MultiThreadFactorial(7));
		
		executor.shutdown();
		executor.awaitTermination(5, TimeUnit.SECONDS);
		
//		MultiThreadFactorial factorial=new MultiThreadFactorial(500);
//		new Thread(factorial).start();
		
		System.out.println(factorial.getResult());
		
		
	}
}
