package Generalscripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectex {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
	      driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      driver.manage().window().maximize();
	      WebElement s=driver.findElement(By.id("country-list"));
	      Select se = new Select(s);
	      se.selectByVisibleText("France");
	      WebElement s1=driver.findElement(By.id("state-list"));
	      Select se1 = new Select(s1);
	      se1.selectByIndex(2);
	      
	      
//	      List<WebElement> options=se.getOptions();
//	      System.out.println(options.size());
//	      
//	      for(WebElement sel:options) {
//	    	  String text=sel.getText();
//	    	  System.out.println(text);
//	      }
//	      


	      

	}

}
