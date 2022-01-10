package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="(//a[@title='Gmail'])[2]")
	private WebElement gmailLogo;
	
	@FindBy(xpath="//div[@class='pp']//div//div//div//div//div[@class='T-I T-I-KE L3']")
	private WebElement compose;
	
	@FindBy(xpath="//*[text()='To']/../../../td[@class='eV']//textarea")
	private WebElement to;
	
	@FindBy(xpath="//input[@placeholder='Subject']")
	private WebElement subject;
	
	@FindBy(xpath="//div[@role='textbox']")
	private WebElement body;
	
	@FindBy (xpath="//div[@class=\"dC\"]//div[1]")
	private WebElement sent;
	
	
	
	public WebElement gmailLogo() {
		return gmailLogo;
	}
	
	public WebElement compose() {
		return compose;
	}
	
	public WebElement to() {
		return to;
	}
	
	public WebElement subject() {
		return subject;
	}
	
	public WebElement body() {
		return body;
	}
	
	public WebElement sent() {
		return sent;
	}


	
	//div[contains(@data-tooltip,'send')]


	


	
	
	
	

}
