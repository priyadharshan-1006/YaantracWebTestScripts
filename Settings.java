package Yaanntrac;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class Settings {
	public WebDriver driver;
	
	String baseurl="https://dev-yaan.yaantrac.com/";
	
	@BeforeTest
	public void chromlaunch() throws InterruptedException{
		
	driver=new ChromeDriver();
	
	driver.get(baseurl);
	
	driver.manage().window().maximize();
	
	
	
	//Click Settings icon
        driver.findElement(By.xpath("//div[@class='MuiBox-root css-pvtymi']/button[2]")).click();
	Thread.sleep(2000);
	//Click Profile
	driver.findElement(By.xpath("(//div[@class='MuiStack-root css-1x4jos1'])[1]")).click();
	Thread.sleep(5000);
	//Click Edit Profile button
	driver.findElement(By.xpath("//div[@class='MuiGrid-root MuiGrid-container css-1w7jmb3']/div[6]//button")).click();
	Thread.sleep(2000);
	//Click Name field
	WebElement name=driver.findElement(By.xpath("//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-fullWidth MuiInputBase-formControl MuiInputBase-sizeSmall MuiInputBase-adornedStart MuiInputBase-adornedEnd css-1si533m']/input[@id='1']"));
	name.click();
	Thread.sleep(2000);
	//Click Email field
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
	email.sendKeys("vasanthakumar.s@datayaan.com");
	Thread.sleep(2000);
	//Click the Calendar icon
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
	//Click the Mobile number field
	WebElement MobileNumber=driver.findElement(By.xpath("//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-fullWidth MuiInputBase-formControl MuiInputBase-sizeSmall MuiInputBase-adornedStart MuiInputBase-adornedEnd css-1si533m']/input[@id='4']"));
	MobileNumber.click();
	MobileNumber.click();
	Thread.sleep(2000);
	Select.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	Thread.sleep(2000);
	Select.sendKeys(Keys.BACK_SPACE).perform();
	Thread.sleep(2000);
	//Enter the Mobile Number
	MobileNumber.sendKeys("9389483982");
	Thread.sleep(2000);
	//Click the Time Zone field
	driver.findElement(By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall MuiInputBase-inputAdornedStart MuiInputBase-inputAdornedEnd css-1y3zh1'])[4]")).click();
	Thread.sleep(2000);
	//Click the Save button
	driver.findElement(By.xpath("//div[@class='MuiBox-root css-1ff6bd']/button[2]")).click();
	Thread.sleep(2000);

	//notification
	driver.findElement(By.xpath("(//div[@class='MuiStack-root css-1x4jos1'])[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class=\"MuiStack-root css-p10ag8\"]/span/span[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class=\"MuiStack-root css-p10ag8\"]/span/span[1]")).click();
	Thread.sleep(2000);
    driver.findElement(By.xpath("(//div[@class='MuiStack-root css-1x4jos1']/span/span/input[@class='PrivateSwitchBase-input MuiSwitch-input css-1m9pwf3'])[1]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//div[@class='MuiStack-root css-1x4jos1']/span/span/input[@class='PrivateSwitchBase-input MuiSwitch-input css-1m9pwf3'])[1]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//div[@class='MuiStack-root css-1x4jos1']/span/span/input[@class='PrivateSwitchBase-input MuiSwitch-input css-1m9pwf3'])[2]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//div[@class='MuiStack-root css-1x4jos1']/span/span/input[@class='PrivateSwitchBase-input MuiSwitch-input css-1m9pwf3'])[2]")).click();
    Thread.sleep(2000);
    //save button
    driver.findElement(By.xpath("//div[@class='MuiStack-root css-1pq64b']/button")).click();
    Thread.sleep(2000);
    
    //Default view
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
    
    //Change Password
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
    
    //LogOut
    driver.findElement(By.xpath("//div[@class='MuiDialogContent-root css-1ty026z']/div[2]/div[1]/div/button")).click();		
	}

}
