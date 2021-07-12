package org.locator;

import org.functional.Reuse;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart extends Reuse{
	public AddToCart() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "a-autoid-2-announce")
	private WebElement btnAddToCard;

	public WebElement getBtnAddToCard() {
		return btnAddToCard;
	}

}


