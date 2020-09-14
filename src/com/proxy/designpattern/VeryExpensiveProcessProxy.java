package com.proxy.designpattern;

public class VeryExpensiveProcessProxy implements VeryExpensiveProcess {
	private VeryExpensiveProcess veryExpensiveObject;

	@Override
	public void process() {
		if(veryExpensiveObject==null)
		{
			veryExpensiveObject = new VeryExpensiveProcessImpl();
			System.out.println("Prabhanjan");
		}
		veryExpensiveObject.process();
	}

}
