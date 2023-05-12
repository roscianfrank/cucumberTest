package org.cucumberTest.steps;

import io.cucumber.java.en.Then;
import org.cucumberTest.pages.MyAccountPage;

public class MyAccountSteps {
    MyAccountPage myAccountPage = new MyAccountPage();
    @Then("I check account is created")
    public void iCheckAccountIsCreated() {
        myAccountPage.checkSuccessMessage();
    }
}
