package com.company.bridge_pattern;

import com.company.bridge_pattern.devices.Device;
import com.company.bridge_pattern.devices.Radio;
import com.company.bridge_pattern.devices.TV;
import com.company.bridge_pattern.remotes.AdvancedRemote;
import com.company.bridge_pattern.remotes.BasicRemote;

public class BridgePatternDemo {
	public static void main(String[] args) {
		testDevice(new TV());
		testDevice(new Radio());
	}
	public static void testDevice(Device device) {
		System.out.println("Test with basic remote");
		BasicRemote basicRemote = new BasicRemote(device);
		basicRemote.power();
		device.printStatus();
		
		System.out.println("Test with advanced remote");
		AdvancedRemote advancedRemote = new AdvancedRemote(device);
		advancedRemote.power();
		advancedRemote.mute();
		device.printStatus();
	}
}
