package YaantracAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CirculerGeofence extends Vehicle {
	
	
	public void VehicleUpdate() throws InterruptedException {
		VehicleUpdate();
	}
	
	
	@Test(priority = 143, description = "Testcase for Geofence clicking")
	public void GeofenceDetails() throws InterruptedException{
		driver.findElement(By.xpath("//a[normalize-space(text())='Geofence']")).click();
		Thread.sleep(2000);
	}
	@Test(priority = 144,description = "Testcase for Add New Geofence")
	public void ClickAddNewGeofence() throws InterruptedException {
		driver.findElement(By.xpath("//button[normalize-space(text())='Add New Geofence']")).click();
		Thread.sleep(2000);
	}
	@Test(priority = 145,description = "Testcase for Enter Geofence Name")
	public void GeofenceName() throws InterruptedException {
		driver.findElement(By.name("geoZoneName")).sendKeys("TestGeofence");
		Thread.sleep(2000);
	}
	@Test(priority = 146,description = "Testcase for Enter geofence Location")
	public void GeofenceLocation() throws InterruptedException{
		WebElement SelectMaplocation=driver.findElement(By.xpath("//input[@class='google-search-autocomplete pac-target-input']"));

		SelectMaplocation.sendKeys("Tambaram");

		Actions SelectLocation=new Actions(driver);
		Thread.sleep(2000);
		SelectLocation.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		SelectLocation.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
	}
	@Test(priority = 147, description = "Testcase for Radius clear and enter new radius")
	public void GeofenceRadius() throws InterruptedException {
		WebElement ClearRadius=driver.findElement(By.xpath("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[2]"));
		ClearRadius.clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[2]")).sendKeys("0");
		Thread.sleep(2000);
	}
	@Test(priority = 148, description = "Testcase for Create new geofence")
	public void saveGeofence() throws InterruptedException {
		driver.findElement(By.xpath("//button[normalize-space(text())='Save']")).click();
		
		Thread.sleep(2000);
	}
	@Test(priority = 149, description = "Testcase for View created geofence")
	public void ViewGeofence() throws InterruptedException {
		
	driver.findElement(By.xpath("//p[normalize-space(text())='TESTGEOFENCE']")).click();
	Thread.sleep(2000);	
	driver.findElement(By.xpath("//span[@aria-label='Close']")).click();	
	Thread.sleep(2000);	
	}
	

}
