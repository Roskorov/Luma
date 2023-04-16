package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;

import dataProviders.ConfigFileReader;

public class HomePage {
	
	WebDriver driver;
	
	ConfigFileReader configFileReader;

	
	//Constructor
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		configFileReader = new ConfigFileReader();
		
	}
	
	
	
	//PageFactory
	@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Women')]")
	private WebElement tab_Women;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Bottoms')]")
	private WebElement tab_Women_Bottoms;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Pants')]")
	private WebElement tab_Women_Bottoms_Pants;	
	
	
	//Actions
		
	//GetHome
	public void navigateTo_Home() {
		
		driver.get(configFileReader.getApplicationUrl());		
	}
		
	public void moveTabWomen() throws InterruptedException{
		
		new Actions(driver).moveToElement(tab_Women).build().perform();
		Thread.sleep(1000);
		new Actions(driver).moveToElement(tab_Women_Bottoms).build().perform();
		Thread.sleep(1000);
		new Actions(driver).moveToElement(tab_Women_Bottoms_Pants).build().perform();
		Thread.sleep(1000);
		tab_Women_Bottoms_Pants.click();
	}
	

}
