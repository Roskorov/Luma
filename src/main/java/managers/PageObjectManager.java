package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import pageObjects.ProductListingPage;


public class PageObjectManager {
	
	private WebDriver driver;
	
	private HomePage homePage;
	
	private ProductListingPage productListingPage;
	
	private CartPage cartPage;
	
	private CheckoutPage checkoutPage;
	
	
	public PageObjectManager(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	/*This method has two responsibilities:

	To create an Object of Page Class only if the object is null.
	To supply the already created object if it is not null*/
	
	public HomePage getHomePage() {
		
		return(homePage == null) ? homePage = 
				new HomePage(driver) : homePage;
	}
	
	public ProductListingPage getProductListingpage() {
		
		return(productListingPage == null) ? productListingPage =
				new ProductListingPage(driver) : productListingPage;		
	}
	
	public CartPage getCartPage() {
		
		return(cartPage == null) ? cartPage =
				new CartPage(driver) : cartPage;
	}
	
	public CheckoutPage getCheckoutPage() {
		
		return(checkoutPage == null) ? checkoutPage =
				new CheckoutPage(driver) : checkoutPage;
	}

}
