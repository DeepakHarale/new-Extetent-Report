package report;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import net.bytebuddy.utility.RandomString;

public class TestNgLiastner extends LoginDetails implements ITestListener {
	LoginDetails login;
	ExtentReports extent = LoginDetails.ReportSample();
	ExtentTest test;
	util utiltest;
	public void onStart(ITestContext context) {
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& test execution started &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println(context.getName());
	}
	public void onTestStart(ITestResult result) {
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ Test method execution started $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		test = extent.createTest(result.getMethod().getMethodName());	
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println(" ################# Test successfully passed ##################");
		System.out.println(result.getMethod().getMethodName());
//		test.log(Status.PASS, "Successfull");
	}
	public void onTestFailure(ITestResult result) {
		
		utiltest = new util();
		try {
			utiltest.screenShot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	
	

	public void onTestSkipped(ITestResult result) {
		System.out.println("################### Test case skipped ###################");
		System.out.println(result.getMethod().getMethodName());
	}
	

	public void onFinish(ITestContext context) {
		System.out.println("####################### Application successfully closed ########################");
		System.out.println(context.getName());
		extent.flush();
	}

}
