package org.cucumberTest.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cucumberTest.pages.Homepage;

import static org.cucumberTest.steps.BaseClass.driver;

public class HomePagesSteps {
    Homepage homepage = new Homepage();
    @Given("I am on the Luma homepage")
    public void iAmOnTheHomepage() {
        driver.navigate().to("https://magento.softwaretestingboard.com/");
    }

    @Then("I can see homepage is loaded")
    public void iCanSeeHomepageIsLoaded() {
        homepage.checkHomepageIsLoaded();
    }

    @When("I click on sign-in link")
    public void iClickOnSigninLink() {
        homepage.clickOnSignInLink();
    }
}
