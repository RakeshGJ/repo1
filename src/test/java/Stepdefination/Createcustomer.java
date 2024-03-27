package Stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Createcustomer extends Applicationutils
{
	
	@Given("user is on acttitime loginpage")
	public void user_is_on_acttitime_loginpage() {
		getdriver("chrome");
		launch("http://localhost:8080/login.do");
	    
	}

	@When("login with  validcredentials")
	public void login_with_validcredentials() {
		type("id","username","admin");
		type("name","pwd","manager");
		
	   
	}

	@And("click  on login button")
	public void click_on_login_button() {
		click("id", "loginButton");
	}

	@Then("user  click on task")
	public void user_click_on_task() 
	{
	    getmodule("task");
	}

	@And("user click on addnew button")
	public void user_click_on_addnew_button() 
	{
	    getelement("xpath", "//div[text()='Add New']").click();
	}

	@And("user click on newcustomer")
	public void user_click_on_newcustomer() {
		getelement("xpath", "//div[text()='+ New Customer']").click();
	    
	}

	@Then("user enter  {} and {}")
	public void user_enter_customer1_and_csd1(String customername,String customerdesc) 
	{
	    getelement("id", "customerLightBox_nameField").sendKeys(customername);
	    pauseexecution(2000);
	    getelement("id", "customerLightBox_descriptionField").sendKeys(customerdesc);
	    
	}

	@And("click on createcustomer")
	public void click_on_createcustomer() 
	{
		getelement("xpath", "//span[text()='Create Customer']").click();
	   
	}

	@Then("user get a successs message")
	public void user_get_a_successs_message() 
	{
	    
	}




}
