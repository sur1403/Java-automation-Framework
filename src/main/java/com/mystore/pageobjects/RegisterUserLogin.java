package com.mystore.pageobjects;

import com.mystore.actiondriver.Action;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterUserLogin {

    @FindBy(xpath = "//p[contains(., 'Hello')]/text()[2]")
    WebElement loggedUser;


    public String getText(String user){
        Action.selectByVisibleText(user, loggedUser);
        return user;
    }


}
