package YaantracAutomation;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Livedashboard extends Testcase{

	public void LoginYaantrac() throws InterruptedException {
		yaantraclogin();

		System.out.println("Yaantrac login Succesfully");

	}

	@Test(priority = 1, description = "Testcase for Totel vehicles Card")
	public void TotelVehicles() throws InterruptedException {

		driver.findElement(By.xpath("//p[normalize-space(text())='Total Vehicles']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=\"MuiSvgIcon-root MuiSvgIcon-fontSizeMedium grey-bg css-vubbuv\"]")).click();
		Thread.sleep(2000);
	}
	@Test(priority = 2, description = "Testxase for offline card")
	public void Offline() throws InterruptedException{

		driver.findElement(By.xpath("//p[normalize-space(text())='Offline']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=\"MuiSvgIcon-root MuiSvgIcon-fontSizeMedium grey-bg css-vubbuv\"]")).click();
		Thread.sleep(2000);
	}
	@Test(priority = 3, description = "Testcase for Movement Card")
	public void Movement() throws InterruptedException{
		driver.findElement(By.xpath("//p[normalize-space(text())='Moving']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=\"MuiSvgIcon-root MuiSvgIcon-fontSizeMedium grey-bg css-vubbuv\"]")).click();
		Thread.sleep(2000);
	}
	@Test(priority = 4, description = "Testcase for Idle Card")
	public void Idle() throws InterruptedException{
		driver.findElement(By.xpath("//p[normalize-space(text())='Idle']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=\"MuiSvgIcon-root MuiSvgIcon-fontSizeMedium grey-bg css-vubbuv\"]")).click();
		Thread.sleep(2000);
	}
	@Test(priority = 5, description = "Testcase for Parked Card")
	public void Parked() throws InterruptedException{
		driver.findElement(By.xpath("//p[normalize-space(text())='Parked']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=\"MuiSvgIcon-root MuiSvgIcon-fontSizeMedium grey-bg css-vubbuv\"]")).click();
		Thread.sleep(2000);
	}
	@Test(priority = 6, description = "Testcase for Livedashboard Scrollup and Scroll Down")
	public void DashboardScrollUpDown() throws InterruptedException{
		WebElement ScrollDashboardPage = driver.findElement(By.xpath("//*[normalize-space(text())='Mileage (kmpl)']")); 
		JavascriptExecutor LiveDashboardScroll = (JavascriptExecutor) driver; 
		Thread.sleep(2000); 
		LiveDashboardScroll.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", ScrollDashboardPage); 
		Thread.sleep(2000); 

		WebElement ScrollUpDashboardPage = driver.findElement(By.xpath("//button[normalize-space(text())='Live Dashboard']")); 
		JavascriptExecutor LiveDashboardScrollUp = (JavascriptExecutor) driver; 
		Thread.sleep(2000); 
		LiveDashboardScrollUp.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", ScrollUpDashboardPage); 
		Thread.sleep(2000); 
	}


	//LiveDashBoard-Filters
	@Test(priority = 7, description = "Testcase for filter all vehicle live data")
	public void AllVehicles() throws InterruptedException{
		driver.findElement(By.xpath("//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')]")).click();
		WebElement FilterVehicleNumber=driver.findElement(By.xpath("//input[@value='All Vehicles']"));
		Actions filter=new Actions(driver);
		Thread.sleep(2000);
		filter.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		filter.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
	}

	@Test(priority = 8, description = "Testcase for get live data using vehicle number") 
	public void VehicleNumber() throws InterruptedException {
		driver.findElement(By.xpath("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[2]")).click();
		Thread.sleep(2000);
		WebElement selectvehicle=driver.findElement(By.xpath("//input[@placeholder='Select Vehicle No.']"));	
		Actions Vehicle=new Actions(driver);
		Thread.sleep(2000);
		Vehicle.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		Vehicle.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space(text())='Get Live']")).click();
		Thread.sleep(2000);

	}

	@Test(priority = 9, description = "Testcase for get live data using vehicle number")
	public void SelectVehilceNumber() throws InterruptedException {
		driver.findElement(By.xpath("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])")).click();
		Thread.sleep(2000);
		Actions selectVehicleMake=new Actions(driver);
		Thread.sleep(2000);
		selectVehicleMake.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		selectVehicleMake.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
	}


	@Test(priority = 10, description = "Testcase for Selecting the Vehicle Make ")
	public void SelectVehilceMake() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='Select Make']")).click();
		Actions SelectBrand=new Actions(driver);
		SelectBrand.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		SelectBrand.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
	}

	@Test(priority = 11, description = "Testcase for Selecting the Select Vehicle Model")
	public void VehilceMake() throws InterruptedException {
		driver.findElement(By.xpath("(//div[contains(@class,'MuiInputBase-root MuiOutlinedInput-root')]//input)[3]")).click();
		Thread.sleep(2000);
		Actions SelectModel=new Actions(driver);
		SelectModel.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		SelectModel.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
	}
	@Test(priority = 12, description = "Testcase for Get live Data for vehicle Number")
	public void GetLiveforVehcleNumber() throws InterruptedException {
		driver.findElement(By.xpath("//button[normalize-space(text())='Get Live']")).click();
		Thread.sleep(2000);
	}

	//Idle,Driving and parking Time.

	@Test(priority = 13, description = "Testcase for Selecting the Select Vehicle Model")
	public void GetLiveforVehcleMake() throws InterruptedException {
		driver.findElement(By.xpath("(//*[@class='iconify iconify--fluent'])[1]")).click();
		Thread.sleep(2000);
		Actions click = new Actions(driver);
		Thread.sleep(2000);
		click.moveByOffset(100, 200).click().perform();
		Thread.sleep(2000);
	}


}

