package com.mystore.pageobjects;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumRuby extends BaseClass {

    public SeleniumRuby(){
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//button[text()='Add to basket']")
    WebElement addToBasket;

    @FindBy(xpath = "//*[contains(text(), 'quick problem-solving guide')]")
    WebElement description;

    public boolean ifAddToBasketVisible(){
        return Action.isDisplayed(getDriver(), addToBasket);
    }

    public boolean validatateDescription(){
        return Action.isDisplayed(getDriver(), description);
    }
}
