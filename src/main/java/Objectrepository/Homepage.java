package Objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Baseclass;

public class Homepage extends Baseclass {
	
	WebDriver driver;
	
	public Homepage(WebDriver hdriver)
	{

		driver = hdriver;
		PageFactory.initElements(hdriver, this);
	}
	
	//@FindBy(xpath="//a[@class='nav-link active']")
	//WebElement hotelsbtn;
	
	By Hotelsbtn= By.xpath("//div[@class='sc-xayxd-0 kOmJSj']//li[2]//a[1]");
	
	public WebElement clickOnHotels() {
		
		return driver.findElement(Hotelsbtn);
	}
	
	
}
