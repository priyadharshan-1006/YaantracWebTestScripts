package YaantracWebAutomationTestScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AddDriver extends Login  {

	@Test(priority = 0)
	public void tologin() throws InterruptedException {
		login();
		System.out.println("Login has been successful");
	}

	@Test(priority = 1,description = "To Click the Configurations")
	public void ToClickConfiguration() throws InterruptedException {
		WebElement Configuration = driver.findElement(By.xpath("//*[@aria-label='Configurations']"));
		Configuration.click();
		Thread.sleep(2000);
	}
    @Test(priority = 2,description = "To Click the Driver")
	public  void DriverIcon() throws InterruptedException {
		WebElement ClickDriver = driver.findElement(By.xpath("//*[normalize-space(text())='Driver']"));
		ClickDriver.click();
		Thread.sleep(2000);
	}
    @Test(priority = 3,description = "To Click the Add Driver")
   	public  void AddDriver() throws InterruptedException { 
    	driver.findElement(By.xpath("//div[@class='title MuiBox-root css-0']/button")).click();
		Thread.sleep(2000);
		}
    @Test(priority = 4,description = "To Enter The First Name")
	public void FirstName() throws InterruptedException {
		WebElement F_name = driver.findElement(By.xpath(
				"//div[@class='MuiGrid-root MuiGrid-container css-il6tnd']/div[1]/div/div/div/input[@id=\"1\"]"));
		F_name.click();
		Thread.sleep(2000);
		F_name.sendKeys("Raja");
		Thread.sleep(2000);	
	}
    @Test(priority = 4,description = "To Enter The Last Name")
 	public void LastName() throws InterruptedException {
    	WebElement L_name = driver.findElement(By
				.xpath("//div[@class='MuiGrid-root MuiGrid-container css-il6tnd']/div[2]/div/div/div/input[@id='2']"));
		L_name.click();
		Thread.sleep(2000);
		L_name.sendKeys("Lakshmi");
		Thread.sleep(2000);
    }

	@Test(priority = 5,description = "To Enter The Email")
	public void Email() throws InterruptedException{
		WebElement email1 = driver.findElement(By
				.xpath("//div[@class='MuiGrid-root MuiGrid-container css-il6tnd']/div[3]/div/div/div/input[@id='3']"));
		email1.click();
		Thread.sleep(2000);
		email1.sendKeys("raji123@gmail.com");
		Thread.sleep(2000);	
	}
			
	@Test(priority = 6,description = "To Enter The Mobile Number")
	public void MobileNumber() throws InterruptedException {
		WebElement MobNum = driver.findElement(By
				.xpath("//div[@class='MuiGrid-root MuiGrid-container css-il6tnd']/div[4]/div/div/div/input[@id='4']"));
		MobNum.click();
		Thread.sleep(2000);
		MobNum.sendKeys("9876543210");
		Thread.sleep(2000);	
	}
	
	@Test(priority = 7,description = "To Enter The License Number")
	public void LicenseNumber() throws InterruptedException {
		WebElement LicenseNum = driver.findElement(By
				.xpath("//div[@class='MuiGrid-root MuiGrid-container css-il6tnd']/div[5]/div/div/div/input[@id='5']"));
		LicenseNum.click();
		Thread.sleep(2000);
		LicenseNum.sendKeys("Tn9384789859374");
		Thread.sleep(2000);
	}
	
	@Test(priority = 8,description = "To Enter The License type")
	public void LicenseType() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='6']")).click();
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		actions.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		
	}
	@Test(priority = 9,description = "To Upload The License Document")
	public void LicenseDocument	() throws InterruptedException, AWTException {
		driver.findElement(By.xpath("(//*[@name='License'])[1]")).click();
		Thread.sleep(2000);
		String file1 = "\"C:\\Users\\PriyadharshanGanesh\\Downloads\\License-Document.pdf\"";
		;// image path
		StringSelection Selection1 = new StringSelection(file1);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection1, null);
		Thread.sleep(3000);

		// Robot class to performing the keyboard actions
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
	}
	
	@Test(priority = 10,description = "To Delete The License Document")
	public void DeleteDocument() throws InterruptedException {
		
		driver.findElement(By.xpath("//div[@class='MuiAccordionSummary-expandIconWrapper css-1fx8m19']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='iconify iconify--mi']")).click();
		Thread.sleep(2000);
	}
	@Test(priority = 11,description = "To Upload The License Document")
	public void AgainLicenseDocument	() throws InterruptedException, AWTException {
		LicenseDocument();	
	}
	@Test(priority = 12,description = "To Upload The Insurance Document")
	public void InsuranceDocument() throws InterruptedException, AWTException {
		
		driver.findElement(By.xpath("(//*[@name='License'])[2]")).click();
		Thread.sleep(2000);
		String file2 = "\"C:\\Users\\PriyadharshanGanesh\\Downloads\\License-Document.pdf\"";// image path
		StringSelection Selection2 = new StringSelection(file2);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection2, null);
		Thread.sleep(5000);
		// Robot class to performing the keyboard actions
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
	}
	@Test(priority = 13,description = "To Upload The Medical Document")
	public void MedicalDocument() throws InterruptedException, AWTException{
		driver.findElement(By.xpath("(//*[@name='License'])[3]")).click();
		Thread.sleep(2000);
		String file3 = "\"C:\\Users\\PriyadharshanGanesh\\Downloads\\License-Document.pdf\""; // image path
		StringSelection Selection3 = new StringSelection(file3);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection3, null);
		Thread.sleep(5000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
	}
	@Test(priority = 14,description = "To Select The License Expiry Date")
	public void LicenseExpiryDate() throws InterruptedException {
		WebElement LicenseExpiryDate = driver.findElement(By.xpath("(//*[@data-testid='CalendarIcon'])[1]"));
		LicenseExpiryDate.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[normalize-space(text())='December 2024']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[normalize-space(text())='2030']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[normalize-space(text())='16']")).click();
	}
	
	@Test(priority = 15,description = "To Select The Insurance Expiry Date")
	public void InsuranceExpiryDate() throws InterruptedException {
		WebElement InsuranceExpiryDate = driver.findElement(By.xpath("(//*[@data-testid='CalendarIcon'])[2]"));
		InsuranceExpiryDate.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[normalize-space(text())='December 2024']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[normalize-space(text())='2030']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[normalize-space(text())='16']")).click();
	}
	@Test(priority = 15,description = "To Select The Medical Expiry Date")
	public void MedicalExpiryDate() throws InterruptedException {
		WebElement MedicalExpiryDate = driver.findElement(By.xpath("(//*[@data-testid='CalendarIcon'])[3]"));
		MedicalExpiryDate.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[normalize-space(text())='December 2024']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[normalize-space(text())='2030']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[normalize-space(text())='16']")).click();
		
	}
	@Test(priority = 16,description = "To Enable the Standard Shift")
	public void StandardShift() throws InterruptedException {
		 // Page Scroll by element
		 WebElement Scroll = driver.findElement(By.xpath("//*[normalize-space(text())='Cancel']"));
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView(true)", Scroll);
	     Thread.sleep(2000);
	     WebElement StandardShift = driver.findElement(By.xpath("//*[@aria-label='Field Switch']"));
		 js.executeScript("arguments[0].removeAttribute('disabled')", StandardShift);
		 // Now the button is enabled, you can click it
		 StandardShift.click();
		 Thread.sleep(2000);
	}
	@Test(priority = 17,description = "To Select the date and Time")
	public void StandardShiftDay() throws InterruptedException {
		driver.findElement(By.xpath(" //*[normalize-space(text())='Mon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" //*[normalize-space(text())='Tue']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" //*[normalize-space(text())='Wed']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" //*[normalize-space(text())='Thu']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" //*[normalize-space(text())='Fri']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[@data-testid='ClockIcon'])[1]")).click();
		Thread.sleep(1000);
		//Time
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		WebElement FromClanderScroll = driver.findElement(By.xpath("//*[normalize-space(text())='08'] "));
		js1.executeScript("arguments[0].scrollIntoView(true)", FromClanderScroll);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[normalize-space(text())='08']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[normalize-space(text())='AM']")).click();
		// To
		driver.findElement(By.xpath("(//*[@data-testid='ClockIcon'])[2]")).click();
		Thread.sleep(1000);
		WebElement ToClanderScroll = driver.findElement(By.xpath("//*[normalize-space(text())='08'] "));
		js1.executeScript("arguments[0].scrollIntoView(true)", ToClanderScroll);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[normalize-space(text())='09']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[normalize-space(text())='PM']")).click();
		Thread.sleep(2000);
	}
	@Test(priority = 18,description = "To Click Add Driver")
	    public void ToAddDriver() throws InterruptedException {
	    driver.findElement(By.xpath("(//*[normalize-space(text())='Add Driver'])[3]")).click();
	    Thread.sleep(6000);
	}
    @Test(priority = 19,description = "To Click the Add Driver")
   	public  void AddClickDriver() throws InterruptedException { 
    	driver.findElement(By.xpath("//div[@class='title MuiBox-root css-0']/button")).click();
		Thread.sleep(2000);
		}
    
    @Test(priority = 20,description = "To reEnter The First Name")
  	public void ReFirstName1() throws InterruptedException {
  		WebElement F_name = driver.findElement(By.xpath(
  				"//div[@class='MuiGrid-root MuiGrid-container css-il6tnd']/div[1]/div/div/div/input[@id=\"1\"]"));
  		F_name.click();
  		Thread.sleep(2000);
  		F_name.sendKeys("Raja");
  		Thread.sleep(2000);	
  	}
      @Test(priority = 21,description = "To ReEnter The Last Name")
   	public void ReLastName1() throws InterruptedException {
      	WebElement L_name = driver.findElement(By
  				.xpath("//div[@class='MuiGrid-root MuiGrid-container css-il6tnd']/div[2]/div/div/div/input[@id='2']"));
  		L_name.click();
  		Thread.sleep(2000);
  		L_name.sendKeys("Lakshmi");
  		Thread.sleep(2000);
      }

  	@Test(priority = 22,description = "To ReEnter The Email")
  	public void ReEmail1() throws InterruptedException{
  		WebElement email1 = driver.findElement(By
  				.xpath("//div[@class='MuiGrid-root MuiGrid-container css-il6tnd']/div[3]/div/div/div/input[@id='3']"));
  		email1.click();
  		Thread.sleep(2000);
  		email1.sendKeys("raji123@gmail.com");
  		Thread.sleep(2000);	
  	}
  			
  	@Test(priority = 23,description = "To Enter The ReMobile Number")
  	public void ReMobileNumber1() throws InterruptedException {
  		WebElement MobNum = driver.findElement(By
  				.xpath("//div[@class='MuiGrid-root MuiGrid-container css-il6tnd']/div[4]/div/div/div/input[@id='4']"));
  		MobNum.click();
  		Thread.sleep(2000);
  		MobNum.sendKeys("9876543210");
  		Thread.sleep(2000);	
  	}
  	
  	@Test(priority = 24,description = "To ReEnter The License Number")
  	public void ReLicenseNumber1() throws InterruptedException {
  		WebElement LicenseNum = driver.findElement(By
  				.xpath("//div[@class='MuiGrid-root MuiGrid-container css-il6tnd']/div[5]/div/div/div/input[@id='5']"));
  		LicenseNum.click();
  		Thread.sleep(2000);
  		LicenseNum.sendKeys("Tn9384789859374");
  		Thread.sleep(2000);
  	}
  	
  	@Test(priority = 25,description = "To ReEnter The License type")
  	public void ReLicenseType1() throws InterruptedException {
  		driver.findElement(By.xpath("//input[@id='6']")).click();
  		Actions actions = new Actions(driver);
  		actions.sendKeys(Keys.ARROW_DOWN).build().perform();
  		Thread.sleep(2000);
  		actions.sendKeys(Keys.ENTER).build().perform();
  		Thread.sleep(2000);
  		
  	}
  	@Test(priority = 26,description = "To ReUpload The License Document")
  	public void ReLicenseDocument1	() throws InterruptedException, AWTException {
  		driver.findElement(By.xpath("(//*[@name='License'])[1]")).click();
  		Thread.sleep(2000);
  		String file1 = "\"C:\\Users\\PriyadharshanGanesh\\Downloads\\License-Document.pdf\"";
  		;// image path
  		StringSelection Selection1 = new StringSelection(file1);
  		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection1, null);
  		Thread.sleep(3000);

  		// Robot class to performing the keyboard actions
  		Robot robot = new Robot();
  		robot.keyPress(KeyEvent.VK_CONTROL);
  		robot.keyPress(KeyEvent.VK_V);
  		robot.keyRelease(KeyEvent.VK_CONTROL);
  		robot.keyRelease(KeyEvent.VK_V);
  		Thread.sleep(3000);
  		robot.keyPress(KeyEvent.VK_ENTER);
  		robot.keyRelease(KeyEvent.VK_ENTER);
  		Thread.sleep(3000);
  	}
  	

  	@Test(priority = 27,description = "To ReUpload The Insurance Document")
  	public void ReInsuranceDocument1() throws InterruptedException, AWTException {
  		
  		driver.findElement(By.xpath("(//*[@name='License'])[2]")).click();
  		Thread.sleep(2000);
  		String file2 = "\"C:\\Users\\PriyadharshanGanesh\\Downloads\\License-Document.pdf\"";// image path
  		StringSelection Selection2 = new StringSelection(file2);
  		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection2, null);
  		Thread.sleep(5000);
  		// Robot class to performing the keyboard actions
  		Robot robot = new Robot();
  		robot.keyPress(KeyEvent.VK_CONTROL);
  		robot.keyPress(KeyEvent.VK_V);
  		robot.keyRelease(KeyEvent.VK_CONTROL);
  		robot.keyRelease(KeyEvent.VK_V);
  		Thread.sleep(3000);
  		robot.keyPress(KeyEvent.VK_ENTER);
  		robot.keyRelease(KeyEvent.VK_ENTER);
  		Thread.sleep(3000);
  	}
  	@Test(priority = 28,description = "To ReUpload The Medical Document")
  	public void ReMedicalDocument1() throws InterruptedException, AWTException{
  		driver.findElement(By.xpath("(//*[@name='License'])[3]")).click();
  		Thread.sleep(2000);
  		String file3 = "\"C:\\Users\\PriyadharshanGanesh\\Downloads\\License-Document.pdf\""; // image path
  		StringSelection Selection3 = new StringSelection(file3);
  		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection3, null);
  		Thread.sleep(5000);
  		Robot robot = new Robot();
  		robot.keyPress(KeyEvent.VK_CONTROL);
  		robot.keyPress(KeyEvent.VK_V);
  		robot.keyRelease(KeyEvent.VK_CONTROL);
  		robot.keyRelease(KeyEvent.VK_V);
  		Thread.sleep(3000);
  		robot.keyPress(KeyEvent.VK_ENTER);
  		robot.keyRelease(KeyEvent.VK_ENTER);
  		Thread.sleep(3000);
  		
  	}
  	@Test(priority = 29,description = "To ReSelect The License Expiry Date")
  	public void ReLicenseExpiryDate1() throws InterruptedException {
  		WebElement LicenseExpiryDate = driver.findElement(By.xpath("(//*[@data-testid='CalendarIcon'])[1]"));
  		LicenseExpiryDate.click();
  		Thread.sleep(2000);
  		driver.findElement(By.xpath("//*[normalize-space(text())='December 2024']")).click();
  		Thread.sleep(2000);
  		driver.findElement(By.xpath("//*[normalize-space(text())='2030']")).click();
  		Thread.sleep(2000);
  		driver.findElement(By.xpath("//*[normalize-space(text())='16']")).click();
  	}
  	
  	@Test(priority = 30,description = "To ReSelect The Insurance Expiry Date")
  	public void ReInsuranceExpiryDate1() throws InterruptedException {
  		WebElement InsuranceExpiryDate = driver.findElement(By.xpath("(//*[@data-testid='CalendarIcon'])[2]"));
  		InsuranceExpiryDate.click();
  		Thread.sleep(2000);
  		driver.findElement(By.xpath("//*[normalize-space(text())='December 2024']")).click();
  		Thread.sleep(2000);
  		driver.findElement(By.xpath("//*[normalize-space(text())='2030']")).click();
  		Thread.sleep(2000);
  		driver.findElement(By.xpath("//*[normalize-space(text())='16']")).click();
  	}
  	@Test(priority = 31,description = "To ReSelect The Medical Expiry Date")
  	public void ReMedicalExpiryDate1() throws InterruptedException {
  		WebElement MedicalExpiryDate = driver.findElement(By.xpath("(//*[@data-testid='CalendarIcon'])[3]"));
  		MedicalExpiryDate.click();
  		Thread.sleep(2000);
  		driver.findElement(By.xpath("//*[normalize-space(text())='December 2024']")).click();
  		Thread.sleep(2000);
  		driver.findElement(By.xpath("//*[normalize-space(text())='2030']")).click();
  		Thread.sleep(2000);
  		driver.findElement(By.xpath("//*[normalize-space(text())='16']")).click();
  		
  	}
	
    

	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    @Test(priority = 20,description = "To reEnter The First Name")
  	public void ReFirstName() throws InterruptedException {
  		WebElement F_name = driver.findElement(By.xpath(
  				"//div[@class='MuiGrid-root MuiGrid-container css-il6tnd']/div[1]/div/div/div/input[@id=\"1\"]"));
  		F_name.click();
  		Thread.sleep(2000);
  		F_name.sendKeys("Raja");
  		Thread.sleep(2000);	
  	}
      @Test(priority = 21,description = "To ReEnter The Last Name")
   	public void ReLastName() throws InterruptedException {
      	WebElement L_name = driver.findElement(By
  				.xpath("//div[@class='MuiGrid-root MuiGrid-container css-il6tnd']/div[2]/div/div/div/input[@id='2']"));
  		L_name.click();
  		Thread.sleep(2000);
  		L_name.sendKeys("Lakshmi");
  		Thread.sleep(2000);
      }

  	@Test(priority = 22,description = "To ReEnter The Email")
  	public void ReEmail() throws InterruptedException{
  		WebElement email1 = driver.findElement(By
  				.xpath("//div[@class='MuiGrid-root MuiGrid-container css-il6tnd']/div[3]/div/div/div/input[@id='3']"));
  		email1.click();
  		Thread.sleep(2000);
  		email1.sendKeys("raji123@gmail.com");
  		Thread.sleep(2000);	
  	}
  			
  	@Test(priority = 23,description = "To Enter The ReMobile Number")
  	public void ReMobileNumber() throws InterruptedException {
  		WebElement MobNum = driver.findElement(By
  				.xpath("//div[@class='MuiGrid-root MuiGrid-container css-il6tnd']/div[4]/div/div/div/input[@id='4']"));
  		MobNum.click();
  		Thread.sleep(2000);
  		MobNum.sendKeys("9876543210");
  		Thread.sleep(2000);	
  	}
  	
  	@Test(priority = 24,description = "To ReEnter The License Number")
  	public void ReLicenseNumber() throws InterruptedException {
  		WebElement LicenseNum = driver.findElement(By
  				.xpath("//div[@class='MuiGrid-root MuiGrid-container css-il6tnd']/div[5]/div/div/div/input[@id='5']"));
  		LicenseNum.click();
  		Thread.sleep(2000);
  		LicenseNum.sendKeys("Tn9384789859374");
  		Thread.sleep(2000);
  	}
  	
  	@Test(priority = 25,description = "To ReEnter The License type")
  	public void ReLicenseType() throws InterruptedException {
  		driver.findElement(By.xpath("//input[@id='6']")).click();
  		Actions actions = new Actions(driver);
  		actions.sendKeys(Keys.ARROW_DOWN).build().perform();
  		Thread.sleep(2000);
  		actions.sendKeys(Keys.ENTER).build().perform();
  		Thread.sleep(2000);
  		
  	}
  	@Test(priority = 26,description = "To ReUpload The License Document")
  	public void ReLicenseDocument	() throws InterruptedException, AWTException {
  		driver.findElement(By.xpath("(//*[@name='License'])[1]")).click();
  		Thread.sleep(2000);
  		String file1 = "\"C:\\Users\\PriyadharshanGanesh\\Downloads\\License-Document.pdf\"";
  		;// image path
  		StringSelection Selection1 = new StringSelection(file1);
  		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection1, null);
  		Thread.sleep(3000);

  		// Robot class to performing the keyboard actions
  		Robot robot = new Robot();
  		robot.keyPress(KeyEvent.VK_CONTROL);
  		robot.keyPress(KeyEvent.VK_V);
  		robot.keyRelease(KeyEvent.VK_CONTROL);
  		robot.keyRelease(KeyEvent.VK_V);
  		Thread.sleep(3000);
  		robot.keyPress(KeyEvent.VK_ENTER);
  		robot.keyRelease(KeyEvent.VK_ENTER);
  		Thread.sleep(3000);
  	}
  	

  	@Test(priority = 27,description = "To ReUpload The Insurance Document")
  	public void ReInsuranceDocument() throws InterruptedException, AWTException {
  		
  		driver.findElement(By.xpath("(//*[@name='License'])[2]")).click();
  		Thread.sleep(2000);
  		String file2 = "\"C:\\Users\\PriyadharshanGanesh\\Downloads\\License-Document.pdf\"";// image path
  		StringSelection Selection2 = new StringSelection(file2);
  		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection2, null);
  		Thread.sleep(5000);
  		// Robot class to performing the keyboard actions
  		Robot robot = new Robot();
  		robot.keyPress(KeyEvent.VK_CONTROL);
  		robot.keyPress(KeyEvent.VK_V);
  		robot.keyRelease(KeyEvent.VK_CONTROL);
  		robot.keyRelease(KeyEvent.VK_V);
  		Thread.sleep(3000);
  		robot.keyPress(KeyEvent.VK_ENTER);
  		robot.keyRelease(KeyEvent.VK_ENTER);
  		Thread.sleep(3000);
  	}
  	@Test(priority = 28,description = "To ReUpload The Medical Document")
  	public void ReMedicalDocument() throws InterruptedException, AWTException{
  		driver.findElement(By.xpath("(//*[@name='License'])[3]")).click();
  		Thread.sleep(2000);
  		String file3 = "\"C:\\Users\\PriyadharshanGanesh\\Downloads\\License-Document.pdf\""; // image path
  		StringSelection Selection3 = new StringSelection(file3);
  		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection3, null);
  		Thread.sleep(5000);
  		Robot robot = new Robot();
  		robot.keyPress(KeyEvent.VK_CONTROL);
  		robot.keyPress(KeyEvent.VK_V);
  		robot.keyRelease(KeyEvent.VK_CONTROL);
  		robot.keyRelease(KeyEvent.VK_V);
  		Thread.sleep(3000);
  		robot.keyPress(KeyEvent.VK_ENTER);
  		robot.keyRelease(KeyEvent.VK_ENTER);
  		Thread.sleep(3000);
  		
  	}
  	@Test(priority = 29,description = "To ReSelect The License Expiry Date")
  	public void ReLicenseExpiryDate() throws InterruptedException {
  		WebElement LicenseExpiryDate = driver.findElement(By.xpath("(//*[@data-testid='CalendarIcon'])[1]"));
  		LicenseExpiryDate.click();
  		Thread.sleep(2000);
  		driver.findElement(By.xpath("//*[normalize-space(text())='December 2024']")).click();
  		Thread.sleep(2000);
  		driver.findElement(By.xpath("//*[normalize-space(text())='2030']")).click();
  		Thread.sleep(2000);
  		driver.findElement(By.xpath("//*[normalize-space(text())='16']")).click();
  	}
  	
  	@Test(priority = 30,description = "To ReSelect The Insurance Expiry Date")
  	public void ReInsuranceExpiryDate() throws InterruptedException {
  		WebElement InsuranceExpiryDate = driver.findElement(By.xpath("(//*[@data-testid='CalendarIcon'])[2]"));
  		InsuranceExpiryDate.click();
  		Thread.sleep(2000);
  		driver.findElement(By.xpath("//*[normalize-space(text())='December 2024']")).click();
  		Thread.sleep(2000);
  		driver.findElement(By.xpath("//*[normalize-space(text())='2030']")).click();
  		Thread.sleep(2000);
  		driver.findElement(By.xpath("//*[normalize-space(text())='16']")).click();
  	}
  	@Test(priority = 31,description = "To ReSelect The Medical Expiry Date")
  	public void ReMedicalExpiryDate() throws InterruptedException {
  		WebElement MedicalExpiryDate = driver.findElement(By.xpath("(//*[@data-testid='CalendarIcon'])[3]"));
  		MedicalExpiryDate.click();
  		Thread.sleep(2000);
  		driver.findElement(By.xpath("//*[normalize-space(text())='December 2024']")).click();
  		Thread.sleep(2000);
  		driver.findElement(By.xpath("//*[normalize-space(text())='2030']")).click();
  		Thread.sleep(2000);
  		driver.findElement(By.xpath("//*[normalize-space(text())='16']")).click();
  		
  	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
