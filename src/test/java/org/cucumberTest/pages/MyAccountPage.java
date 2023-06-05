package org.cucumberTest.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

import static org.cucumberTest.steps.BaseClass.driver;

public class MyAccountPage extends CommonMethods {
    public MyAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[role='alert']")
    private WebElement successMessage;

    public final void checkSuccessMessage() {
        Assertions.assertTrue(isElementVisible(successMessage, Duration.ofSeconds(5)));
    }
}
