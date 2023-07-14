package jun23;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Property_File {
	
	@Test
	public void startsTest() throws Throwable{
		
		//Create an object for property class
		Properties conpro = new Properties();
		
		//load file
		conpro.load(new FileInputStream("Login.properties"));
		
		System.setProperty("webdriver.chrome.driver", "E:\\JavaAccessories\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(conpro.getProperty("Url"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(conpro.getProperty("ObjReset"))).click();
		driver.findElement(By.xpath(conpro.getProperty("Objuser"))).sendKeys("Enter_user");
		driver.findElement(By.xpath(conpro.getProperty("Objpass"))).sendKeys("Enter_Pass");
		driver.findElement(By.xpath(conpro.getProperty("ObjLogin"))).click();
		
		String Actual_title = driver.getTitle();
		String Expected_title ="Dashboard « Stock Accounting";
		
		if(Expected_title.equalsIgnoreCase(Actual_title)) {
			
			Reporter.log("Login Success :::"+Expected_title+" "+Actual_title,true);
		}
		else {
			
			Reporter.log("Login Failure:::"+Expected_title+""+Actual_title,false);
		}
		
		driver.quit();
		
	}
}
