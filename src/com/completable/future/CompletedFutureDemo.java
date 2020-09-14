package com.completable.future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletedFutureDemo {

	public static void main(String[] args) {
		CompletableFuture<String> completedFuture = CompletableFuture.completedFuture("Hello World!");
		try {
			String result = completedFuture.get();
			System.out.println(result);
			System.out.println(Thread.currentThread().getName());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}

	}

}
//If we know the exact output then we will use the completedFuture so that get method of completedFutute will not block the current thread.
