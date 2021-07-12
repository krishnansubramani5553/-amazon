package org.locator;

import org.functional.Reuse;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailPage extends Reuse {
	public EmailPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "ap_email")
	private WebElement txtUserName;
	
	@FindBy(id = "continue")
	private WebElement btnContinue;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}
	
}
