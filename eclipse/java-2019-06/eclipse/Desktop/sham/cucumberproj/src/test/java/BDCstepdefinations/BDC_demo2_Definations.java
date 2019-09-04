package BDCstepdefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BDC_demo2_Definations {
	
	@Given("User access the signup page")
	public void user_access_the_signup_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("User access the signup page");
	}

	@Given("geths the creadentials")
	public void geths_the_creadentials() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("User access the signup page credentials");

	}

	@Given("User has valid account credentials for dev shop")
	public void user_has_valid_account_credentials_for_dev_shop() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("User access the signup page validatates");

	}

	@Given("Provide the valid cred as inputs for the login process")
	public void provide_the_valid_cred_as_inputs_for_the_login_process() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("User access the signup page nnd login");

	}

	@Then("verifies the state for the login status")
	public void verifies_the_state_for_the_login_status() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("User access the signup page nd login status");

	}


}
