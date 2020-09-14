package com.exception.handling;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.executor.callable.future.Mycallable;

public class ClientTest {

	public static void main(String[] args) {
		Mycallable task2 = new Mycallable(10);
		ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
		newSingleThreadExecutor.submit(task2);
		try {
			Integer futureObject = task2.call();
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}

}
