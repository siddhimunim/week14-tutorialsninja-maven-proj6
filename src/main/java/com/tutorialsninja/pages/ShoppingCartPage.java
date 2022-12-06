package com.tutorialsninja.pages;

import com.google.common.base.Verify;
import com.tutorialsninja.utility.Utility;
import javafx.scene.control.Tab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage extends Utility {
    //for all methods for desktop----------------------------------------///
    By verifyMassage = By.xpath("//body/div[@id='product-product']/div[1]");
    By shoppingcart = By.xpath("//a[contains(text(),'shopping cart')]");
    By VerifyShoppingcart = By.xpath("//div[@id='content']//h1");
    By verifyProductname = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");
    By verifyDelivarydate= By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]");
    By verifyModel= By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[3]");
    By verifyTotal = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");

    public String verifyMassageOfShoppingCart(){

      return  getTextFromElement(verifyMassage);

    }
    public void clickOnShoppingcart(){
        mouseHoverToElementAndClick(shoppingcart);
    }
    public String verifyProductnameText (){
        return getTextFromElement(verifyProductname);

    }
    public String verifyDeliverydateText (){
        return getTextFromElement(verifyDelivarydate);

    }
    public String verifyModelNo (){
        return getTextFromElement(verifyModel);

    }
    public String verifyShoppingCartText (){
        return getTextFromElement(VerifyShoppingcart);

    }
    public String verifyTotal (){
        return getTextFromElement(verifyTotal);

    }
    //----------------all methods for laptop and notebook--------------------------//
   // 2.9 Verify the text "Shopping Cart"
    By verifyShoppingCart = By.xpath("//body[1]/div[2]/div[1]/div[1]/h1[1]");
    public String verifyMassageShoppingcart(){
        return getTextFromElement(verifyShoppingCart);
    }
    //2.10 Verify the Product name "MacBook"
    By verifyProductMacBook = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");
    public String verifyTextOfMacBook(){
        return getTextFromElement(verifyProductMacBook);
    }
  //2.11 Change Quantity "2"
    By changeQty =By.xpath("//div[@class='input-group btn-block']/input");
    public void clearQty(){
        WebElement changeqty =   driver.findElement(By.xpath("//div[@class='input-group btn-block']/input"));
        changeqty.clear();
    }
    public void newQtychange(String text){
        sendTextToElement(changeQty,text);
    }
   //2.12 Click on “Update” Tab
    By updateButton = By.xpath("//tbody/tr[1]/td[4]/div[1]/span[1]/button[1]/i[1]");
    public void clickOnUpdateButton(){
        clickOnElement(updateButton);
    }

//2.13 Verify the message “Success: You have modified your shopping cart!”
    By verifySuccessModifyCart =By.xpath("//div[@class='alert alert-success alert-dismissible']");
    public String verifySuceesfullyUpdatecartMassage(){
        return getTextFromElement(verifySuccessModifyCart);
    }
  //2.14 Verify the Total £737.45
    By verifyPriceCheck =By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");
    public String verifyPrice(){
        return getTextFromElement(verifyPriceCheck);
    }
 //2.15 Click on “Checkout” button
    By checkout =By.linkText("Checkout");
    public void clickOnCheckOut(){
        mouseHoverToElementAndClick(checkout);
    }
}
