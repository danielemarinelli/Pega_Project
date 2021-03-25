package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginAction extends BasePage{
	
	@FindBy(xpath=".//input[@id='txtUserID']")
	private WebElement userNameField;
	
	@FindBy(xpath=".//input[@id='txtPassword']")
	private WebElement passwordField;
	
	@FindBy(xpath=".//button[@id='sub']")
	private WebElement btnLogIn;
	
	private WebDriver driver;
	
	public LoginAction(WebDriver driver)	{
		super(driver);
		this.driver = driver;
	}

	public void Perform_Login(String user, String pwd) {
		userNameField.sendKeys(user);
		passwordField.sendKeys(pwd);
		btnLogIn.click();
	}
	
}
