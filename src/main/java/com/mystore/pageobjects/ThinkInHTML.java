package com.mystore.pageobjects;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThinkInHTML extends BaseClass {

    public ThinkInHTML() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[text()='Add to basket']")
    WebElement addToBasket;

    @FindBy(xpath = "//*[contains(text(), 'ntermediate knowledge of HTML. Instead')]")
    WebElement description;

    @FindBy(xpath = "//a[@href='#tab-reviews']")
    WebElement reviewsLink;

    @FindBy(xpath = "//h2[text()='Reviews']")
    WebElement reviewTitle;

    public boolean ifAddToBasketVisible() {
        return Action.isDisplayed(driver, addToBasket);
    }

    public boolean validatateDescription() {
        return Action.isDisplayed(driver, description);
    }

    public void clickReviewsLink() throws InterruptedException {
       Action.click(driver, reviewsLink);
    }
    public boolean validateTitle() {
        return Action.isDisplayed(driver, reviewTitle);
    }
}
