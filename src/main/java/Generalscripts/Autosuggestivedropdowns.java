package Generalscripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestivedropdowns {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
	     driver.get("https://www.amazon.in/");
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      driver.manage().window().maximize();
	      driver.findElement(By.xpath("//input[@placeholder=\"Search Amazon\"]")).sendKeys("mobile");
	      List<WebElement> op=driver.findElements(By.xpath("//div[@class=\"s-suggestion-container\"]"));
	      for(WebElement ad:op) {
	    	 String text= ad.getText();
	    	 if(text.equals("mobile phones")) {
	    		 ad.click();
	    	 }
	      }
	      
	}

}
