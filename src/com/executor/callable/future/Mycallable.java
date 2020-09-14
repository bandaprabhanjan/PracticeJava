package com.executor.callable.future;

import java.util.concurrent.Callable;

public class Mycallable implements Callable<Integer> {
	private Integer number;

	public Mycallable(Integer number) {
		super();
		this.number = number;
	}

	@Override
	public Integer call() throws Exception {

		Integer sum = 0;
		for (int i = 0; i <= number; i++) {
			sum = sum + i;

		}
		return sum;
	}

}
