package com.completable.future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ProcessAsynchResult {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(()->"Beautiful");
		completableFuture = completableFuture.thenApply(s->s+"World!");
		String result = completableFuture.get();
		System.out.println(result);
		
		CompletableFuture<String> completableFuture1 = CompletableFuture.supplyAsync(()->"Beautiful");
		completableFuture1.thenAccept(s->System.out.println("My computation is completed:" +s));
		completableFuture1.get();
		
		CompletableFuture<String> completableFuture2 = CompletableFuture.supplyAsync(()->"Beautiful");
		completableFuture2.thenRun(()->System.out.println("My task is completed"));
		completableFuture2.get();
	}

}
