package org.locator;

import org.functional.Reuse;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditQuantity extends Reuse {
	public EditQuantity() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@value='Delete']")
	private WebElement btnQuantity;

	
	@FindBy(xpath = "//h1[contains(text(),'Shopping Cart')]")
	private WebElement getTextFromPage;

	public WebElement getBtnQuantity() {
		return btnQuantity;
	}

	

	public WebElement getGetTextFromPage() {
		return getTextFromPage;
	

}
}
