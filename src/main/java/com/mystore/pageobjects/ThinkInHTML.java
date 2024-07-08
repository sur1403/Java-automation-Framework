package com.mystore.pageobjects;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThinkInHTML extends BaseClass {

    public ThinkInHTML() {

        PageFactory.initElements(getDriver(), this);
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
        return Action.isDisplayed(getDriver(), addToBasket);
    }

    public boolean validatateDescription() {
        return Action.isDisplayed(getDriver(), description);
    }

    public void clickReviewsLink() throws InterruptedException {
       Action.click(getDriver(), reviewsLink);
    }
    public boolean validateTitle() {
        return Action.isDisplayed(getDriver(), reviewTitle);
    }
}
