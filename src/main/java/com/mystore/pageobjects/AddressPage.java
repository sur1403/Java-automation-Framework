package com.mystore.pageobjects;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;
import org.apache.commons.math3.analysis.function.Add;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage extends BaseClass {

    public AddressPage(){
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(id="billing_first_name")
    WebElement fname;

    @FindBy(id="billing_last_name")
    WebElement lname;

    @FindBy(id="billing_company")
    WebElement bcompany;

    @FindBy(id="billing_email")
    WebElement bEmail;

    @FindBy(id="billing_phone")
    WebElement phone;

    @FindBy(xpath="//*[@id=\"select2-chosen-1\"]")
    WebElement country;

    @FindBy(xpath="//*[@id=\"billing_address_1_field\"]")
    WebElement address;

    @FindBy(xpath="//*[@id=\"billing_city_field\"]")
    WebElement city;

    @FindBy(xpath="//*[@id=\"select2-drop-mask\"]")
    WebElement state;

    @FindBy(xpath="//*[@id=\"billing_postcode_field\"]")
    WebElement postcode;

    @FindBy(id="place_order")
    WebElement placeOrder;

    public OrdeRConfirmationPAge configOPrdeR(){
        Action.click(getDriver(), placeOrder);
        return new OrdeRConfirmationPAge();
    }
}
