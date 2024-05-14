package com.company.builder_pattern.cars;

import com.company.builder_pattern.components.Engine;
import com.company.builder_pattern.components.GPSNavigator;
import com.company.builder_pattern.components.Transmission;
import com.company.builder_pattern.components.TripComputer;

public class Car {
	private final CarType carType;
	private final int seats;
	private final Engine engine;
	private final Transmission transmission;
	private final TripComputer tripComputer;
	private final GPSNavigator gpsNavigator;
	private double fuel =0;
	public Car(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer,
			GPSNavigator gpsNavigator) {
		super();
		this.carType = carType;
		this.seats = seats;
		this.engine = engine;
		this.transmission = transmission;
		this.tripComputer = tripComputer;
		if(this.tripComputer != null) {
			this.tripComputer.setCar(this);
		}
		this.gpsNavigator = gpsNavigator;
	}
	public double getFuel() {
		return fuel;
	}
	public void setFuel(double fuel) {
		this.fuel = fuel;
	}
	public CarType getCarType() {
		return carType;
	}
	public int getSeats() {
		return seats;
	}
	public Engine getEngine() {
		return engine;
	}
	public Transmission getTransmission() {
		return transmission;
	}
	public TripComputer getTripComputer() {
		return tripComputer;
	}
	public GPSNavigator getGpsNavigator() {
		return gpsNavigator;
	}
	
	
}
