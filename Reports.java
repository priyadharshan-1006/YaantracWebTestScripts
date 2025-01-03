package YaantracAutomation;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Reports extends YaaanTrips{

	public void DeleteTrip() throws InterruptedException {
		DeleteTrip();
	}
	// Management
	@Test(priority = 60, description = "Testcase for click Management Button ")
	public void ClickManagement() throws InterruptedException {
	driver.findElement(By.xpath("//span[@aria-label='Management']")).click();
	Thread.sleep(2000);
	}
	
	@Test(priority = 61, description = "Testcase View report and Select report Alert ")
	public void AlertReport() throws InterruptedException {
	// ReportDropDown
	driver.findElement(By.id("select-report")).click();
	Thread.sleep(2000);
	Actions SelectVehicle2 = new Actions(driver);
	SelectVehicle2.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	SelectVehicle2.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	}
	
	// Management_Report_Alert
	@Test(priority = 62, description = "Testcase Select Vehicle for Alert Report ")
	public void SelectVehiceForAlertReport() throws InterruptedException {
	driver.findElement(By.id("select-vehicle")).click();
	Thread.sleep(2000);
	Actions SelectVehicleReport = new Actions(driver);
	SelectVehicleReport.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	SelectVehicleReport.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	}
	
	// ChooseDateFrom and To
	@Test(priority = 63, description = "Testcase for choose date range ")
	public void ChooseDateRange() throws InterruptedException {
	driver.findElement(By.xpath("//input[@placeholder='From']")).click();
	Thread.sleep(2000);
	WebElement DateChooseReport = driver.findElement(By.xpath("(//button[@aria-label='Choose date'])[1]"));
	Actions ChooseDateReport = new Actions(driver);
	Thread.sleep(2000);
	ChooseDateReport.moveToElement(DateChooseReport).click().perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[normalize-space(text())='Last 30 days']")).click();
	Thread.sleep(2000);
	}
	
	// GetReport
	@Test(priority = 64, description = "Testcase for Get AlertReport ")
	public void GetAlertReport() throws InterruptedException {
	driver.findElement(By.xpath("//button[normalize-space(text())='Get Report']")).click();
	Thread.sleep(2000);
	}
	// Management_Report_DeviceHealth
	// ToClickDeviceHealth
	@Test(priority = 65, description = "Testcase for Device health report ")
	public void DeviceHealthReport() throws InterruptedException {
	driver.findElement(By.id("select-report")).click();
	Thread.sleep(2000);
	Actions SelectVehicleDeviceHealth = new Actions(driver);
	for (int i = 0; i < 2; i++) {
		SelectVehicleDeviceHealth.sendKeys(Keys.ARROW_DOWN).perform();
	}
	Thread.sleep(2000);
	SelectVehicleDeviceHealth.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	}
	
	// GetReport
	@Test(priority = 66, description = "Testcase for Get Device health report ")
	public void GetDeviceHealthReport() throws InterruptedException {
	driver.findElement(By.xpath("//button[normalize-space(text())='Get Report']")).click();
	Thread.sleep(2000);
	}
	
	// Download
	@Test(priority = 67, description = "Testcase for download Device health report ")
	public void DownloadDeviceHealthReport() throws InterruptedException {
	driver.findElement(By.xpath("//button[normalize-space(text())='Download']")).click();
	}
	
	// Send mail
	@Test(priority = 68, description = "Testcase for Send Mail Device health report ")
	public void MailDeviceHealthReport() throws InterruptedException {
	driver.findElement(By.id("document")).click();
	Actions DocumentType = new Actions(driver);
	DocumentType.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	DocumentType.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[normalize-space(text())='Send Mail']")).click();
	Thread.sleep(2000);
	}
	
	// Management-Report-DeviceScorecard.
	// ToClickDeviceScorecard.
	
	@Test(priority = 69, description = "Testcase for Diver Score Card ")
	public void DriverscoreCard() throws InterruptedException {
	driver.findElement(By.id("select-report")).click();
	Actions SelectReportDriverScroreCard = new Actions(driver);
	for (int i = 0; i < 3; i++) {
		SelectReportDriverScroreCard.sendKeys(Keys.ARROW_DOWN).perform();
	}
	Thread.sleep(2000);
	SelectReportDriverScroreCard.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	}
	
	// ChooseDateFrom
	@Test(priority = 70, description = "Testcase for Choose Date Date range for Diver Score Card ")
	public void ChooseDateRangeDriverscoreCard() throws InterruptedException {
	driver.findElement(By.id("select-report")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[2]"))
	.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@aria-label='Choose date'])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[normalize-space(text())='Last 30 days']")).click();
	Thread.sleep(2000);
	}
	
	// GetReport
	@Test(priority = 71, description = "Testcase for Get Driver Score Card ")
	public void GetDriverScoreCard() throws InterruptedException {
	driver.findElement(By.xpath("//button[normalize-space(text())='Get Report']")).click();
	}
	
	// Management-Report-DeviceIdentification.
	// ToClickDeviceIdentification.
	@Test(priority = 72, description = "Testcase for Driver Identification ")
	public void DriverIdentification() throws InterruptedException {
	driver.findElement(By.id("select-report")).click();
	Actions SelectReportDriverIdentification = new Actions(driver);
	for (int i = 0; i < 4; i++) {
		SelectReportDriverIdentification.sendKeys(Keys.ARROW_DOWN).perform();
	}
	Thread.sleep(2000);
	SelectReportDriverIdentification.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	}
	
	// ToVehicleNumber
	@Test(priority = 73, description = "Testcase for select vehuicle number Driver Identification ")
	public void VehicleNumberSelect() throws InterruptedException {
	driver.findElement(By.xpath("//input[@placeholder='Vehicle No.']")).click();
	Actions ReportVehicleNumber = new Actions(driver);
	ReportVehicleNumber.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	ReportVehicleNumber.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	}
	
	// ChooseDateFrom
	@Test(priority = 74, description = "Testcase for Choose Date Range Driver Identification ")
	public void ChooseDateRangeForDriverID() throws InterruptedException {
	driver.findElement(By.xpath("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[3]"))
	.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@aria-label='Choose date'])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[normalize-space(text())='Last 30 days']")).click();
	Thread.sleep(2000);
	}
	
	// GetReport
	@Test(priority = 75, description = "Testcase for Get Driver Identification Report ")
	public void GetDriverId() throws InterruptedException {
	driver.findElement(By.xpath("//button[normalize-space(text())='Get Report']")).click();
	Thread.sleep(2000);
	}
	
	// Management-Report-Engine.
	// ToClickEngine
	@Test(priority = 76, description = "Testcase for Engine Report ")
	public void Engineport() throws InterruptedException {
	driver.findElement(By.id("select-report")).click();
	Actions SelectReportEngine = new Actions(driver);
	for (int i = 0; i < 5; i++) {
		SelectReportEngine.sendKeys(Keys.ARROW_DOWN).perform();
	}
	Thread.sleep(2000);
	SelectReportEngine.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	}
	
	// VehicleNumber
	@Test(priority = 77, description = "Testcase for SelectVehicle Number Engine Report ")
	public void SelectVehicleNumerER() throws InterruptedException {
	driver.findElement(By.xpath("//input[@placeholder='Vehicle No.']")).click();
	Actions ReportVehicleNumberEngine = new Actions(driver);
	ReportVehicleNumberEngine.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	ReportVehicleNumberEngine.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	}
	
	@Test(priority = 78, description = "Testcase for choose Date range Engine Report ")
	public void ChooseDaterangeER() throws InterruptedException {
	// ChooseDateFrom
	driver.findElement(By.xpath("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[3]"))
	.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@aria-label='Choose date'])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[normalize-space(text())='Last 30 days']")).click();
	Thread.sleep(2000);
	}
	
	// GetReport
	@Test(priority = 79, description = "Testcase for get  Engine Report ")
	public void GetEngineReport() throws InterruptedException {
	driver.findElement(By.xpath("//button[normalize-space(text())='Get Report']")).click();
	Thread.sleep(2000);
	}
	
	// Download
	
	@Test(priority = 80, description = "Testcase for download Engine Report ")
	public void DownloadEngineReport() throws InterruptedException {
	driver.findElement(By.xpath("//button[normalize-space(text())='Download']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("document")).click();
	Actions DocumentTypeEngine = new Actions(driver);
	DocumentTypeEngine.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	DocumentTypeEngine.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[normalize-space(text())='Send Mail']")).click();
	}
	
	// Management-Report-Idle
	// ToClickIdle
	@Test(priority = 81, description = "Testcase for Idle Report ")
	public void IdleReport() throws InterruptedException {
	driver.findElement(By.id("select-report")).click();
	Actions SelectReportIdle = new Actions(driver);
	for (int i = 0; i < 6; i++) {
		SelectReportIdle.sendKeys(Keys.ARROW_DOWN).perform();
	}
	Thread.sleep(2000);
	SelectReportIdle.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	}
	
	// VehicleNumber
	@Test(priority = 82, description = "Testcase for select Vehicle Number Idle Report ")
	public void IdleReportVehicleNumber() throws InterruptedException {
	driver.findElement(By.xpath("//input[@placeholder='Vehicle No.']")).click();
	Actions ReportVehicleNumbeIdle = new Actions(driver);
	ReportVehicleNumbeIdle.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	ReportVehicleNumbeIdle.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	}
	
	
	// ChooseDateFrom
	@Test(priority = 83, description = "Testcase for Choose Date range Idle Report ")
	public void ChooseDateRangeIdle() throws InterruptedException {
	driver.findElement(By.xpath("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[3]"))
	.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@aria-label='Choose date'])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[normalize-space(text())='Last 30 days']")).click();
	Thread.sleep(2000);
	}
	
	// GetReport
	@Test(priority = 84, description = "Testcase for Get Idle Report ")
	public void GetIdleReport() throws InterruptedException {
	driver.findElement(By.xpath("//button[normalize-space(text())='Get Report']")).click();
	Thread.sleep(2000);
	// Download
	driver.findElement(By.xpath("//button[normalize-space(text())='Download']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("document")).click();
	Thread.sleep(2000);
	Actions DocumentTypeIdle = new Actions(driver);
	DocumentTypeIdle.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	DocumentTypeIdle.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	// SendMail
	driver.findElement(By.xpath("//button[normalize-space(text())='Send Mail']")).click();
	Thread.sleep(2000);
	}
	
	
	// Management-Report-KM
	// ToClickKm
	
	@Test(priority = 85, description = "Testcase for KM Report ")
	public void KMReport() throws InterruptedException {
	driver.findElement(By.id("select-report")).click();
	Actions SelectReportKM = new Actions(driver);
	for (int i = 0; i < 7; i++) {
		SelectReportKM.sendKeys(Keys.ARROW_DOWN).perform();
	}
	Thread.sleep(2000);
	SelectReportKM.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	}
	
	
	@Test(priority = 86, description = "Testcase for Select Vehicle number KM Report ")
	public void SelectVehicleKM() throws InterruptedException {
	// VehicleNumber
	driver.findElement(By.xpath("//input[@placeholder='Vehicle No.']")).click();
	Actions ReportVehicleNumbeKM = new Actions(driver);
	ReportVehicleNumbeKM.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	ReportVehicleNumbeKM.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	}
	
	@Test(priority = 87, description = "Testcase for Choose Date, KM Report ")
	public void ChooseDateKM() throws InterruptedException {
	// ChooseDateFrom
	driver.findElement(By.xpath("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[3]"))
	.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@aria-label='Choose date'])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[normalize-space(text())='Last 30 days']")).click();
	Thread.sleep(2000);
	}
	
	// GetReport
	
	@Test(priority = 88, description = "Testcase for Get KM Report ")
	public void GetKMReport() throws InterruptedException {
	driver.findElement(By.xpath("//button[normalize-space(text())='Get Report']")).click();
	Thread.sleep(2000);
	// Download
	driver.findElement(By.xpath("//button[normalize-space(text())='Download']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("document")).click();
	Thread.sleep(2000);
	Actions DocumentTypeKM = new Actions(driver);
	DocumentTypeKM.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	DocumentTypeKM.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	// SendMail
	driver.findElement(By.xpath("//button[normalize-space(text())='Send Mail']")).click();
	Thread.sleep(2000);
	}
	
	// Management-Report-Movement
	// ToClickMovement
	
	@Test(priority = 89, description = "Testcase for Movement report ")
	public void Movement() throws InterruptedException {
	driver.findElement(By.id("select-report")).click();
	Actions SelectReportMovement = new Actions(driver);
	for (int i = 0; i < 8; i++) {
		SelectReportMovement.sendKeys(Keys.ARROW_DOWN).perform();
	}
	Thread.sleep(2000);
	SelectReportMovement.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	}
	
	// VehicleNumber
	@Test(priority = 90, description = "Testcase for Select Vehicle Number, Movement Report")
	public void SelectVehicleMovement() throws InterruptedException {
	driver.findElement(By.xpath("//input[@placeholder='Vehicle No.']")).click();
	Actions ReportVehicleNumbeMovement = new Actions(driver);
	ReportVehicleNumbeMovement.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	ReportVehicleNumbeMovement.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	}
	
	// ChooseDateFrom
	@Test(priority = 91, description = "Testcase for Choose Date, Movement Report")
	public void ChooseDateMovement() throws InterruptedException {
	driver.findElement(By.xpath("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[3]"))
	.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@aria-label='Choose date'])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[normalize-space(text())='Last 30 days']")).click();
	Thread.sleep(2000);
	}
	
	@Test(priority = 92, description = "Testcase for Get Movement Report")
	public void GetMovement() throws InterruptedException {
	driver.findElement(By.xpath("//button[normalize-space(text())='Get Report']")).click();
	Thread.sleep(2000);
	// Download
	driver.findElement(By.xpath("//button[normalize-space(text())='Download']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("document")).click();
	Thread.sleep(2000);
	Actions DocumentTypeMovement = new Actions(driver);
	DocumentTypeMovement.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	DocumentTypeMovement.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	// SendMail
	driver.findElement(By.xpath("//button[normalize-space(text())='Send Mail']")).click();
	Thread.sleep(2000);

	// Management-Report-Overall
	// ToClickOverall
	driver.findElement(By.id("select-report")).click();
	Actions SelectReportOverall = new Actions(driver);
	for (int i = 0; i < 9; i++) {
		SelectReportOverall.sendKeys(Keys.ARROW_DOWN).perform();
	}
	Thread.sleep(2000);
	SelectReportOverall.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	// VehicleNumber
	driver.findElement(By.xpath("//input[@placeholder='Vehicle No.']")).click();
	Actions ReportVehicleNumbeOverall = new Actions(driver);
	ReportVehicleNumbeOverall.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	ReportVehicleNumbeOverall.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	// ChooseDateFrom
	driver.findElement(By.xpath("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[3]"))
	.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@aria-label='Choose date'])[1]")).click();
	Thread.sleep(2000);
	// ChooseDateTo
	driver.findElement(By.xpath("//span[normalize-space(text())='Last 30 days']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[normalize-space(text())='Get Report']")).click();
	Thread.sleep(2000);
	// Download
	driver.findElement(By.xpath("//button[normalize-space(text())='Download']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("document")).click();
	Thread.sleep(2000);
	Actions DocumentTypeOverall = new Actions(driver);
	DocumentTypeOverall.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	DocumentTypeOverall.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	// SendMail
	driver.findElement(By.xpath("//button[normalize-space(text())='Send Mail']")).click();
	Thread.sleep(2000);
	}
	
	// Management-Report-OverSpeed
	// ToClickOverSpeed
	
	@Test(priority = 93, description = "Testcase for Over speed Report")
	public void OverSpeed() throws InterruptedException {
	driver.findElement(By.id("select-report")).click();
	Actions SelectReportOverSpeed = new Actions(driver);
	for (int i = 0; i < 10; i++) {
		SelectReportOverSpeed.sendKeys(Keys.ARROW_DOWN).perform();
	}
	Thread.sleep(2000);
	SelectReportOverSpeed.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	}
	
	// VehicleNumber
	@Test(priority = 94, description = "Testcase for select vehicle, Over speed Report")
	public void VehicleNumberOverSpeed() throws InterruptedException {
	driver.findElement(By.xpath("//input[@placeholder='Vehicle No.']")).click();
	Actions ReportVehicleNumbeOverspeed = new Actions(driver);
	ReportVehicleNumbeOverspeed.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	ReportVehicleNumbeOverspeed.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	}
	
	
	// ChooseDateFrom
	@Test(priority = 95, description = "Testcase for Choose Date , Over speed Report")
	public void ChooseDateOverspeed() throws InterruptedException {
	driver.findElement(By.xpath("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[3]"))
	.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@aria-label='Choose date'])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[normalize-space(text())='Last 30 days']")).click();
	Thread.sleep(2000);
	}
	
	
	// GetReport
	@Test(priority = 96, description = "Testcase for get Over speed Report")
	public void GetOverspeed() throws InterruptedException {
	driver.findElement(By.xpath("//button[normalize-space(text())='Get Report']")).click();
	Thread.sleep(2000);
	// Download
	driver.findElement(By.xpath("//button[normalize-space(text())='Download']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("document")).click();
	Thread.sleep(2000);
	Actions DocumentTypeOverspeed = new Actions(driver);
	DocumentTypeOverspeed.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	DocumentTypeOverspeed.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	// SendMail
	driver.findElement(By.xpath("//button[normalize-space(text())='Send Mail']")).click();
	Thread.sleep(2000);
	}
	
	
	
	// Management-Report-Parking
	// ToClickParking
	@Test(priority = 97, description = "Testcase for Parking Report")
	public void Parking() throws InterruptedException {
	driver.findElement(By.id("select-report")).click();
	Actions SelectReportParking = new Actions(driver);
	for (int i = 0; i < 11; i++) {
		SelectReportParking.sendKeys(Keys.ARROW_DOWN).perform();
	}
	Thread.sleep(2000);
	SelectReportParking.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	}
	
	// Vehicle
	@Test(priority = 98, description = "Testcase for Select Vehicle, Parking Report")
	public void SelectVehicleParking() throws InterruptedException {
	driver.findElement(By.xpath("//input[@placeholder='Vehicle No.']")).click();
	Actions ReportVehicleNumbeParking = new Actions(driver);
	ReportVehicleNumbeParking.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	ReportVehicleNumbeParking.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	}
	
	// ChooseDateFrom
	@Test(priority = 99, description = "Testcase for Choose Date, Parking Report")
	public void ChooseDateMvement() throws InterruptedException {
	driver.findElement(By.xpath("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[3]"))
	.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@aria-label='Choose date'])[1]")).click();
	Thread.sleep(2000);
	// ChooseDateTo
	driver.findElement(By.xpath("//span[normalize-space(text())='Last 30 days']")).click();
	Thread.sleep(2000);
	
	}
	// GetReport
	
	@Test(priority = 100, description = "Testcase for Get Parking Report")
	public void GetParking() throws InterruptedException {
	driver.findElement(By.xpath("//button[normalize-space(text())='Get Report']")).click();
	Thread.sleep(2000);
	// Download
	driver.findElement(By.xpath("//button[normalize-space(text())='Download']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("document")).click();
	Thread.sleep(2000);
	Actions DocumentTypeParking = new Actions(driver);
	DocumentTypeParking.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	DocumentTypeParking.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	// SendMail
	driver.findElement(By.xpath("//button[normalize-space(text())='Send Mail']")).click();
	Thread.sleep(2000);
	}

	
	// Management-Report-Stoppage
	// ToClickStoppage
	@Test(priority = 101, description = "Testcase for Stoppage Report")
	public void Stoppage() throws InterruptedException {
	driver.findElement(By.id("select-report")).click();
	Actions SelectReportStoppage = new Actions(driver);
	for (int i = 0; i < 12; i++) {
		SelectReportStoppage.sendKeys(Keys.ARROW_DOWN).perform();
	}
	Thread.sleep(2000);
	SelectReportStoppage.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	}
	
	
	// VehicleNumber
	@Test(priority = 102, description = "Testcase for Select vehice Stoppage Report")
	public void StoppageSelectVehicle() throws InterruptedException {
	driver.findElement(By.xpath("//input[@placeholder='Vehicle No.']")).click();
	Actions ReportVehicleNumbeStoppage = new Actions(driver);
	ReportVehicleNumbeStoppage.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	ReportVehicleNumbeStoppage.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	}
	
	// ChooseDateFrom
	@Test(priority = 103, description = "Testcase for Choose Date, Stoppage Report")
	public void StoppageChooseDate() throws InterruptedException {
	driver.findElement(By.xpath("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[3]"))
	.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@aria-label='Choose date'])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[normalize-space(text())='Last 30 days']")).click();
	Thread.sleep(2000);
	}
	
	// GetReport
	@Test(priority = 104, description = "Testcase for Get Stoppage Report")
	public void GetStoppage() throws InterruptedException {
	driver.findElement(By.xpath("//button[normalize-space(text())='Get Report']")).click();
	Thread.sleep(2000);
	// Download
	driver.findElement(By.xpath("//button[normalize-space(text())='Download']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("document")).click();
	Thread.sleep(2000);
	Actions DocumentTypeStoppage = new Actions(driver);
	DocumentTypeStoppage.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	DocumentTypeStoppage.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	// SendMail
	driver.findElement(By.xpath("//button[normalize-space(text())='Send Mail']")).click();
	Thread.sleep(2000);
	}
	
	// Management-Report-TripDetails
	// ToClickTripDetails
	@Test(priority = 105, description = "Testcase for Trip Details Report")
	public void TripDetails() throws InterruptedException {
	driver.findElement(By.id("select-report")).click();
	Actions SelectReportTripDetails = new Actions(driver);
	for (int i = 0; i < 13; i++) {
		SelectReportTripDetails.sendKeys(Keys.ARROW_DOWN).perform();
	}
	Thread.sleep(2000);
	SelectReportTripDetails.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	}
	
	// VehicleNumber
	@Test(priority = 106, description = "Testcase for Select Vehicle Trip Details Report")
	public void SelectVehicleTripDetails() throws InterruptedException {
	driver.findElement(By.xpath("//input[@placeholder='Vehicle No.']")).click();
	Actions ReportVehicleNumbeTripDetails = new Actions(driver);
	ReportVehicleNumbeTripDetails.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	ReportVehicleNumbeTripDetails.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	}
	
	// ChooseDateFrom
	@Test(priority = 107, description = "Testcase for Choose date Trip Details Report")
	public void ChooseDateTripDetails() throws InterruptedException {
	driver.findElement(By.xpath("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[3]"))
	.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@aria-label='Choose date'])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[normalize-space(text())='Last 30 days']")).click();
	Thread.sleep(2000);
	}
	
	// GetReport
	@Test(priority = 108, description = "Testcase for Get Trip Details Report")
	public void GetTripDetails() throws InterruptedException {
	driver.findElement(By.xpath("//button[normalize-space(text())='Get Report']")).click();
	Thread.sleep(2000);
	// Download
	driver.findElement(By.xpath("//button[normalize-space(text())='Download']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("document")).click();
	Thread.sleep(2000);
	Actions DocumentTypeTripDetails = new Actions(driver);
	DocumentTypeTripDetails.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	DocumentTypeTripDetails.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	// SendMail
	driver.findElement(By.xpath("//button[normalize-space(text())='Send Mail']")).click();
	Thread.sleep(2000);
	}
	
	
	// Management-Report-TripCompliance
	// ToClickTripCompliance
	@Test(priority = 109, description = "Testcase for Trip complaince  Report")
	public void TripComplaince() throws InterruptedException {
	driver.findElement(By.id("select-report")).click();
	Actions SelectReportTripCompliance = new Actions(driver);
	for (int i = 0; i < 14; i++) {
		SelectReportTripCompliance.sendKeys(Keys.ARROW_DOWN).perform();
	}
	Thread.sleep(2000);
	SelectReportTripCompliance.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	}
	
	// VehicleNumber
	@Test(priority = 110, description = "Testcase for Select Vehicle Trip complaince  Report")
	public void SelectVehicleTripComplaince() throws InterruptedException {
	driver.findElement(By.xpath("//input[@placeholder='Vehicle No.']")).click();
	Actions ReportVehicleNumbeTripCompliance = new Actions(driver);
	ReportVehicleNumbeTripCompliance.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	ReportVehicleNumbeTripCompliance.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	}
	
	// ChooseDateFrom
	@Test(priority = 111, description = "Testcase for Choose Date, Trip complaince  Report")
	public void ChooseDateTripComplaince() throws InterruptedException {
	driver.findElement(By.xpath("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[3]"))
	.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@aria-label='Choose date'])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[normalize-space(text())='Last 30 days']")).click();
	Thread.sleep(2000);
	}
	
	
	// GetReport
	@Test(priority = 112, description = "Testcase for Get Trip complaince  Report")
	public void GetTripComplaince() throws InterruptedException {
	driver.findElement(By.xpath("//button[normalize-space(text())='Get Report']")).click();
	Thread.sleep(2000);
	// Download
	driver.findElement(By.xpath("//button[normalize-space(text())='Download']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("document")).click();
	Thread.sleep(2000);
	Actions DocumentTypeTripCompliance = new Actions(driver);
	DocumentTypeTripCompliance.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	DocumentTypeTripCompliance.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	// SendMail
	driver.findElement(By.xpath("//button[normalize-space(text())='Send Mail']")).click();
	Thread.sleep(2000);
	}
	
	// Management-Report-VehicleDetails
	// ToClickVehicleDetails
	@Test(priority = 113, description = "Testcase for Vehicle Details Report")
	public void VehicleDetails() throws InterruptedException {
	driver.findElement(By.id("select-report")).click();
	Actions SelectReportVehicleDetails = new Actions(driver);
	for (int i = 0; i < 15; i++) {
		SelectReportVehicleDetails.sendKeys(Keys.ARROW_DOWN).perform();
	}
	Thread.sleep(2000);
	SelectReportVehicleDetails.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	}
	
	// GetReport
	@Test(priority = 114, description = "Testcase for Get Vehicle Details Report")
	public void GetVehicleDetails() throws InterruptedException {
	driver.findElement(By.xpath("//button[normalize-space(text())='Get Report']")).click();
	}
	// Management-Report-VehicleGeofence
	// ToClickVehicleGeofence
	
	@Test(priority = 115, description = "Testcase for Vehicle geofence Report")
	public void VehicleGeofence() throws InterruptedException {
	driver.findElement(By.id("select-report")).click();
	Actions SelectReportVehicleGeofence = new Actions(driver);
	for (int i = 0; i < 16; i++) {
		SelectReportVehicleGeofence.sendKeys(Keys.ARROW_DOWN).perform();
	}
	Thread.sleep(2000);
	SelectReportVehicleGeofence.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	}
	
	// VehicleNumber
	@Test(priority = 116, description = "Testcase for Vehicle geofence Report")
	public void VehicleNumberGeofence() throws InterruptedException {
	driver.findElement(By.xpath("//input[@placeholder='Vehicle No.']")).click();
	Actions ReportVehicleNumbeVehicleGeofence = new Actions(driver);
	ReportVehicleNumbeVehicleGeofence.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	ReportVehicleNumbeVehicleGeofence.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	}
	
	// ChooseDateFrom
	@Test(priority = 117, description = "Testcase for Choose Date, Vehicle geofence Report")
	public void ChooseDateGeofence() throws InterruptedException {
	driver.findElement(By.xpath("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[3]"))
	.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@aria-label='Choose date'])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[normalize-space(text())='Last 30 days']")).click();
	Thread.sleep(2000);
	}
	
	@Test(priority = 118, description = "Testcase for Get Vehicle geofence Report")
	public void GetGeofence() throws InterruptedException {
	driver.findElement(By.xpath("//button[normalize-space(text())='Get Report']")).click();
	Thread.sleep(2000);
	// Download
	driver.findElement(By.xpath("//button[normalize-space(text())='Download']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("document")).click();
	Thread.sleep(2000);
	Actions DocumentTypeVehicleGeofence = new Actions(driver);
	DocumentTypeVehicleGeofence.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	DocumentTypeVehicleGeofence.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	// SendMail
	driver.findElement(By.xpath("//button[normalize-space(text())='Send Mail']")).click();
	Thread.sleep(2000);

}
}