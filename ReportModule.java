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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.json.JsonException;

public class ReportModule {

	public static void main(String[] args) throws InterruptedException {
		
		// Notification Handle
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 1);
		options.setExperimentalOption("prefs", prefs);

		// To launch Browers

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://dev-v2.yaantrac.com/");
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
		Thread.sleep(2000);

		// Management
		driver.findElement(By.xpath("//span[@aria-label='Management']")).click();
		Thread.sleep(2000);

		// ReportDropDown
		driver.findElement(By.id("select-report")).click();
		Thread.sleep(2000);
		Actions SelectVehicle2 = new Actions(driver);
		SelectVehicle2.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		SelectVehicle2.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		// Management_Report_Alert
		driver.findElement(By.id("select-vehicle")).click();
		Thread.sleep(2000);
		Actions SelectVehicleReport = new Actions(driver);
		SelectVehicleReport.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		SelectVehicleReport.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		// ChooseDateFrom
		driver.findElement(By.xpath("//input[@placeholder='From']")).click();
		Thread.sleep(2000);
		WebElement DateChooseReport = driver.findElement(By.xpath("(//button[@aria-label='Choose date'])[1]"));
		Actions ChooseDateReport = new Actions(driver);
		Thread.sleep(2000);
		ChooseDateReport.moveToElement(DateChooseReport).click().perform();
		Thread.sleep(2000);
		// ChooseDateTo
		driver.findElement(By.xpath("//span[normalize-space(text())='Last 30 days']")).click();
		Thread.sleep(2000);
		// GetReport
		driver.findElement(By.xpath("//button[normalize-space(text())='Get Report']")).click();
		Thread.sleep(2000);

		// Management_Report_DeviceHealth
		// ToClickDeviceHealth
		driver.findElement(By.id("select-report")).click();
		Thread.sleep(2000);
		Actions SelectVehicleDeviceHealth = new Actions(driver);
		for (int i = 0; i < 2; i++) {
			SelectVehicleDeviceHealth.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(2000);
		SelectVehicleDeviceHealth.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		// GetReport
		driver.findElement(By.xpath("//button[normalize-space(text())='Get Report']")).click();
		Thread.sleep(2000);
		// Download
		driver.findElement(By.xpath("//button[normalize-space(text())='Download']")).click();
		// Send mail
		driver.findElement(By.id("document")).click();
		Actions DocumentType = new Actions(driver);
		DocumentType.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		DocumentType.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space(text())='Send Mail']")).click();
		Thread.sleep(2000);

