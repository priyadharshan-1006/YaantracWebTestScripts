package YaantracAutomation;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class YaaanTrips extends HistoricalTracking{

	public void SelectNormalMap() throws InterruptedException {

		SelectNormalMap();
	}
	// Trip
	@Test(priority = 46, description = "Test case for move trips page ")
	public void MoveTripPage() throws InterruptedException {
		WebElement Trip = driver.findElement(By.xpath("//*[@aria-label='Trips']"));
		Trip.click();
		Thread.sleep(2000);
	}

	//View  Trps.
	@Test(priority = 47, description = "Testcase for View trip type per Page ")
	public void ViewTripsType() throws InterruptedException {
		driver.findElement(By.xpath("//button[normalize-space(text())='Scheduled']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space(text())='Completed']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space(text())='Scheduled']")).click();
		Thread.sleep(2000);
	}

	//AddNewTripbutton
	@Test(priority = 48, description = "Testcase for Click Add New Trip Button")
	public void ClickAddNewTrips() throws InterruptedException {
		WebElement AddNewTripbutton = driver.findElement(By.xpath(" //*[normalize-space(text())='Add New Trip']"));
		AddNewTripbutton.click();
		Thread.sleep(2000);

	}

	//Select Vehicle
	@Test(priority = 49, description = "Testcase for Select Vehicle for a trip")
	public void SelectTripVehicle() throws InterruptedException {
		WebElement SelectVehicle = driver.findElement(By.xpath("(//*[@data-testid='KeyboardArrowDownIcon'])[1]"));
		SelectVehicle.click();
		Actions VehicleNumber = new Actions(driver);
		VehicleNumber.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		VehicleNumber.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
	}

	//Source
	@Test(priority = 50, description = "Testcase for Select Source for a trip")
	public void SelectTripSource() throws InterruptedException {
		WebElement Source = driver.findElement(By.xpath("//input[@id='search-source']"));
		Source.sendKeys("Chennai");
		Thread.sleep(2000);
		Actions SourceDropDown  = new Actions(driver);
		SourceDropDown.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		SourceDropDown.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
	}

	//Destination
	@Test(priority = 51, description = "Testcase for Select Destination for a trip")
	public void SelectTripDestination() throws InterruptedException {
		WebElement Destination = driver.findElement(By.xpath("//input[@id='search-destination']"));
		Destination.sendKeys("Madurai");
		Thread.sleep(2000);
		Actions DestinationDropDown  = new Actions(driver);
		DestinationDropDown.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		DestinationDropDown.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
	}

	//AddWaypoint
	@Test(priority = 52, description = "Testcase for Select Way Points for a trip")
	public void AddWayPoints() throws InterruptedException {
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
	}

	//Preview

	@Test(priority = 53, description = "Testcase for View Preview for a trip")
	public void TripsPreview() throws InterruptedException {
		WebElement Preview = driver.findElement(By.xpath("//*[normalize-space(text())='Preview']"));
		Preview.click();
		Thread.sleep(4000);
		//StartDate
		WebElement StartDate = driver.findElement(By.xpath("(//*[@placeholder='DD/MM/YYYY HH:MM'])[1]"));
		StartDate.click();
		Thread.sleep(2000);
		StartDate.sendKeys("101220250800am");
		Thread.sleep(2000);
	}

	//Select Driver

	@Test(priority = 54, description = "Testcase for Select Driver for a trip")
	public void SelectDriver() throws InterruptedException {
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
	}

	//Submit Add New Driver form
	@Test(priority = 55, description = "Testcase for click Add new trip button")
	public void ClickAddNewTrip() throws InterruptedException {
		WebElement AddNewTrip = driver.findElement(By.xpath("(//*[normalize-space(text())='Add New Trip'])[3]"));
		AddNewTrip.click();
		Thread.sleep(2000);
	}


	// trips Menu
	@Test(priority = 56, description = "Testcase for click trip Menu button")
	public void ClickTripMenu() throws InterruptedException {
		WebElement TripMenu=driver.findElement(By.xpath("(//button[@aria-label='Menu'])[1]"));
		Actions ClickMenu=new Actions(driver);
		ClickMenu.moveToElement(TripMenu).click().perform();
		Thread.sleep(2000);
	}

	//View Trips
	@Test(priority = 57, description = "Testcase for click view Trips button")
	public void ClickView() throws InterruptedException {
		WebElement ClickViewButton=driver.findElement(By.xpath("(//*[text()='View'])[1]"));
		Actions ClickView=new Actions(driver);
		ClickView.moveToElement(ClickViewButton).click().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@aria-label='Close']//button[1]")).click();
		Thread.sleep(2000);
	}

	// Update Trip.
	@Test(priority = 58, description = "Testcase for click Update Trips button")
	public void UpdateTrip() throws InterruptedException {
		WebElement TripMenuButton=driver.findElement(By.xpath("(//button[@aria-label='Menu'])[1]"));
		Actions ClickMenuButton=new Actions(driver);
		ClickMenuButton.moveToElement(TripMenuButton).click().perform();
		Thread.sleep(2000);

		WebElement ClickUpdatetrips =driver.findElement(By.xpath("(//*[text()='Update'])[1]"));
		Actions ClickUpdate=new Actions(driver);
		ClickUpdate.moveToElement(ClickUpdatetrips).click().perform();
		Thread.sleep(2000);

		WebElement ClearVehicleNumber=driver.findElement(By.id("vehicleNumber"));
		Actions RemovevehicleNumber=new Actions(driver);
		RemovevehicleNumber.moveToElement(ClearVehicleNumber).click().perform();
		Thread.sleep(2000);
		Thread.sleep(2000);

		driver.findElement(By.id("vehicleNumber")).sendKeys("TN02BF1373");
		Thread.sleep(2000);

		Actions UpdateVehicle=new Actions(driver);			
		UpdateVehicle.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		UpdateVehicle.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[normalize-space(text())='Update Trip']")).click();
		Thread.sleep(2000);
	}

	//Delete trips
	@Test(priority = 59, description = "Testcase for click Delete Trips button")
	public void DeleteTrip() throws InterruptedException {

		WebElement TripMenuButtonDelete=driver.findElement(By.xpath("(//button[@aria-label='Menu'])[1]"));
		Actions ClickMenuButtonDelete=new Actions(driver);
		ClickMenuButtonDelete.moveToElement(TripMenuButtonDelete).click().perform();
		Thread.sleep(2000);

		WebElement DeleteTrips =driver.findElement(By.xpath("(//*[text()='Delete'])[1]"));
		Actions DeleteupdatedTrip=new Actions(driver);
		DeleteupdatedTrip.moveToElement(DeleteTrips).click().perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[normalize-space(text())='Yes']")).click();


	}

}
