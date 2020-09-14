package com.asynch.byexecutors;

public class task implements Runnable{

	@Override
	public void run() {
		System.out.println("Child Thread Name" +Thread.currentThread().getName());
		
	}

}
