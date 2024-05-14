package com.company.abstract_factory_pattern;

import java.util.Scanner;

import com.company.abstract_factory_pattern.app.Application;
import com.company.abstract_factory_pattern.factories.GUIFactory;
import com.company.abstract_factory_pattern.factories.MacOSFactory;
import com.company.abstract_factory_pattern.factories.WindowsFactory;

public class AbstractFactoryDemo {
	public static void main(String[] args) {
		GUIFactory factory;
		Application app;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Press 1 to create MacOS GUI \nPress 2 to create Windows GUI");
		if(scanner.nextInt() ==1) {
			factory = new MacOSFactory();
		} else {
			factory = new WindowsFactory();
		}
		app = new Application(factory);
		app.paint();
	}
}
