package Threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPool {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//There are 2 workers in my factory to work on a task
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		for(int i = 0; i < 5; i++){
			executor.submit(new Processorr(i));
		}
		
		//The shutdown method prevents clients from sending more work to the executor service. Executor waits for all
		//threads to terminate then shutdown. 
		executor.shutdown();
		
		System.out.println("All tasks submitted");
		
		//wait for 1 day for all the task to complete. then carry on the rest of the code
		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("All tasks completed");
	}
}

class Processorr implements Runnable{
	private int id;
	
	public Processorr(int id){
		this.id = id;
	}	
	public void run(){
		System.out.println("Starting: " + id);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		System.out.println("Completed " + id);
	}	
}