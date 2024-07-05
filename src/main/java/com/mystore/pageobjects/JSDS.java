package com.mystore.pageobjects;

import com.mystore.base.BaseClass;
import org.openqa.selenium.support.PageFactory;

public class JSDS extends BaseClass {
    public JSDS(){
        PageFactory.initElements(driver, this);
    }
}
