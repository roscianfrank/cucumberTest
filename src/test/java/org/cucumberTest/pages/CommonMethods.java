package org.cucumberTest.pages;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Locale;

import static org.cucumberTest.steps.BaseClass.driver;

public class CommonMethods {
    protected static Faker faker = new Faker(new Locale("en-GB"));

    protected final void clickOnElement(WebElement element) {
        Assertions.assertTrue(isElementVisible(element, Duration.ofSeconds(5)));
        element.click();
    }

    protected static boolean isElementVisible(WebElement webElement, Duration timeOut) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, timeOut);
            wait.until(ExpectedConditions.visibilityOf(webElement));
            wait.until(ExpectedConditions.refreshed(ExpectedConditions.not(ExpectedConditions.stalenessOf(webElement))));
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    protected void scrollToElement(WebElement webElement) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoViewIfNeeded()", webElement);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
