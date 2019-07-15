package com.qa.classes.webpage;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TatocBasicCookiePage {
WebDriver driver;
	
	@FindBy(linkText = "Proceed")
	WebElement proceedLink;
	
	@FindBy (partialLinkText = "Token")
	WebElement generateTokenLink;
	
	@FindBy (id = "token")
	WebElement tokenContainer;
	public TatocBasicCookiePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnGenerateTokenLink() {
		generateTokenLink.click();
	}
	
	public void addTokenValueToCookie() {
		String tokenValue = tokenContainer.getText().split(": ")[1];
	    Cookie cookie = new Cookie("Token", tokenValue);
	    driver.manage().addCookie(cookie);
	}
	
	public void clickOnProceed() {
		proceedLink.click();
	}
}
