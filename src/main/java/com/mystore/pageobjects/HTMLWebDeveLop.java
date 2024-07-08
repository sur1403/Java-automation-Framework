package com.mystore.pageobjects;

import com.mystore.base.BaseClass;
import org.openqa.selenium.support.PageFactory;

public class HTMLWebDeveLop extends BaseClass {
    public HTMLWebDeveLop(){
        PageFactory.initElements(getDriver(), this);
    }
}
