package com.company.builder_pattern.builders;

import com.company.builder_pattern.cars.CarType;
import com.company.builder_pattern.components.Engine;
import com.company.builder_pattern.components.GPSNavigator;
import com.company.builder_pattern.components.Transmission;
import com.company.builder_pattern.components.TripComputer;

public interface Builder {
	void setCarType(CarType type);
	void setSeats(int seats);
	void setEngine(Engine engine);
	void setTransmission(Transmission transmission);
	void setTripComputer(TripComputer tripComputer);
	void setGPSNavigator(GPSNavigator gpsNavigator);
	
}
