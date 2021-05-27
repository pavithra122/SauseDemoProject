package org.demo;

import java.util.List;

import org.lib.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LibGlobal {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='user-name']")
	private WebElement txtUserName;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement txtPassWord;
	@FindBy(xpath = "//input[@id='login-button']")
	private WebElement btnLogin;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassWord() {
		return txtPassWord;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

}
