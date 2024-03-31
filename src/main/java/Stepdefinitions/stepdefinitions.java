package Stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefinitions {

	WebDriver driver;
	@Given("User is on the application home page")
	public void user_is_on_the_application_home_page() {
	   
		driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[normalize-space()='Log in']")).click();
	}

	@When("User enters email and password credentials \\(username: {string}, password: {string})")
	public void user_enters_email_and_password_credentials_username_password(String email, String pwd) {
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys(pwd);
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
	}

	@Then("User redirects into the application Myaccount page")
	public void user_redirects_into_the_application_myaccount_page() {
	   
	}

	@Then("User should see the welcome message displayed")
	public void user_should_see_the_welcome_message_displayed() {
		boolean status=driver.findElement(By.xpath("//h2[contains(text(),'Welcome to our store')]")).isDisplayed();
		Assert.assertEquals(status, true);
		driver.quit();
	}
}
