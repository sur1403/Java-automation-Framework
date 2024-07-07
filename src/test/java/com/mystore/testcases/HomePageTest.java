package com.mystore.testcases;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.IndexPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class HomePageTest extends BaseClass {
    IndexPage indexPage ;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @BeforeMethod
    public void setup() {
        launchApp();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void validateThreeSlider() throws Throwable {
        indexPage = new IndexPage();
        indexPage.gotoShop();
        indexPage.goToHome();

        // The locator for sliders is obtained from validateIndexPage method
        List<WebElement> sliders = indexPage.findSliders();

        Assert.assertNotNull(sliders);
        Assert.assertEquals(3, sliders.size());

        System.out.println("Test Passed: Home page contains exactly three sliders.");
    }

        public void validateThreeArivals(){
        List<WebElement> arrivals = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(indexPage.ifProductVisible()));
    }
}
