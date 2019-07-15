package com.qa.classes.webpage;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

public class BasicFrameDungeonPage {
	WebDriver driver;

	public BasicFrameDungeonPage(WebDriver driver){
		this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	 
	public void switchToMainFrame() {
		driver.switchTo().frame(0);
//		System.out.println("I am Main frame of Basic Frame Dungeon Page");
	}
}
