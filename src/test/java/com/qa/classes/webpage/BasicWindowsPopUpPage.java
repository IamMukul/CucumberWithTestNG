package com.qa.classes.webpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasicWindowsPopUpPage {
WebDriver driver;
	
	@FindBy(id = "name")
	WebElement nameField;
	
	@FindBy (id = "submit")
	WebElement submitBtn;
	
	public BasicWindowsPopUpPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSubmitButton() {
		submitBtn.click();
	}
	
	public void fillNameInInputField(String name) {
		nameField.sendKeys(name);
	}
}
