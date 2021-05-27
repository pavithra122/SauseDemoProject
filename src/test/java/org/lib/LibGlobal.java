package org.lib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	public static WebDriver driver;
	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
	}
	public void type(WebElement element,String data) {
		element.sendKeys(data);
		

	}
	public void scrollDown(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("argument[0].scrollIntoView(true)", element);
	}
	public void navigateurl(String url) {
		driver.navigate().to(url);
	}
	public void navigateBack() {
		driver.navigate().back();

	}
	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public void loadUrl(String url) {
		driver.get(url);
		implicitWait();
	}
	public void click(WebElement element) {
		element.click();
	}
	public void getAttribute(WebElement element) {
		element.getAttribute("value");
	}
	public void getAttribute(WebElement element,String data) {
		element.getAttribute(data);
	}
	public void clear(WebElement element) {
		element.clear();
	}
	
	

}
