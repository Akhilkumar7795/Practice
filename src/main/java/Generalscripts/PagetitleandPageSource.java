package Generalscripts;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PagetitleandPageSource {

	public static void main(String[] args) {

          WebDriver driver = new ChromeDriver();
          driver.get("https://www.google.co.in/");
          String title=driver.getTitle();
          System.out.println(title);
          String url =driver.getCurrentUrl();
          String psource=driver.getPageSource();
          System.out.println(url);
          System.out.println(psource);
          
          


	}

}
