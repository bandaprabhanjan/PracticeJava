package com.executor.callable.future;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.executor.callable.future.Mycallable;

public class ClientTest {

	public static void main(String[] args) {
		Mycallable task2 = new Mycallable(10);
		ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
		Future<Integer> futureObject = newSingleThreadExecutor.submit(task2);
//		if (futureObject.isDone()) {
			try {
				System.out.println(futureObject.get());
				System.out.println("Display");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

//}
