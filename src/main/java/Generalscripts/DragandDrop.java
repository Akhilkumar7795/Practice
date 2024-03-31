package Generalscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
	      driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      driver.manage().window().maximize();
	      WebElement x1=driver.findElement(By.xpath("//div[contains(text(),\"Washington\")][2]"));
	      WebElement x2=driver.findElement(By.xpath("//div[contains(text(),\"United States\")]"));
	      Actions a = new Actions(driver);
	      a.dragAndDrop(x1, x2).build().perform();
	      

	}

}
