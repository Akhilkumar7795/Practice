package Generalscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Verifyinunandpwddimensions {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait ms = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		
		WebElement untb=driver.findElement(By.xpath("//input[@class='email']"));
		int unx=untb.getLocation().getX();
		int uwidth=untb.getSize().getWidth();
		int uheight=untb.getSize().getHeight();
		
		WebElement unpw=driver.findElement(By.xpath("//input[@class='password']"));
		int upx=unpw.getLocation().getX();
		int pwidth=unpw.getSize().getWidth();
		int pheight=unpw.getSize().getHeight();
		
		if(unx==upx && uwidth==pwidth && uheight==pheight)
		{
			System.out.println("dimensions are alligned");
		}
		

	}

}
