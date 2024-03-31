package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login {
	
    WebDriver driver;
    @Test
	public void methodone() {
		
		 driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[normalize-space()='Log in']")).click();
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys("test@123");
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		boolean status=driver.findElement(By.xpath("//h2[contains(text(),'Welcome to our store')]")).isDisplayed();
		Assert.assertEquals(status, true);
	}
}
