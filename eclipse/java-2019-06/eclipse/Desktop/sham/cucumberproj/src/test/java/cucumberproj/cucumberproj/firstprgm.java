package cucumberproj.cucumberproj;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


//import seleniumtest1.test1;

public class firstprgm {
	WebDriver driver;
	
	
	@Given("Application is launched by Guest users")
	public void application_is_launched_by_Guest_users() {
		
		driver=test1.configurewebdriver("chrome");
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp");
		
	      driver.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();
		  driver.findElement(By.id("userName")).sendKeys("shamla");
		  driver.findElement(By.id("firstName")).sendKeys("sham");
		  driver.findElement(By.id("lastName")).sendKeys("lucky");
		  driver.findElement(By.id("password")).sendKeys("Password12");
		  driver.findElement(By.id("pass_confirmation")).sendKeys("Password12");
		  driver.findElement(By.xpath("//input[@value='Female']")).click();
		  driver.findElement(By.id("emailAddress")).sendKeys("a@accenture.com");
		  driver.findElement(By.id("mobileNumber")).sendKeys("1342253345");
		  driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();
		  Select s= new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		  s.selectByVisibleText("May");
		  Select s1= new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		  s1.selectByVisibleText("1995");
		  driver.findElement(By.linkText("25")).click();
		  //driver.findElement(By.id("dob")).sendKeys("05/25/1995");
		  driver.findElement(By.id("address")).sendKeys("Banglorenorthsouth");
		 // Select sl=new Select(driver.findElement(By.id("securityQuestion")));
		  Select sl=new Select(driver.findElement(By.xpath("//select[@id='securityQuestion']")));
		  sl.selectByVisibleText("What is your Nick Name?");
		  driver.findElement(By.id("answer")).sendKeys("jaanu");
		  driver.findElement(By.xpath("//input[@name='Submit']")).click();
		  

	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		//System.out.println("this is my first program");
	}

	@When("Users clicks on sign in link available")
	public void users_clicks_on_sign_in_link_available() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("Provides the required data")
	public void provides_the_required_data() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("User submits the data")
	public void user_submits_the_data() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("verifies for the account creation")
	public void verifies_for_the_account_creation() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