		// Management-Report-DeviceScorecard.
		// ToClickDeviceScorecard.
		driver.findElement(By.id("select-report")).click();
		Actions SelectReportDriverScroreCard = new Actions(driver);
		for (int i = 0; i < 3; i++) {
			SelectReportDriverScroreCard.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(2000);
		SelectReportDriverScroreCard.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		// ChooseDateFrom
		driver.findElement(By.xpath("(//input[contains(@class,'MuiInputBase-input MuiOutlinedInput-input')])[2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@aria-label='Choose date'])[1]")).click();
		Thread.sleep(2000);
		// ChooseDateTo
		driver.findElement(By.xpath("//span[normalize-space(text())='Last 30 days']")).click();
		Thread.sleep(2000);
		// GetReport
		driver.findElement(By.xpath("//button[normalize-space(text())='Get Report']")).click();

		// Management-Report-DeviceIdentification.
		// ToClickDeviceIdentification.
		driver.findElement(By.id("select-report")).click();
		Actions SelectReportDriverIdentification = new Actions(driver);
		for (int i = 0; i < 4; i++) {
			SelectReportDriverIdentification.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(2000);
		SelectReportDriverIdentification.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		// ToVehicleNumber
		driver.findElement(By.xpath("//input[@placeholder='Vehicle No.']")).click();
		Actions ReportVehicleNumber = new Actions(driver);
		ReportVehicleNumber.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		ReportVehicleNumber.sendKeys(Keys.ENTER).perform();
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
		// GetReport
		driver.findElement(By.xpath("//button[normalize-space(text())='Get Report']")).click();
		Thread.sleep(2000);

		// Management-Report-Engine.
		// ToClickEngine
		driver.findElement(By.id("select-report")).click();
		Actions SelectReportEngine = new Actions(driver);
		for (int i = 0; i < 5; i++) {
			SelectReportEngine.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(2000);
		SelectReportEngine.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		// VehicleNumber
		driver.findElement(By.xpath("//input[@placeholder='Vehicle No.']")).click();
		Actions ReportVehicleNumbeEnginer = new Actions(driver);
		ReportVehicleNumbeEnginer.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		ReportVehicleNumbeEnginer.sendKeys(Keys.ENTER).perform();
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
		// GetReport
		driver.findElement(By.xpath("//button[normalize-space(text())='Get Report']")).click();
		Thread.sleep(2000);
		// Download
		driver.findElement(By.xpath("//button[normalize-space(text())='Download']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("document")).click();
		Actions DocumentTypeEngine = new Actions(driver);
		DocumentTypeEngine.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		DocumentTypeEngine.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		// SendMail
		driver.findElement(By.xpath("//button[normalize-space(text())='Send Mail']")).click();

		// Management-Report-Idle
		// ToClickIdle
		driver.findElement(By.id("select-report")).click();
		Actions SelectReportIdle = new Actions(driver);
		for (int i = 0; i < 6; i++) {
			SelectReportIdle.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(2000);
		SelectReportIdle.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		// VehicleNumber
		driver.findElement(By.xpath("//input[@placeholder='Vehicle No.']")).click();
		Actions ReportVehicleNumbeIdle = new Actions(driver);
		ReportVehicleNumbeIdle.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		ReportVehicleNumbeIdle.sendKeys(Keys.ENTER).perform();
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
		// GetReport
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

		// Management-Report-KM
		// ToClickKm
		driver.findElement(By.id("select-report")).click();
		Actions SelectReportKM = new Actions(driver);
		for (int i = 0; i < 7; i++) {
			SelectReportKM.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(2000);
		SelectReportKM.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		// VehicleNumber
		driver.findElement(By.xpath("//input[@placeholder='Vehicle No.']")).click();
		Actions ReportVehicleNumbeKM = new Actions(driver);
		ReportVehicleNumbeKM.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		ReportVehicleNumbeKM.sendKeys(Keys.ENTER).perform();
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
		// GetReport
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

		// Management-Report-Movement
		// ToClickMovement
		driver.findElement(By.id("select-report")).click();
		Actions SelectReportMovement = new Actions(driver);
		for (int i = 0; i < 8; i++) {
			SelectReportMovement.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(2000);
		SelectReportMovement.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		// VehicleNumber
		driver.findElement(By.xpath("//input[@placeholder='Vehicle No.']")).click();
		Actions ReportVehicleNumbeMovement = new Actions(driver);
		ReportVehicleNumbeMovement.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		ReportVehicleNumbeMovement.sendKeys(Keys.ENTER).perform();
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

		// Management-Report-OverSpeed
		// ToClickOverSpeed
		driver.findElement(By.id("select-report")).click();
		Actions SelectReportOverSpeed = new Actions(driver);
		for (int i = 0; i < 10; i++) {
			SelectReportOverSpeed.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(2000);
		SelectReportOverSpeed.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		// VehicleNumber
		driver.findElement(By.xpath("//input[@placeholder='Vehicle No.']")).click();
		Actions ReportVehicleNumbeOverspeed = new Actions(driver);
		ReportVehicleNumbeOverspeed.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		ReportVehicleNumbeOverspeed.sendKeys(Keys.ENTER).perform();
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
		// GetReport
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

		// Management-Report-Parking
		// ToClickParking
		driver.findElement(By.id("select-report")).click();
		Actions SelectReportParking = new Actions(driver);
		for (int i = 0; i < 11; i++) {
			SelectReportParking.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(2000);
		SelectReportParking.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		// Vehicle
		driver.findElement(By.xpath("//input[@placeholder='Vehicle No.']")).click();
		Actions ReportVehicleNumbeParking = new Actions(driver);
		ReportVehicleNumbeParking.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		ReportVehicleNumbeParking.sendKeys(Keys.ENTER).perform();
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
		// GetReport
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

		// Management-Report-Stoppage
		// ToClickStoppage
		driver.findElement(By.id("select-report")).click();
		Actions SelectReportStoppage = new Actions(driver);
		for (int i = 0; i < 12; i++) {
			SelectReportStoppage.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(2000);
		SelectReportStoppage.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		// VehicleNumber
		driver.findElement(By.xpath("//input[@placeholder='Vehicle No.']")).click();
		Actions ReportVehicleNumbeStoppage = new Actions(driver);
		ReportVehicleNumbeStoppage.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		ReportVehicleNumbeStoppage.sendKeys(Keys.ENTER).perform();
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
		// GetReport
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

		// Management-Report-TripDetails
		// ToClickTripDetails
		driver.findElement(By.id("select-report")).click();
		Actions SelectReportTripDetails = new Actions(driver);
		for (int i = 0; i < 13; i++) {
			SelectReportTripDetails.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(2000);
		SelectReportTripDetails.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		// VehicleNumber
		driver.findElement(By.xpath("//input[@placeholder='Vehicle No.']")).click();
		Actions ReportVehicleNumbeTripDetails = new Actions(driver);
		ReportVehicleNumbeTripDetails.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		ReportVehicleNumbeTripDetails.sendKeys(Keys.ENTER).perform();
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
		// GetReport
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

		// Management-Report-TripCompliance
		// ToClickTripCompliance
		driver.findElement(By.id("select-report")).click();
		Actions SelectReportTripCompliance = new Actions(driver);
		for (int i = 0; i < 14; i++) {
			SelectReportTripCompliance.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(2000);
		SelectReportTripCompliance.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		// VehicleNumber
		driver.findElement(By.xpath("//input[@placeholder='Vehicle No.']")).click();
		Actions ReportVehicleNumbeTripCompliance = new Actions(driver);
		ReportVehicleNumbeTripCompliance.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		ReportVehicleNumbeTripCompliance.sendKeys(Keys.ENTER).perform();
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
		// GetReport
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

		// Management-Report-VehicleDetails
		// ToClickVehicleDetails
		driver.findElement(By.id("select-report")).click();
		Actions SelectReportVehicleDetails = new Actions(driver);
		for (int i = 0; i < 15; i++) {
			SelectReportVehicleDetails.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(2000);
		SelectReportVehicleDetails.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		// GetReport
		driver.findElement(By.xpath("//button[normalize-space(text())='Get Report']")).click();

		// Management-Report-VehicleGeofence
		// ToClickVehicleGeofence
		driver.findElement(By.id("select-report")).click();
		Actions SelectReportVehicleGeofence = new Actions(driver);
		for (int i = 0; i < 16; i++) {
			SelectReportVehicleGeofence.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(2000);
		SelectReportVehicleGeofence.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		// VehicleNumber
		driver.findElement(By.xpath("//input[@placeholder='Vehicle No.']")).click();
		Actions ReportVehicleNumbeVehicleGeofence = new Actions(driver);
		ReportVehicleNumbeVehicleGeofence.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		ReportVehicleNumbeVehicleGeofence.sendKeys(Keys.ENTER).perform();
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
