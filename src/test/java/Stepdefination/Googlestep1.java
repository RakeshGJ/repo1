package Stepdefination;


	import java.util.List;

	import org.junit.Assert;
	import org.openqa.selenium.WebElement;

	import io.cucumber.datatable.DataTable;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	
	public class Googlestep1 extends  Applicationutils
	{
		@Given("user is on Google page")
		public void user_is_on_google_page() {
			getdriver("chrome");
			driver.get("https://www.google.com/");
		}
		@When("user enter  in searchBox")
		public void user_enter_digi_soft_in_search_box(String company) {
			type("name", "q", company);
		}
		@When("click  Search button")
		public void click_on_search_button() {
			click("name", "btnK");
		}
		@Then("user Navigate to result(s) page")
		public void user_navigate_to_results_page() {
			int resultsCount = getElements("tagname", "a").size();
			System.out.println("total results : " + resultsCount);
		}

		@Then("user fail the test")
		public void user_test_fail() {
			Assert.assertFalse(true);
		}

		@Then("user print/save all the hyperlinks")
		public void user_print_all_the_hyperlinks() {
			List<WebElement> results = getElements("tagname", "h3");
			

			results.forEach(e -> System.out.println(e.getText()));

			driver.quit();
			}
		


		@When("user perform search and print the results")
		public void user_perform_search_and_print_the_results(DataTable dataTable) {
		  List<String> dataToSearch = dataTable.asList();

		  dataToSearch.forEach(ele -> {
			  type("name", "q", ele);
			  click("name", "btnK");
			  List<WebElement> results = getElements("tagname", "h3");
	          results.forEach(e -> 
	          {
	        	  if(e.getText().length()>0)
	        		  System.out.println(e.getText());
	          });
	          driver.get("https://www.google.com/");
		  });





			List<String> dataToSearch1 = dataTable.asList();

			dataToSearch1.forEach(ele -> {
				type("name", "q", ele);
				click("name", "btnK");
				List<WebElement> results = getElements("tagname", "h3");
				results.forEach(e -> {
					if (e.getText().length() > 0)
						System.out.println(e.getText());
				});
				driver.get("https://www.google.com/");
			});

		}
		

		@When("user perform search and print the results as Map")
		public void user_perform_search_and_print_the_results_as_map(io.cucumber.datatable.DataTable dataTable) {
		 System.out.println("Team will implement");
			System.out.println("Team will implement");
		}
		

		@Then("close the browser")
		public void close_the_browser() {
			driver.quit();

}}
