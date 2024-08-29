package report;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC02 extends LoginDetails {

	@Test
	public void FailureMethod() {
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
		System.out.println("Title is"+ driver.getTitle());
		Assert.fail();
		driver.close();
		
	}
}
