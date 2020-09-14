package com.completable.future;

import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MultipleFutureInParallel {

	public static void main(String[] args) {
	CompletableFuture<String> future1 = CompletableFuture.supplyAsync(()->"India");
	CompletableFuture<String> future2 = CompletableFuture.supplyAsync(()->"Is my");
	CompletableFuture<String> future3 = CompletableFuture.supplyAsync(()->"Country ");
	System.out.println(future1.isDone());
	String result = Stream.of(future1,future2,future3).map(CompletableFuture::join).collect(Collectors.joining(" "));
	System.out.println(result);

	}

}
