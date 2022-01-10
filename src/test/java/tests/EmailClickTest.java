package tests;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjects.GmailPageObjects;
import pageobjects.LandingPage;
import resources.Base;

public class EmailClickTest {
	
	public class EmailClickDemo extends Base{
		public WebDriver driver;
		Logger log;
		
		@Test
		public void clickEmail() {
			   LandingPage landingpage = new LandingPage(driver);
		       landingpage.emailTextBox().sendKeys(prop.getProperty("email"));
		       log.debug("email got entered");
		       
		       landingpage.nextButton().click();
		       log.debug("Clicked on next button");
		       
		       landingpage.passwordTextBox().sendKeys(prop.getProperty("password"));
		       log.debug("Password got entered");
		       
		       landingpage.nextButton2().click();
		       log.debug("Clicked on next button to login to home page"); 
		       
			
		       GmailPageObjects gb = new GmailPageObjects(driver);
		       gb.clickEmail("testing email");
		       log.debug("clicked on specific email");
		}
			
		
		@BeforeMethod 
		public void openApplication() throws IOException {
			log = LogManager.getLogger(GmailPageObjects.class.getName());
			 driver = initializeDriver();
			 log.debug("browser got launched");
				driver.get(prop.getProperty("url"));
				
				 log.debug("navigated to application URL");
		}
		
		@AfterMethod
		public void closure() {
			driver.close();
			log.debug("Browser got closed");
		}

	}

}
