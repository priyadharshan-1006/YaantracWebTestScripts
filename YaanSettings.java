package Testcases;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YaanSettings {
	public static WebDriver driver; 

	String baseurl="https://dev-yaan.yaantrac.com/";


	public WebDriver GetChromeDriver() 

	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VasanthakumarSekar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 

		return new ChromeDriver();	 

	} 

	@BeforeTest
	public void chromelaunch() throws InterruptedException {

		ChromeOptions notification=new ChromeOptions();
		driver = new ChromeDriver(notification);			
		driver.get(baseurl);
		Thread.sleep(2000);
		driver.manage().window().maximize();

	}

	//Yaantrac Landing Page: 

	//login

	@Test(priority = 0, description = "TestCase for login yaantrac application")
	public void yaantraclogin() throws InterruptedException {

		driver.findElement(By.xpath("//button[normalize-space(text())='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("demo");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Demo@12345!");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space(text())='Login']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[@aria-label='Configurations']")).click();
		Thread.sleep(2000);
	}



	//Click Settings icon
	@Test(priority = 1, description = "The Testcase for clicking Settings module")
	public void ClickSttings() throws InterruptedException {
	driver.findElement(By.xpath("//div[@class='MuiBox-root css-pvtymi']/button[2]")).click();
	Thread.sleep(2000);
	}
	
	//Click Profile
	@Test(priority = 2, description = "The Testcase for clicking profile module")
	public void ClickProfile() throws InterruptedException {
	driver.findElement(By.xpath("(//div[@class='MuiStack-root css-1x4jos1'])[1]")).click();
	Thread.sleep(2000);
	}
	
	//Click Edit Profile button
	@Test(priority = 3, description = "The Testcase for clicking Edit Profile")
	public void ClickEditProfile() throws InterruptedException {
	driver.findElement(By.xpath("//div[@class='MuiGrid-root MuiGrid-container css-1w7jmb3']/div[6]//button")).click();
	Thread.sleep(2000);
	}
	//Click Name field
	@Test(priority = 4, description = "The Testcase for Edit Name field")
	public void ClickEditName() throws InterruptedException {
	WebElement name=driver.findElement(By.xpath("//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-fullWidth MuiInputBase-formControl MuiInputBase-sizeSmall MuiInputBase-adornedStart MuiInputBase-adornedEnd css-1si533m']/input[@id='1']"));
	name.click();
	Thread.sleep(2000);
	}
	//Click Email field
	@Test(priority = 5, description = "The Testcase for Edit Email field")
	public void ClickEditEmail() throws InterruptedException {
	WebElement email=driver.findElement(By.id("2"));
	email.click();
	Thread.sleep(2000);
	//Select all characters in the Email field and clear it
	Actions Select=new Actions(driver);
	Select.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	Thread.sleep(2000);
	Select.sendKeys(Keys.BACK_SPACE).perform();
	Thread.sleep(2000);
	//Enter the Email
	email.sendKeys("prshanthED.s@datayaan.com");
	Thread.sleep(2000);
	}
	
	//Click the Calendar icon
	@Test(priority = 6, description = "The Testcase for Edit Date Of Birth")
	public void EditDOB() throws InterruptedException {
	WebElement date=driver.findElement(By.xpath("//div[@class='MuiInputAdornment-root MuiInputAdornment-positionEnd MuiInputAdornment-outlined MuiInputAdornment-sizeSmall css-1nvf7g0']/button"));
	date.click();
	//Click Year
	driver.findElement(By.xpath("//div[@class='MuiPickersFadeTransitionGroup-root css-1bx5ylf']/div")).click();
	Thread.sleep(2000);
	//Scroll up the Year
	WebElement scrollup=driver.findElement(By.xpath("(//div[@class='MuiPickersYear-root css-j9zntq'])[1]"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView()", scrollup);
	Thread.sleep(2000);
	//Scroll down the Year
	WebElement scrolldown=driver.findElement(By.xpath("(//div[@class='MuiPickersYear-root css-j9zntq'])[57]"));
	js.executeScript("arguments[0].scrollIntoView()", scrolldown);
	Thread.sleep(2000);
	//Select the Year
	driver.findElement(By.xpath("(//div[@class='MuiPickersYear-root css-j9zntq'])[52]")).click();
	//Select month
	WebElement month=driver.findElement(By.xpath("//div[@class='MuiPickersArrowSwitcher-root css-k008qs']/button[2]"));
	month.click();
	Thread.sleep(2000);
	month.click();
	Thread.sleep(2000);
	month.click();
	Thread.sleep(2000);
	}
	
	//Click the Mobile number field
	@Test(priority = 7, description = "The Testcase for Edit Mobile Number")
	public void EditMobuleNumber() throws InterruptedException {
	WebElement MobileNumber=driver.findElement(By.xpath("(//label[contains(.,'Mobile Number *')]/following::input)[1]"));
	MobileNumber.click();
	Thread.sleep(2000);
	MobileNumber.clear();
	Thread.sleep(2000);
	MobileNumber.sendKeys("8056493576");
	Thread.sleep(2000);
	}
	//Click the Time Zone field
	@Test(priority = 8, description = "The Testcase for Edit zone")
	public void EditTimeZone() throws InterruptedException {
	driver.findElement(By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall MuiInputBase-inputAdornedStart MuiInputBase-inputAdornedEnd css-1y3zh1'])[4]")).click();
	Thread.sleep(2000);
	}
	//Click the Save button
	@Test(priority = 9, description = "The Testcase for Save Profile")
	public void SaveProfile() throws InterruptedException {
	driver.findElement(By.xpath("//div[@class='MuiBox-root css-1ff6bd']/button[2]")).click();
	Thread.sleep(2000);
	}
	
	//notification
	@Test(priority = 10, description = "The Testcase for Notification Module")
	public void Notification() throws InterruptedException {
	driver.findElement(By.xpath("(//div[@class='MuiStack-root css-1x4jos1'])[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class=\"MuiStack-root css-p10ag8\"]/span/span[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class=\"MuiStack-root css-p10ag8\"]/span/span[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@aria-label='Settings']//button[1]")).click();
	Thread.sleep(2000);
	}
	@Test(priority = 11, description = "The Testcase for Driver Identiication Notification ")
	public void DriverIdentification() throws InterruptedException {
	driver.findElement(By.xpath("//span[normalize-space(text())='Driver Identification']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[normalize-space(text())='Driver Identification']")).click();	
	Thread.sleep(2000);
	}
	
	@Test(priority = 12, description = "The Testcase for Engine Notification ")
	public void EngineNotification() throws InterruptedException {
	driver.findElement(By.xpath("//span[normalize-space(text())='Engine']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[normalize-space(text())='Engine']")).click();
	Thread.sleep(2000);
	}
	@Test(priority = 13, description = "The Testcase for Geofence Creation Notification ")
	public void GeofenceNotifiction() throws InterruptedException {
	driver.findElement(By.xpath("//span[normalize-space(text())='Geofence Creation']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[normalize-space(text())='Geofence Creation']")).click();
	Thread.sleep(2000);
	}
	@Test(priority = 14, description = "The Testcase for GeofenceINandOUT Notification ")
	public void GeofenceINandOUTNotification() throws InterruptedException {
	driver.findElement(By.xpath("//span[normalize-space(text())='Geofence IN/OUT']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[normalize-space(text())='Geofence IN/OUT']")).click();
	Thread.sleep(2000);
	}
	
	@Test(priority = 15, description = "The Testcase for Harsh Events Notification ")
	public void HashEventsNotification() throws InterruptedException {
	driver.findElement(By.xpath("//span[normalize-space(text())='Harsh Events']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[normalize-space(text())='Harsh Events']")).click();
	Thread.sleep(2000);
	}
	@Test(priority = 16, description = "The Testcase for Overspeed Events Notification ")
	public void OverSpeedNotification() throws InterruptedException {
	driver.findElement(By.xpath("//span[normalize-space(text())='Overspeed']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[normalize-space(text())='Overspeed']")).click();
	Thread.sleep(2000);
	}
	@Test(priority = 17, description = "The Testcase for Movements Notification ")
	public void MovementsNotification() throws InterruptedException {
	driver.findElement(By.xpath("//span[normalize-space(text())='Movement']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[normalize-space(text())='Movement']")).click();
	Thread.sleep(2000);
	}
	@Test(priority = 18, description = "The Testcase for Movements Notification ")
	public void OtherNotification() throws InterruptedException {
	driver.findElement(By.xpath("//span[normalize-space(text())='Others']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[normalize-space(text())='Others']")).click();
	Thread.sleep(2000);
	}
	@Test(priority = 19, description = "The Testcase for Mail Notification ")
	public void MailSending() throws InterruptedException {
	
	driver.findElement(By.xpath("(//div[@class='MuiStack-root css-1x4jos1']/span/span/input[@class='PrivateSwitchBase-input MuiSwitch-input css-1m9pwf3'])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@class='MuiStack-root css-1x4jos1']/span/span/input[@class='PrivateSwitchBase-input MuiSwitch-input css-1m9pwf3'])[1]")).click();
	Thread.sleep(2000);
	
	}
	@Test(priority = 20, description = "The Testcase for SMS Notification ")
	public void SMSnotifiaction() throws InterruptedException {
	driver.findElement(By.xpath("(//div[@class='MuiStack-root css-1x4jos1']/span/span/input[@class='PrivateSwitchBase-input MuiSwitch-input css-1m9pwf3'])[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@class='MuiStack-root css-1x4jos1']/span/span/input[@class='PrivateSwitchBase-input MuiSwitch-input css-1m9pwf3'])[2]")).click();
	Thread.sleep(2000);
	}
	
		//save button
	@Test(priority = 21, description = "The Testcase for Save Notification Changes")
	public void SaveNoticationChanges() throws InterruptedException {
	driver.findElement(By.xpath("//button[normalize-space(text())='Save']")).click();
	Thread.sleep(2000);
	}
	
	//Default view
	@Test(priority = 22, description = "The Testcase for Set Default Notification")
	public void SetDefaultView() throws InterruptedException {
	driver.findElement(By.xpath("(//div[@class='MuiStack-root css-1x4jos1'])[3]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//*[@class='PrivateSwitchBase-input css-1m9pwf3'])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//*[@class='PrivateSwitchBase-input css-1m9pwf3'])[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//*[@class='PrivateSwitchBase-input css-1m9pwf3'])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='MuiStack-root css-1e6hego']/button")).click();
	Thread.sleep(2000);
	}
	
	//Change Password
	//Default view
		@Test(priority = 23, description = "Testcase for Change Password Functionality")
		public void ChangePassword() throws InterruptedException {
	driver.findElement(By.xpath("(//div[@class='MuiStack-root css-1x4jos1'])[4]")).click();
	Thread.sleep(2000);
	//Enter the Current password
	driver.findElement(By.xpath("(//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-fullWidth MuiInputBase-formControl MuiInputBase-sizeSmall MuiInputBase-adornedStart MuiInputBase-adornedEnd css-1si533m'])[1]/input[@id='1']")).sendKeys("Demo@1235!");
	Thread.sleep(2000);
	//Click the eye icon
	driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw'])[1]")).click();
	Thread.sleep(2000);
	//Enter the New Password
	driver.findElement(By.xpath("(//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-fullWidth MuiInputBase-formControl MuiInputBase-sizeSmall MuiInputBase-adornedStart MuiInputBase-adornedEnd css-1si533m'])[2]/input[@id='2']")).sendKeys("Demo@12345!");
	Thread.sleep(2000);
	//Click the eye icon
	driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw'])[2]")).click();
	Thread.sleep(2000);
	//Enter the Confirm Password
	driver.findElement(By.xpath("(//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-fullWidth MuiInputBase-formControl MuiInputBase-sizeSmall MuiInputBase-adornedStart MuiInputBase-adornedEnd css-1si533m'])[3]/input[@id='3']")).sendKeys("Demo@12345!");
	Thread.sleep(2000);
	//Click the eye icon
	driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw'])[3]")).click();
	Thread.sleep(2000);
	//Click the Save button
	driver.findElement(By.xpath("//div[@class='MuiStack-root css-1ivcf59']/button[2]")).click();
	Thread.sleep(2000);
		}
	//LogOut
	@Test(priority = 24, description = "The Testcase for logout Application")
	public void LogoutApplication() throws InterruptedException {
	driver.findElement(By.xpath("//div[@class='MuiDialogContent-root css-1ty026z']/div[2]/div[1]/div/button")).click();		
}



}
