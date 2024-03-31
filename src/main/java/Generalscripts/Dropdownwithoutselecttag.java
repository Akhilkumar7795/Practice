package Generalscripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdownwithoutselecttag {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
	      driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      driver.manage().window().maximize();
	      driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
	      List<WebElement> op=driver.findElements(By.xpath("//ul[@class=\"multiselect-container dropdown-menu\"]//label"));
	      for(WebElement dd:op) {
	    	  String text=dd.getText();
	    	  if(text.equals("Java") | text.equals("Python")) {
	    		  dd.click();
	    	  }
	      }
	     
	   
			

	}

}
