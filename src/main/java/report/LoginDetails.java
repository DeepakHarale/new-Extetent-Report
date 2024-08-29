package report;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LoginDetails {
		static WebDriver driver;
static	ExtentSparkReporter reporter;
static	ExtentReports extent;
static	ExtentTest test;
	@BeforeMethod
	public static ExtentReports ReportSample() {
		
		String path = System.getProperty("user.dir")+"\\reports\\jala.html";
		reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Jala Academy result");
		reporter.config().setDocumentTitle("test result");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("tester", "Deepak");
		
		return extent;
		
	}

	
	public void luach() {
		 test = extent.createTest("luach brpwser");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
		System.out.println("Title is"+ driver.getTitle());
		test.fail("test failed");
		extent.flush();
	}
}

