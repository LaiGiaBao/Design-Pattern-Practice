package com.company.builder_pattern.components;

public class GPSNavigator {
	private String route;
	public GPSNavigator() {
		this.route = "221B, Baker Street, London";
	}
	public GPSNavigator(String manualRoute) {
		this.route = manualRoute;
	}
	public String getRoute() {
		return route;
	}
}
