package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver driver;
	
	
	public LandingPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//input[@id='identifierId']")
	private WebElement emailTextBox;
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement nextButton;
	
	@FindBy(name="password")
	private WebElement passwordTextBox;
	
	@FindBy(css="#passwordNext > div > button > span")
	private WebElement nextButton2;
	
	public WebElement emailTextBox() {
		return emailTextBox;
	}
	
	public WebElement nextButton() {
		return nextButton;
	}
	
	public WebElement passwordTextBox() {
		return passwordTextBox;
	}
	
	public WebElement nextButton2() {
		return nextButton2;
	}

	
	

}
