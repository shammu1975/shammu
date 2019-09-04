package cucumberproj.cucumberproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class program1 {
	WebDriver driver;
	
	@Given("launch the application search for the login_button")
	public void launch_the_application_search_for_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		
		driver=test1.configurewebdriver("chrome");
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com");
	}

	@When("users clicks on login_button link")
	public void users_clicks_on_login_button_link() {
		driver.findElement(By.xpath("//a[@href='/login']")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("provides the email")
	public void provides_the_email() {
		driver.findElement(By.id("Email")).sendKeys("shamla@gmail.com");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("Enter the password")
	public void enter_the_password() {
		driver.findElement(By.id("Password")).sendKeys("Shamla12");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new cucumber.api.PendingException();
	}

	@When("user selects the Electronics category")
	public void user_selects_the_Electronics_category() {
	//	Actions a=new Actions(driver);
	//	a.moveToElement(driver.findElement(By.xpath("//a[@href='/electronics']"))).moveToElement(driver.findElement(By.xpath("//a[@href='/cell-phones']"))).click().build().perform();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//a[@href='/books']")).click();
		//driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[1]/a")).click();
		//driver.findElement(By.partialLinkText("Books\r\n" + 
			//	"        ")).click();
	}
	@Then("clicks on AddTocart button")
	public void clicks_on_AddTocart_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
	}

	@Then("clicks on shopping cart link")
	public void clicks_on_shopping_cart_link() {
		driver.findElement(By.xpath("//span[contains(text(),'Shopping cart')]")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("user selects the category of his own in cart")
	public void user_selects_the_category_of_his_own_in_cart() {
		driver.findElement(By.className("product-name")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("clicks on AddToCart button")
	public void clicks_on_AddToCart_button() {
		driver.findElement(By.xpath("//input[@class='button-2 product-box-add-to-cart-button']")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

}
