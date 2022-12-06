package com.tutorialsninja.pages;

import com.google.common.base.Verify;
import com.tutorialsninja.utility.Utility;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopAndNoteBookPage extends Utility {
    By verifylaptopText = By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");
    By priceHighLowField = By.xpath("//select[@id='input-sort']");


    public String verifyTextOfLaptop() {
        return getTextFromElement(verifylaptopText);
    }

    public void sortProductToHighLow(String text) {
        selectByVisibleTextFromDropDown(priceHighLowField, text);
    }
    //verify product high to low

    public ArrayList<Double> verifyPriceHighToLow() {
        List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));
        List<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            System.out.println(e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(originalProductsPrice);
        // Sort By Reverse order
        Collections.sort(originalProductsPrice, Collections.reverseOrder());
        System.out.println(originalProductsPrice);
        // Select sort by Price (High > Low)
        selectByVisibleTextFromDropDown(By.id("input-sort"), "Price (High > Low)");
        // After filter Price (High > Low) Get all the products name and stored into array list
        products = driver.findElements(By.xpath("//p[@class ='price']"));
        ArrayList<Double> afterSortByPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            afterSortByPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }

        return afterSortByPrice;
    }


   // 2.4 Select Product “MacBook”
    By selectMacBook= By.linkText("MacBook");
    public void clickOnMacBook(){
        clickOnElement(selectMacBook);
    }




}
