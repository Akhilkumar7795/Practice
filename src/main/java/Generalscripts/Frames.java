package Generalscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
	     driver.get("https://ui.vision/demo/webtest/frames/");
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      driver.manage().window().maximize();
	      WebElement f1=driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));
	      driver.switchTo().frame(f1);
	      driver.findElement(By.xpath("//input[@name=\"mytext1\"]")).sendKeys("Akhil");
	      driver.switchTo().defaultContent();
	      
	      WebElement f3=driver.findElement(By.xpath("//frame[@src=\"frame_3.html\"]"));
	      driver.switchTo().frame(f3);
	      driver.findElement(By.xpath("//input[@name=\"mytext3\"]")).sendKeys("Akhilkumar");
	      driver.switchTo().frame(0);
	      driver.findElement(By.xpath("//div[@class=\"AB7Lab Id5V1\"][1]")).click();
	     WebElement as= driver.findElement(By.xpath("//span[@class=\"XQLyQ\"]"));
	     as.click();
	   
	      
	}

}
