package com.completable.future;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class CompletableFutureCancelMethod {

	public static void main(String[] args) {
		CompletableFuture<String> calculateAsynch = calculateAsynnch();
		try {
			String result = calculateAsynch.get();
			System.out.println(Thread.currentThread().getName());
			System.out.println(result);
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static CompletableFuture<String> calculateAsynnch() {
		CompletableFuture<String> completableFuture = new CompletableFuture<String>();
		List<String> list = Arrays.asList("PKP","KPK","LPA");
		Executors.newCachedThreadPool().submit(()->{
			try {
				Thread.sleep(20);
				String joinStr = String.join("---", list);
//				completableFuture.complete(joinStr);
				completableFuture.cancel(true);
				System.out.println(Thread.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		});
		return completableFuture;
	}

}
//If completableFuture will not get proper response then we will call completableFuture.cancel() method so that 
//we will get java.util.concurrent.CancellationException
