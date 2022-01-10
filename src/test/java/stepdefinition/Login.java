package stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HomePage;
import pageobjects.LandingPage;
import resources.Base;

public class Login extends Base{
	WebDriver driver;
	LandingPage landingpage;
	 HomePage homepage;
    
    
    @Given("^Open any Browser$")
    public void open_any_browser() throws IOException{
    	driver = initializeDriver();
    }
    
    
    
    @When("^User enters username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void user_enters_username_as_something_and_password_as_something(String email, String password) throws InterruptedException{
    	   landingpage = new LandingPage(driver);
           landingpage.emailTextBox().sendKeys(prop.getProperty("email"));
           landingpage.nextButton().click();
           landingpage.passwordTextBox().sendKeys(prop.getProperty("password"));
           landingpage.nextButton2().click();
           Thread.sleep(3000);
    }
    @And("^Navigate to the Login Page$")
    public void navigate_to_the_login_page1(){
    	driver.get(prop.getProperty("url"));
        
    }

 

    @After
    public void closure() {
    	driver.close();
    }
    


}
