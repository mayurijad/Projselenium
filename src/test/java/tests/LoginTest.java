package tests;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.HomePage;
import pageobjects.LandingPage;
import resources.Base;

public class LoginTest extends Base{
	public WebDriver driver;
	Logger log;
	
	@Test
	public void login () throws IOException, InterruptedException {
	
	
		
       
       LandingPage landingpage = new LandingPage(driver);
       landingpage.emailTextBox().sendKeys(prop.getProperty("email"));
       log.debug("email got entered");
       
       landingpage.nextButton().click();
       log.debug("Clicked on next button");
       
       landingpage.passwordTextBox().sendKeys(prop.getProperty("password"));
       log.debug("Password got entered");
       
       landingpage.nextButton2().click();
       log.debug("Clicked on next button to login to home page");
       
       

       
		
	}
	
	@BeforeMethod 
	public void openApplication() throws IOException {
		log = LogManager.getLogger(LoginTest.class.getName());
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
