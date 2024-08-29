package Button;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import net.bytebuddy.utility.RandomString;
import report.LoginDetails;
import report.util;

public class TestListner extends LoginDetails implements ITestListener {
	
	
	public void onStart(ITestContext context) {
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& test execution started &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println(context.getName());
	}
	public void onTestStart(ITestResult result) {
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ Test method execution started $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println(" ################# Test successfully passed ##################");
		System.out.println(result.getMethod().getMethodName());
//		test.log(Status.PASS, "Successfull");
	}
	public void onTestFailure(ITestResult result) {
		util Util = new util();
		RandomString random = new RandomString();
		 try {
			 Util.screenShot(result.getMethod().getMethodName()+"_"+random);
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
	
	}

}
