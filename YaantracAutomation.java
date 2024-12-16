package Yaantrac;

import java.awt.Point;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YaantracAutomation {

	public void ChromeLaunch() throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VasanthakumarSekar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		ChromeOptions options=new ChromeOptions();
		Map<String, Object> prefs=new HashMap<String,Object>();

		prefs.put("profile.default_content_setting_values.notifications", 1);

		options.setExperimentalOption("prefs",prefs);

		WebDriver driver=new ChromeDriver(options);

		driver.get("https://dev-yaan.yaantrac.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);

		//Yaantrac Landing Page: 

		WebElement ScrollElement = driver.findElement(By.xpath("//div[contains(@class,'MuiStack-root typo-content')]"));
		JavascriptExecutor HomeScroll = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		HomeScroll.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", ScrollElement);
		Thread.sleep(2000);

		WebElement ScrollElement1 = driver.findElement(By.xpath("//p[normalize-space(text())='Optimize route planning, vehicle utilization, and driver productivity to maximize fleet efficiency and performance']"));
		JavascriptExecutor HomeScroll1 = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		HomeScroll1.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", ScrollElement1);
		Thread.sleep(2000);

		WebElement ScrollElement2 = driver.findElement(By.xpath("//p[normalize-space(text())='Enhance customer satisfaction by delivering real-time updates on vehicle locations and estimated arrival times']"));
		JavascriptExecutor HomeScroll2 = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		HomeScroll2.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", ScrollElement2);
		Thread.sleep(2000);

		WebElement ScrollElement3 = driver.findElement(By.xpath("//p[normalize-space(text())='Streamline fleet operations to minimize fuel consumption and maintenance expenses while enhancing overall productivity']"));
		JavascriptExecutor HomeScroll3 = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		HomeScroll3.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", ScrollElement3);
		Thread.sleep(2000);

		WebElement ScrollElement4 = driver.findElement(By.xpath("//p[normalize-space(text())='Live Tracking']"));
		JavascriptExecutor HomeScroll4 = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		HomeScroll4.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", ScrollElement4);
		Thread.sleep(2000);

		WebElement ScrollElement5 = driver.findElement(By.xpath("(//*[normalize-space(text())='Route Optimization'])[1]"));
		JavascriptExecutor HomeScroll5 = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		HomeScroll5.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", ScrollElement5);
		Thread.sleep(2000);

		WebElement ScrollElement6 = driver.findElement(By.xpath("(//*[normalize-space(text())='Route Optimization'])[1]"));
		JavascriptExecutor HomeScroll6 = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		HomeScroll6.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", ScrollElement6);
		Thread.sleep(2000);

		WebElement ScrollElement7 = driver.findElement(By.xpath("//p[normalize-space(text())='Speed Insights']"));
		JavascriptExecutor HomeScroll7 = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		HomeScroll7.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", ScrollElement7);
		Thread.sleep(2000);

		WebElement ScrollElement8 = driver.findElement(By.xpath("//p[normalize-space(text())='Geo-fencing']"));
		JavascriptExecutor HomeScroll8 = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		HomeScroll8.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", ScrollElement8);
		Thread.sleep(2000);

		WebElement ScrollElement9 = driver.findElement(By.xpath("//p[normalize-space(text())='Reporting and Reminders']"));
		JavascriptExecutor HomeScroll9 = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		HomeScroll9.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", ScrollElement9);
		Thread.sleep(2000);

		WebElement ScrollElement10 = driver.findElement(By.xpath("//p[normalize-space(text())='Points of Interests and Navigation']"));
		JavascriptExecutor HomeScroll10 = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		HomeScroll10.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", ScrollElement10);
		Thread.sleep(2000);

		WebElement ScrollElement11 = driver.findElement(By.xpath("//p[normalize-space(text())='Safety Surveillance']"));
		JavascriptExecutor HomeScroll11 = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		HomeScroll11.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", ScrollElement11);
		Thread.sleep(2000);

		WebElement ScrollElement12 = driver.findElement(By.xpath("//p[normalize-space(text())='Vehicle Tracking']"));
		JavascriptExecutor HomeScroll12 = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		HomeScroll12.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", ScrollElement12);
		Thread.sleep(2000);

		Actions HomeVehicletrackingHover = new Actions(driver);
		WebElement HomeVehicleTracking = driver.findElement(By.xpath("//p[normalize-space(text())='Vehicle Tracking']"));
		HomeVehicletrackingHover.moveToElement(HomeVehicleTracking).build().perform();
		Thread.sleep(2000);

		Actions HomeGeofenceHover = new Actions(driver);
		WebElement HomeGeofence = driver.findElement(By.xpath("//p[normalize-space(text())='Geo-fence']"));
		HomeGeofenceHover.moveToElement(HomeGeofence).build().perform();
		Thread.sleep(2000);
		Actions HomeRouteOptimizationHover = new Actions(driver);
		WebElement HomeRouteOptimization = driver.findElement(By.xpath("(//p[normalize-space(text())='Route Optimization'])[2]"));
		HomeRouteOptimizationHover.moveToElement(HomeRouteOptimization).build().perform();

		Thread.sleep(2000);
		Actions HomeDriverPerformanceMoniteringHover = new Actions(driver);
		WebElement HomeDriverPerformanceMonitering = driver.findElement(By.xpath("//p[normalize-space(text())='Driver Performance Monitering']"));
		HomeDriverPerformanceMoniteringHover.moveToElement(HomeDriverPerformanceMonitering).build().perform();

		Thread.sleep(2000);
		Actions HomeDashboardHover = new Actions(driver);
		WebElement HomeDashboard = driver.findElement(By.xpath("//p[normalize-space(text())='Driver Performance Monitering']"));
		HomeDashboardHover.moveToElement(HomeDashboard).build().perform();

		Thread.sleep(2000);
		Actions HomeHistoricalPlaybackHover = new Actions(driver);
		WebElement HomeHistoricalPlayback  = driver.findElement(By.xpath("//p[normalize-space(text())='Historical Playback']"));
		HomeHistoricalPlaybackHover.moveToElement(HomeHistoricalPlayback).build().perform();
		Thread.sleep(2000);

		WebElement ScrollElement13 = driver.findElement(By.xpath("//p[normalize-space(text())='Alerts & Notifications']"));
		JavascriptExecutor HomeScroll13 = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		HomeScroll13.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", ScrollElement13);
		Thread.sleep(2000);

		Actions HomeAlertsNotificationsHover = new Actions(driver);
		WebElement HomeAlertNotifications  = driver.findElement(By.xpath("//p[normalize-space(text())='Alerts & Notifications']"));
		HomeAlertsNotificationsHover.moveToElement(HomeAlertNotifications).build().perform();
		Thread.sleep(2000);

		Actions HomeReportsHover = new Actions(driver);
		WebElement HomeReports = driver.findElement(By.xpath("//p[normalize-space(text())='Reports & Analytics']"));
		HomeReportsHover.moveToElement(HomeReports).build().perform();
		Thread.sleep(2000);
		
		Actions HomeMobileHover = new Actions(driver);
		WebElement HomeMobile = driver.findElement(By.xpath("//p[normalize-space(text())='Mobile Application']"));
		HomeMobileHover.moveToElement(HomeMobile).build().perform();
		Thread.sleep(2000);

		WebElement ScrollElement14 = driver.findElement(By.xpath("//div[normalize-space(text())='Courier and package delivery services']"));
		JavascriptExecutor HomeScroll14 = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		HomeScroll14.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", ScrollElement14);
		Thread.sleep(2000);
		
		

		WebElement ScrollElement15 = driver.findElement(By.xpath("//div[normalize-space(text())='Frequently Asked Questions']"));
		JavascriptExecutor HomeScroll15 = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		HomeScroll15.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", ScrollElement15);
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//*[@class='Section8-icon iconify iconify--mingcute'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='Section8-icon'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='Section8-icon iconify iconify--mingcute'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='Section8-icon'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='Section8-icon iconify iconify--mingcute'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='Section8-icon'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='Section8-icon iconify iconify--mingcute'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='Section8-icon'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='Section8-icon iconify iconify--mingcute'])[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='Section8-icon'])[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='Section8-icon iconify iconify--mingcute'])[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='Section8-icon'])[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='Section8-icon iconify iconify--mingcute'])[7]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='Section8-icon'])[7]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		




		/*driver.findElement(By.xpath("(//*[text()='About Us'])[1]")).click();
		Thread.sleep(2000);


		Thread.sleep(2000);

		driver.findElement(By.xpath("(//*[text()='Contact Us'])[1]")).click();
		Thread.sleep(2000);

		WebElement Element2 = driver.findElement(By.xpath("//*[text()='Connect With Us']"));
		JavascriptExecutor Scroll = (JavascriptExecutor) driver;
		Scroll.executeScript("window.scrollTo({ top: 1000, behavior: 'smooth' });");
		Scroll.executeScript("arguments[0].scrollIntoView();", Element2);
		Thread.sleep(2000);

		driver.findElement(By.name("name")).sendKeys("Vasanth");
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//label[text()='Email ID']/following::input)[1]")).sendKeys("vk2266@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[3]")).sendKeys("1234567890");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='message']")).sendKeys("Testing");
		Thread.sleep(2000);
		driver.findElement(By.id("recaptcha-anchor-label")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Submit']")).click();
		Thread.sleep(2000);

		//login
		driver.findElement(By.xpath("//button[normalize-space(text())='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("demo");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Demo@12345!");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space(text())='Login']")).click();
		Thread.sleep(2000);

		//LiveDashBoard-Vehicle Status
		driver.findElement(By.xpath("//p[normalize-space(text())='Total Vehicles']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=\"MuiSvgIcon-root MuiSvgIcon-fontSizeMedium grey-bg css-vubbuv\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[normalize-space(text())='Offline']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=\"MuiSvgIcon-root MuiSvgIcon-fontSizeMedium grey-bg css-vubbuv\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[normalize-space(text())='Moving']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=\"MuiSvgIcon-root MuiSvgIcon-fontSizeMedium grey-bg css-vubbuv\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[normalize-space(text())='Idle']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=\"MuiSvgIcon-root MuiSvgIcon-fontSizeMedium grey-bg css-vubbuv\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[normalize-space(text())='Parked']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=\"MuiSvgIcon-root MuiSvgIcon-fontSizeMedium grey-bg css-vubbuv\"]")).click();
		Thread.sleep(2000);

		//LiveDashBoard-Filters

		driver.findElement(By.xpath("//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')]")).click();
		WebElement FilterVehicleNumber=driver.findElement(By.xpath("//input[@value='All Vehicles']"));
		Actions filter=new Actions(driver);
		Thread.sleep(2000);
		filter.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		filter.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

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
		driver.findElement(By.xpath("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])")).click();
		Thread.sleep(2000);


		Actions selectVehicleMake=new Actions(driver);
		Thread.sleep(2000);
		selectVehicleMake.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		selectVehicleMake.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Select Make']")).click();
		Actions SelectBrand=new Actions(driver);
		SelectBrand.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		SelectBrand.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Select Model']")).click();
		Thread.sleep(2000);
		Actions SelectModel=new Actions(driver);
		SelectModel.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		SelectModel.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space(text())='Get Live']")).click();

		//Idle,Driving and parking Time.

		driver.findElement(By.xpath("(//*[@class='iconify iconify--fluent'])[1]")).click();
		Thread.sleep(2000);
		Actions click = new Actions(driver);
		click.moveByOffset(100, 200).click().perform();
		Thread.sleep(2000);


		//Overview Dashboard

		driver.findElement(By.xpath("//button[normalize-space(text())='Overview Dashboard']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='All Vehicles']")).click();

		Actions filtervehicle=new Actions(driver);
		Thread.sleep(2000);
		filtervehicle.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		filtervehicle.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[2]")).click();

		Actions VehicleSelect=new Actions(driver);
		Thread.sleep(2000);
		VehicleSelect.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		VehicleSelect.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
//
		Actions clickanywhere1=new Actions(driver);
		clickanywhere1.moveByOffset(100, 100).click().perform();

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

		driver.findElement(By.xpath("//button[normalize-space(text())='Get Overview']")).click();
		Thread.sleep(2000);

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

		driver.findElement(By.xpath("//input[@placeholder='From']")).click();

		WebElement DateChoose1=driver.findElement(By.xpath("(//button[@aria-label='Choose date'])[1]"));
		Actions ChooseDate1=new Actions(driver);
		Thread.sleep(2000);
		ChooseDate1.moveToElement(DateChoose1).click().perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[normalize-space(text())='Last 30 days']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space(text())='Get Overview']")).click();
		Thread.sleep(2000);		


		//Live Tracking

		driver.findElement(By.xpath("//span[@aria-label='Live Tracking']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Vehicle status']")).click();

		Thread.sleep(2000);
		Actions SelectStatusoffline=new Actions(driver);
		SelectStatusoffline.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		SelectStatusoffline.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Vehicle status']")).click();

		Thread.sleep(2000);
		Actions SelectStatusidle=new Actions(driver);
		SelectStatusidle.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		SelectStatusidle.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Vehicle status']")).click();

		Thread.sleep(2000);
		Actions SelectStatusMoving=new Actions(driver);
		SelectStatusMoving.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		SelectStatusMoving.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Vehicle status']")).click();

		Thread.sleep(2000);
		Actions SelectStatusParked=new Actions(driver);
		SelectStatusParked.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		SelectStatusParked.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//p[text()='Legends']/following-sibling::div)[1]")).click();
		Thread.sleep(2000);


		driver.findElement(By.id("vehicles")).click();

		Thread.sleep(2000);
		Actions SelectVehicle=new Actions(driver);
		SelectVehicle.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		SelectVehicle.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);


		//Historical Tracking:


		driver.findElement(By.xpath("//span[@aria-label='Historic Tracking']")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("selectVehicle")).click();
		Thread.sleep(2000);
		Actions SelectVehicle1=new Actions(driver);
		SelectVehicle1.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		SelectVehicle1.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='From']")).click();

		WebElement DateChoose2=driver.findElement(By.xpath("(//button[@aria-label='Choose date'])[1]"));
		Actions ChooseDate2=new Actions(driver);
		Thread.sleep(2000);
		ChooseDate2.moveToElement(DateChoose2).click().perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[normalize-space(text())='Last 3 days']")).click();
		Thread.sleep(2000);
		WebElement DateChoose3=driver.findElement(By.xpath("(//div[contains(@class,'MuiInputAdornment-root MuiInputAdornment-positionEnd')]//button)[2]"));
		Actions ChooseDate3=new Actions(driver);
		Thread.sleep(2000);
		ChooseDate3.moveToElement(DateChoose3).click().perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[normalize-space(text())='Yesterday']")).click();
		Thread.sleep(2000);
		WebElement DateChoose4=driver.findElement(By.xpath("(//div[contains(@class,'MuiInputAdornment-root MuiInputAdornment-positionEnd')]//button)[2]"));
		Actions ChooseDate4=new Actions(driver);
		Thread.sleep(2000);
		ChooseDate4.moveToElement(DateChoose4).click().perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[normalize-space(text())='Today']")).click();

		//Management
		//Management-Report-Alert

		driver.findElement(By.xpath("//span[@aria-label='Management']")).click();
		Thread.sleep(2000);

		/*driver.findElement(By.id("select-report")).click();
		Thread.sleep(2000);
		Actions SelectVehicle2=new Actions(driver);
		SelectVehicle2.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		SelectVehicle2.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		driver.findElement(By.id("select-vehicle")).click();
		Thread.sleep(2000);
		Actions SelectVehicleReport=new Actions(driver);
		SelectVehicleReport.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		SelectVehicleReport.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='From']")).click();
		Thread.sleep(2000);
		WebElement DateChooseReport=driver.findElement(By.xpath("(//button[@aria-label='Choose date'])[1]"));
		Actions ChooseDateReport=new Actions(driver);
		Thread.sleep(2000);
		ChooseDateReport.moveToElement(DateChooseReport).click().perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[normalize-space(text())='Last 30 days']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space(text())='Get Report']")).click();
		Thread.sleep(2000);

		//Management-Report- DeviceHealth

		driver.findElement(By.id("select-report")).click();

		Thread.sleep(2000);
		Actions SelectVehicleDeviceHealth=new Actions(driver);
		for(int i=0; i<2; i++) {
			SelectVehicleDeviceHealth.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(2000);
		SelectVehicleDeviceHealth.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);


		driver.findElement(By.xpath("//button[normalize-space(text())='Get Report']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space(text())='Download']")).click();

		driver.findElement(By.id("document")).click();

		Actions DocumentType=new Actions(driver);
		DocumentType.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		DocumentType.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space(text())='Send Mail']")).click();

		Thread.sleep(2000);

		//Management-Report-DeviceScorecard.

		driver.findElement(By.id("select-report")).click();
		Actions SelectReportDriverScroreCard=new Actions(driver);
		for(int i=0; i<3; i++) {
			SelectReportDriverScroreCard.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(2000);
		SelectReportDriverScroreCard.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@aria-label='Choose date'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space(text())='Last 30 days']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space(text())='Get Report']")).click();

		//Management-Report-DeviceIdentification.

		driver.findElement(By.id("select-report")).click();

		Actions SelectReportDriverIdentification=new Actions(driver);
		for(int i=0; i<4; i++) {
			SelectReportDriverIdentification.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(2000);
		SelectReportDriverIdentification.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Vehicle No.']")).click();
		Actions ReportVehicleNumber=new Actions(driver);
		ReportVehicleNumber.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		ReportVehicleNumber.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@aria-label='Choose date'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space(text())='Last 30 days']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space(text())='Get Report']")).click();
		Thread.sleep(2000);


		//Management-Report-Engine.


		driver.findElement(By.id("select-report")).click();

		Actions SelectReportEngine=new Actions(driver);
		for(int i=0; i<5; i++) {
			SelectReportEngine.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(2000);
		SelectReportEngine.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Vehicle No.']")).click();
		Actions ReportVehicleNumbeEnginer=new Actions(driver);
		ReportVehicleNumbeEnginer.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		ReportVehicleNumbeEnginer.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@aria-label='Choose date'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space(text())='Last 30 days']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space(text())='Get Report']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[normalize-space(text())='Download']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("document")).click();

		Actions DocumentTypeEngine=new Actions(driver);
		DocumentTypeEngine.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		DocumentTypeEngine.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space(text())='Send Mail']")).click();

		Thread.sleep(2000);


		//Management-Report-Idle

		driver.findElement(By.id("select-report")).click();

		Actions SelectReportIdle=new Actions(driver);
		for(int i=0; i<6; i++) {
			SelectReportIdle.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(2000);
		SelectReportIdle.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Vehicle No.']")).click();
		Actions ReportVehicleNumbeIdle=new Actions(driver);
		ReportVehicleNumbeIdle.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		ReportVehicleNumbeIdle.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@aria-label='Choose date'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space(text())='Last 30 days']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space(text())='Get Report']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[normalize-space(text())='Download']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("document")).click();
		Thread.sleep(2000);
		Actions DocumentTypeIdle=new Actions(driver);
		DocumentTypeIdle.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		DocumentTypeIdle.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space(text())='Send Mail']")).click();
		Thread.sleep(2000);


		//Management-Report-KM


		driver.findElement(By.id("select-report")).click();

		Actions SelectReportKM=new Actions(driver);
		for(int i=0; i<7; i++) {
			SelectReportKM.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(2000);
		SelectReportKM.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Vehicle No.']")).click();
		Actions ReportVehicleNumbeKM=new Actions(driver);
		ReportVehicleNumbeKM.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		ReportVehicleNumbeKM.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@aria-label='Choose date'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space(text())='Last 30 days']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space(text())='Get Report']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[normalize-space(text())='Download']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("document")).click();
		Thread.sleep(2000);
		Actions DocumentTypeKM=new Actions(driver);
		DocumentTypeKM.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		DocumentTypeKM.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space(text())='Send Mail']")).click();
		Thread.sleep(2000);

		//Management-Report-Movement

		driver.findElement(By.id("select-report")).click();

		Actions SelectReportMovement=new Actions(driver);
		for(int i=0; i<8; i++) {
			SelectReportMovement.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(2000);
		SelectReportMovement.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Vehicle No.']")).click();
		Actions ReportVehicleNumbeMovement=new Actions(driver);
		ReportVehicleNumbeMovement.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		ReportVehicleNumbeMovement.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@aria-label='Choose date'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space(text())='Last 30 days']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space(text())='Get Report']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[normalize-space(text())='Download']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("document")).click();
		Thread.sleep(2000);
		Actions DocumentTypeMovement=new Actions(driver);
		DocumentTypeMovement.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		DocumentTypeMovement.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space(text())='Send Mail']")).click();
		Thread.sleep(2000);

		//Management-Report-Overall

		driver.findElement(By.id("select-report")).click();

		Actions SelectReportOverall=new Actions(driver);
		for(int i=0; i<9; i++) {
			SelectReportOverall.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(2000);
		SelectReportOverall.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Vehicle No.']")).click();
		Actions ReportVehicleNumbeOverall=new Actions(driver);
		ReportVehicleNumbeOverall.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		ReportVehicleNumbeOverall.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@aria-label='Choose date'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space(text())='Last 30 days']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space(text())='Get Report']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[normalize-space(text())='Download']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("document")).click();
		Thread.sleep(2000);
		Actions DocumentTypeOverall=new Actions(driver);
		DocumentTypeOverall.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		DocumentTypeOverall.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space(text())='Send Mail']")).click();
		Thread.sleep(2000);

		//Management-Report-OverSpeed

		driver.findElement(By.id("select-report")).click();

		Actions SelectReportOverSpeed=new Actions(driver);
		for(int i=0; i<10; i++) {
			SelectReportOverSpeed.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(2000);
		SelectReportOverSpeed.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Vehicle No.']")).click();
		Actions ReportVehicleNumbeOverspeed=new Actions(driver);
		ReportVehicleNumbeOverspeed.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		ReportVehicleNumbeOverspeed.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@aria-label='Choose date'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space(text())='Last 30 days']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space(text())='Get Report']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[normalize-space(text())='Download']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("document")).click();
		Thread.sleep(2000);
		Actions DocumentTypeOverspeed=new Actions(driver);
		DocumentTypeOverspeed.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		DocumentTypeOverspeed.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space(text())='Send Mail']")).click();
		Thread.sleep(2000);


		//Management-Report-Parking

		driver.findElement(By.id("select-report")).click();

		Actions SelectReportParking=new Actions(driver);
		for(int i=0; i<11; i++) {
			SelectReportParking.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(2000);
		SelectReportParking.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Vehicle No.']")).click();
		Actions ReportVehicleNumbeParking=new Actions(driver);
		ReportVehicleNumbeParking.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		ReportVehicleNumbeParking.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@aria-label='Choose date'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space(text())='Last 30 days']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space(text())='Get Report']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[normalize-space(text())='Download']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("document")).click();
		Thread.sleep(2000);
		Actions DocumentTypeParking=new Actions(driver);
		DocumentTypeParking.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		DocumentTypeParking.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space(text())='Send Mail']")).click();
		Thread.sleep(2000);



		//Management-Report-Stoppage

		driver.findElement(By.id("select-report")).click();

		Actions SelectReportStoppage=new Actions(driver);
		for(int i=0; i<12; i++) {
			SelectReportStoppage.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(2000);
		SelectReportStoppage.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Vehicle No.']")).click();
		Actions ReportVehicleNumbeStoppage=new Actions(driver);
		ReportVehicleNumbeStoppage.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		ReportVehicleNumbeStoppage.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@aria-label='Choose date'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space(text())='Last 30 days']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space(text())='Get Report']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[normalize-space(text())='Download']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("document")).click();
		Thread.sleep(2000);
		Actions DocumentTypeStoppage=new Actions(driver);
		DocumentTypeStoppage.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		DocumentTypeStoppage.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space(text())='Send Mail']")).click();
		Thread.sleep(2000);

		//Management-Report-TripDetails

		driver.findElement(By.id("select-report")).click();

		Actions SelectReportTripDetails=new Actions(driver);
		for(int i=0; i<13; i++) {
			SelectReportTripDetails.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(2000);
		SelectReportTripDetails.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Vehicle No.']")).click();
		Actions ReportVehicleNumbeTripDetails=new Actions(driver);
		ReportVehicleNumbeTripDetails.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		ReportVehicleNumbeTripDetails.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@aria-label='Choose date'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space(text())='Last 30 days']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space(text())='Get Report']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[normalize-space(text())='Download']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("document")).click();
		Thread.sleep(2000);
		Actions DocumentTypeTripDetails=new Actions(driver);
		DocumentTypeTripDetails.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		DocumentTypeTripDetails.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space(text())='Send Mail']")).click();
		Thread.sleep(2000);


		//Management-Report-TripCompliance

		driver.findElement(By.id("select-report")).click();

		Actions SelectReportTripCompliance=new Actions(driver);
		for(int i=0; i<14; i++) {
			SelectReportTripCompliance.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(2000);
		SelectReportTripCompliance.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Vehicle No.']")).click();
		Actions ReportVehicleNumbeTripCompliance=new Actions(driver);
		ReportVehicleNumbeTripCompliance.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		ReportVehicleNumbeTripCompliance.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@aria-label='Choose date'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space(text())='Last 30 days']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space(text())='Get Report']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[normalize-space(text())='Download']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("document")).click();
		Thread.sleep(2000);
		Actions DocumentTypeTripCompliance=new Actions(driver);
		DocumentTypeTripCompliance.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		DocumentTypeTripCompliance.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space(text())='Send Mail']")).click();
		Thread.sleep(2000);

		//Management-Report-VehicleDetails
		///
		 */

		driver.findElement(By.id("select-report")).click();

		Actions SelectReportVehicleDetails=new Actions(driver);
		for(int i=0; i<15; i++) {
			SelectReportVehicleDetails.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(2000);
		SelectReportVehicleDetails.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[normalize-space(text())='Get Report']")).click();

		//Management-Report-VehicleGeofence

		driver.findElement(By.id("select-report")).click();

		Actions SelectReportVehicleGeofence=new Actions(driver);
		for(int i=0; i<16; i++) {
			SelectReportVehicleGeofence.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(2000);
		SelectReportVehicleGeofence.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Vehicle No.']")).click();
		Actions ReportVehicleNumbeVehicleGeofence=new Actions(driver);
		ReportVehicleNumbeVehicleGeofence.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		ReportVehicleNumbeVehicleGeofence.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@aria-label='Choose date'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space(text())='Last 30 days']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space(text())='Get Report']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[normalize-space(text())='Download']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("document")).click();
		Thread.sleep(2000);
		Actions DocumentTypeVehicleGeofence=new Actions(driver);
		DocumentTypeVehicleGeofence.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		DocumentTypeVehicleGeofence.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space(text())='Send Mail']")).click();
		Thread.sleep(2000);*/



		//Management-Geofence
		driver.findElement(By.xpath("//a[normalize-space(text())='Geofence']")).click();
		Thread.sleep(2000);







		/*driver.findElement(By.xpath("//button[normalize-space(text())='Add New Geofence']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("geoZoneName")).sendKeys("TestGeofence");
		Thread.sleep(2000);
		WebElement SelectMaplocation=driver.findElement(By.xpath("//input[@class='google-search-autocomplete pac-target-input']"));

		SelectMaplocation.sendKeys("Tambaram");

		Actions SelectLocation=new Actions(driver);
		Thread.sleep(2000);
		SelectLocation.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		SelectLocation.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[2]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[2]")).sendKeys("10");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[normalize-space(text())='Save']")).click();


		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space(text())='Add New Geofence']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[@name='geoType'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("geoZoneName")).sendKeys("TestGeofence2");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space(text())='Save']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@title='Draw a shape']")).click();

		Thread.sleep(5000);
		WebElement ZoomMap=driver.findElement(By.xpath("(//div[contains(@class,'zoom-btn MuiBox-root')])[1]"));

		for(int i=0; i<6; i++) {
			ZoomMap.click();
		}
		Thread.sleep(2000);

		WebElement PolygonGeofence=driver.findElement(By.xpath("//span[text()='To navigate, press the arrow keys.']/following-sibling::div"));

		Thread.sleep(2000);
		double[][] geofenceCoordinates = {
                {12.922915, -80.127457}, 
                {12.943068, -80.133205},
                {80.133205, -80.134850},
                {12.922915, -80.127457} 
            };

		Actions CreateGeofence=new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		for (double[] coordinate : geofenceCoordinates) {

			 double latitude = coordinate[0];
	            double longitude = coordinate[1];

			 int[] pixelPosition = convertLatLngToPixel(latitude, longitude,PolygonGeofence );

			 CreateGeofence .moveToElement(PolygonGeofence, pixelPosition[0], pixelPosition[1]).click().perform();

	            Thread.sleep(1000);
        }	


	private static int[] convertLatLngToPixel(double latitude, double longitude, WebElement polygonGeofence) {

		int x = (int) (latitude * 5);
        int y = (int) (longitude * -5); 
        return new int[]{x, y};
	}*/


		//Management-My Trips.

		//Add New Trip





		// Add New Trip 

		driver.findElement(By.xpath("//a[normalize-space(text())='My Trips']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[normalize-space(text())='Add New Trip']")).click();


		//View Trip

		/*driver.findElement(By.cssSelector("button#basic-button")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//*[@class='menu-bg iconify iconify--eva'])[1]")).click();
	Thread.sleep(2000);
	WebElement ViewElement=driver.findElement(By.xpath("(//*[@class='menu-icon view iconify iconify--bx'])[1]"));
	Thread.sleep(2000);
	Actions View=new Actions(driver);
	View.sendKeys(Keys.ARROW_DOWN).click(ViewElement).perform();
	Thread.sleep(2000);

	driver.findElement(By.xpath("(//div[contains(@class,'cardheader d-flex')]//div)[3]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[contains(@class,'cardheader d-flex')]/following-sibling::div)[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[normalize-space(text())='Deactivate']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[normalize-space(text())='No']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@aria-label='Close']//button[1]")).click();
	Thread.sleep(2000);

	//Update Trip
	driver.findElement(By.cssSelector("button#basic-button")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//*[@class='menu-bg iconify iconify--eva'])[1]")).click();
	Thread.sleep(2000);
	WebElement UpdateElement=driver.findElement(By.xpath("(//*[@class='menu-icon update iconify iconify--ic'])[1]"));
	Thread.sleep(2000);
	Actions UpdateTrip=new Actions(driver);
	UpdateTrip.sendKeys(Keys.ARROW_DOWN).click(UpdateElement).perform();
	Thread.sleep(2000);
	UpdateTrip.click().perform();

	Thread.sleep(2000);

	driver.findElement(By.xpath("(//input[@class='google-search-autocomplete pac-target-input'])[3]")).clear();
	Thread.sleep(2000);
	WebElement SelectRoute=driver.findElement(By.id("waypoint1"));
	Thread.sleep(2000);
	SelectRoute.sendKeys("Tambaram");
	Thread.sleep(2000);
	Actions SelectWayPoint=new Actions(driver);
	Thread.sleep(2000);
	SelectWayPoint.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	SelectWayPoint.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[normalize-space(text())='Update Trip']")).click();*/


	}
}	















