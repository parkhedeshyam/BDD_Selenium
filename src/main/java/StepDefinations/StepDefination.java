package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StepDefination {
	@Given("User is on gmail login page")
	public void user_is_on_gmail_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I am in GIVEN METHOD");
	}

	@SuppressWarnings("deprecation")
	@When("User enter the username and password")
	public void user_enter_the_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		//Assert.fail();
		System.out.println("I am in WHEN METHOD");
	   
	}

	@And("User clicks on the login button")
	public void user_clicks_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I am in AND METHOD");
	}

	@Then("User is on gmail home page")
	public void user_is_on_gmail_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I am in THEN METHOD");
	}

}
