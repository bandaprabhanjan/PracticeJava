package com.adapter.designpattern.mobileadapter;

import com.adapter.designpattern.Volt;
import com.adapter.designpattern.wallsocket.WallSocket;

public class MobileAdapterImpl implements MobileAdapter {
	private WallSocket wallsocket;

	public MobileAdapterImpl(WallSocket wallsocket) {
		super();
		this.wallsocket = wallsocket;
	}

	@Override
	public Volt get3Volts() {
		Volt volt240 = wallsocket.getVolts();
		int v3 = volt240.getVolt()/80;
		return new Volt(v3);
	}

}
