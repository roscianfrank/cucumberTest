package org.cucumberTest.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cucumberTest.pages.LoginPage;

public class LoginPageSteps {
    LoginPage loginPage = new LoginPage();

    @Then("I can see sign-in form")
    public void iCanSeeSigninForm() {
        loginPage.checkLoginPageIsLoaded();
    }

    @When("I click on create account")
    public void iClickOnCreateAccount() {
        loginPage.clickOnCreateAccount();
    }

    @When("I enter the login detail")
    public void iEnterTheLoginDetail() {
        loginPage.loginToAccount();
    }

    @Then("I check user is not logged in")
    public void iCheckUserIsLoggedIn() {
        loginPage.checkLoginError();
    }
}
