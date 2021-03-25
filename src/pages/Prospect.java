package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Prospect extends BasePage{
	
	@FindBy(xpath=".//div[@data-test-id='201801311259170443318']")
	private WebElement verticalSlider;

	@FindBy(xpath=".//span[text()='Lavorazione Prospect']")
	private WebElement tabProspect;
	
	@FindBy(xpath=".//h3[@id='headerlabel937']")
	private WebElement tabInVerifica;
	
	@FindBy(xpath="(.//table[@id='bodyTbl_right']/tbody)[3]")
	private WebElement webTable;
	
	@FindBy(xpath="(((.//table[@id='bodyTbl_right']/tbody)[3]//tr[@class='oddRow cellCont'])[1])//a[text()='Apri Prospect']")
	private WebElement firstBtnApriProspect;
	//prima riga dispari della tabella (((.//table[@id='bodyTbl_right']/tbody)[3]//tr[@class='oddRow cellCont'])[1])
	//prima riga pari della tabella (((.//table[@id='bodyTbl_right']/tbody)[3]//tr[@class='evenRow cellCont'])[1])
	
	private WebDriver driver;
	
	public Prospect(WebDriver driver)	{
		super(driver);
		this.driver = driver;
	}
	
	
	public void lavorazione_prospect() {
		moveCursorToElement(driver, verticalSlider);
		moveCursorToElement(driver, tabProspect);
		tabProspect.click();
		moveCursorToElement(driver, tabInVerifica);
		tabInVerifica.click();
		firstBtnApriProspect.click();
	}
	
	
	
	
	public void WebTable_Prospect() {   //TABELLA
		//WebElement webTable = driver.findElement(By.xpath(".//table[@id='product']/tbody")); // WebTable
		List<WebElement> rows = webTable.findElements(By.xpath("tr"));   // Rows
		
		for(int i=0;i<rows.size();i++) {
			List<WebElement> rowChild = null;
				if(i==0) {
					rowChild=rows.get(0).findElements(By.xpath("(.//tr[@class='cellCont'])[3]/th"));
				}else if (i%2==0){
					rowChild=rows.get(i).findElements(By.xpath("(.//table[@id='bodyTbl_right']/tbody)[3]//tr[@class='evenRow cellCont']"));
				} else if (i%2!=0){
					rowChild=rows.get(i).findElements(By.xpath("(.//table[@id='bodyTbl_right']/tbody)[3]//tr[@class='oddRow cellCont']"));
				} else 
				
					for(int j=0;j<rowChild.size();j++) {
					System.out.print(rowChild.get(j).getText()+" | ");
					}
				System.out.println();
			}
	}
}
