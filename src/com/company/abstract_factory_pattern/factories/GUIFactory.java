package com.company.abstract_factory_pattern.factories;

import com.company.abstract_factory_pattern.button.Button;
import com.company.abstract_factory_pattern.checkboxes.Checkbox;

public interface GUIFactory {
	Button createButton();
	Checkbox createCheckbox();
}
