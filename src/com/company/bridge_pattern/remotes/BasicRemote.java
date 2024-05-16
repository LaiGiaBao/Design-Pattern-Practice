package com.company.bridge_pattern.remotes;

import com.company.bridge_pattern.devices.Device;

public class BasicRemote implements Remote{
	protected Device device;
	public BasicRemote() {}
	
	public BasicRemote(Device device) {
		this.device =device;
	}
	@Override
	public void power() {
		// TODO Auto-generated method stub
		System.out.println("Remote: power toggle");
		if(device.isEnabled()) {
			device.disable();
		}
		else {
			device.enable();
		}
		
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("Remote: volume down");
		device.setVolume(device.getVolume()-1);
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("Remote: volume up");
		device.setVolume(device.getVolume()+1);
	}

	@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		System.out.println("Remote:Channel down");
		device.setChannel(device.getChannel()-1);
	}

	@Override
	public void channelUp() {
		// TODO Auto-generated method stub
		System.out.println("Remote:Channel up");
		device.setChannel(device.getChannel()+1);
		
	}
	
}
