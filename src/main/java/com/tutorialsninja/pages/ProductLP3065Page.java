package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductLP3065Page extends Utility {
    By verifyLaptopText = By.xpath("//h1[contains(text(),'HP LP3065')]");

    public String verifyLaptopText(){
        return getTextFromElement(verifyLaptopText);
    }
    //----------------------------------------datepicker------------------------
    //  By calenderField = By.xpath("//div[@class = 'input-group date']//button");
    By monthYearTab = By.xpath("//div[@class='datepicker-days']/table/thead/tr[1]/th[2]");
    //  By clickOnErrow = By.xpath("//body[1]/div[4]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[3]");
    By pickDate =  By.xpath("//div[@class='datepicker']/div[1]//table//td[text()='30']");


    public void pickUpDate() {
        String year = "2022";
        String month = "November";
        String date = "30";
        clickOnElement(By.xpath("//div[@class = 'input-group date']//button"));
        while (true) {
            String monthyear = driver.findElement(monthYearTab).getText();
            //nov 2022
            String[] arr = monthyear.split(" ");
            String mon = arr[0];
            String year1 = arr[1];
            if (mon.equalsIgnoreCase(month) && year1.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(By.xpath("//body[1]/div[4]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[3]"));
            }

        }
        clickOnElement(By.xpath("//div[@class='datepicker']/div[1]//table//td[text()='30']"));
        List<WebElement> alldates = driver.findElements(pickDate);
        for (WebElement date1 : alldates) {
            if (date1.getText().equalsIgnoreCase(date)) {
                date1.click();
                break;
            }
        }
    }
    //2.7 enterQty //
    By enterQtyField = By.name("quantity");
    public void enterQuantityInToTab(String text){
        sendTextToElement(enterQtyField,text);
    }
    //click on add to cart//
    By addToCart = By.xpath("//button[@id='button-cart']");
    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }
    //---------------------//

     By verifyMassage = By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible");
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
}
