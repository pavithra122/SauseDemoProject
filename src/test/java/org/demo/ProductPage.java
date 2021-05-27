package org.demo;

import java.util.List;

import org.lib.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends LibGlobal {
	public ProductPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@id='react-burger-menu-btn']")
	private WebElement btnMenu;
	@FindBy(xpath = "//a[@id='about_sidebar_link']")
	private WebElement btnAbout;
	@FindBy(xpath="(//button[text()='Add to cart'])[3]")
	private WebElement btnAddCt;
	@FindBy(xpath = "//div[@class='inventory_item']//child::div[@class='inventory_item_price']")
	private List<WebElement> allPrice;
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	private WebElement btnCart;
	public WebElement getBtnMenu() {
		return btnMenu;
	}
	public WebElement getBtnAbout() {
		return btnAbout;
	}
	public WebElement getBtnAddCt() {
		return btnAddCt;
	}
	public List<WebElement> getAllPrice() {
		return allPrice;
	}
	public WebElement getBtnCart() {
		return btnCart;
	}

	

}
