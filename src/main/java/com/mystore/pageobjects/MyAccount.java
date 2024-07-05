package com.mystore.pageobjects;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends BaseClass {

    @FindBy(xpath = "[id='username']")
    WebElement loginUser;

    @FindBy(xpath = "password")
    WebElement loginPwd;

    @FindBy(xpath = "//input[@name='login']")
    WebElement loginBtn;

    @FindBy(xpath = "//label[@class='inline']")
    WebElement rememberMe;

    @FindBy(xpath = "//a[text()='Lost your password?']")
    WebElement lostPwd;

    @FindBy(id="reg_email")
    WebElement email;

    @FindBy(id = "reg_password")
    WebElement password;

    @FindBy(xpath = "//input[@name='register']")
    WebElement register;

    public LostPassworsdPage lostPasswrd() throws Throwable{
        Action.click(driver, lostPwd);
        return new LostPassworsdPage();
    }

    public void login(String user, String pass) throws Throwable{
        Action.type(loginUser, user);
        Action.type(loginPwd, pass);
        Action.click(driver, loginBtn);
    }

    public String register(String user, String pass) throws Throwable{
        Action.type(email, user);
        Action.type(password, pass);
        Action.click(driver, register);
        return new RegisterUserLogin().getText(user);


    }

}
