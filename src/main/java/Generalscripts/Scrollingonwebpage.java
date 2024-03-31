package Generalscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Scrollingonwebpage {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
	      driver.get("https://www.selenium.dev/downloads/");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     WebElement ele= driver.findElement(By.xpath("//h2[contains(text(),\"Ecosystem\")]"));
	     int x=ele.getLocation().getX();
	     int y=ele.getLocation().getY();
	      JavascriptExecutor js = (JavascriptExecutor)driver;
	      js.executeScript("windows.scrollBy("+x+","+y+")");
	      
	    
	}

}
