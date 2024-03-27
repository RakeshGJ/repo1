package Stepdefination;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class FormySteps extends Applicationutils{
	
	
	

	@Given("user is on Formy Registration page")
	public void user_is_on_formy_registration_page() {
		getdriver("chrome");
		launch("https://formy-project.herokuapp.com/form");
	}

	@When("user register below users as list")
	public void user_register_below_users_as_list(DataTable dataTable) {
		
		List<List<String>> userdetails = dataTable.asLists();
		
		userdetails.forEach(user -> {
			
			type("id", "first-name", user.get(0));
			type("id", "last-name", user.get(1));
			type("id", "job-title", user.get(2));
			switch (user.get(3))
			{
				case "High School": {
					click("id", "radio-button-1");
					break;
				}
				case "Grad School": {
					click("id", "radio-button-3");
					break;
				}
				case "College": {
					click("id", "radio-button-2");
					break;
				}
			
			}
			switch (user.get(4))
			{
				case "Male": {
					click("id", "checkbox-1");
					break;
				}
				case "Female": {
					click("id", "checkbox-2");
					break;
				}
				case "Nopref": {
					click("id", "checkbox-3");
					break;
				}
			
			}
			Select sel = new Select(getelement("id", "select-menu"));
			sel.selectByVisibleText(user.get(5));
			type("id", "datepicker", user.get(6));

			click("xpath", "//a[text()='Submit']");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			WebElement successMsg = driver.findElement(By.xpath("//div[@class='alert alert-success']"));
		
			System.out.println(successMsg.getText());
			launch("https://formy-project.herokuapp.com/form");
			
		});
		
		
		
		
	}

	@When("close the Browser")
	public void close_the_browser() {
		driver.close();
	}

	@When("user register below users as Map")
	public void user_register_below_users_as_map(DataTable dataTable) {
		
		List<Map<String, String>> userdetails = dataTable.asMaps();
		
		userdetails.forEach(user -> {
			type("id", "first-nam", user.get("firstname"));
			type("id", "last-name", user.get("lastname"));
			type("id", "job-title", user.get("jobtitle"));
			switch (user.get("edu"))
			{
				case "High School": {
					click("id", "radio-button-1");
					break;
				}
				case "Grad School": {
					click("id", "radio-button-3");
					break;
				}
				case "College": {
					click("id", "radio-button-2");
					break;
				}
			
			}
			switch (user.get("sex"))
			{
				case "Male": {
					click("id", "checkbox-1");
					break;
				}
				case "Female": {
					click("id", "checkbox-2");
					break;
				}
				case "Nopref": {
					click("id", "checkbox-3");
					break;
				}
			
			}
			Select sel = new Select(getelement("id", "select-menu"));
			sel.selectByVisibleText(user.get("exp"));
			type("id", "datepicker", user.get("date"));

			click("xpath", "//a[text()='Submit']");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			WebElement successMsg = driver.findElement(By.xpath("//div[@class='alert alert-success']"));
		
			System.out.println(successMsg.getText());
			launch("https://formy-project.herokuapp.com/form");
			
		});
	}

}