package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    //verify returning customer
    By returningCustomer = By.xpath("//h2[contains(text(),'Returning Customer')]");
    public String verifyReturningCustomer(){
        return getTextFromElement(returningCustomer);
    }
 //4.3 Enter Email address
 By email1 = By.id("input-email");
    public void enterEmailField(String text) {
        sendTextToElement(email1, text );
    }
//4.5 Enter Password
By password1 = By.id("input-password");
    public void enterPasswordField(String text) {

        sendTextToElement(password1,text);
    }
//4.6 Click on Login button
    By loginButton1 = By.xpath("//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]");
    public void clickOnLoginField(){
        mouseHoverToElementAndClick(loginButton1);
    }

}
