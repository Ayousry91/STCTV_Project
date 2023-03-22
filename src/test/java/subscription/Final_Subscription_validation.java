package subscription;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Subscription_page;
public class Final_Subscription_validation {
	Subscription_page subscription_page;
	public static WebDriver driver ;
	@BeforeTest
	public void openURL()
	{
		System.setProperty("webdriver.chrome.driver"
				, System.getProperty("user.dir")+"\\Sources\\chromedriver.exe");
		driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.navigate().to("https://subscribe.stctv.com/sa-en?");
		///	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	@Test (priority=1)
	public void Validate_KSA() {
		subscription_page = new Subscription_page(driver);
		// Validate Country is displayed Correctly
		Assert.assertEquals(subscription_page.Country_name(),"KSA");
		//Validate Prices are displayed correctly
		Assert.assertEquals("15", subscription_page.Lite_price());
		Assert.assertEquals("25", subscription_page.Classic_price());
		Assert.assertEquals("60", subscription_page.Premium_price());
		//Validate Currency is displayed correctly
		Assert.assertEquals("SAR/month", subscription_page.currency_unit());
	}
	@AfterMethod
	public void Validate_package_name() {
		//Validate Packages names are displayed correctly for every country
		Assert.assertEquals("LITE", subscription_page.Lite_package());
		Assert.assertEquals("CLASSIC", subscription_page.Classic_package());
		Assert.assertEquals("PREMIUM", subscription_page.Premium_package());
	}
	@Test (priority=2)
	public void Validate_Bahrain() {
		Subscription_page.Country_name_click();
		Subscription_page.Bahrain_country();
		// Validate Country is displayed Correctly
		Assert.assertEquals(subscription_page.Country_name(),"Bahrain");
		//Validate Prices are displayed correctly
		Assert.assertEquals("2", subscription_page.Lite_price());
		Assert.assertEquals("3", subscription_page.Classic_price());
		Assert.assertEquals("6", subscription_page.Premium_price());		
		//Validate Currency is displayed correctly
		Assert.assertEquals("BHD/month", subscription_page.currency_unit());
	}
	@Test (priority=3)
	public void Validate_Kuwait() {
		Subscription_page.Country_name_click();
		Subscription_page.Kuwait_country();
		// Validate Country is displayed Correctly
		Assert.assertEquals(subscription_page.Country_name(),"Kuwait");
		//Validate Prices are displayed correctly
		Assert.assertEquals("1.2", subscription_page.Lite_price());
		Assert.assertEquals("2.5", subscription_page.Classic_price());
		Assert.assertEquals("4.8", subscription_page.Premium_price());		
		//Validate Currency is displayed correctly
		Assert.assertEquals("KWD/month", subscription_page.currency_unit());
	}
	@AfterTest
	public void closeDriver() {
		driver.quit();	 
	}



}
