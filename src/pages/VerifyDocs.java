package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerifyDocs extends BasePage{

	@FindBy(xpath=".//h2[text()='Contatti']")
	private WebElement btnContatti;
	
	@FindBy(xpath=".//a[text()='Gestisci Contatto']")
	private WebElement btnGestisciContatto;
	
	@FindBy(xpath=".//button[@id='ModalButtonSubmit']")
	private WebElement btnConfermaFirmatario;
	
	
	private WebDriver driver;
	
	public VerifyDocs(WebDriver driver)	{
		super(driver);
		this.driver = driver;
	}
	
	public void Contact_and_Documentations() {
		btnContatti.click();
		btnGestisciContatto.click();
		btnConfermaFirmatario.click();
	}
}
