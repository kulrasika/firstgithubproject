package stepdefinition;

import EndtoEnd.FrameworkProject.Init_Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Landingpage;
import pageobjects.LoginPage;

public class stepDefinition extends Init_Driver {
	
	@Given("^User is on \"([^\"]*)\" page$")
	public void user_is_on_page(String urlstring) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = InitialiseDriver();
		driver.get(urlstring);
	}

	 @When("^User logins by entering (.+) and (.+)$")
	public void user_logins_by_entering_and(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		Landingpage l = new Landingpage(driver);
		
		l.closenewsletter(driver);
		//log.info("Opening Login page");
		l.Login().click();
		
		LoginPage lp= new LoginPage(driver);
		//log.info("Entering Login details");
		
		lp.Username().sendKeys(username);
		lp.Password().sendKeys(password);
		//System.out.println("text");
		
		lp.Loginbutton().click();
	}
	
	
	@Then("Home page is populated")
	public void home_page_is_populated() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}


/*

	@Given("User is on \"([^\"]*)\" page")
	public void user_is_on_page(String url) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = InitialiseDriver();
		driver.get(url);
	}

	@When("^User logins by entering \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_logins_by_entering_username_and_password(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		Landingpage l = new Landingpage(driver);
		
		l.closenewsletter(driver);
		//log.info("Opening Login page");
		l.Login().click();
		
		LoginPage lp= new LoginPage(driver);
		//log.info("Entering Login details");
		
		lp.Username().sendKeys(username);
		lp.Password().sendKeys(password);
		//System.out.println("text");
		
		lp.Loginbutton().click();
	}
	
	@Then("^Home page is populated$")
	public void home_page_is_populated() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}
*/


}
