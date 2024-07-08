package com.mystore.pageobjects;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage extends BaseClass {
    @FindBy(xpath = "//*[@id=\"page-34\"]/div/div[1]/form/table/tbody/tr[1]/td[4]/span")
    WebElement unitPrice;

    @FindBy(xpath= "//*[@id=\"page-34\"]/div/div[1]/div/div/table/tbody/tr[3]/td/strong/span")
    WebElement totalPrice;

    @FindBy(xpath = "//*[@id=\"page-34\"]/div/div[1]/div/div/div/a")
    WebElement checkout;

    public OrderPage() {
        PageFactory.initElements(getDriver(),this);
    }

    public double getUnitPrice(){
        String price = unitPrice.getText();
        String unit = price.replaceAll("[^a-zA-Z0-9]", "");
        double finalUnitPrice = Double.parseDouble(unit);
        return finalUnitPrice/100;
    }

    public double getTotalPrice(){
        String totalPrice = unitPrice.getText();
        String tot = totalPrice.replaceAll("[^a-zA-Z0-9]", "");
        double finaltotalPrice = Double.parseDouble(tot);
        return finaltotalPrice/100;
    }

    public AddressPage clickOnCheckout(){
        Action.click(getDriver(), checkout);
        return new AddressPage();
    }
}
