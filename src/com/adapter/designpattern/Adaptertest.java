package com.adapter.designpattern;

import com.adapter.designpattern.mobileadapter.MobileAdapter;
import com.adapter.designpattern.mobileadapter.MobileAdapterImpl;
import com.adapter.designpattern.wallsocket.WallSocket;
import com.adapter.designpattern.wallsocket.WallSocketImpl;

public class Adaptertest {

	public static void main(String[] args) {
		WallSocket wallsocket = new WallSocketImpl();
		Volt v240 = wallsocket.getVolts();
		System.out.println(v240);
		MobileAdapter mobileAdapter = new MobileAdapterImpl(wallsocket);
		Volt get3Volts = mobileAdapter.get3Volts();
		System.out.println(get3Volts);
	}

}
