package Maven.POMProject;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utility.BaseTest;
import utility.ListenersLogic;
import utility.RetryLogic;

@Listeners(ListenersLogic.class)
public class Tc1_LoginToAmazon extends BaseTest{
	
	@Test(retryAnalyzer=RetryLogic.class)
	public void validcred() throws InterruptedException {
		
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
		
		Thread.sleep(3000);
	}

}
