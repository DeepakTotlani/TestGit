package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginStepDefinition {
	WebDriver driver;
	
	@Given("^user is already on login page$")
	public void user_already_login_page() {
		System.setProperty("webdriver.chrome.driver","./exefile/chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("https://www.freecrm.com");
	}
	
	@When("^title of login page is Free CRM$")
	public void title_login_page() {
	String title = driver.getTitle();
	Assert.assertEquals("Free CRM software in the cloud for sales and service",title);
	}
	
	
	@Then ("^user enter username and password$")
	public void enter_username_password() {
	driver.findElement(By.name("username")).sendKeys("naveenk");
	 driver.findElement(By.name("password")).sendKeys("test@123");
	}
	
	@Then ("^user clicks on login button$")
	public void clicks_login_button() {
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
			 JavascriptExecutor js = (JavascriptExecutor)driver;
			 js.executeScript("arguments[0].click();", loginBtn);
	}
	
	@Then("^user is home page$")
	public void user_home_page() {
	 String titlehome = driver.getTitle();
	 Assert.assertEquals("CRMPRO", titlehome);	
	}
	
}
