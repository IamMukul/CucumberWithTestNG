package com.qa.classes.webpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TatocBasicDragPage {
	WebDriver driver;

	@FindBy(id = "dragbox")
	WebElement dragBox;
	
	@FindBy(id = "dropbox")
	WebElement dropBox;
	
	@FindBy (linkText = "Proceed")
	WebElement proceedLink;
	
	public TatocBasicDragPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void dropDragMeToDropBox() {
		Actions action = new Actions(driver);
		action.dragAndDrop(dragBox, dropBox).perform();
	}
	
	public void clickOnProceed() {
		proceedLink.click();
	}
}
