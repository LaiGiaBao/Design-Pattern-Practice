package com.company.bridge_pattern.remotes;

import com.company.bridge_pattern.devices.Device;

public class AdvancedRemote extends BasicRemote{
	public AdvancedRemote(Device device) {
		super.device = device;
	}
	public void mute() {
		System.out.println("Remote: mute");
		device.setVolume(0);
	}

}
