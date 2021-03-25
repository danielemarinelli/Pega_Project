package test;

import org.testng.annotations.Test;

import pages.CreateProspect;
import pages.LoginAction;
import pages.Prospect;

public class PegaTest extends BaseTest{
	
	LoginAction login = null;
	CreateProspect createUser = null;
	Prospect prospect = null;
	
	@Test(priority=1)
	public void Perform_Pega_Login() {
		login = new LoginAction(getDriver());
		login.Perform_Login("Backoffice@nttdata.com", "rules789!");
	}
	
	@Test(priority=2)
	public void create_prospect() {
		createUser = new CreateProspect(getDriver());
		createUser.create_prospect();
	}
	
//	@Test(priority=2)
//	public void Perform_Prospect() {
//		prospect = new Prospect(getDriver());
//		prospect.lavorazione_prospect();
//	}
	
	

}
