package com.mystore.pageobjects;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LostPassworsdPage extends BaseClass {
    @FindBy(xpath = "//input[contains(text(), 'Lost your password?')]")
    WebElement title;

    public String verifyTitle(){
        return Action.getTitle(driver);
    }
}


