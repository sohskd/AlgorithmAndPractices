package Threading;

import java.util.Scanner;

class Processor extends Thread{
	
	/* Java volatile keyword is used to mark a Java variable as "being stored in main memory". Every read of a 
	 * volatile variable will be read from the computer's main memory and not from the CPU cache. Every write will
	 * be written to main memory, and not just to the CPU cache. Java volatile keyword guarantees visibility of
	 * changes to variables across threads.
	 */
	private volatile boolean running = true;
	
	public void run(){
		
		while(running){
			System.out.println("Hello");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}		
	}
	
	public void shutdown(){
		running = false;
	}
}


public class BasicThreadSynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Processor proc1 = new Processor();
		proc1.start();
		
		System.out.println("Press return to stop....");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
	
		proc1.shutdown();
	}
	
}
