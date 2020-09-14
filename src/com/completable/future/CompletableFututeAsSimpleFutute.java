package com.completable.future;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class CompletableFututeAsSimpleFutute {

	public static void main(String[] args) {
		CompletableFuture<String> asynch = calculateAsynch();
		try {
			String result = asynch.get();
			System.out.println(result);
			System.out.println(Thread.currentThread().getName());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}

	}

	private static CompletableFuture<String> calculateAsynch() {
		CompletableFuture<String> completableFuture = new CompletableFuture<String>();
		List<String> list = Arrays.asList("JK", "PK", "KK");
		Executors.newCachedThreadPool().submit(() -> {
			try {
				Thread.sleep(20);
				String joinStr = String.join("----", list);
				completableFuture.complete(joinStr);
				System.out.println(Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return null;
		});
		return completableFuture;

	}

}
