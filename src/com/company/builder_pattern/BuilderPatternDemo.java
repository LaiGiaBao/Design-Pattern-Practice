package com.company.builder_pattern;

import com.company.builder_pattern.builders.CarBuilder;
import com.company.builder_pattern.builders.CarManualBuilder;
import com.company.builder_pattern.cars.Car;
import com.company.builder_pattern.cars.Manual;
import com.company.builder_pattern.director.Director;

public class BuilderPatternDemo {
	public static void main(String[] args) {
		Director director = new Director();
		CarBuilder builder = new CarBuilder();
		director.constructSportsCar(builder);
		Car car = builder.getResult();
		System.out.println("Car built: \n"+car.getCarType());
		
		CarManualBuilder manualBuilder = new CarManualBuilder();
		director.constructSportsCar(manualBuilder);
		Manual carManual = manualBuilder.getResult();
		System.out.println("\nCar manual built:\n" + carManual.print());
	}
}
