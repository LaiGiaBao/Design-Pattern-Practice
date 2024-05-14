package com.company.factory;

import com.company.buttons.Button;

public abstract class Dialog {
	public void renderWindow() {
		Button okButton = createButton();
		okButton.render();
	}
	public abstract Button createButton();
}
