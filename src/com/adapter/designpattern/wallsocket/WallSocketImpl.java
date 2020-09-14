package com.adapter.designpattern.wallsocket;

import com.adapter.designpattern.Volt;

public class WallSocketImpl implements WallSocket {

	@Override
	public Volt getVolts() {
		return new Volt(240);
	}

}
