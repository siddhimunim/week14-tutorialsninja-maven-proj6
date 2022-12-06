package com.tutorialsninja.pages;

import com.google.common.base.Verify;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;

public class LogOutAccountPage extends Utility {
   // 3.16 Verify the text “Account Logout”
   By logOut = By.xpath("//h1[contains(text(),'Account Logout')]");
   public String verifyAccountLogout(){
       return getTextFromElement(logOut);
   }
   // 3.17 Click on Continue button
    By fieldContinue = By.xpath("//a[contains(text(),'Continue')]");
   public void clickOnContinueField(){
       clickOnElement(fieldContinue);
   }


}
