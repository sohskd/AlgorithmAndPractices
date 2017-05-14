package Threading;

public class SynchronizedKeyword {
	
	private static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SynchronizedKeyword.dowork();

	}
	
	//Only 1 thread can acquire the lock. Other method have to wait. Synchronized handles volatility of variable state
	//All threads will receive the latest value. Threads will access the variable in an atomic way. When one thread is
	//executing a synchronized method for an object, all other threads that invoke synchronized methods for the
	//same object is blocked until the first thread is done with the object.
	public synchronized static void increment(){
		count++;
	}
	
	public static void dowork(){
		
		Thread t1 = new Thread(new Runnable(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i = 0; i < 10000; i++){
					increment();
				}				
			}					
		});
		
		Thread t2 = new Thread(new Runnable(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i = 0; i < 10000; i++){
					increment();
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
		
		System.out.println("Count is : " + count);
		
	}
}
