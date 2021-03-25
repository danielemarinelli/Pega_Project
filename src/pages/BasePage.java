package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	
	public BasePage(WebDriver driver)	{
		PageFactory.initElements(driver, this);	
	}
	
	public void moveCursorToElement(WebDriver driver, WebElement element)	{
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();	
	}

}
