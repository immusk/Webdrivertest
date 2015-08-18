package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Jenkins {

	public WebDriver driver;

	@Test
	public void openGoogle() {

		driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		Assert.assertEquals(driver.getTitle(), "Google", "Expected page is not opened");
		driver.quit();
	}
	
	@Test
	public void doGoogleSearch() {

		driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Assert.assertEquals(driver.getTitle(), "Google", "Expected page is not opened");
		driver.quit();
	}
	
	@Test
	public void doYahooSearch() {

		driver = new FirefoxDriver();
		driver.get("https://www.yahoo.com/");
		driver.findElement(By.id("UHSearchBox")).sendKeys("Selenium");
		Assert.assertEquals(driver.getTitle(), "Yahoo", "Expected page is not opened");
		driver.quit();
	}
}
