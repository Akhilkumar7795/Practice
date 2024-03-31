package Generalscripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
	     driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      driver.manage().window().maximize();
     int rows=driver.findElements(By.xpath("//table[@class=\"table-display\"]//tr")).size();
     System.out.println(rows);
    int col= driver.findElements(By.xpath("//table[@class=\"table-display\"]//th")).size();
    System.out.println(col);
    String value=driver.findElement(By.xpath("//table[@class=\"table-display\"]//tr[5]/td[2]")).getText();
    System.out.println(value);
     for(int r=2;r<=rows;r++) {
    	 for(int c=1;c<col;c++) {
    		 String value1=driver.findElement(By.xpath("//table[@class=\"table-display\"]//tr["+r+"]/td["+c+"]")).getText();
    		    System.out.print(value1);
    	 }
    	 System.out.println();
     }
     //to get sum of all prices
     int sum=0;
     for(int i=2;i<=rows;i++) {
    	 String price=driver.findElement(By.xpath("//table[@class=\"table-display\"]//tr["+i+"]/td[3]")).getText();
    	 sum=sum+Integer.parseInt(price);
     }
     System.out.println(sum);
	}

}
