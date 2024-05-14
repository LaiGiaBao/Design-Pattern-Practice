package com.company.abstract_factory_pattern.app;

import com.company.abstract_factory_pattern.button.Button;
import com.company.abstract_factory_pattern.checkboxes.Checkbox;
import com.company.abstract_factory_pattern.factories.GUIFactory;

public class Application {
	private Button button;
	private Checkbox checkbox;
	public Application(GUIFactory factory) {
		button = factory.createButton();
		checkbox = factory.createCheckbox();
	}
	public void paint() {
		button.paint();
		checkbox.paint();
	}
}
