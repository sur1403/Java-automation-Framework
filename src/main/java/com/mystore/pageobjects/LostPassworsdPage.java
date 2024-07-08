package com.mystore.pageobjects;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LostPassworsdPage extends BaseClass {
    @FindBy(xpath = "//input[contains(text(), 'Lost your password?')]")
    WebElement title;


    public LostPassworsdPage(){
        PageFactory.initElements(getDriver(), this);
    }

    public String verifyTitle(){
        return Action.getTitle(getDriver());
    }
}


