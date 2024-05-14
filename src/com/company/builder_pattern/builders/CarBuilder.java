package com.company.builder_pattern.builders;

import com.company.builder_pattern.cars.Car;
import com.company.builder_pattern.cars.CarType;
import com.company.builder_pattern.components.Engine;
import com.company.builder_pattern.components.GPSNavigator;
import com.company.builder_pattern.components.Transmission;
import com.company.builder_pattern.components.TripComputer;

public class CarBuilder implements Builder{
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

	@Override
	public void setCarType(CarType type) {
		this.type = type;
		
	}

	@Override
	public void setSeats(int seats) {
		this.seats = seats;
		
	}

	@Override
	public void setEngine(Engine engine) {
		this.engine = engine;
		
	}

	@Override
	public void setTransmission(Transmission transmission) {
		// TODO Auto-generated method stub
		this.transmission = transmission;
	}

	@Override
	public void setTripComputer(TripComputer tripComputer) {
		this.tripComputer = tripComputer;
		
	}

	@Override
	public void setGPSNavigator(GPSNavigator gpsNavigator) {
		this.gpsNavigator = gpsNavigator;
		
	}
	public Car getResult() {
		return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
	}

	

}
