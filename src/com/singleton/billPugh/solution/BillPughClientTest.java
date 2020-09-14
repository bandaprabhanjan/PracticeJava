package com.singleton.billPugh.solution;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BillPughClientTest {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		ExecutorService executorService = null;
		try {
			executorService = Executors.newFixedThreadPool(5);
			executorService.execute(myThread);
			executorService.execute(myThread);
			executorService.execute(myThread);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (executorService != null)
				executorService.shutdown();
		}
	}

}
