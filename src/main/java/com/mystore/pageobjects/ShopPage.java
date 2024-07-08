package com.mystore.pageobjects;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopPage extends BaseClass {

    public ShopPage(){
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//h3[text()='Android Quick Start Guide']")
    WebElement andriod;

    @FindBy(xpath = "//a[@data-product_id='169']")
    WebElement andriodAddToBasket;

    @FindBy(xpath = "//h3[text()='Functional Programming in JS']")
    WebElement JS;

    @FindBy(xpath = "//a[@data-product_id='170']")
    WebElement JSAddToBasket;

    @FindBy(xpath = "//h3[text()='HTML5 Forms")
    WebElement HTML;

    @FindBy(xpath = "//a[@data-product_id='181']")
    WebElement HTMLAddToBasket;

    @FindBy(xpath = "//h3[text()='HTML5 WebApp Develpment")
    WebElement HTMLWebApp;

    @FindBy(xpath = "//a[@data-product_id='182']")
    WebElement HTMLWebAppToBasket;

    @FindBy(xpath = "//h3[text()='Selenium Ruby")
    WebElement seleniumRuby;

    @FindBy(xpath = "//a[@data-product_id='160']")
    WebElement seleniumAddToRubyToBasket;

    @FindBy(xpath = "//h3[text()='Mastering JavaScript")
    WebElement masterJS;

    @FindBy(xpath = "//a[@data-product_id='165']")
    WebElement masterJSToBasket;

    @FindBy(xpath = "//h3[text()='JS Data Structures and Algorithm")
    WebElement jsDS;

    @FindBy(xpath = "//a[@data-product_id='180']")
    WebElement JSDSToBasket;

    @FindBy(xpath = "//h3[text()='Thinking in HTML")
    WebElement thinkingHTML;

    @FindBy(xpath = "//a[@data-product_id='163']")
    WebElement thinkingHTMLToBasket;

    public boolean isProductAvailable(){
        Action.isDisplayed(getDriver(), andriod);
        Action.isDisplayed(getDriver(), JS);
        Action.isDisplayed(getDriver(), HTML);
        Action.isDisplayed(getDriver(), HTMLWebApp);
        Action.isDisplayed(getDriver(), seleniumRuby);
        Action.isDisplayed(getDriver(), masterJS);
        Action.isDisplayed(getDriver(), jsDS);
        return Action.isDisplayed(getDriver(), thinkingHTML);
    }

    public void clickOnAndriod(){
        Action.click(getDriver(),andriodAddToBasket );
    }

    public void clickOnJS(){
        Action.click(getDriver(),JSAddToBasket );
    }

    public void clickOnHTML(){
        Action.click(getDriver(),HTMLAddToBasket );
    }

    public void clickOnHTMLWeb(){
        Action.click(getDriver(),HTMLWebAppToBasket );
    }

    public void selenium(){
        Action.click(getDriver(),seleniumAddToRubyToBasket );
    }

    public void clickOnJMasterJS() {
        Action.click(getDriver(), masterJSToBasket);
    }

    public void clickOnJSDSToBasket(){
        Action.click(getDriver(),JSDSToBasket );
    }

    public void clickOnJThinkHTML(){
        Action.click(getDriver(),thinkingHTMLToBasket );
    }
}
