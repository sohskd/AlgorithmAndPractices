package Threading;

import java.lang.Thread.State;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SynchronizedBlocks {
	
	private static Random r = new Random();
	
	private static Object Lock1 = new Object();
	private static Object Lock2 = new Object();

	private static List<Integer> list1 = new ArrayList<Integer>();
	private static List<Integer> list2 = new ArrayList<Integer>();
	
	public static void stageOne(){
		
		//Only 1 thread can acquire the intrinsic lock of Lock1 object
		synchronized(Lock1){
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		list1.add(r.nextInt(100));
		}
	}
	
	public static void stageTwo(){
		
		//Only 1 thread can acquire the intrinsic lock of Lock2 object
		synchronized(Lock2){
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		list2.add(r.nextInt(100));
		}
	}
	
	public static void process(){
		for(int i = 0; i < 1000; i++){
			stageOne();
			stageTwo();
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting ...");
		
		long start = System.currentTimeMillis();
		
		Thread t1 = new Thread(new Runnable(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				process();
			}		
		});
		
		Thread t2 = new Thread(new Runnable(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				process();
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
		
		long end = System.currentTimeMillis();
		System.out.println("Time taken: " + (end - start));
		System.out.println("List1: " + list1.size() + "List2: " + list2.size());	
	}
}
