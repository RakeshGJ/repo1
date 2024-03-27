package Stepdefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch extends Applicationutils
{
	@Given("user launch the browser")
	public void user_launch_the_browser() 
	{
	   getdriver("chrome");
	}

	@And("user pass the url")
	public void user_pass_the_url() 
	{
	    launch("https://www.google.com/");
	}

	@When("user type ibm on search field")
	public void user_type_ibm_on_search_field() 
	{
	   type("name","q","ibm");
	}

	@And("user get all autosuggestions")
	public void user_get_all_autosuggestions() 
	{
List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@role='listbox' and @class='G43f7e']//div[@role='presentation']"));
		
		for (WebElement suggestion : suggestions)
		{
			System.out.println(suggestion.getText().formatted());
		}
	}

	@Then("print all autosuggestions")
	public void print_all_autosuggestions() 
	{
	   
	}

}
