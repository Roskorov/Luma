package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
		
	//Constructor
	public CartPage(WebDriver driver) {
				
		PageFactory.initElements(driver, this);
		
	}
	
	//PageFactoy
	@FindBy(how = How.XPATH, using = "//button[@class= 'action primary tocart']")
	private WebElement addToCart;
	
	@FindBy(how = How.XPATH, using = "//div[@aria-label='29']")
	private WebElement size29;
	
	@FindBy(how = How.XPATH, using = "//div[@aria-label='Orange']")
	private WebElement colorOrange;
	
	@FindBy(how = How.XPATH, using = "//a[@class='action showcart']")
	private WebElement showCart;
	
	@FindBy(how = How.XPATH, using = "//button[@id='top-cart-btn-checkout']")
	private WebElement checkoutButton;	
	
	//Actions
	public void clickOnSize() {
		
		size29.click();
	}
	
	public void clickOnColor() {
		
		colorOrange.click();
	}
	
	public void clickOnAddToCart() {
		
		addToCart.click();
	}
	
	public void clickOnViewCart() {
		
		showCart.click();
	}
	
	public void proceedToCheckout() {
		
		checkoutButton.click();
	}
	

}
