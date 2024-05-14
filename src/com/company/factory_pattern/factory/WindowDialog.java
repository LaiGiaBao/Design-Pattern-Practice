package com.company.factory_pattern.factory;

import com.company.factory_pattern.buttons.Button;
import com.company.factory_pattern.buttons.WindowsButton;

public class WindowDialog extends Dialog{
	@Override
	public Button createButton() {
		return new WindowsButton();
	}

}
