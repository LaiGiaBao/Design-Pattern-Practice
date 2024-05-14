package com.company.abstract_factory_pattern.factories;

import com.company.abstract_factory_pattern.button.Button;
import com.company.abstract_factory_pattern.button.WindowsButton;
import com.company.abstract_factory_pattern.checkboxes.Checkbox;
import com.company.abstract_factory_pattern.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}

}
