package Generalscripts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
	     driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      driver.manage().window().maximize();
	     driver.findElement(By.xpath("//button[contains(text(),\"Click for JS Alert\")]")).click();
	      Alert a=driver.switchTo().alert();
	     System.out.println(a.getText());
	     a.accept();
	     driver.findElement(By.xpath("//button[contains(text(),\"Click for JS Confirm\")]")).click();
	     System.out.println(a.getText());
	     a.dismiss();
	      driver.findElement(By.xpath("//button[contains(text(),\"Click for JS Prompt\")]")).click();
	     System.out.println(a.getText());
	      a.sendKeys("Akhil");
	      a.accept();
	      

	}

}
