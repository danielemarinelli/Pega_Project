package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateProspect extends BasePage{
	
	@FindBy(xpath=".//div[@class='menu-panel-wrapper']//li[@data-test-id='201809180544410372323']/a")
	private WebElement btnCreaProspect;
//	.//span[text()='Prospect']/../..	
	@FindBy(xpath=".//i[@class='pi pi-plus']/..")
	private WebElement btnPlus;
	
	
	private WebDriver driver;
	
	public CreateProspect(WebDriver driver)	{
		super(driver);
		this.driver = driver;
	}
	
	public void create_prospect() {
		
		btnPlus.click();
		moveCursorToElement(driver, btnCreaProspect);
		btnCreaProspect.click();
	}

}
