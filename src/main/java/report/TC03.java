package report;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC03 extends LoginDetails{

	@Test(dependsOnMethods = "Registration")
	public void Login() {
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
		System.out.println("Title is"+ driver.getTitle());
		driver.close();
	}
	
	@Test
	public void Registration() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
		Reporter.log("landing on login page"+driver.getTitle(),true);
		Assert.fail();
		driver.close();
	}
}
