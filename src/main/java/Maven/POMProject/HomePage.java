package Maven.POMProject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	//step 1
	
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	private WebElement accountandList;
	
	@FindBy(xpath="//a[@class='nav-action-signin-button']")
	private WebElement signin;
	
	@FindBy(xpath="//span[text()='Sign Out']")
	private WebElement signout;
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchtextbox;
	
	//step 2
	public void hoveroveronAccountAndList(WebDriver driver)
	{
		Actions a1= new Actions(driver); //creating method inside method
		a1.moveToElement(accountandList).perform();
	}
	public void clickonsignin(WebDriver driver)
	{
		signin.click();
	}
	
	public void clickonsignout(WebDriver driver)
	{
		signout.click();
	}
	
	public void searchProduct() throws InterruptedException
	{
		Thread.sleep(3000);
		searchtextbox.sendKeys("shoes"+Keys.ENTER);
	}
	
	//step 3
	public HomePage(WebDriver driver)        //Constructor
	{
		PageFactory.initElements(driver, this);
	}
	

}
