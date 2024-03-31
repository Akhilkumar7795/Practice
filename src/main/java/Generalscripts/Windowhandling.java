package Generalscripts;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
	      driver.get("https://www.naukri.com/");
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      driver.manage().window().maximize();
	      driver.findElement(By.xpath("//div[contains(text(),\"Jobs\")]")).click();
	      driver.findElement(By.xpath("//span[contains(text(),\"Remote\")]")).click();
	      Set<String>wh=driver.getWindowHandles();
	      Iterator<String> it = wh.iterator();
	      String parentid=it.next();
	      String childid = it.next();
	      System.out.println(parentid);
	      System.out.println(childid);
	      driver.switchTo().window(childid);
	      driver.findElement(By.xpath("//a[@data-label=\"IT Jobs\"]")).click();
	      if(wh.equals(childid)) {
	    	  driver.close();
	      }
	      
//	      System.out.println(wh.size());
//	      System.out.println(wh);
//	      for(String wd:wh) {
//	    	  driver.switchTo().window(wd);
//	    	 String title=driver.getTitle();
//	    	 System.out.println(title);
//	      }

	}

}
