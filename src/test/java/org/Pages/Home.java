package org.Pages;

import org.Base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home extends Base {

	public Home() {
		PageFactory.initElements(driver, this);
	}

   @FindBy(xpath = "//*[text()='Cartes American Express']")
   static WebElement firstLink;

	public static void clickOnCartesAmericanExpression(){
		try {
			waitForElementPresent(firstLink);
			clickByJS(firstLink);
		} catch (Exception e) {
			System.out.println("Button Cartes American Express is not present on the webpage");
		}
	}
}
