package Generalscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Actiondemo {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
	      driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      driver.manage().window().maximize();
	      
	      WebElement a=driver.findElement(By.xpath("//a[contains(text(),\"Broken Link\")]"));
	      Actions ac = new Actions(driver);
	     ac.contextClick(a).build().perform();
	     WebElement mm = driver.findElement(By.id("mousehover"));
	      ac.moveToElement(mm).build().perform();
	      driver.findElement(By.xpath("//a[contains(text(),\"Reload\")]")).click();
	      

	}

}
