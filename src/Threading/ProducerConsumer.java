package Threading;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer{
	
	//BlockingQueue will handle concurreny issues/race conditions on its own. 
	private BlockingQueue<Integer> bq = new ArrayBlockingQueue<Integer>(10); 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProducerConsumer p1 = new ProducerConsumer();
		Thread t1 = new Thread(new Runnable(){
			//ProducerConsumer p1 = new ProducerConsumer();
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					p1.Producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}		
		});
		
		Thread t2 = new Thread(new Runnable(){
			//ProducerConsumer p2 = new ProducerConsumer();
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					p1.Consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}			
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	private void Producer() throws InterruptedException{		
		
		Random r = new Random();
		
		while(true){
			//System.out.println("Putting value inside");
			bq.put(r.nextInt(100));
		}		
	}
	
	private void Consumer() throws InterruptedException{
		
		Random r = new Random();
		
		while(true){
			Thread.sleep(100);
			//System.out.println("Attempting to take value");
			int val1 = r.nextInt(10);
			//System.out.println(val1);
			if(val1 == 0){
				System.out.println("im in!");
				Integer value = bq.take();
				//System.out.println(value);
				System.out.println("The value taken is " + value + "Queue size is " + bq.size());
			}
		}		
	}
}
