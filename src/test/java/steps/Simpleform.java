package steps;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Simpleform {
	
	WebDriver driver;
	
	@Given("open the browser, enter the Simple form url")
	public void open_the_browser_enter_the_simple_form_url() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://v1.training-support.net/selenium/simple-form");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}

	@When("user enters the valid first name")
	public void user_enters_the_valid_first_name() {
		
		driver.findElement(By.id("firstName")).sendKeys("Shomya");

	}

	@When("user enters the valid last name")
	public void user_enters_the_valid_last_name() {
		
		driver.findElement(By.id("lastName")).sendKeys("Hansda");
	 
	}

	@When("user enters the valid email")
	public void user_enters_the_valid_email() {
		
		driver.findElement(By.id("email")).sendKeys("shomu12@gmail.com");
	   
	}

	@When("user enters the valid contact number")
	public void user_enters_the_valid_contact_number() {
		
		driver.findElement(By.id("number")).sendKeys("9945685712");
	    
	}

	@When("user enters a message in the message field")
	public void user_enters_a_message_in_the_message_field() {
		
		driver.findElement(By.cssSelector("[rows='2']")).sendKeys("Hey!! Practice hard");
	   
	}

	@Then("user clicks on the submit button")
	public void user_clicks_on_the_submit_button() {
		
		driver.findElement(By.cssSelector("[type='submit']")).click();
	    
	}
	@Then("Thank you message should be displayed")
	public void thank_you_message_should_be_displayed() {
	    
		   Alert A = driver.switchTo().alert();
		   String Act = A.getText();
		   String ms ="Thank You for reaching out to us, Shomya Hansda";
		   Assert.assertEquals(ms, Act);
	}

}


