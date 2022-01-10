package pageobjects;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import resources.Base;
//import tests.LoginTest;

public class GmailPageObjects{
	WebDriver driver;
	
	public GmailPageObjects(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickEmail(String emailSubject) {
		for (int i=0; i<emailThreads.size(); i++) {
			if (emailThreads.get(i).getText().contains(emailSubject)) {
				emailThreads.get(i).click();
				System.out.println("Email clicked");
				break;
			}
		}
	}
	
	@FindBy(xpath="//span[@class='bog']")
	private List<WebElement> emailThreads;


}
