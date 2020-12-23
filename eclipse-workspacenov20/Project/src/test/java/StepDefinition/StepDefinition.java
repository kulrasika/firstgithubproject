package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

    @Given("^User is on landing page$")
    public void user_is_on_landing_page() {
    	
    	System.out.println("Given");
    }

    @When("^User logins by entering username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void user_logins_by_entering_username_as_and_password_as(String arg1, String arg2){
    	System.out.println("When");
    	System.out.println(arg1);
    	System.out.println(arg2);
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated(){
    	System.out.println("Then");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() {
    	System.out.println("And");
    }

}
	
	
	
	
	
