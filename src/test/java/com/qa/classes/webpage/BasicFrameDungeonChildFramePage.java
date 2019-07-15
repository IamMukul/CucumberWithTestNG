package com.qa.classes.webpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasicFrameDungeonChildFramePage {
	WebDriver driver;

	@FindBy(xpath = "//div[text()='Box 2']")
	WebElement box2;
	
	public BasicFrameDungeonChildFramePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void switchToParentFrame() {
		driver.switchTo().parentFrame();
	}
	
	public String getColorOfBox2() {
		return box2.getAttribute("class");
	}
}
