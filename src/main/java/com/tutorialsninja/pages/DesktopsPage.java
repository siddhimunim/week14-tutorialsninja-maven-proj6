package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopsPage extends Utility {
    //verify desktoptext on page
    By verifyDesktopText = By.xpath("//h2[contains(text(),'Desktops')]");

    By clickOnZtoA = By.xpath("//select[@id='input-sort']");
    By clickOnAtoZ = By.xpath("//select[@id='input-sort']");
    By selectHp3065 = By.xpath("//a[contains(text(),'HP LP3065')]");






    public void clickOnHpLaptop() {
        clickOnElement(selectHp3065);
    }


    public String verifyText() {
        return getTextFromElement(verifyDesktopText);
    }

    public void clickonAtoZ() {
        selectByVisibleTextFromDropDown(clickOnAtoZ, "Name (A - Z)");
    }

    public void clickonZtoA() {
        //  clickOnElement(clickOnZtoA);
        selectByVisibleTextFromDropDown(clickOnZtoA, "Name (Z - A)");
    }

    //verify z-a order
    By allProductName = By.xpath("//h4/a");
    By sortOutZToA = By.id("input-sort");

    public ArrayList<String> verifyProductZToA() {
        // Get all the products name and stored into array list
        List<WebElement> products = driver.findElements(allProductName);
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        System.out.println(originalProductsName);
        // Sort By Reverse order//
        Collections.reverse(originalProductsName);
        //System.out.println(originalProductsName);
        // Select sort by Name Z - A//
        selectByVisibleTextFromDropDown(sortOutZToA, "Name (Z - A)");
        // After filter Z -A Get all the products name and stored into array list
        products = driver.findElements(allProductName);
        ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();
        for (WebElement e : products) {
            afterSortByZToAProductsName.add(e.getText());

        }
        return afterSortByZToAProductsName;
    }


}
