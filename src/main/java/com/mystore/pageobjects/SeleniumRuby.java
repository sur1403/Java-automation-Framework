package com.mystore.pageobjects;

import com.mystore.base.BaseClass;
import org.openqa.selenium.support.PageFactory;

public class SeleniumRuby extends BaseClass {

    public SeleniumRuby(){
        PageFactory.initElements(driver, this);
    }

}
