package org.locator;

import org.functional.Reuse;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Reuse {
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(text(),'Hello, Sign in')]")
	private WebElement mousetnSign;

	@FindBy(xpath = "//div[@id='nav-flyout-ya-signin']//child::span[text()='Sign in']")
	private WebElement btnSign;

	@FindBy(id = "twotabsearchtextbox")
	private WebElement txSearchBox;

	@FindBy(id = "nav-search-submit-button")
	private WebElement btnSearch;

	@FindBy(className = "nav-line-1-container")
	private WebElement getTextUserName;

	@FindBy(id = "nav-logo")
	private WebElement verifyLogo;

	@FindBy(id = "nav-cart-count-container")
	private WebElement btnAddToCart;

	public WebElement getMousetnSign() {
		return mousetnSign;
	}

	public WebElement getBtnSign() {
		return btnSign;
	}

	public WebElement getTxSearchBox() {
		return txSearchBox;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public WebElement getGetTextUserName() {
		return getTextUserName;
	}

	public WebElement getVerifyLogo() {
		return verifyLogo;
	}

	public WebElement getBtnAddToCart() {
		return btnAddToCart;
	}
	
	

}
