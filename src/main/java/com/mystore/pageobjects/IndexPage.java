package com.mystore.pageobjects;

import com.mystore.actiondriver.Action;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage extends Action {
    @FindBy(xpath = "//img[@alt = 'Shop Selenium Books']")
    WebElement selBookImg;

    @FindBy(xpath = "//img[@title = 'Selenium Ruby']")
    WebElement selRubyImg;

    @FindBy(xpath = "//img[@title = 'Thinking in HTML']")
    WebElement thinkInHtmlImg;

    @FindBy(xpath = "//img[@title = 'Mastering JavaScript']")
    WebElement masterJSImg;

    @FindBy(xpath = "//a[@href='/?add-to-cart=160']")
    WebElement SelniumAddToCartBtn;

    @FindBy(xpath = "//a[@href='/?add-to-cart=163']")
    WebElement thinkInHTMLBtn;

    @FindBy(xpath = "//a[@href='/?add-to-cart=165']")
    WebElement masterJSBtn;

    @FindBy(xpath = "//div[@id='n2-ss-6-arrow-previous']/img[@alt='Arrow']")
    WebElement leftArrow;

    @FindBy(xpath = "//div[@id='n2-ss-6-arrow-next']/img[@alt='Arrow']")
    WebElement rightArrow;

    public IndexPage(){
        PageFactory.initElements(driver, this);
    }

    public void clickOnSeleniumImg(){
        Action.click(driver, selRubyImg );
    }

    public void thinkInHTMLImg(){
        Action.click(driver, thinkInHtmlImg );
    }


}
