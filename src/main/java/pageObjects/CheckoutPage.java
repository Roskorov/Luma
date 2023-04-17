package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;

public class CheckoutPage {
	
	//Constructor
	public CheckoutPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	//PageFactoy
	@FindBy(how = How.XPATH, using = "//input[@id='customer-email']" )
	private WebElement input_emailAddress;
	
	@FindBy(how = How.XPATH, using = "//input[@name='firstname']")
	private WebElement input_firstName;
	
	@FindBy(how = How.XPATH, using = "//input[@name='lastname']")
	private WebElement input_lastName;
	
	@FindBy(how = How.XPATH, using = "//input[@name='street[0]']")
	private WebElement input_addres1;
	
	@FindBy(how = How.XPATH, using = "//input[@name='city']")
	private WebElement input_city;
	
	@FindBy(how = How.XPATH, using = "//select[@name='region_id']")
	private WebElement downdropState;
	
	@FindBy(how = How.XPATH, using = "//input[@name='postcode']")
	private WebElement input_zipCode;
	
	@FindBy(how = How.XPATH, using = "//select[@name='country_id']")
	private WebElement downdropCountry;
	
	@FindBy(how = How.XPATH, using = "//input[@name='telephone']")
	private WebElement input_phoneNumber;
	
	@FindBy(how = How.XPATH, using = "//tbody/tr[2]/td[1]/input[1]")
	private WebElement radioBestWay;
	
	@FindBy(how = How.XPATH, using = "//button[@class='button action continue primary']")
	private WebElement nextButton;
	
	
	//Actions
	public void enter_emailAddress(String email_Address) {		
		input_emailAddress.sendKeys(email_Address);		
	}
	
	public void enterFirstName(String first_Name) {
		input_firstName.sendKeys(first_Name);
	}
	
	public void enterLastName(String last_Name) {
		input_lastName.sendKeys(last_Name);
	}
	
	public void enterAddress1(String address1) {
		input_addres1.sendKeys(address1);
	}

	public void enterCity(String city) {
		input_city.sendKeys(city);
	}
	
	public void selectState(String stateName) {
		downdropState.click();
		new Select(downdropState).selectByVisibleText(stateName);		
	}
	
	public void enterZipCode(String zipCode) {
		input_zipCode.sendKeys(zipCode);
	}
	
	public void selectCountry(String countryName) {
		downdropCountry.click();
		new Select(downdropCountry).selectByVisibleText(countryName);		
	}
	
	public void enterPhoneNumber(String phoneNumber) {
		input_phoneNumber.sendKeys(phoneNumber);
	}
	
	
	
	
	public void fillPersonalDetails() throws InterruptedException{
		
		enter_emailAddress("mail@mail.com");
		Thread.sleep(2000);
		enterFirstName("John");
		Thread.sleep(2000);
		enterLastName("Connor");
		Thread.sleep(2000);
		enterAddress1("123 Oak Street");
		Thread.sleep(2000);
		enterCity("Los Angeles");
		Thread.sleep(2000);
		selectState("California");
		Thread.sleep(2000);
		enterZipCode("90006");
		Thread.sleep(2000);
		selectCountry("United States");
		Thread.sleep(2000);
		enterPhoneNumber("1234567890");
		Thread.sleep(1000);
		
	}
	
	public void clickOnShippingMethod() {
		radioBestWay.click();
	}
	
	public void clickOnNextButton() {
		nextButton.click();
	}


}
