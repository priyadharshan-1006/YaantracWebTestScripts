package YaantracAutomation;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class OverViewDashboard extends Livedashboard{

	
	public void GetLiveforVehcleMake(int counter) throws InterruptedException {
	  
	    GetLiveforVehcleMake(); 
	}
	
	@Test(priority = 14, description = "Testcase for Go on the overview dashboard")
	public void OverviewDashboardTestcases() throws InterruptedException {

		driver.findElement(By.xpath("//button[normalize-space(text())='Overview Dashboard']")).click();
		Thread.sleep(2000);
	}

	@Test(priority = 15, description = "Testcase for OverviewDasboard Scrollup and Scroll Down")
	public void OverviewDashboardScrollUpDown() throws InterruptedException{
		WebElement ScrollOverviewDashboardPage = driver.findElement(By.xpath("//*[normalize-space(text())='Vehicles Utilization']")); 
		Thread.sleep(2000); 
		JavascriptExecutor overviewDashboardScroll = (JavascriptExecutor) driver; 
		Thread.sleep(2000); 
		overviewDashboardScroll.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", ScrollOverviewDashboardPage); 
		Thread.sleep(2000); 

		WebElement ScrollUpOverviewDashboardPage = driver.findElement(By.xpath("//input[@value='All Vehicles']")); 
		Thread.sleep(2000); 
		JavascriptExecutor OverviewDashboardScrollUp = (JavascriptExecutor) driver; 
		Thread.sleep(2000); 
		OverviewDashboardScrollUp.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", ScrollUpOverviewDashboardPage); 
		Thread.sleep(2000); 
	}
	@Test(priority = 16, description = "Testcase for Filter with Vehicle number")
	public void SelectVehileNumber() throws InterruptedException {

		driver.findElement(By.xpath("//input[@value='All Vehicles']")).click();
		Actions filtervehicle=new Actions(driver);
		Thread.sleep(2000);
		filtervehicle.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		filtervehicle.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

	}

	@Test(priority = 17, description = "Testcase for Click Vehicle number")
	public void ClickVhicleNumber() throws InterruptedException {
		driver.findElement(By.xpath("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[2]")).click();

		Actions VehicleSelect=new Actions(driver);
		Thread.sleep(2000);
		VehicleSelect.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		VehicleSelect.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		Actions clickanywhere1=new Actions(driver);
		clickanywhere1.moveByOffset(100, 100).click().perform();
	}
	@Test(priority = 18, description = "Testcase for Select Date Range for filter data with Vehicle number")
	public void SelectDateRange() throws InterruptedException {

		driver.findElement(By.id("select-startdate")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='DD/MM/YYYY hh:mm aa']")).click();
		Thread.sleep(2000);

		WebElement DateChoose=driver.findElement(By.xpath("(//button[@aria-label='Choose date'])[1]"));
		Actions ChooseDate=new Actions(driver);
		Thread.sleep(2000);
		ChooseDate.moveToElement(DateChoose).click().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space(text())='Last 30 days']")).click();
		Thread.sleep(2000);
	}

	@Test(priority = 19, description = "Testcase for Get oveview data with Vehicle number")
	public void GetOverviewData() throws InterruptedException {

		driver.findElement(By.xpath("//button[normalize-space(text())='Get Overview']")).click();
		Thread.sleep(2000);
	}

	@Test(priority = 20, description = "Testcase for filter data with Vehicle make")
	public void OverViewVehicleMake() throws InterruptedException {

		driver.findElement(By.xpath("//input[@value='Vehicle Number']")).click();

		Actions filterVehicle=new Actions(driver);
		Thread.sleep(2000);
		filterVehicle.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		filterVehicle.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Select Make']")).click();
		Thread.sleep(2000);
		filterVehicle.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		filterVehicle.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Select Model']")).click();
		Thread.sleep(2000);
		filterVehicle.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		filterVehicle.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
	}
	@Test(priority = 21, description = "Testcase for Select Vehicle Date range")
	public void OverViewSelectDateRange() throws InterruptedException {

		driver.findElement(By.xpath("(//input[@inputmode='text'])[1]")).click();
		Thread.sleep(2000);
		WebElement DateChoose1=driver.findElement(By.xpath("(//button[@aria-label='Choose date'])[1]"));
		Actions ChooseDate1=new Actions(driver);
		Thread.sleep(2000);
		ChooseDate1.moveToElement(DateChoose1).click().perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[normalize-space(text())='Last 30 days']")).click();
		Thread.sleep(2000);
	}
	@Test(priority = 22, description = "Testcase for Click Get Overview button to observe the result")
	public void GetOverview() throws InterruptedException {

		driver.findElement(By.xpath("//button[normalize-space(text())='Get Overview']")).click();
		Thread.sleep(2000);	
	}
}
