package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Subscription_page  {

	
	public Subscription_page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[@id=\"country-name\"]")
	WebElement countryname ;
	
	@FindBy(id="name-lite")
	WebElement lite_package ;
	
	@FindBy(id="name-classic")
	WebElement classic_package ;
	
	@FindBy(id="name-premium")
	WebElement premium_package ;
	
	@FindBy(xpath="//*[@id=\"currency-lite\"]/b")
	WebElement lite_price ;
	
	@FindBy(xpath="//*[@id=\"currency-classic\"]/b")
	WebElement classic_price ;
	
	@FindBy(xpath="//*[@id=\"currency-premium\"]/b")
	WebElement premium_price ;
	
	@FindBy(xpath="//*[@id=\"currency-lite\"]/i")
	WebElement Currency;
	
	
	
	
	public String Country_name() {
		return countryname.getText();
	}
	
	public String Lite_package() {
		return lite_package.getText();
	}
	
	public String Classic_package() {
		return classic_package.getText();
	}
	
	public String Premium_package() {
		return premium_package.getText();
	}
	
	public String Lite_price() {
		return lite_price.getText();
	}
	
	public String Classic_price() {
		return classic_price.getText();
	}
	
	public String Premium_price() {
		return premium_price.getText();
	}
	
	public String currency_unit() {
		return Currency.getText();
	}
	
	
	
}
