package org.locator;

import org.functional.Reuse;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoToCart extends Reuse {
	public GoToCart() {
		PageFactory.initElements(driver,this);
		
	}
@FindBy(id= "a-autoid-4-announce")
private WebElement btngoToCard;
public WebElement getBtngoToCard() {
	return btngoToCard;
}
}
