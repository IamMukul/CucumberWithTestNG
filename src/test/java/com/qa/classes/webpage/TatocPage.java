package com.qa.classes.webpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TatocPage {
	/**

     * All WebElements are identified by @FindBy annotation

     */

    //WebDriver driver;

    @FindBy(linkText="Basic Course")
    WebElement linkForBasicCourse;
    
    @FindBy(linkText="Advanced Course")
    WebElement linkForAdvancedCourse;
    
    public TatocPage(WebDriver driver){

        //this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }

    public void clickOnBasicCourse(){           
    	linkForBasicCourse.click();
    }
    
    public void clickOnAdvancedCourse(){           
    	linkForAdvancedCourse.click();
    }
}
