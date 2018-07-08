package com.java.concurrency;

public class VolatileTest extends Thread {
	volatile boolean keepRunning=true;

	public void run() {
		int count=0;
		while(keepRunning) {
			count++;
		}
		System.out.println("Thread terminated"+count);
}
	public static void main(String[] args) throws InterruptedException {
		VolatileTest vt=new VolatileTest();
		vt.start();
		Thread.sleep(200);
		vt.keepRunning=false;
		System.out.println("thread set to false");
	}
}
