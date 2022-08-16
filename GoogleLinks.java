package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class GoogleLinks {
	WebDriver driver;
	ExtentReports reports;
	ExtentTest test;
	@BeforeMethod
	public void beforeMethod() {
		 reports = new ExtentReports("C:\\Users\\Lenovo\\eclipse-workspace\\AutomationTraining\\Reports");
		test = reports.startTest("GoogleLinks");
		 reports.startTest("Reports");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\webdrivertraining\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void f() {
		driver.get("https://www.google.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (int i = 0; i < links.size(); i++) {
			String AlllinksNames = links.get(i).getText();
			String Alllinks = links.get(i).getAttribute("href");
			System.out.println(AlllinksNames + "---->" + Alllinks);
			test.log(LogStatus.PASS,"Passed");
			reports.endTest(test);
		}
	}

	@AfterMethod
	public void afterMethod() {
		
		reports.flush();
		driver.close();
	}

}
