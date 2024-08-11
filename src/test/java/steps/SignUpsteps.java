package steps;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpsteps {
	
	WebDriver driver;
	
	@Given("Open browser, enter Instagram url.")
	public void open_browser_enter_instagram_url() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/emailsignup/?hl=en");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	}
	@When("user enters all mandatory fields")
	public void user_enters_all_mandatory_fields() {
	    
		   driver.findElement(By.cssSelector("[name='emailOrPhone']")).sendKeys("Shomu12@gmail.com");
		   driver.findElement(By.cssSelector("[name='fullName']")).sendKeys("Shomya Dey");
		   driver.findElement(By.cssSelector("[name='username']")).sendKeys("Shomyadey50");
		   driver.findElement(By.cssSelector("[name='password']")).sendKeys("SIMSU4506");	
		
	}

	@When("user clicks the signup button")
	public void user_clicks_the_signup_button() {
		
		driver.findElement(By.cssSelector("[type='submit']")).click();   
	 
	}

	@Then("Successful sign up message should be displayed")
	public void successful_sign_up_message_should_be_displayed() {
	    
		String sp  = driver.findElement(By.xpath("//span[text()='Add Your Birthday']")).getText();  
		String ms = "Add Your Birthday";
		Assert.assertEquals(ms, sp);
	}



	

}
