package com.qa.classes.webpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TatocBasicWindowsPage {
	//WebDriver driver;
	
	@FindBy(partialLinkText = "Popup")
	WebElement popUp;
	
	@FindBy (linkText = "Proceed")
	WebElement proceedLink;
	
	public TatocBasicWindowsPage(WebDriver driver) {
		//this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void clickOnLaunchPopUpWindow() {
		popUp.click();
	}
	public void clickOnProceed() {
		proceedLink.click();
	}
}
