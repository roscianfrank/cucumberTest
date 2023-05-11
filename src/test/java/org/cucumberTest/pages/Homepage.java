package org.cucumberTest.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.cucumberTest.steps.BaseClass.driver;

public class Homepage {
    public Homepage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(linkText = "Sign In")
    private WebElement signInLink;

    public final void checkHomepageIsLoaded(){
        Assertions.assertTrue(signInLink.isDisplayed());
    }

    public final void clickOnSignInLink(){
        signInLink.click();
    }
}
