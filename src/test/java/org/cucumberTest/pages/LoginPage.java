package org.cucumberTest.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

import static org.cucumberTest.steps.BaseClass.driver;

public class LoginPage extends CommanMethods{
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css="a[class='action create primary'] span")
    private WebElement createAccount;

    @FindBy(css = "#email")
    private WebElement email;

    @FindBy(css = "[name='login[password]']")
    private WebElement password;

    @FindBy(xpath = "//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]")
    private WebElement loginButton;

    @FindBy(css ="[data-ui-id='message-error'] div")
    private WebElement loginError;

    public final void checkLoginPageIsLoaded(){
        Assertions.assertTrue(isElementVisible(createAccount, Duration.ofSeconds(5)));
    }

    public final void clickOnCreateAccount(){
        clickOnElement(createAccount);
    }

    public final void loginToAccount(){
        Assertions.assertTrue(isElementVisible(email, Duration.ofSeconds(5)));
        email.sendKeys("roni_cost@example.com");
        password.sendKeys("roni_cost3@example.com");
        loginButton.click();
    }

    public final void checkLoginError(){
        Assertions.assertTrue(isElementVisible(loginError,Duration.ofSeconds(5)));
        Assertions.assertEquals("Incorrect CAPTCHA",loginError.getText());
    }

}
