package com.executor.callable.future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableAndFuture {
	public static void main(String[] args) {
		Callable<String> task1 = new Callable<String>() {

			@Override
			public String call() throws Exception {
				return "task is completed";
			}
		};
		ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
		Future<String> futureObject = newSingleThreadExecutor.submit(task1);
		if (futureObject.isDone()) {
			try {
				System.out.println(futureObject.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
	}

}
