package report;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC01 {

	@Test
	public void LoginMethod(String name) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
		System.out.println("Title is"+ driver.getTitle());
		Reporter.log("landing on login page"+driver.getTitle());
		
		
	}
}
