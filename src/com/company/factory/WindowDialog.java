package com.company.factory;

import com.company.buttons.Button;
import com.company.buttons.WindowsButton;

public class WindowDialog extends Dialog{
	@Override
	public Button createButton() {
		return new WindowsButton();
	}

}
