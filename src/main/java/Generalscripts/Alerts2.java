package Generalscripts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
	     driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      driver.manage().window().maximize();
	      driver.findElement(By.xpath("//input[@name=\"enter-name\"]")).sendKeys("Akhil");
	      driver.findElement(By.xpath("//input[@id=\"alertbtn\"]")).click();
	     Alert a = driver.switchTo().alert();
	     System.out.println(a.getText());
	     a.dismiss();

	}

}
