package Yaantrac;

import java.sql.Driver;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AddNewTrip {

	public static void main(String[] args) throws InterruptedException {

		// Notification Handle
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 1);
		options.setExperimentalOption("prefs", prefs);

		// To launch Browers

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://dev-yaan.yaantrac.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();

		// login
		driver.findElement(By.xpath("//button[normalize-space(text())='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("demo");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Demo@12345!");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space(text())='Login']")).click();
		Thread.sleep(2000);

		// Trip
		WebElement Trip = driver.findElement(By.xpath("//*[@aria-label='Trips']"));
		Trip.click();
		Thread.sleep(2000);
        
        //AddNewTripbutton
        WebElement AddNewTripbutton = driver.findElement(By.xpath(" //*[normalize-space(text())='Add New Trip']"));
        AddNewTripbutton.click();
        Thread.sleep(2000);
        
        
        //Select Vehicle
        WebElement SelectVehicle = driver.findElement(By.xpath("(//*[@data-testid='KeyboardArrowDownIcon'])[1]"));
        SelectVehicle.click();
    	Actions VehicleNumber = new Actions(driver);
    	VehicleNumber.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		VehicleNumber.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		//Source
		WebElement Source = driver.findElement(By.xpath("//input[@id='search-source']"));
		Source.sendKeys("Chennai");
		Thread.sleep(2000);
	 	Actions SourceDropDown  = new Actions(driver);
	 	SourceDropDown.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		SourceDropDown.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
				
		//Destination
		WebElement Destination = driver.findElement(By.xpath("//input[@id='search-destination']"));
		Destination.sendKeys("Madurai");
		Thread.sleep(2000);
	  	Actions DestinationDropDown  = new Actions(driver);
	  	DestinationDropDown.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		DestinationDropDown.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		
		//AddWaypoint
		WebElement AddWaypoint = driver.findElement(By.xpath("//*[normalize-space(text())='Add Waypoint']"));
		AddWaypoint.click();
		Thread.sleep(2000);
		WebElement Waypoint1 = driver.findElement(By.xpath("//*[@id='waypoint1']"));
		Waypoint1.click();
		Thread.sleep(2000);
		Waypoint1.sendKeys("Tiruchirappalli");
		Thread.sleep(2000);
		Actions AddWaypointDropDown  = new Actions(driver);
		AddWaypointDropDown.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		AddWaypointDropDown.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		//Preview
		WebElement Preview = driver.findElement(By.xpath("//*[normalize-space(text())='Preview']"));
		Preview.click();
		Thread.sleep(4000);
		//StartDate
		WebElement StartDate = driver.findElement(By.xpath("(//*[@placeholder='DD/MM/YYYY HH:MM'])[1]"));
		StartDate.click();
		Thread.sleep(2000);
		StartDate.sendKeys("101220250800am");
		Thread.sleep(2000);
		//
		WebElement SelectDriver = driver.findElement(By.xpath("//*[@id='driverId']"));
		SelectDriver.click();
		Thread.sleep(2000);
		Actions Driver = new Actions(driver);
		for (int i = 0; i < 2; i++) {
			Driver.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(2000);
		Driver.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		WebElement AddNewTrip = driver.findElement(By.xpath("(//*[normalize-space(text())='Add New Trip'])[3]"));
		AddNewTrip.click();
		
		
		
		
//		WebElement StartDate = driver.findElement(By.xpath("(//*[@aria-label='Choose date'])[1]"));
//		StartDate.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium MuiPickersCalendarHeader-switchViewIcon css-sldnni']")).click();
//		Thread.sleep(2000);
//	    driver.findElement(By.xpath("//*[normalize-space(text())='2025']")).click();
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("//*[normalize-space(text())='12']")).click();
	    
		
      

		 
		
	}

}
