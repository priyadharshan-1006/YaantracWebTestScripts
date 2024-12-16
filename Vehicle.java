package Yaantrac;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Vehicle {

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
		Thread.sleep(3000);
		
		//Configuration
		WebElement Configuration = driver.findElement(By.xpath("//*[@aria-label='Configurations']"));
		Configuration.click();
		Thread.sleep(2000);
		
		//Vehicle
		WebElement vehicle = driver.findElement(By.xpath(" //*[normalize-space(text())='Vehicle']"));
		vehicle.click();
		Thread.sleep(2000);
		
		//VehicleSearch
		WebElement VehicleSearch = driver.findElement(By.xpath("//*[@name='search']"));
		VehicleSearch.sendKeys("TN02BF1373");
		Thread.sleep(3000);
		//ToClickVehicleWidget
		WebElement Vehiclewidget = driver.findElement(By.xpath("//div[@class='vehicle-card MuiBox-root css-0']"));
		Vehiclewidget.click();
		Thread.sleep(2000);
		//ToUpdateVehicleDetails
		WebElement UpdateVehicle = driver.findElement(By.xpath(" //*[normalize-space(text())='Update']"));
		UpdateVehicle.click();
		Thread.sleep(2000);
		WebElement FreeWay = driver.findElement(By.xpath("//input[@name='freeWay']"));
//		FreeWay.clear();
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
		WebElement ToUpdate = driver.findElement(By.xpath("( //*[normalize-space(text())='Update'])[3]"));
		ToUpdate.click();
	
		

	}

}
