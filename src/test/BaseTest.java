package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import core.DriverFactory;

public class BaseTest extends DriverFactory {
	
	private WebDriver driver;
	private DriverFactory df = null;
	
	@Parameters("browser")
	@BeforeClass
	public void initDriver(String browser) {
		driver = new DriverFactory().getDriver(browser);	
	}

	public WebDriver getDriver() {
		return driver;
	}
	
	@BeforeClass
	public void launchApp() {
		driver.get("https://teital-oss-stg1.pegacloud.net/prweb");
	}
	
	
	@AfterClass
	public void tearDown() {
		df = new DriverFactory();
		df.quitDriver();
	}

}
