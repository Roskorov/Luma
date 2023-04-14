package stepDefinitions;

//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Steps {
	
	WebDriver driver;	
	
	@Given("^user is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		
		System.setProperty("webdriver.edge.driver", 
				"D:/MyJob/Testing/Selenium_Driver/edgedriver_win64/msedgedriver.exe");	
		//Private mode
		EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("-inprivate");
        driver = new EdgeDriver(edgeOptions); 
        
        driver.get("https://magento.softwaretestingboard.com/");
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^he search for \"([^\"]*)\"$")
	public void he_search_for(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^choose to buy the first item$")
	public void choose_to_buy_the_first_item() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^moves to checkout from mini cart$")
	public void moves_to_checkout_from_mini_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^enter personal details on checkout page$")
	public void enter_personal_details_on_checkout_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^place the order$")
	public void place_the_order() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
