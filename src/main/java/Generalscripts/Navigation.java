package Generalscripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {

      WebDriver driver = new ChromeDriver();
      driver.get("https://rahulshettyacademy.com/AutomationPractice/");
      driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.navigate().back();
      driver.navigate().forward();
      driver.navigate().refresh();
      driver.quit();
 

	}

}
