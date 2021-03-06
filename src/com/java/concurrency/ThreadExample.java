package com.java.concurrency;

public class ThreadExample extends Thread{
	    String name;
	 public ThreadExample(String name) {
		this.name = name;
		setName(name);
		start();
	}
	@Override
		public void run() {
		//super.run();
	for(int i=0;i<10;i++) {
		System.out.println(name +" = " +i+""+Thread.currentThread());  //Thread.currentThread()->call toString()
		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	}
	public static void main(String[] args) {
		ThreadExample one = new  ThreadExample("one");
		ThreadExample two = new  ThreadExample("two");
		System.out.println("main done");
		try {
			one.join();     //join()-wait for thread to die
			two.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main complete"+Thread.currentThread());
	}

}
