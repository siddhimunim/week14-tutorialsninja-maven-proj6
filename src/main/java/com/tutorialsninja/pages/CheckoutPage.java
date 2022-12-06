package com.tutorialsninja.pages;

import com.google.common.base.Verify;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;

public class CheckoutPage extends Utility {
    //2.16 Verify the text “Checkout”
    By verifyCheckoutText = By.xpath("//h1[contains(text(),'Checkout')]");
    public String verifycheckoutTextOnPage(){
        return getTextFromElement(verifyCheckoutText);
    }
    //2.17 Verify the Text “New Customer”
    By verifyNewCustomerText = By.xpath("//h2[contains(text(),'New Customer')]");
    public String verifyNewCustomerTab (){
        return getTextFromElement(verifyNewCustomerText);
    }
    // 2.18 Click on “Guest Checkout” radio button
    By guestCheckout = By.xpath("//input[@value='guest']");
    public void clickOnGuestCheckout(){
        clickOnElement(guestCheckout);
    }

    //2.19 Click on “Continue” tab
    By Continue = By.id("button-account");
    public void clickOnContinueTab(){
        clickOnElement(Continue);
    }
    //fill all field  of guestcheckout form------------------
    By firstname = By.id("input-payment-firstname");
    public void enterFirstname(String text){
        sendTextToElement(firstname,text );
    }
    By lastname = By.id("input-payment-lastname");
    public void enterLastname(String text){
        sendTextToElement(lastname,text );
    }
    By email = By.id("input-payment-email");
    public void enterEmail(String text){
        sendTextToElement(email,text );
    }
    By telephoneField = By.id("input-payment-telephone");
    public void enterTelephone(String text){
        sendTextToElement(telephoneField,text );
    }
    By address1 = By.id("input-payment-address-1");
    public void enterAddress1(String text){
        sendTextToElement(address1,text );
    }
    By city = By.id("input-payment-city");
    public void enterCityName(String text){
        sendTextToElement(city ,text );
    }
    By postcode = By.id("input-payment-postcode");
    public void enterPostcode(String text){
        sendTextToElement(postcode,text );
    }
    By Country = By.xpath("//select[@id='input-payment-country']");
    public void enterCountryName(String text){
        selectByVisibleTextFromDropDown(Country,text);
    }
    By region = By.xpath("//select[@id='input-payment-zone']");
    public void enterRegionField(String text){
        selectByVisibleTextFromDropDown(region,text);
    }
    //click on countinue
    By continueField = By.id("button-guest");
    public void clickOnContinue(){
        clickOnElement(continueField);
    }
    //2.22 Add Comments About your order into text area
    By comment= By.xpath("//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/p[2]/textarea[1]");
    public void addCommentOnTextArea (String text){
        sendTextToElement(comment,text);
    }

    //2.23 Check the Terms & Conditions check box
    By termsCondition = By.xpath("//input[@type='checkbox']");
    public void clickOnTermsAndCondition(){
        clickOnElement(termsCondition);
    }
    //2.24 Click on “Continue” button
    By contTab = By.id("button-payment-method");
    public void clickOnContinueField(){
        clickOnElement(contTab);
    }
    //2.25 Verify the message “Warning: Payment method required
    By verifyWarningMassage = By.xpath("//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]");
    public String verifyWarningSign(){
        return  getTextFromElement(verifyWarningMassage);
    }






}
