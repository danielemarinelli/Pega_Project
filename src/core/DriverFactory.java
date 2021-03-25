package core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class DriverFactory {
	
	private WebDriver driver = null;
	
	public WebDriver getDriver(String browser) {
	
		switch(browser.toLowerCase()) {
		case "chrome"  :
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\marinellid\\Desktop\\WizdomQA\\chromedriver.exe");
			driver = new ChromeDriver(); break;
			
		case "firefox" : 
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\marinellid\\Desktop\\WizdomQA\\geckodriver.exe");
			driver = new FirefoxDriver(); break;	
		
		case "opera" : 
			System.setProperty("webdriver.opera.driver", "C:\\Users\\marinellid\\Desktop\\WizdomQA\\operadriver.exe");
			driver = new OperaDriver(); break;
			
		case "ie" : 
				System.setProperty("webdriver.ie.driver", "C:\\Users\\marinellid\\Desktop\\WizdomQA\\IEDriverServer.exe");
				driver = new InternetExplorerDriver(); break;
		default : System.out.println("Incorrect browser name provided");	
			
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		}
		return driver;
		
	}
	
	public void quitDriver() {
		if(driver!=null) {
			driver.close();
		}		
	}
}
