package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;

public class MyAccountPage extends Utility {
    //click on my account and logout
   By myAccount = By.xpath("//span[contains(text(),'My Account')]");
   public void clickMyAccountTab(){
       mouseHoverToElementAndClick(myAccount);
   }
  //verify My Account
    By verifyMyAcc = By.xpath("//h2[contains(text(),'My Account')]");
   public String verifyMyAccount(){
       return getTextFromElement(verifyMyAcc);
   }

}
