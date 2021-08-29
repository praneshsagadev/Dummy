package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepImplementations {
	
	@Given("^Load the url$")

	public void loadURL() {

		System.out.println("url loaded");
	}
@When("^enter the username$")
	public void enterUsername() {
    System.out.println("GIT PUSH FROM ECLI");
		System.out.println("username entered");
	}
@And("^enter the password$")
	public void enterPassword() {

		System.out.println("password entered ");
	}
@Then("^click the login button$")
	public void clickLogin() {

		System.out.println(":login button clicked");

	}
@Then("^I should see the login page$")
	public void expectedPage() {

		System.out.println("Login Page");
	}

}
