package jun23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Advance_Reports {
	
	WebDriver driver;
	ExtentReports reports;
	ExtentTest test;
	
	@BeforeTest
	public void generateReport() {
		
		reports = new ExtentReports("./Reports/Demo.html");
		
	}
	
	@BeforeMethod
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\JavaAccessories\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
	}
	
	@Test
	public void testPass() {
		
		test = reports.startTest("Validate Pass test");
		test.assignAuthor("Victor");
		test.assignCategory("Functional Test");
		String Actual_title = driver.getTitle();
		String Expected_title = "Google";
		if(Expected_title.equalsIgnoreCase(Actual_title)) {
			test.log(LogStatus.PASS, "Title is Matching");
		}
		else {
			test.log(LogStatus.FAIL, "Title is not Matching");
		}
	}
	
	@Test
	public void testfail() {
		
		test = reports.startTest("Vailidate Test Fail");
		test.assignAuthor("Anthony");
		test.assignCategory("Functional Test");
		String Actual_title = driver.getTitle();
		String Expected_title = "gmail";
		if(Expected_title.equalsIgnoreCase(Actual_title)) {
			test.log(LogStatus.PASS, "Title is Matching");
		}
		else {
			test.log(LogStatus.FAIL, "Title is not Matching");
		}
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		reports.endTest(test);
		reports.flush();
		driver.quit();
	}

}
