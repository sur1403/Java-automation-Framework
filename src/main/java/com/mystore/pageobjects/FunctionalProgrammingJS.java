package com.mystore.pageobjects;

import com.mystore.base.BaseClass;
import org.openqa.selenium.support.PageFactory;

public class FunctionalProgrammingJS extends BaseClass {

    public FunctionalProgrammingJS(){
        PageFactory.initElements(getDriver(), this);
    }
}
