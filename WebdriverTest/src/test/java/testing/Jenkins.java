package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Jenkins {

	public WebDriver driver;
	@Test
	public void verifyLogin(){
		
		driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/webhp?sourceid=chrome-instant&ion=1&espv=2&ie=UTF-8#q=birthday%20wishes");
		
		String title = "birthday wishes - Google Search";
		Assert.assertEquals(driver.getTitle(),title, "Expected page is not opened");
		driver.close();//this is used to close the driver
	}
}
