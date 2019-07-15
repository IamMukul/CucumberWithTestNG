package com.qa.classes.webpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasicFrameDungeonMainFramePage {
	WebDriver driver;

	@FindBy(xpath = "//div[text()='Box 1']")
	WebElement box1;

	@FindBy(partialLinkText = "Repaint")
	WebElement repaintBox2Link;

	@FindBy(linkText = "Proceed")
	WebElement proceedLink;
	
	public BasicFrameDungeonMainFramePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnProceedLink() {
		proceedLink.click();
	}

	public void clickOnRepaintBox2Link() {
		repaintBox2Link.click();
	}
	
	public void switchToChildFrame() {
		driver.switchTo().frame(0);
//		System.out.println("I am child frame that have Box 2 on it");
	}
	
	public String getColorOfBox1() {
		return box1.getAttribute("class");
	}
}
