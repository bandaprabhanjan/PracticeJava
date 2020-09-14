package com.proxy.designpattern;

public class ProxyTest {

	public static void main(String[] args) {
		VeryExpensiveProcess veryExpensiveProcessProxy = new VeryExpensiveProcessProxy();
		veryExpensiveProcessProxy.process();
		veryExpensiveProcessProxy.process();

	}

}
