package stepDefinations;



import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.api.PendingException;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class MyStepDefinitions {

    @Given("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
        System.out.println("landing page");
    }

    @When("^User enter username and password$")
    public void user_enter_username_and_password() throws Throwable {
    	   System.out.println("landing page1");   
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	   System.out.println("landing page2");
    }

    @And("^ Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
    	   System.out.println("landing page3");
    }

}