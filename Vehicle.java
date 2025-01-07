package YaantracAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Vehicle extends Driver {
	
	//Vehicle
	@Test(priority = 153, description = "The testcase for clicking the Vehicle Configuration")
	public void ClickVehicle() throws InterruptedException {
	WebElement vehicle = driver.findElement(By.xpath(" //*[normalize-space(text())='Vehicle']"));
	vehicle.click();
	Thread.sleep(2000);
	}
	//VehicleSearch
	@Test(priority = 154, description = "The testcase for Searching the vehicle")
	public void SearchVehicle() throws InterruptedException {
	WebElement VehicleSearch = driver.findElement(By.xpath("//*[@name='search']"));
	VehicleSearch.sendKeys("TN02BF1373");
	Thread.sleep(3000);
	}
	//ToClickVehicleWidget
	@Test(priority = 155, description = "The testcase for clicking the vehicle")
	public void ClickVehiclewidget() throws InterruptedException {
	WebElement Vehiclewidget = driver.findElement(By.xpath("//div[@class='vehicle-card MuiBox-root css-0']"));
	Vehiclewidget.click();
	Thread.sleep(2000);
	}
	//ToUpdateVehicleDetails
	@Test(priority = 156, description = "The testcase for vehicle update")
	public void VehicleUpdate() throws InterruptedException {
	WebElement UpdateVehicle = driver.findElement(By.xpath(" //*[normalize-space(text())='Update']"));
	UpdateVehicle.click();
	Thread.sleep(2000);
	WebElement FreeWay = driver.findElement(By.xpath("//input[@name='freeWay']"));
	
//	FreeWay.clear();
	for (int i = 0; i < 5; i++) {
		FreeWay.sendKeys(Keys.BACK_SPACE);
	}		
	Thread.sleep(2000);
	FreeWay.sendKeys("110");
	Thread.sleep(2000);
	WebElement NonFreeWay = driver.findElement(By.xpath("//input[@name='nonFreeWay']"));
	
	for (int i = 0; i < 5; i++) {
		NonFreeWay.sendKeys(Keys.BACK_SPACE);
	}	
	Thread.sleep(2000);
	NonFreeWay.sendKeys("85");
	Thread.sleep(2000);
	WebElement ToUpdate = driver.findElement(By.xpath("( //*[normalize-space(text())='Update'])[2]"));
	ToUpdate.click();
	}
	



}

