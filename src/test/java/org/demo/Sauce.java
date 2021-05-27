package org.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.lib.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sauce extends LibGlobal {
	LoginPage lp;
	ProductPage pp;
	CartPage cp;

	@BeforeClass
	public void tc0() {
		getDriver();
		navigateurl("https://www.saucedemo.com/ ");
	}

	@Parameters({ "username", "password" })

	@Test
	public void tc1(String s1, String s2) {
		lp = new LoginPage();
		type(lp.getTxtUserName(), s1);
		type(lp.getTxtPassWord(), s2);
		click(lp.getBtnLogin());

	}

	@Parameters({ "urlLab", "urlDemo" })

	@Test
	public void tc2(String s3, String s4) throws InterruptedException {
		pp = new ProductPage();
		implicitWait();
		click(pp.getBtnMenu());
		Thread.sleep(6000);
		click(pp.getBtnAbout());
		
		if (driver.getCurrentUrl().equals(s3)) {
			System.out.println("User is navigate to saucelab page");
		}
		navigateBack();
		if (driver.getCurrentUrl().equals(s4)) {
			System.out.println("User navigate to product page");
		}

	}

	@Test
	public void tc3() {
		List<WebElement> allPrice = pp.getAllPrice();
		List<Integer> li = new ArrayList<Integer>();
		for (int i = 0; i < allPrice.size(); i++) {
			li.add(Integer.parseInt(allPrice.get(i).getText().replace("$", "")));

		}

		Integer max = Collections.max(li);
		System.out.println(max);
		for (int j = 0; j < allPrice.size(); j++) {
			WebElement element = allPrice.get(j);
			String text = element.getText();

			if (text.contains(String.valueOf(max))) {
				WebElement element2 = driver
						.findElement(By.xpath("//div[contains(text(),'text')]//following-sibling::button"));
				click(element2);
			}

		}
		scrollDown(pp.getBtnAddCt());
		click(pp.getBtnCart());

	}

	@Parameters({ "title", "title1", "FirstName", "LastName", "PostalCode" })

	@Test
	public void tc4(String s6, String s7, String s8, String s9, String s10) {
		cp = new CartPage();
		if (cp.getTitle().equals(s6)) {
			System.out.println("Now user is your cart page ");
		}
		click(cp.getBtnChkOut());
		if (cp.getTitle1().equals(s7)) {
			System.out.println("Now user is moved on checkout info page");
		}
		type(cp.getTxtFirstName(), s8);
		type(cp.getTxtLastName(), s9);
		type(cp.getTxtZipCode(), s10);
		click(cp.getBtnContinue());

	}

	@Parameters({ "title2" })
	@Test
	public void tc5(String s11) {
		if (cp.getTitle2().equals(s11)) {
			System.out.println("Now user is moved on checkout overview page");
		}
		WebElement totalPrice = cp.getTotalPrice();
		String text = totalPrice.getText();

	}
}
