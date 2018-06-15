package com.java.lang;

//import java.io.IOException;

public class RuntimeExample {
	public static void main(String[] args)  {
		long start = System.currentTimeMillis();
		Runtime runtime = Runtime.getRuntime();
		runtime.addShutdownHook(new Thread() {
			@Override
			public void run() {
				System.out.println("thread calling");
			}
		});
		int pro = runtime.availableProcessors();
		System.out.println(pro);
		long end =  System.currentTimeMillis();
		System.out.println(end-start);
     //process
		try {
			Process process = runtime.exec("notepad");
			process.waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}
