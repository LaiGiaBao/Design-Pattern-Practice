package com.company.factory_pattern;

import java.util.Scanner;

import com.company.factory_pattern.factory.Dialog;
import com.company.factory_pattern.factory.HtmlDialog;
import com.company.factory_pattern.factory.WindowDialog;

public class FactoryPatternDemo {
	private static Dialog dialog;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Press 1 to render window button \nPress 2 to render html button");
		if (scanner.nextInt()==1) {
			dialog = new WindowDialog();
		}
		else {
			dialog = new HtmlDialog();
		}
		dialog.renderWindow();
		
	}

}
