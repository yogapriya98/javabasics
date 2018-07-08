package com.java.concurrency;

public class SynchronizedWorker {
	private static int count=0;
	
	public static void main(String[] args) {
		SynchronizedWorker worker = new SynchronizedWorker();
		worker.doWork();
	} 
	public void increment() throws InterruptedException{
		synchronized (this) {    // this line->object(this) can be blocked
			count++;
		}
	}
	public void doWork(){
		Thread thread1=new Thread(new Runnable() {
		public void run(){
		  for (int i = 0; i < 10000; i++) {
			  try {
				increment();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		}
	});
	thread1.start();
	
	Thread thread2=new Thread(new Runnable() {
	public void run(){
	  for (int i = 0; i < 10000; i++) {
		try {
			increment();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	  }
  	}
});
	thread2.start();
	
	try {
		thread1.join();
		thread2.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
  System.out.println(count);
	}
}

