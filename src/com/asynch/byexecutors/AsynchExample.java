package com.asynch.byexecutors;

public class AsynchExample {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Thread thread1 = new Thread(new task());
			thread1.start();
			System.out.println("Thread Name:" + thread1.currentThread().getName());

		}

	}

}

//1 Java Thread =(corresponds to) 1 Operating System Thread
//so creating a thread is an expensive operation
//if we want fixed no.of threads we should create them in a pool and submits tasks to them