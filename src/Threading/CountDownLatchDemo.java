package Threading;

import java.util.concurrent.CountDownLatch;

/* Use countdownlatch when one of thread like main thread, require to wait for one or more thread to complete, before
 * it start doing processing. Classical example of using CountDownLatch in Java is any server side core Java 
 * application which uses services architecture, where multiple services is provided by multiple threads and 
 * application can not start processing until all services have started successfully as shown in our CountDownLatch
 * Example
 * 
 * CountDownLatch is a concurrency utility. Other concurrency utility like CyclicBarrier, Semaphore, 
 * ConcurrentHashMap, BlockingQueue in java.util.concurrent package.
 */

public class CountDownLatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final CountDownLatch latch = new CountDownLatch(3);
		
		System.out.println("Starting services... ");
		
		Thread s1 = new Thread(new Service("Service1", 3000, latch));
		Thread s2 = new Thread(new Service("Service2", 3000, latch));
		Thread s3 = new Thread(new Service("Service3", 3000, latch));
		
		s1.start();
		s2.start();
		s3.start();
		
		try {
			latch.await(); // main thread is waiting on CountDownLatch to finish
			System.out.println("All services are up!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		

	}

}

class Service implements Runnable{
	
	private final String name;
	private final int timeToStart;
	private final CountDownLatch latch;
	
	public Service(String name, int timeToStart, CountDownLatch latch){
		this.name = name;
		this.timeToStart = timeToStart;
		this.latch = latch;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(timeToStart);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
    System.out.println(name + " is Up");
    latch.countDown(); //reduce count of CountDownLatch by 1 
	}
	
}
