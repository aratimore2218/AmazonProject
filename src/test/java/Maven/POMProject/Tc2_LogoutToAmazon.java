package Maven.POMProject;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utility.BaseTest;
import utility.ListenersLogic;
import utility.RetryLogic;

@Listeners(ListenersLogic.class)
public class Tc2_LogoutToAmazon extends BaseTest{
	
	@Test(retryAnalyzer=RetryLogic.class)
	public void validcredandlogout() throws InterruptedException {
		
		Reporter.log("Website Launched");
		
		HomePage homepage= new HomePage(driver);
		
		homepage.hoveroveronAccountAndList(driver);
		Reporter.log("Hoverover on account and list successfully");
		homepage.clickonsignin(driver);
		Reporter.log("click on sign in button is successfully");
		
		LoginPage loginpage= new LoginPage(driver);
		
		loginpage.enterEmailId();
		Reporter.log("enter emailid successfully");
		loginpage.clickoncontinueButton();
		Reporter.log("click on continue button successfully");
		loginpage.enterpassword();
		Reporter.log("click on password successfully");
		loginpage.clickonSignin();
		Reporter.log("click on sign in successfully");
		
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		Reporter.log("Test Case is Pass");
		
		homepage.hoveroveronAccountAndList(driver);
		Reporter.log("Hoverover on account and list successfully");
		
		homepage.clickonsignout(driver);
		Reporter.log("click on signout successfully");
		

		Assert.assertEquals(loginpage.verifingLoginPage(), "Sign in or create account");

		Reporter.log("Test case 2 is pass");
	}

}
			