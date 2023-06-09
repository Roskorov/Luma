package stepDefinitions;

//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import pageObjects.ProductListingPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import dataProviders.ConfigFileReader;
import managers.PageObjectManager;

public class Steps {
	
	WebDriver driver;
	
	ConfigFileReader configFileReader;
	
	HomePage homePage;
	
	PageObjectManager pageObjectManager;
	
	ProductListingPage productListingPage;
	
	CartPage cartPage;
	
	CheckoutPage checkoutPage;
	
	
	
	@Given("^user is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
				
		configFileReader = new ConfigFileReader();		
		
		System.setProperty("webdriver.edge.driver", 
				configFileReader.getDriverPath());	
		
		//Private mode
		EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("-inprivate");
        driver = new EdgeDriver(edgeOptions); 
        /*
        System.setProperty("webdriver.chrome.driver", 
				configFileReader.getDriverPath());
        
        //Private mode
        ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments("-incognito");
        driver = new ChromeDriver(chromeOptions);
		*/        
        
        pageObjectManager = new PageObjectManager(driver);
        
        //Created an Object of HomePage Class
        homePage = pageObjectManager.getHomePage();
        //Get Home
        homePage.navigateTo_Home();
        Thread.sleep(1000);
        homePage.moveTabWomen();
        
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^customer search for \"([^\"]*)\"$")
	public void he_search_for(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^choose to buy the first item$")
	public void choose_to_buy_the_first_item() throws Throwable {
		
		productListingPage = pageObjectManager.getProductListingpage();
		productListingPage.select_Product(0);
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^moves to checkout from mini cart$")
	public void moves_to_checkout_from_mini_cart() throws Throwable {
		
		cartPage = pageObjectManager.getCartPage();
		Thread.sleep(2000);
		cartPage.clickOnSize();
		Thread.sleep(1000);
		cartPage.clickOnColor();
		Thread.sleep(1000);
		cartPage.clickOnAddToCart();
		Thread.sleep(4000);
		cartPage.clickOnViewCart();
		Thread.sleep(3000);
		cartPage.proceedToCheckout();
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^enter personal details on checkout page$")
	public void enter_personal_details_on_checkout_page() throws Throwable {
	    
		Thread.sleep(2000);
		checkoutPage = pageObjectManager.getCheckoutPage();
		checkoutPage.fillPersonalDetails();
		Thread.sleep(1000);
		checkoutPage.clickOnShippingMethod();
		Thread.sleep(2000);
		checkoutPage.clickOnNextButton();
		// Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^place the order$")
	public void place_the_order() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
