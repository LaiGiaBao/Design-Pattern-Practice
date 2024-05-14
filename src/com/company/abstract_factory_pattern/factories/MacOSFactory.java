package com.company.abstract_factory_pattern.factories;

import com.company.abstract_factory_pattern.button.Button;
import com.company.abstract_factory_pattern.button.MacOSButton;
import com.company.abstract_factory_pattern.checkboxes.Checkbox;
import com.company.abstract_factory_pattern.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{

	@Override
	public Button createButton() {
		return new MacOSButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new MacOSCheckbox();
	}

}
