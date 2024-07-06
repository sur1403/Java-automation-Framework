package com.mystore.testcases;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.ShopPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ListenerComparator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class HomePageTest extends BaseClass {
    IndexPage indexPage;

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
        indexPage.gotoCart();
        indexPage.goToHome();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> sliders = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(indexPage.validateIndexPage("Shop Selenium Books")));
        if (sliders.size() == 3) {
            System.out.println("Test Passed: Home page contains exactly three sliders.");
        } else {
            System.out.println("Test Failed: Expected 3 sliders, but found " + sliders.size());
        }



    }

    public void validateThreeArivals(){

    }


}
