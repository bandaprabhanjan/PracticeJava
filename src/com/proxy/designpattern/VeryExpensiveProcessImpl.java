package com.proxy.designpattern;

public class VeryExpensiveProcessImpl implements VeryExpensiveProcess {

	public VeryExpensiveProcessImpl() {
		heavyInitialConfigurationSetup();
	}

	private void heavyInitialConfigurationSetup() {
		System.out.println("Setting-up Initial Configuration");

	}

	@Override
	public void process() {
		System.out.println("Processing is done");

	}

}
