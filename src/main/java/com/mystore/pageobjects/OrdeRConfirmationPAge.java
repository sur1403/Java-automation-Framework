package com.mystore.pageobjects;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrdeRConfirmationPAge extends BaseClass {
    public OrdeRConfirmationPAge(){
        PageFactory.initElements(getDriver(), this);
    }
    @FindBy(xpath = "//*[text()= 'Thank you. Your order has been received.']")
    WebElement orderReceieved;

    public String ifOrderRec(){
        String message = orderReceieved.getText();
        return message;

    }
}
