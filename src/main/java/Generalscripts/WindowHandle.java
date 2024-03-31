package Generalscripts;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {



		WebDriver driver = new ChromeDriver();
	     driver.get("https://ui.vision/demo/webtest/frames/");
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
			
			//capture id's for browser windows
			Set<String> windowIDs=driver.getWindowHandles();  // store 2 window id's
       System.out.println(windowIDs);
         System.out.println(windowIDs.size());
	}

}
