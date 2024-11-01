package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;

public class TC001_AccountRegistractionTest extends BaseClass {

	
@Test public	void varify_account_registration() {
	
	HomePage hp = new HomePage(driver);
	
	hp.clickMyaccount();
	hp.clickRegistar();
	
	AccountRegistrationPage ap = new AccountRegistrationPage(driver);
	ap.setFirstName(randomeString().toUpperCase());
	ap.setLastName(randomeString().toLowerCase());
	//ap.setEmail("avinashdev210@gmail.com");
	ap.setEmail(randomeString()+"@gmail.com");

	ap.setTelephone(randomeNumber());
    
	//String password = randomAlphaNumeric();
	
	String password = randomeAlphaNumeric(); // we are storing the password here so that same password should pass in the password field
	
	ap.setPassword(password);
	ap.setConfirmPassword(password);
	
	ap.setPrivacyPolicy();
	ap.ClickContinue();

	String confmsg = ap.getConfirmationMsg();
	
	Assert.assertEquals(confmsg, "your account has been created!");
}
	
}
