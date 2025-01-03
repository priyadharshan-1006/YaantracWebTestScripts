package YaantracAutomation;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class LiveTracking extends OverViewDashboard{

	public void GetOverview() throws InterruptedException {

		GetOverview();
	}
	@Test(priority = 23, description = "Testcase for navigate to live traking Page" )
	public void NavigateLivetrackingPage() throws InterruptedException {

		driver.findElement(By.xpath("//span[@aria-label='Live Tracking']")).click();
		Thread.sleep(2000);

	}
	@Test(priority = 24, description = "Testcase for Select Offline status to view offline vehicle")
	public void LivetrackingOffline() throws InterruptedException {

		driver.findElement(By.xpath("//input[@placeholder='Vehicle status']")).click();
		Thread.sleep(2000);
		Actions SelectStatusoffline=new Actions(driver);
		SelectStatusoffline.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		SelectStatusoffline.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

	}	

	@Test(priority = 25, description = "testcase for select idle status to view idle vehicle")
	public void LivetrackinIdle() throws InterruptedException {


		driver.findElement(By.xpath("//input[@placeholder='Vehicle status']")).click();
		Thread.sleep(2000);
		Actions SelectStatusidle=new Actions(driver);
		SelectStatusidle.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		SelectStatusidle.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
	}

	@Test(priority = 26, description = "Testcase for select moving ststus to view moving vehicle")
	public void LiveTrackingMoving() throws InterruptedException {

		driver.findElement(By.xpath("//input[@placeholder='Vehicle status']")).click();
		Thread.sleep(2000);
		Actions SelectStatusMoving=new Actions(driver);
		SelectStatusMoving.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		SelectStatusMoving.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
	}

	@Test(priority = 27, description = "Testcase for select parking status to view parked vehicle")
	public void LivetrackingParked() throws InterruptedException {

		driver.findElement(By.xpath("//input[@placeholder='Vehicle status']")).click();

		Thread.sleep(2000);
		Actions SelectStatusParked=new Actions(driver);
		SelectStatusParked.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		SelectStatusParked.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
	}

	@Test(priority = 28, description = "Testcase for view legents to view vehicle legents")
	public void LivetrackingLegents() throws InterruptedException {


		driver.findElement(By.xpath("(//p[text()='Legends']/following-sibling::div)[1]")).click();
		Thread.sleep(2000);

	}

	@Test(priority = 29, description = "Testcase for select vehicle filter to track each vehicle")
	public void SelectVehicleFilter() throws InterruptedException {
		driver.findElement(By.id("vehicles")).click();

		Thread.sleep(2000);
		Actions SelectVehicle=new Actions(driver);
		SelectVehicle.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		SelectVehicle.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
	}

	@Test(priority = 30, description = "Testcase for track trip on live")
	public void TrackTrip() throws InterruptedException {

		driver.findElement(By.xpath("//input[@placeholder='Trips']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Trips']")).click();
		Thread.sleep(2000);


	}

}
