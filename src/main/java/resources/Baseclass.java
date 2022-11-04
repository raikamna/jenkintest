package resources;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	
	//public String url="https://www.trivago.in";
	public String url="https://www.goibibo.com";
	public WebDriver driver;
	
	@BeforeClass
	public void setUp() 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver.exe");
		//System.setProperty("webdriver.edge.driver", "E:\\Automation\\msedgedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	@AfterClass
	public void down() throws Exception
	{		
		Thread.sleep(50);
		//driver.quit();
	}

}
