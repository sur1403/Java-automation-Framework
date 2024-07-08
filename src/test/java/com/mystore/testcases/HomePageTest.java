package com.mystore.testcases;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.MasterJS;
import com.mystore.pageobjects.SeleniumRuby;
import com.mystore.pageobjects.ThinkInHTML;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class HomePageTest extends BaseClass {
    IndexPage indexPage;
    SeleniumRuby seleniumRuby;
    ThinkInHTML thinkInHTML;
    MasterJS masterjs;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @BeforeMethod
    public void setup() throws Throwable {
        launchApp();
        indexPage = new IndexPage();
        seleniumRuby = new SeleniumRuby();
        thinkInHTML = new ThinkInHTML();
        masterjs = new MasterJS();
        indexPage.gotoShop();
        indexPage.goToHome();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test(description = "Validate there are only 3 sliders on home page")
    public void validateThreeSlider() throws Throwable {

        List<WebElement> sliders = indexPage.findSliders();
        Assert.assertNotNull(sliders);
        Assert.assertEquals(3, sliders.size());
    }

    @Test(description = "Validate there are only 3 arriavals on home page")

    public void validateThreeArivals() {

        List<WebElement> arrivals = indexPage.ifProductVisible();
        Assert.assertNotNull(arrivals);
        Assert.assertEquals(3, arrivals.size());
    }

    @Test(description = "Validate Arrival images and their description ")
    public void validateArivalImage() throws Throwable {
        validateThreeArivals();
        indexPage.clickSelImage();
        Assert.assertTrue(seleniumRuby.ifAddToBasketVisible());
        Assert.assertTrue(seleniumRuby.validatateDescription());
        indexPage.goToHome();
        wait.until(ExpectedConditions.visibilityOfAllElements(indexPage.ifProductVisible()));
        indexPage.clickThinkInHTML();
        Assert.assertTrue(thinkInHTML.ifAddToBasketVisible());
        Assert.assertTrue(thinkInHTML.validatateDescription());
        thinkInHTML.clickReviewsLink();
        Assert.assertTrue(thinkInHTML.validateTitle());
        indexPage.goToHome();
        wait.until(ExpectedConditions.visibilityOfAllElements(indexPage.ifProductVisible()));
        indexPage.clickMasterJS();
        Assert.assertTrue(masterjs.ifAddToBasketVisible());
        Assert.assertTrue(masterjs.validatateDescription());
        indexPage.goToHome();
        wait.until(ExpectedConditions.visibilityOfAllElements(indexPage.ifProductVisible()));
    }


}
