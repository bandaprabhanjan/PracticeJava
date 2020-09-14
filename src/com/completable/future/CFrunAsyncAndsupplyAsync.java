package com.completable.future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

//CompletableFuture with Encapsulated Computation Logic
public class CFrunAsyncAndsupplyAsync {

	public static void main(String[] args) {
		CompletableFuture.runAsync(() -> System.out.println("task1 is completed"));
		CompletableFuture.runAsync(() -> {
			System.out.println("task2 is completed");
		}, Executors.newFixedThreadPool(2));
		CompletableFuture<String> supplyAsync = CompletableFuture.supplyAsync(() -> "Hello World");
		try {
			System.out.println(supplyAsync.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		CompletableFuture<String> supplyAsync2 = CompletableFuture.supplyAsync(() -> {
			return "Hello World";
		}, Executors.newFixedThreadPool(2));
		try {
			System.out.println(supplyAsync2.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}

}
