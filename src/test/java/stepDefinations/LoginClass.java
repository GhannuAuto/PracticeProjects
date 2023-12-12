package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginClass {


    @Given("User is no login page")
    public void user_is_no_login_page() {
        System.out.println("user is on login Page");
        System.out.println("Ghanshyam ");
    }
    @When("User enters username and password")
    public void user_enters_username_and_password() {
        System.out.println("User enters username and password");
    }
    @Then("Click on Login button")
    public void click_on_login_button() {
       System.out.println("Click on Login button");
    }
    @And("User is navigated to Home Page of the application")
    public void user_is_navigated_to_home_page_of_the_application() {
        System.out.println("User is navigated to Home Page of the application");
    }

}
