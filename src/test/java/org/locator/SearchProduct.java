package org.locator;

import org.functional.Reuse;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProduct extends Reuse {
	public SearchProduct() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")
	private WebElement productSearch;

	public WebElement getProductSearch() {
		return productSearch;
	}
	
}
