package com.qa.stepDefinitions;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.qa.objects.webpage.PageObjects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class StepDefs_BasicCourse {
	WebDriver driver;
	PageObjects pageObject;

	@Given("^Open browser and launch application on chrome$")
	public void open_browser_and_launch_application_on_chrome() throws Throwable {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.0.1.86/tatoc");
		System.out.println("Lauching Browser");
	}

	@When("^I click on basic course$")
	public void i_click_on_basic_course() throws Throwable {
		pageObject = new PageObjects(driver);
		pageObject.tatocPage.clickOnBasicCourse();
		System.out.println("Clicking on basic course");
	}

	@Then("^verify basic grid gate page appears$")
	public void verify_basic_grid_gate_page_appears() throws Throwable {
		pageObject = new PageObjects(driver);
		String actualTitle = driver.getTitle();
		String expectedTitle = "Grid Gate - Basic Course - T.A.T.O.C";
		Assert.assertEquals(actualTitle, expectedTitle, "Actual Webpage is different than Expected");
		System.out.println("Verifying title");
	}

	@Then("^verify frame dungeon page appears$")
	public void verify_frame_dungeon_page_appears() throws Throwable {
		pageObject = new PageObjects(driver);
		String expectedTitle = "Frame Dungeon - Basic Course - T.A.T.O.C";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Actual Webpage is different than Expected");
	}

	@When("^I click on green box$")
	public void i_click_on_green_box() throws Throwable {
		pageObject = new PageObjects(driver);
		pageObject.basicGridGatePageObj.clickOnGreenBox();
	}

	@When("^I goto main frame$")
	public void i_goto_main_frame() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		pageObject = new PageObjects(driver);
		pageObject.basicFrameDungeonPage.switchToMainFrame();
	}

	@And("^I get color of box1 and box2 until they have same color$")
	public void i_get_color_of_box1_and_box2_until_they_have_same_color() throws Throwable {
		// throw new PendingException();
		Boolean result;
		do {
			String box1Color = pageObject.basicFrameDungeonMainFramePageObj.getColorOfBox1();
			pageObject.basicFrameDungeonMainFramePageObj.switchToChildFrame();
			String box2Color = pageObject.basicFrameDungeonChildFramePageObj.getColorOfBox2();
			pageObject.basicFrameDungeonChildFramePageObj.switchToParentFrame();
			result = box1Color.equals(box2Color);
			if (!result) {
				pageObject.basicFrameDungeonMainFramePageObj.clickOnRepaintBox2Link();
			} else {
				pageObject.basicFrameDungeonMainFramePageObj.clickOnProceedLink();
			}
		} while (!result);
	}

	@When("^I put drag me into drop box$")
	public void i_put_drag_me_into_drop_box() throws Throwable {
		//throw new PendingException();
		pageObject.tatocBasicDragPage.dropDragMeToDropBox();
	}

	@Then("^I verify drag page appears$")
	public void i_verify_drag_page_appears() throws Throwable {
		//throw new PendingException();
		//pageObject = new PageObjects(driver);
		String expectedTitle = "Drag - Basic Course - T.A.T.O.C";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Actual Webpage is different than Expected");
		
	}

	@Then("^verify windows page appears$")
	public void verify_windows_page_appears() throws Throwable {
		//throw new PendingException();
		String expectedTitle = "Windows - Basic Course - T.A.T.O.C";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Actual Webpage is different than Expected");
	}

	@And("^I click on proceed link$")
	public void i_click_on_proceed_link() throws Throwable {
		//throw new PendingException();
		pageObject.tatocBasicDragPage.clickOnProceed();
	}

	@When("^I launch popup window$")
    public void i_launch_popup_window() throws Throwable {
        //throw new PendingException();
		pageObject.tatocBasicWindowsPage.clickOnLaunchPopUpWindow();
    }
    @And("^I click on proceed$")
    public void i_click_on_proceed() throws Throwable {
       // throw new PendingException();
    	pageObject.tatocBasicWindowsPage.clickOnProceed();
    }
    @Then("^I fill the name \"(.*?)\" into the form and perform click$")
    public void i_fill_the_name_into_the_form_and_perform_click(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    	String parentWindow = driver.getWindowHandle();
        Set<String> openWindows = driver.getWindowHandles();
        for (String windowHandle : openWindows) {
      	  if(!windowHandle.equals(parentWindow)) {
      		  driver.switchTo().window(windowHandle);
      		  pageObject.basicWindowsPopUpPage.fillNameInInputField(arg1);
      		  pageObject.basicWindowsPopUpPage.clickOnSubmitButton();
      	  }
        }
        driver.switchTo().window(parentWindow);
    }
    @When("^I generate token by clicking on generate token link$")
    public void i_generate_token_by_clicking_on_generate_token_link() throws Throwable {
     //   throw new PendingException();
    	pageObject.tatocBasicCookiePage.clickOnGenerateTokenLink();
    }

    @Then("^I verify cookie handling page appears$")
    public void i_verify_cookie_handling_page_appears() throws Throwable {
       // throw new PendingException();
    	String expectedTitle = "Cookie Handling - Basic Course - T.A.T.O.C";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Actual Webpage is different than Expected");
    }

    @And("^I add this token as a cookie$")
    public void i_add_this_token_as_a_cookie() throws Throwable {
        //throw new PendingException();
    	pageObject.tatocBasicCookiePage.addTokenValueToCookie();
    }
    @And("^perform click on proceed$")
    public void perform_click_on_proceed() throws Throwable {
     //   throw new PendingException();
    	pageObject.tatocBasicCookiePage.clickOnProceed();
    }
    @Then("^I verify End of Tatoc appears$")
    public void i_verify_end_of_tatoc_appears() throws Throwable {
        //throw new PendingException();
    	String expectedTitle = "End - T.A.T.O.C";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Actual Webpage is different than Expected");
    }
}
