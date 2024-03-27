package Stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDemo 

{WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("");
	    
	}

	@When("user enter the username and password")
	public void user_enter_the_username_and_password() {
	    
	}

	@And("click on submit")
	public void click_on_submit() {
	   
	}

	@Then("user navigate to home page")
	public void user_navigate_to_home_page() {
	    
	}

}
