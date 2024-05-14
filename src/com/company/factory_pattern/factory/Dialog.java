package com.company.factory_pattern.factory;

import com.company.factory_pattern.buttons.Button;

public abstract class Dialog {
	public void renderWindow() {
		Button okButton = createButton();
		okButton.render();
	}
	public abstract Button createButton();
}
