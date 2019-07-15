package com.qa.classes.webpage;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class BasicGridGatePage {

	 WebDriver driver;

	 @FindBy(className="redbox")
	 WebElement redBoxElement;
	    
	 @FindBy(className="greenbox")
	 WebElement greenBoxElement;

	 public BasicGridGatePage(WebDriver driver){
		 this.driver = driver;
	     PageFactory.initElements(driver, this);
	 }
	 
	 public void clickOnRedBox() {
		 redBoxElement.click();
	 }
	 public void clickOnGreenBox() {
		 greenBoxElement.click();
	 }
}