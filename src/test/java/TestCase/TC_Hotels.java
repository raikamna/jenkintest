package TestCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Objectrepository.Homepage;
import Objectrepository.Hotels;
import resources.Baseclass;

public class TC_Hotels extends Baseclass {
	
	@Test
	public void verifyandCompareHotels() throws InterruptedException {
		
			driver.get(url);
			Homepage hp=new Homepage(driver);
			Thread.sleep(2000);
			hp.clickOnHotels().click();
			Hotels h=new Hotels(driver);
			Thread.sleep(2000);
			h.searchLocation();
			Thread.sleep(2000);
			h.setSearchloc();
			Thread.sleep(3000);
			h.clickOnDate();
			Thread.sleep(2000);
			h.clickOnRooms();
			Thread.sleep(2000);
			h.clickonRoomsDoneBtn();
			Thread.sleep(2000);
			h.clickOnSearchButton();
			
	}
	

}
