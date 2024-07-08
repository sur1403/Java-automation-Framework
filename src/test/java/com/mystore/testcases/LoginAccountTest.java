package com.mystore.testcases;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.IndexPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LoginAccountTest extends BaseClass {
    IndexPage indexPage;

    @BeforeMethod
    public void setup() throws Throwable {
        launchApp();
        indexPage = new IndexPage();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
