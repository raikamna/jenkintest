package Objectrepository;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import resources.Baseclass;

public class Hotels extends Baseclass {
	

	WebDriver driver;
	
	public Hotels(WebDriver rdriver)
	{

		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@id='downshift-1-input']")
	WebElement searchloc;
	
	@FindBy(xpath="//li[@id='downshift-1-item-0']")
	WebElement setsearchloc;
	
	@FindBy(css="div[data-testid='openCheckinCalendar']")
	WebElement datebtn;
	
	@FindBy(xpath="//input[@value='2 Adults | 0 Child | 1 Room ']")
	WebElement selectroom;
	
	@FindBy(xpath="//button[@aria-label='button-pax-home']")
	WebElement roomdonebtn;
	
	@FindBy(xpath="//button[@class='dwebCommonstyles__ButtonBase-sc-112ty3f-12 SearchBlockUIstyles__SearchButtonAutoSuggest-sc-fity7j-14 QWIoF kWwdSv']")
	WebElement searchbtn;

	
	public void searchLocation() {
		
		searchloc.sendKeys("Delhi");
		
	}
	
	public void setSearchloc() {
		
		setsearchloc.click();
	}
	
	public void clickOnDate() throws InterruptedException {
		
		datebtn.click();
		
		//driver.findElement(By.cssSelector("div[data-testid='openCheckinCalendar']")).click();
        	
		Calendar c1 = Calendar.getInstance();
		c1.add(Calendar.DATE, 5);
		Date resultDate = c1.getTime();
		String dateres=resultDate.toString();
		String datesplit[] = dateres.split(" ");
		String month= datesplit[1];
		String futuredate = datesplit[2];
		String time = datesplit[3];
		System.out.println("Futuredate:"+futuredate);
		
		c1.add(Calendar.DATE, 8);
		Date Second_date = c1.getTime();
		String sdate=Second_date.toString();
		String datesplit1[] = sdate.split(" ");
		String month1= datesplit1[1];
		String sdate1 = datesplit1[2];
		String time1 = datesplit1[3];
		System.out.println("Seconddate:"+sdate1);
		
		boolean stateElement=true;
		
		try {
		List<WebElement> datelist = driver.findElements(By.cssSelector("li[class='date_is_selectable_true']"));
		
		stateElement = false;
		
		for(int i=1;i<datelist.size();i++) {
			
			String date1=datelist.get(i).getText();
			//System.out.println(date1);
			
			List arrlist=Arrays.asList(date1);
			
			if(arrlist.contains(futuredate)) {
			
				driver.findElements(By.cssSelector("li[class='date_is_selectable_true']")).get(i).click();
			}
			
			else if(arrlist.contains(sdate1)) {
				
				Thread.sleep(2000);
				driver.findElements(By.cssSelector("li[class='date_is_selectable_true']")).get(i).click();
			}
		} 
		
	}catch(StaleElementReferenceException e) {
		stateElement = true;
	}
		
}
	
	public void clickOnRooms() {
		
		selectroom.click();
	}
	
	public void clickonRoomsDoneBtn() {
		
		roomdonebtn.click();
	}
	
	public void clickOnSearchButton() {
		
		searchbtn.click();
	}
	
	public void getHotelList() throws InterruptedException {
		

		}

	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*try {
		List<WebElement> hotellist= driver.findElements(By.cssSelector("button[data-testid='item-name']"));
		
		int hotel_count = hotellist.size();
	    System.out.println(hotel_count);
	    
	    for(int i=0; i<hotellist.size();i++) {
         	
         	Thread.sleep(2000);
         	String hoteldet= hotellist.get(1).getText();
         	System.out.println(hoteldet);
         	break;
         	}
		}catch(Exception e)	{
			
			System.out.println("Null pointer exception");
		}*/
		
		/*List<WebElement> allDates=driver.findElements(By.cssSelector("td[class='p-0']"));
		
		// now we will iterate all values and will capture the text. We will select when date is 28
				for(WebElement ele:allDates)
				{
					
					String date=ele.getText();
					
		              // once date is 28 then click and break
					if(date.equalsIgnoreCase("20"))
					{
						ele.click();
						break;
					}
					
				}*/
		

