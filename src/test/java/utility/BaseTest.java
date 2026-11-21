package utility;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends ListenersLogic { 
	
	@BeforeMethod
	public void launchBrowser() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void quitBrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
		System.out.println("quiting the browser");
		Thread.sleep(3000);
	}
}

