package Generalscripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxes2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
	      driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      driver.manage().window().maximize();
	     //driver.findElement(By.id("checkBoxOption2")).click();
	  List<WebElement> cb= driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
//	  for(WebElement checkbox:cb) {
//		  
//		  checkbox.click();
//	  }
	  for(int i=2;i<cb.size();i++) {
		  
		  cb.get(i).click();
	  }

	}

}
