package com.mystore.pageobjects;

import com.mystore.base.BaseClass;
import org.openqa.selenium.support.PageFactory;

public class AndriodQuickStart extends BaseClass {

    public AndriodQuickStart(){
        PageFactory.initElements(getDriver(), this);
    }
}
