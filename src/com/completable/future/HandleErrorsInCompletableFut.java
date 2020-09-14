package com.completable.future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class HandleErrorsInCompletableFut {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		String name = null;
		CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
			if (name == null) {
				throw new RuntimeException("Computation Failed!!!");
			}
			return "Hello.." + name;
		}).handle((s, t) -> s != null ? s : "Hello Stranger");
		System.out.println(completableFuture.get());
	}

}
