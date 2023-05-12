package org.cucumberTest.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.cucumberTest.steps.BaseClass.driver;

public class Homepage {
    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Sign In")
    private WebElement signInLink;

    @FindBy(css = ".block-promo")
    private List<WebElement> promoImages;

    @FindBy(css = ".product-item-info")
    private List<WebElement> productList;

    public final void checkHomepageIsLoaded() {
        Assertions.assertTrue(signInLink.isDisplayed());
    }

    public final void clickOnSignInLink() {
        signInLink.click();
    }

    public final void checkHomePageLayout() {
        Assertions.assertEquals(6, promoImages.size(), "Promo images are missing");
        Assertions.assertEquals(6, promoImages.size(), "Products are missing from home page");
    }
}
