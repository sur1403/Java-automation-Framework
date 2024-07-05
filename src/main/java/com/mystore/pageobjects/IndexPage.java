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

    @FindBy(xpath = "//*[@id=\"text-22-sub_row_1-0-2-1-0\"]/div/ul/li/a[3]")
    WebElement HTMLAddToBasket;

    @FindBy(xpath = "//*[@id=\"text-22-sub_row_1-0-2-0-0\"]/div/ul/li/a[3]")
    WebElement SeleniumAddToBasket;

    @FindBy(xpath = "//*[@id=\"text-22-sub_row_1-0-2-2-0\"]/div/ul/li/a[3]")
    WebElement JSToBasket;

    @FindBy(xpath = "//input[@type = 'email']")
    WebElement email;

    @FindBy(xpath = "//input[@type = 'submit']")
    WebElement submitBtn;

    @FindBy(xpath = "//a[text()='Shop']")
    WebElement shop;

    @FindBy(xpath = "//a[text()='My Account']")
    WebElement myAccount;

    @FindBy(xpath = "//a[@title='Start shopping']")
    WebElement cart;


    public ShopPage goToShop(){
        Action.click(driver, shop);
        return new ShopPage();
    }

    public MyAccount gotoMyAccount(){
        Action.click(driver, myAccount);
        return new MyAccount();
    }

    public ShopPage gotoCart(){
        Action.click(driver, cart);
        return new ShopPage();
    }

    public IndexPage(){
        PageFactory.initElements(driver, this);
    }

    public SeleniumRuby clickOnSeleniumImg() throws Throwable{
        Action.click(driver, selRubyImg );
        return new SeleniumRuby();
    }

    public ThinkInHTML thinkInHTMLImg() throws Throwable{
        Action.click(driver, thinkInHtmlImg );
        return new ThinkInHTML();
    }

    public MasterJS masterJSImg() throws Throwable{
        Action.click(driver, masterJSImg);
        return new MasterJS();
    }

    public boolean seleniumAddToCart() throws Throwable{
        Action.click(driver,SelniumAddToCartBtn );
        return Action.isDisplayed(driver, SeleniumAddToBasket);
    }

    public boolean htmlAddToCart() throws Throwable{
        Action.click(driver,thinkInHTMLBtn );
        return Action.isDisplayed(driver, HTMLAddToBasket);
    }
    public boolean masterJSAddToCart(){
        Action.click(driver, masterJSBtn);
        return Action.isDisplayed(driver, JSToBasket);
    }

    public void moveArrows() throws Throwable{
        Action.click(driver, leftArrow);
        Action.click(driver, rightArrow);
    }

    public boolean verifyTitle() throws Throwable{
        return Action.isDisplayed(driver, selBookImg);
    }

    public String getMyStoreTitle() throws Throwable{
        return Action.getTitle(driver);
    }

    public void subscribeHere(String email1) throws  Throwable{
        Action.type(email, email1);
        Action.click(driver, submitBtn);
    }
}
