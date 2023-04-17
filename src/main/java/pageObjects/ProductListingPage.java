package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductListingPage {
	
	//Constructor
	public ProductListingPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	//PageFactoy
	@FindAll(@FindBy(how = How.XPATH, using = "//li[@class='item product product-item']"))
	private List<WebElement> prd_List;
	
	@FindBy(how = How.XPATH, using = "//button[@class= 'action primary tocart']")
	private WebElement addToCart;
	
	
	
	//Actions
	//Select product from list
	public void select_Product(int productNumber) {
		
		prd_List.get(productNumber).click();
	} 

}
