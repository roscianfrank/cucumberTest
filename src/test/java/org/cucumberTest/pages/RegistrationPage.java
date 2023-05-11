package org.cucumberTest.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

import static org.cucumberTest.steps.BaseClass.driver;

public class RegistrationPage extends CommanMethods{
    public RegistrationPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#firstname")
    private WebElement firstName;

    @FindBy(css = "#lastname")
    private WebElement lastName;

    @FindBy(css = "#email_address")
    private WebElement email;

    @FindBy(css = "#password")
    private WebElement password;

    @FindBy(css = "#password-confirmation")
    private WebElement confirmPassword;

    @FindBy(css = "button[title='Create an Account'] span")
    private WebElement createAccountButton;

    public final void CreateAnAccount(){
        Assertions.assertTrue(isElementVisible(firstName, Duration.ofSeconds(5)));
        firstName.sendKeys(faker.name().firstName());
        lastName.sendKeys(faker.name().lastName());
        email.sendKeys(faker.internet().emailAddress());
        password.sendKeys("Pa55word");
        confirmPassword.sendKeys("Pa55word");
        scrollToElement(createAccountButton);
        createAccountButton.click();
    }
}
