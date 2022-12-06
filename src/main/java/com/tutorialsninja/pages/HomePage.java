package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {


    //for desktop tab
    By menuField =  By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*");
    By desktopsField= By.linkText("Desktops");
    By allDesktopField = By.linkText("Show All Desktops");
    By laptopAndNoteBookField= By.linkText("Laptops & Notebooks");
    By componentsField= By.linkText("Components");
    By currencyField = By.xpath("//span[contains(text(),'Currency')]");
    By SelectPound = By.xpath("//button[contains(text(),'£ Pound Sterling')]");




    //method for homepage
    public void clickOnAllDesktop(){
        clickOnElement(allDesktopField);
    }
    public void mouseHoverOnlaptopAndNoteBook(){
        mouseHoverToElementAndClick(laptopAndNoteBookField);
    }
    public void mouseHoverOnDesktop(){
        mouseHoverToElementAndClick(desktopsField);
    }
    public void mouseHoverOnComponents(){
        mouseHoverToElementAndClick(componentsField);
    }
    public void selectmenu (String menu){
        List<WebElement> topMenuList = driver.findElements(menuField);
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (
                StaleElementReferenceException e) {
            topMenuList = driver.findElements(menuField);
        }
    }
    public void clickOnCurrency(){
        mouseHoverToElementAndClick(currencyField);

    }
    public void selectCurrencyPound(){
        clickOnElement(SelectPound);

    }
    //---------------------------------method for select my account tabs-------------------------------//
    By myAccountList1 = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li");
    public void selectMyAccountOptions(String option) {

        List<WebElement> myAccountList = driver.findElements(myAccountList1);
        try {
            for (WebElement option1 : myAccountList) {
                System.out.println(option1.getText());
                if (option1.getText().equals(option)) {
                    option1.click();
                    break;
                }

            }

        } catch (StaleElementReferenceException e) {
            myAccountList = driver.findElements(myAccountList1);
        }
    }
    //click on my account
    By myAccountButton= By.xpath("//span[contains(text(),'My Account')]");
    public void clickOnMyAccount(){
        mouseHoverToElementAndClick(myAccountButton);
    }







}
