package Maven.POMProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//step1
	
	WebDriver driver;
	@FindBy(id="ap_email_login")
	WebElement emailid;
	
	@FindBy(id="continue")
	WebElement continuebutton;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement signInSubmit;
	
	@FindBy(xpath="//div[@id='claim-collection-container']/h1")
	WebElement Signinorcreateaccount;
	
	//step 2
	public void enterEmailId()
	{
	emailid.sendKeys("8855913018");
	
	}
	public void clickoncontinueButton()
	{
		continuebutton.click();
	}
	
	public void enterpassword() throws InterruptedException
	{
		Thread.sleep(3000);
	password.sendKeys("Arati@1234");
	
	}
	
	public void clickonSignin()
	{
		signInSubmit.click();
	}
	
	//step 3
	
	public LoginPage(WebDriver driver)        //Constructor
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifingLoginPage()
	{
		String title= Signinorcreateaccount.getText();
		return title;
	}

}
