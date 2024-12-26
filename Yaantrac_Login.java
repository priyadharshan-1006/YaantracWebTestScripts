package Yaanntrac;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Yaantrac_Login {
	
		public WebDriver driver;
		
		String baseurl="https://dev-yaan.yaantrac.com/";
		
		@BeforeTest
		public void chromlaunch(){
			
		driver=new ChromeDriver();
		
		driver.get(baseurl);
		
		driver.manage().window().maximize();
		
		}
		
		@Test(priority = 0)
		public void login() throws InterruptedException {
		driver.findElement(By.xpath("//*[text()='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("demo");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Demo@12345!");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'MuiButtonBase-root MuiIconButton-root')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(15000);

		}
		
		//Driver Module
		//Click Management
		/*driver.findElement( By.xpath("(//span[@class='MuiBadge-root nonActive css-1rzb3uu'])[3]")).click();
		Thread.sleep(2000);
		//Click Driver
		driver.findElement(By.xpath("//div[@class='MuiTabs-flexContainer css-k008qs']/a[4]")).click();
		Thread.sleep(2000);
		//Add Driver
		driver.findElement(By.xpath("//div[@class='title MuiBox-root css-0']/button")).click();
		Thread.sleep(2000);
		//First name
		WebElement F_name=driver.findElement(By.xpath("//div[@class='MuiGrid-root MuiGrid-container css-il6tnd']/div[1]/div/div/div/input[@id=\"1\"]"));
		F_name.click();
		Thread.sleep(2000);
		F_name.sendKeys("Raja");
		Thread.sleep(2000);
		//Last name
		WebElement L_name=driver.findElement(By.xpath("//div[@class='MuiGrid-root MuiGrid-container css-il6tnd']/div[2]/div/div/div/input[@id='2']"));
		L_name.click();
		Thread.sleep(2000);
		L_name.sendKeys("Lakshmi");
		Thread.sleep(2000);
		//Email
		WebElement email1=driver.findElement(By.xpath("//div[@class='MuiGrid-root MuiGrid-container css-il6tnd']/div[3]/div/div/div/input[@id='3']"));
		email1.click();
		Thread.sleep(2000);
		email1.sendKeys("raji123@gmail.com");
		Thread.sleep(2000);
		//Mobile number
		WebElement MobNum=driver.findElement(By.xpath("//div[@class='MuiGrid-root MuiGrid-container css-il6tnd']/div[4]/div/div/div/input[@id='4']"));
		MobNum.click();
		Thread.sleep(2000);
		MobNum.sendKeys("9876543210");
		Thread.sleep(2000);
		WebElement LicenseNum=driver.findElement(By.xpath("//div[@class='MuiGrid-root MuiGrid-container css-il6tnd']/div[5]/div/div/div/input[@id='5']"));
		LicenseNum.click();
		Thread.sleep(2000);
		LicenseNum.sendKeys("Tn9384789859374");
		Thread.sleep(2000);
		WebElement Scroll=driver.findElement(By.xpath("//div[@class='MuiBox-root css-1czis7r']"));
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("arguments[0].scrollIntoView()", Scroll);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='6']")).click();
		Actions actions=new Actions(driver);
		actions.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		actions.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='custom-date-time-picker MuiBox-root css-0']/div/div/div/button)[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='MuiPickersFadeTransitionGroup-root css-1bx5ylf']")).click();
		Thread.sleep(2000);
		WebElement Scrlup=driver.findElement(By.xpath("(//div[@class='MuiPickersYear-root css-j9zntq'])[1]"));
		js1.executeScript("arguments[0].scrollIntoView()", Scrlup);
		Thread.sleep(2000);
		WebElement Scrldown=driver.findElement(By.xpath("(//div[@class='MuiPickersYear-root css-j9zntq'])[200]"));
		js1.executeScript("arguments[0].scrollIntoView()", Scrldown);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='MuiPickersYear-root css-j9zntq'])[141]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='MuiDayCalendar-weekContainer css-mvmu1r'])[4]/button[7]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='custom-date-time-picker MuiBox-root css-0']/div/div/div/button)[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='MuiPickersFadeTransitionGroup-root css-1bx5ylf']")).click();
		Thread.sleep(2000);
		WebElement IEDScrlup=driver.findElement(By.xpath("(//div[@class='MuiPickersYear-root css-j9zntq'])[1]"));//IED -> Insurance Expiry date
		js1.executeScript("arguments[0].scrollIntoView()", IEDScrlup);
		Thread.sleep(2000);
		WebElement IEDScrldown=driver.findElement(By.xpath("(//div[@class='MuiPickersYear-root css-j9zntq'])[200]"));
		js1.executeScript("arguments[0].scrollIntoView()", IEDScrldown);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='MuiPickersYear-root css-j9zntq'])[142]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='MuiDayCalendar-weekContainer css-mvmu1r'])[4]/button[7]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='custom-date-time-picker MuiBox-root css-0']/div/div/div/button)[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='MuiPickersFadeTransitionGroup-root css-1bx5ylf']")).click();
		Thread.sleep(2000);
		WebElement MEDScrlup=driver.findElement(By.xpath("(//div[@class='MuiPickersYear-root css-j9zntq'])[1]"));//IED -> Insurance Expiry date
		js1.executeScript("arguments[0].scrollIntoView()", MEDScrlup);
		Thread.sleep(2000);
		WebElement MEDScrldown=driver.findElement(By.xpath("(//div[@class='MuiPickersYear-root css-j9zntq'])[200]"));
		js1.executeScript("arguments[0].scrollIntoView()", MEDScrldown);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='MuiPickersYear-root css-j9zntq'])[145]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='MuiDayCalendar-weekContainer css-mvmu1r'])[4]/button[6]")).click();
		Thread.sleep(2000);
		//License document upload
		driver.findElement(By.xpath("(//*[@name='License'])[1]")).click();
		Thread.sleep(2000);
		String file1="\"C:\\Users\\RajalakshmiRajasekar\\Downloads\\license-1\"";//image path
		StringSelection Selection1=new StringSelection(file1);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection1, null);
		Thread.sleep(3000);
		//Robot class to performing the keyboard actions
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);      
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);  
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='MuiAccordionSummary-expandIconWrapper css-1fx8m19']")).click();
		Thread.sleep(2000);
		//delete file
		driver.findElement(By.xpath("(//*[@role='img'])[11]")).click();
		Thread.sleep(2000);
		//Again upload new file
		driver.findElement(By.xpath("(//*[@name='License'])[1]")).click();
		Thread.sleep(2000);
		String file="\"C:\\Users\\RajalakshmiRajasekar\\Downloads\\license-1\"";//image path
		StringSelection Selection=new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection, null);
		Thread.sleep(3000);
		//Robot class to performing the keyboard actions
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);      
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);  
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//div[@class='MuiAccordionSummary-expandIconWrapper Mui-expanded css-1fx8m19']")).click();
		Thread.sleep(2000);	
		//Insurance Document Upload
		driver.findElement(By.xpath("(//*[@name='License'])[2]")).click();
		Thread.sleep(2000);
		String file2="\"C:\\Users\\RajalakshmiRajasekar\\Downloads\\Insta\"";//image path
		StringSelection Selection2=new StringSelection(file2);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection2, null);
		Thread.sleep(5000);
		//Robot class to performing the keyboard actions
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);      
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);  
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		//Medical Certificate upload
		driver.findElement(By.xpath("(//*[@name='License'])[3]")).click();
		Thread.sleep(2000);
		String file3="\"C:\\Users\\RajalakshmiRajasekar\\Downloads\\Medical-1\""; //image path
		StringSelection Selection3=new StringSelection(file3);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection3, null);
		Thread.sleep(5000);
		//Robot class to performing the keyboard actions
		//Robot robot1 = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);      
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);  
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		//Click Add driver button
		driver.findElement(By.xpath("//div[@class='MuiBox-root css-1czis7r']/button[1]")).click();
		Thread.sleep(5000);
		
		
		
		//Settings Module
        driver.findElement(By.xpath("//div[@class='MuiBox-root css-pvtymi']/button[2]")).click();
		Thread.sleep(2000);

		//Profile
		driver.findElement(By.xpath("(//div[@class='MuiStack-root css-1x4jos1'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='MuiGrid-root MuiGrid-container css-1w7jmb3']/div[6]//button")).click();
		Thread.sleep(2000);
		WebElement name=driver.findElement(By.xpath("//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-fullWidth MuiInputBase-formControl MuiInputBase-sizeSmall MuiInputBase-adornedStart MuiInputBase-adornedEnd css-1si533m']/input[@id='1']"));
		name.click();
		Thread.sleep(2000);
		WebElement email=driver.findElement(By.id("2"));
		email.click();
		Thread.sleep(2000);
		Actions Select=new Actions(driver);
		Select.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		Thread.sleep(2000);
		Select.sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(2000);
		email.sendKeys("vasanthakumar.s@datayaan.com");
		Thread.sleep(2000);
		WebElement date=driver.findElement(By.xpath("//div[@class='MuiInputAdornment-root MuiInputAdornment-positionEnd MuiInputAdornment-outlined MuiInputAdornment-sizeSmall css-1nvf7g0']/button"));
		date.click();
		driver.findElement(By.xpath("//div[@class='MuiPickersFadeTransitionGroup-root css-1bx5ylf']/div")).click();
		Thread.sleep(2000);
		WebElement scrollup=driver.findElement(By.xpath("(//div[@class='MuiPickersYear-root css-j9zntq'])[1]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", scrollup);
		Thread.sleep(2000);
		WebElement scrolldown=driver.findElement(By.xpath("(//div[@class='MuiPickersYear-root css-j9zntq'])[57]"));
		js.executeScript("arguments[0].scrollIntoView()", scrolldown);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='MuiPickersYear-root css-j9zntq'])[52]")).click();
		WebElement month=driver.findElement(By.xpath("//div[@class='MuiPickersArrowSwitcher-root css-k008qs']/button[2]"));
		month.click();
		Thread.sleep(2000);
		month.click();
		Thread.sleep(2000);
		month.click();
		Thread.sleep(2000);
		WebElement MobileNumber=driver.findElement(By.xpath("//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-fullWidth MuiInputBase-formControl MuiInputBase-sizeSmall MuiInputBase-adornedStart MuiInputBase-adornedEnd css-1si533m']/input[@id='4']"));
		MobileNumber.click();
		MobileNumber.click();
		Thread.sleep(2000);
		Select.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		Thread.sleep(2000);
		Select.sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(2000);
		MobileNumber.sendKeys("9389483982");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall MuiInputBase-inputAdornedStart MuiInputBase-inputAdornedEnd css-1y3zh1'])[4]")).click();
		Thread.sleep(2000);
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
        driver.findElement(By.xpath("(//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-fullWidth MuiInputBase-formControl MuiInputBase-sizeSmall MuiInputBase-adornedStart MuiInputBase-adornedEnd css-1si533m'])[1]/input[@id='1']")).sendKeys("Demo@1235!");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-fullWidth MuiInputBase-formControl MuiInputBase-sizeSmall MuiInputBase-adornedStart MuiInputBase-adornedEnd css-1si533m'])[2]/input[@id='2']")).sendKeys("Demo@12345!");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw'])[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-fullWidth MuiInputBase-formControl MuiInputBase-sizeSmall MuiInputBase-adornedStart MuiInputBase-adornedEnd css-1si533m'])[3]/input[@id='3']")).sendKeys("Demo@12345!");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw'])[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='MuiStack-root css-1ivcf59']/button[2]")).click();
        Thread.sleep(2000);
        
        //LogOut
        driver.findElement(By.xpath("//div[@class='MuiDialogContent-root css-1ty026z']/div[2]/div[1]/div/button")).click();		
*/
	

}
