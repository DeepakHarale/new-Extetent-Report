package report;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import  org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import net.bytebuddy.utility.RandomString;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class util extends LoginDetails {
	LoginDetails login;

	
		
		
		public void screenShot(String getName) throws IOException {
			 
			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File des = new File("C:\\Users\\Sarvadnya\\eclipse-workspace\\ExtentReport\\reports"+ getName+".png");
			FileHandler.copy(source, des);
		}
		
	

}
