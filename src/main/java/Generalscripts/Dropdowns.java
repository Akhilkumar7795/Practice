package Generalscripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
	      driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      driver.manage().window().maximize();
	      WebElement sb=driver.findElement(By.xpath("//select[@name=\"country\"]"));
	      Select s = new Select(sb);
	     // s.selectByVisibleText("India");
	     List<WebElement> options= s.getOptions();
	     //System.out.println(options.size());
	      for(WebElement op:options) {
	    	 System.out.println(op.getText());
	      }
	     
	      
	      

	}

}
