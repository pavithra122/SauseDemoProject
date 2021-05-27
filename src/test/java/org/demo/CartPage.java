package org.demo;

import org.lib.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends LibGlobal {
	public CartPage(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Your Cart']")
	private WebElement title;
	@FindBy(xpath="//button[@id='checkout']")
	private WebElement btnChkOut;
	@FindBy(xpath="//span[text()='Checkout: Your Information']")
	private WebElement title1;
	@FindBy(xpath="//input[@id='first-name']")
	private WebElement txtFirstName;
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement txtLastName;
	@FindBy(xpath="//input[@id='postal-code']")
	private WebElement txtZipCode;
	@FindBy(xpath="//input[@id='continue']")
	private WebElement btnContinue;
	@FindBy(xpath="Checkout: Overview")
	private WebElement title2;
	
	@FindBy(xpath="//div[@class='summary_total_label']")
	private WebElement TotalPrice;

	public WebElement getTitle() {
		return title;
	}

	public WebElement getBtnChkOut() {
		return btnChkOut;
	}

	public WebElement getTitle1() {
		return title1;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtZipCode() {
		return txtZipCode;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public WebElement getTitle2() {
		return title2;
	}

	public WebElement getTotalPrice() {
		return TotalPrice;
	}

	
	
	
	

}
