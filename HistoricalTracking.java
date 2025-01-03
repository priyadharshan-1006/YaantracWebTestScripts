package YaantracAutomation;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HistoricalTracking extends LiveTracking{

	public void TrackTrip() throws InterruptedException {

		TrackTrip();
	}

	@Test(priority = 31, description = "Testcase for navigate to historical tracking")
	public void NavigateHistoricalTracking() throws InterruptedException {

		driver.findElement(By.xpath("//span[@aria-label='Historic Tracking']")).click();
		Thread.sleep(2000);
	}

	@Test(priority = 32, description = "Testcase for select vehicle to view historical tracking")
	public void SelectVehicelNumber() throws InterruptedException {
		driver.findElement(By.id("selectVehicle")).click();
		Thread.sleep(2000);
		Actions SelectVehicle1=new Actions(driver);
		SelectVehicle1.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		SelectVehicle1.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
	}

	@Test(priority = 33, description = "Testcase filter tracking to last Three days")
	public void ChoosedateHistoicaltracking() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='From']")).click();

		WebElement DateChoose2=driver.findElement(By.xpath("(//button[@aria-label='Choose date'])[1]"));
		Actions ChooseDate2=new Actions(driver);
		Thread.sleep(2000);
		ChooseDate2.moveToElement(DateChoose2).click().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space(text())='Last 3 days']")).click();
		Thread.sleep(2000);
	}

	@Test(priority = 34, description = "Testcase for filte tracking yestrrday")
	public void ChooseYesterday() throws InterruptedException {
		WebElement DateChoose3=driver.findElement(By.xpath("(//div[contains(@class,'MuiInputAdornment-root MuiInputAdornment-positionEnd')]//button)[2]"));
		Actions ChooseDate3=new Actions(driver);
		Thread.sleep(2000);
		ChooseDate3.moveToElement(DateChoose3).click().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space(text())='Yesterday']")).click();
		Thread.sleep(2000);
	}

	@Test(priority = 35, description = "Testcase for filter tracking today")
	public void ChooseToday() throws InterruptedException {
		WebElement DateChoose4=driver.findElement(By.xpath("(//div[contains(@class,'MuiInputAdornment-root MuiInputAdornment-positionEnd')]//button)[2]"));
		Actions ChooseDate4=new Actions(driver);
		Thread.sleep(2000);
		ChooseDate4.moveToElement(DateChoose4).click().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space(text())='Today']")).click();
		Thread.sleep(2000);
	}	
	@Test(priority = 36, description = "Testcase for Click Map Setings")
	public void MapSettings() throws InterruptedException {

		WebElement HoveringSettings=driver.findElement(By.xpath("//span[@class='MuiSpeedDialIcon-root css-1og6e21']"));
		Thread.sleep(2000);
		Actions Settings=new Actions(driver);
		Thread.sleep(2000);
		Settings.moveToElement(HoveringSettings).perform();
		Thread.sleep(2000);
	}		
	@Test(priority = 37, description = "Testcase for Select SatliteMode")
	public void SelectSatlite() throws InterruptedException {

		driver.findElement(By.xpath("//button[@aria-label='Satellite']")).click();
		Thread.sleep(2000);
	}
	@Test(priority = 38, description = "Testcase for Add Label on Map")
	public void SelectLabelOnSatlite() throws InterruptedException {

		driver.findElement(By.xpath("(//button[contains(@class,'MuiButtonBase-root MuiFab-root')])[3]")).click();
		Thread.sleep(2000);
	}
	@Test(priority = 39, description = "Testcase for Remove Satlte Mode")
	public void RemoveSelectSatlite() throws InterruptedException {

		driver.findElement(By.xpath("(//button[contains(@class,'MuiButtonBase-root MuiFab-root')])[2]")).click();
		Thread.sleep(2000);
	}
	@Test(priority = 40, description = "Testcase for Select Terraine Mode")
	public void SelectTerrain() throws InterruptedException {

		driver.findElement(By.xpath("//button[@aria-label='Terrain']")).click();
		Thread.sleep(2000);
	}
	@Test(priority = 41, description = "Testcase for Select Night Mode")
	public void SelectNightMode() throws InterruptedException {

		driver.findElement(By.xpath("//button[@aria-label='Night mode']")).click();
		Thread.sleep(2000);
	}
	@Test(priority = 42, description = "Testcase for Select Silver Mode")
	public void SelectSilver() throws InterruptedException {

		driver.findElement(By.xpath("//button[@aria-label='Silver']")).click();
		Thread.sleep(2000);
	}
	@Test(priority = 43, description = "Testcase for Select Retro Mode")
	public void SelectRetro() throws InterruptedException {

		driver.findElement(By.xpath("//button[@aria-label='Retro']")).click();
		Thread.sleep(2000);
	}
	@Test(priority = 44, description = "Testcase for Remove Retro mode and select mormel Map")
	public void SelectNormalMode() throws InterruptedException {

		driver.findElement(By.xpath("//button[@aria-label='Satellite']")).click();
		Thread.sleep(2000);
	}
	@Test(priority = 45, description = "Testcase for View noremel map")
	public void SelectNormalMap() throws InterruptedException {

		driver.findElement(By.xpath("//button[@aria-label='Map']")).click();
		Thread.sleep(5000);
	}
}
