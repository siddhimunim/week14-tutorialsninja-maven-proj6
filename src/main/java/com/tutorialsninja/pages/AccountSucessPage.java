package com.tutorialsninja.pages;

import com.google.common.base.Verify;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;

public class AccountSucessPage extends Utility {
   // 3.12 Verify the message “Your Account Has Been Created!”
    By verifySucessMassage = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
    public String verifySucessMassageText(){
        return getTextFromElement(verifySucessMassage);
    }
   // 3.13 Click on Continue button
    By clickOn  = By.xpath("//a[contains(text(),'Continue')]");
    public void ClickOnContinueTab(){
        clickOnElement(clickOn);
    }
}
