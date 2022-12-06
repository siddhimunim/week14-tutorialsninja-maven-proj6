package com.tutorialsninja.pages;

import com.google.common.base.Verify;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;

public class ProductMacBookPage extends Utility {
    By verifyMacBookText = By.xpath("//h1[contains(text(),'MacBook')]");

    public String verifyMacBookProduct() {
        return getTextFromElement(verifyMacBookText);
    }

    //2.6 Click on ‘Add To Cart’ button
    By addToCart = By.xpath("//button[@id='button-cart']");

    public void clickOnCart() {
        clickOnElement(addToCart);
    }
  //  2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
    By verifymacBookText = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    public String verifyMacBookTab(){
        return getTextFromElement(verifymacBookText);
    }
    // 2.8 Click on link “shopping cart” display into success message
    By shopcart = By.xpath("//a[contains(text(),'shopping cart')]");
    public void clickOnShoppingCart(){
        clickOnElement(shopcart);
    }
}
