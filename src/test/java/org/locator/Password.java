package org.locator;

import org.functional.Reuse;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Password extends Reuse {
	public Password() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "ap_password")
	private WebElement txPassword;

	@FindBy(id = "signInSubmit")
	private WebElement btnSignIn;

	public WebElement getTxPassword() {
		return txPassword;
	}

	public WebElement getBtnSignIn() {
		return btnSignIn;
	}
	
}
