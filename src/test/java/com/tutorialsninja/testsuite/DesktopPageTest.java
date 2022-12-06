package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.ProductLP3065Page;
import com.tutorialsninja.pages.ShoppingCartPage;
import com.tutorialsninja.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPageTest extends BaseTest {
    HomePage homePage = new HomePage();
    DesktopsPage desktopsPage = new DesktopsPage();
    ProductLP3065Page productLP3065Page = new ProductLP3065Page();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void verifyProductArrangeInAlphabeticalOrder() {

        homePage.mouseHoverOnDesktop();
        homePage.selectmenu("Show All Desktops");
        desktopsPage.clickonZtoA();
         List<String> expText  = desktopsPage.verifyProductZToA();
         List<String> actText  = desktopsPage.verifyProductZToA();
        System.out.println("Expected list " + expText );
        Assert.assertEquals(Collections.singleton(actText),Collections.singleton(expText));
        System.out.println("Actual List " + actText);


    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        Thread.sleep(1000);
        homePage.clickOnCurrency();
        homePage.selectCurrencyPound();
        homePage.mouseHoverOnDesktop();
        homePage.clickOnAllDesktop();
        desktopsPage.clickonAtoZ();
        desktopsPage.clickOnHpLaptop();
        //verify laptopname//
        Thread.sleep(1000);
        String expText = "HP LP3065";
        String actText = productLP3065Page.verifyLaptopText();
        Assert.assertEquals(actText,expText,"Not varify");
        productLP3065Page.pickUpDate();
        productLP3065Page.enterQuantityInToTab(" ");
        productLP3065Page.clickOnAddToCart();
        Thread.sleep(1000);
        Assert.assertTrue(shoppingCartPage.verifyMassageOfShoppingCart().contains("Success: You have added HP LP3065 to your shopping cart!"));

        Thread.sleep(1000);
        shoppingCartPage.clickOnShoppingcart();
        String expText2 = "Shopping Cart  (1.00kg)";
        String actText2 = shoppingCartPage.verifyShoppingCartText();
        Assert.assertEquals(actText2,expText2,"Not varify");
        Thread.sleep(1000);
        String expText3 = "HP LP3065";
        String actText3 = shoppingCartPage.verifyProductnameText();
        Assert.assertEquals(actText3,expText3,"Not varify");
        Thread.sleep(1000);
        String expText4 = "Delivery Date: 2022-11-30";
        String actText4 = shoppingCartPage.verifyDeliverydateText();
        Assert.assertEquals(actText4,expText4,"Not varify");
        Thread.sleep(1000);
        String expText5 = "Product 21";
        String actText5 = shoppingCartPage.verifyModelNo();
        Assert.assertEquals(actText5,expText5,"Not varify");
        Thread.sleep(1000);
        String expText6 = "£74.73";
        String actText6 = shoppingCartPage.verifyTotal();
        Assert.assertEquals(actText6,expText6,"Not varify");










    }
}

