package com.mystore.pageobjects;

import com.mystore.base.BaseClass;
import org.openqa.selenium.support.PageFactory;

public class ThinkInHTML extends BaseClass {

    public ThinkInHTML(){

        PageFactory.initElements(driver, this);
    }


}
