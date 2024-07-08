package com.mystore.pageobjects;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class IndexPage extends BaseClass {
    @FindBy(xpath = "//img[@alt = 'Shop Selenium Books']")
    WebElement selBookImg;

    @FindBy(css = ".attachment-shop_catalog")
    List<WebElement> product;

    @FindBy(xpath = "//a[text()='Home']")
    WebElement homeLink;

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

    @FindBy(css = ".attachment-shop_catalog.size-shop_catalog.wp-post-image")
    List<WebElement> sliders;

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

    @FindBy(id = "cart-button")
    WebElement cart;


    public ShopPage goToShop() {
        Action.click(getDriver(), shop);
        return new ShopPage();
    }

    public MyAccount gotoMyAccount() {
        Action.click(getDriver(), myAccount);
        return new MyAccount();
    }

    public ShopPage gotoShop() {
        Action.click(getDriver(), shop);
        return new ShopPage();
    }

    public IndexPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public SeleniumRuby clickOnSeleniumImg() throws Throwable {
        Action.click(getDriver(), selRubyImg);
        return new SeleniumRuby();
    }

    public IndexPage goToHome() throws Throwable {
        Action.click(getDriver(), homeLink);
        return new IndexPage();
    }

    public ThinkInHTML thinkInHTMLImg() throws Throwable {
        Action.click(getDriver(), thinkInHtmlImg);
        return new ThinkInHTML();
    }

    public MasterJS masterJSImg() throws Throwable {
        Action.click(getDriver(), masterJSImg);
        return new MasterJS();
    }

    public boolean seleniumAddToCart() throws Throwable {
        Action.click(getDriver(), SelniumAddToCartBtn);
        return Action.isDisplayed(getDriver(), SeleniumAddToBasket);
    }

    public boolean htmlAddToCart() throws Throwable {
        Action.click(getDriver(), thinkInHTMLBtn);
        return Action.isDisplayed(getDriver(), HTMLAddToBasket);
    }

    public boolean masterJSAddToCart() {
        Action.click(getDriver(), masterJSBtn);
        return Action.isDisplayed(getDriver(), JSToBasket);
    }

    public void moveArrows() throws Throwable {
        Action.click(getDriver(), leftArrow);
        Action.click(getDriver(), rightArrow);
    }

    public boolean verifyTitle() throws Throwable {
        return Action.isDisplayed(getDriver(), selBookImg);
    }

    public String getMyStoreTitle() throws Throwable {
        return Action.getTitle(getDriver());
    }

    public void subscribeHere(String email1) throws Throwable {
        Action.type(email, email1);
        Action.click(getDriver(), submitBtn);
    }

    public List<WebElement> findSliders() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(sliders));
        return sliders;
    }

    public List<WebElement> ifProductVisible() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(product));
        return product;
    }

    public SeleniumRuby clickSelImage(){
        Action.click(getDriver(), selRubyImg);
        return new SeleniumRuby();
    }

    public ThinkInHTML clickThinkInHTML(){
        Action.click(getDriver(), thinkInHtmlImg);
        return new ThinkInHTML();
    }

    public MasterJS clickMasterJS(){
        Action.click(getDriver(), masterJSImg);
        return new MasterJS();
    }
}
