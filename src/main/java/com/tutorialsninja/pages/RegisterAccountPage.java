package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;

public class RegisterAccountPage extends Utility {
    //verify register account text
    By regAccountText = By.xpath("//h1[contains(text(),'Register Account')]");

    public String verifyRegAccountText() {
        return getTextFromElement(regAccountText);
    }

    // filled mendotary field
    By firstName = By.id("input-firstname");

    public void enterFirstName(String text ) {

        sendTextToElement(firstName, text + getAlphaNumericString(1));
    }

    By lastName = By.id("input-lastname");

    public void enterLastName(String text) {
        sendTextToElement(lastName, text +getAlphaNumericString(1));
    }

    By email = By.id("input-email");

    public void enterEmail(String text) {
        sendTextToElement(email, text +getAlphaNumericString(2) + "@gmail.com");
    }

    By telephone = By.id("input-telephone");

    public void enterTelephone(String text) {
        sendTextToElement(telephone, text);
    }

    By password = By.id("input-password");

    public void enterPassword(String text) {
        sendTextToElement(password, text);
    }

    By confirmPass = By.id("input-confirm");

    public void enterConfirmPassword(String text) {
        sendTextToElement(confirmPass, text);
    }

    // 3.9 Select Subscribe Yes radio button
    By subscribe = By.name("newsletter");

    public void clickOnSubscribe() {
        clickOnElement(subscribe);
    }

    //3.10 Click on Privacy Policy check box
    By checkbox = By.name("agree");

    public void clickOnCheckbox() {
        clickOnElement(checkbox);
    }

    //3.11 Click on Continue button
    By continueBox = By.xpath("//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]");

    public void clickOnContinue() {
        clickOnElement(continueBox);
    }

}
