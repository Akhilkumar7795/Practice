package Generalscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cb {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
	      driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      driver.manage().window().maximize();
	      String as=driver.findElement(By.id("checkBoxOption1")).getAttribute("value");
	      System.out.println(as);
	      String va="option1";
	      if(as.equals(va)) {
	    	  System.out.println("it is a checkbox");
	      }
	      else {
	    	  System.out.println("not a checkbox");
	      }

	}

}
