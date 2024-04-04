package stepDefinitions;
import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinitions {

    @Given("User is on NetBanking landing page")
    public void user_is_on_netbanking_landing_page() {
    	System.out.println("TEST1");
  
    }

    @When("User login into application with username and password")
    public void user_login_into_application_with_username_and_password() {
    	System.out.println("TEST2");

    }

    @Then("Home page is populated")
    public void home_page_is_populated() {
    	System.out.println("TEST3");

    }

    @Then("Cards are displayed")
    public void cards_are_displayed() {
    	System.out.println("TEST4");

    }
}

