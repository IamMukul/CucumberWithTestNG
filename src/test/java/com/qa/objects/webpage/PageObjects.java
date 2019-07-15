package com.qa.objects.webpage;

import org.openqa.selenium.WebDriver;

import com.qa.classes.webpage.BasicFrameDungeonChildFramePage;
import com.qa.classes.webpage.BasicFrameDungeonMainFramePage;
import com.qa.classes.webpage.BasicFrameDungeonPage;
import com.qa.classes.webpage.BasicGridGatePage;
import com.qa.classes.webpage.BasicWindowsPopUpPage;
import com.qa.classes.webpage.TatocBasicCookiePage;
import com.qa.classes.webpage.TatocBasicDragPage;
import com.qa.classes.webpage.TatocBasicWindowsPage;
import com.qa.classes.webpage.TatocPage;

public class PageObjects {
	
	//WebDriver driver;
	// Page Reference Containers
	public TatocPage tatocPage;
	public BasicFrameDungeonMainFramePage basicFrameDungeonMainFramePageObj;
	public BasicFrameDungeonPage basicFrameDungeonPage;
	public TatocBasicDragPage tatocBasicDragPage;
	public TatocBasicWindowsPage tatocBasicWindowsPage;
	public BasicWindowsPopUpPage basicWindowsPopUpPage;
	public TatocBasicCookiePage tatocBasicCookiePage;
	public BasicGridGatePage basicGridGatePageObj;
	public BasicFrameDungeonChildFramePage basicFrameDungeonChildFramePageObj;
	
	public PageObjects(WebDriver driver) {
		//this.driver = driver;
		this.tatocPage = new TatocPage(driver);
		this.basicFrameDungeonMainFramePageObj = new BasicFrameDungeonMainFramePage(driver);
		this.basicFrameDungeonPage = new BasicFrameDungeonPage(driver);
		this.tatocBasicDragPage = new TatocBasicDragPage(driver);
		this.tatocBasicWindowsPage = new TatocBasicWindowsPage(driver);
		this.basicWindowsPopUpPage = new BasicWindowsPopUpPage(driver);
		this.tatocBasicCookiePage = new TatocBasicCookiePage(driver);
		this.basicGridGatePageObj = new BasicGridGatePage(driver);
		this.basicFrameDungeonChildFramePageObj = new BasicFrameDungeonChildFramePage(driver);
	}
}