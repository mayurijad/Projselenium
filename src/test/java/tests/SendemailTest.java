package tests;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import pageobjects.HomePage;
import pageobjects.LandingPage;
import resources.Base;


public class SendemailTest extends Base{
	public WebDriver driver;
	Logger log;
	
	@Test
	public void sendEmail() throws InterruptedException {
		
		   LandingPage landingpage = new LandingPage(driver);
		   
	       landingpage.emailTextBox().sendKeys(prop.getProperty("email"));
	       landingpage.nextButton().click();
	       landingpage.passwordTextBox().sendKeys(prop.getProperty("password"));
	       landingpage.nextButton2().click();
	       
	       HomePage homepage = new HomePage(driver);
	       homepage.compose().click();
	       log.debug("clicked on composed");
	       homepage.to().sendKeys("jrashi685@gmail.com");
	       log.debug("clicked on to");
	       homepage.subject().sendKeys("Automations Script");
	       log.debug("clicked on subject");
	       homepage.body().sendKeys("Test script");
	       log.debug("writing the text in body text");
	       homepage.sent().click();
	       log.debug("clicked on sent button");
	       
	           
		}
	
		@BeforeMethod 
		public void openApplication() throws IOException {
		log = LogManager.getLogger(SendemailTest.class.getName());
		driver = initializeDriver();
		log.debug("browser got launched");
		driver.get(prop.getProperty("url"));
		//Assert.assertTrue(false);
			 log.debug("navigated to application URL");
		}
	
		@AfterMethod
		public void closure() {
		driver.close();
		log.debug("Browser got closed");
		}

	}
