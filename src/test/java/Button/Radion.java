package Button;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Radion {

	@DataProvider
	public Object[][] data() {
		Object data[][]= {{"male"},
						{"Female"}};
		return data;
	}
	
	@Test(dataProvider = "data")
	public void button(String radiobtn) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.id("Password")).sendKeys("jobprogram");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Employee")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create")).click();
		Thread.sleep(3000);
		if(radiobtn.equals("male")) {
		driver.findElement(By.id("rdbMale")).click();
		}else if(radiobtn.equals("Female")){
			driver.findElement(By.id("rdbFemale")).click();
			
			WebElement option = driver.findElement(By.xpath("//h4[text()='Skiils']"));
		  List<WebElement> list = option.findElements(By.tagName("input"));
		  for(int i =0; i<list.size();i++) {
			  System.out.println(list.get(i).getText());
			  
		  }
		}
		
		
	}
}
