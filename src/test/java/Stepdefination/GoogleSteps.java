package Stepdefination;


	import java.util.List;
	import org.openqa.selenium.WebElement;

	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	

	public class GoogleSteps extends Applicationutils {

		@Given("user is Google page")
		public void user_is_on_google_page() {
			getdriver("chrome");
			launch("https://www.google.com/");
		}

		@When("user enter {} in searchBox")
		public void user_enter_digi_soft_in_search_box(String company) {
			type("name", "q", company);
		}

		@When("click on Search button")
		public void click_on_search_button() {
			click("name", "btnK");
		}

		@Then("user Navigate to results page")
		public void user_navigate_to_results_page() {
			int resultsCount = getElements("tagname", "a").size();
			System.out.println("total results : " + resultsCount);
		}

		@Then("user print all the hyperlinks")
		public void user_print_all_the_hyperlinks() {
			List<WebElement> results = getElements("tagname", "h3");

			results.forEach(e -> System.out.println(e.getText()));

			driver.quit();
			}

	}


