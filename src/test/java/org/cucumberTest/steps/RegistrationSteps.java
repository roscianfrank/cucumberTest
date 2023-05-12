package org.cucumberTest.steps;

import io.cucumber.java.en.And;
import org.cucumberTest.pages.RegistrationPage;

public class RegistrationSteps {
    RegistrationPage registrationPage = new RegistrationPage();

    @And("I fill up the create account")
    public void iFillUpTheCreateAccount() {
        registrationPage.CreateAnAccount();
    }
}
