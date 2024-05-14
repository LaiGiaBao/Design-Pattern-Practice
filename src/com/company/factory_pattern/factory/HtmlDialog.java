package com.company.factory_pattern.factory;

import com.company.factory_pattern.buttons.Button;
import com.company.factory_pattern.buttons.HtmlButton;

public class HtmlDialog extends Dialog{

	@Override
	public Button createButton() {
		return new HtmlButton();
	}

}
