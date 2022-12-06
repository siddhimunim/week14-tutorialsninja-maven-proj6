package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.*;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

public class LaptopAndNoteBooksTest extends BaseTest {
    HomePage homePage = new HomePage();
    LaptopAndNoteBookPage laptopAndNoteBookPage = new LaptopAndNoteBookPage();
    ProductMacBookPage productMacBookPage = new ProductMacBookPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckoutPage checkoutPage = new CheckoutPage();


    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() {
        homePage.mouseHoverOnlaptopAndNoteBook();
        homePage.selectmenu("Show All Laptops & Notebooks");
        laptopAndNoteBookPage.sortProductToHighLow("Price (High > Low)");
        List<Double> expText  = laptopAndNoteBookPage.verifyPriceHighToLow();
        List<Double> actText  = laptopAndNoteBookPage.verifyPriceHighToLow();
        System.out.println("Expected list " + expText );
        Assert.assertEquals(Collections.singleton(actText),Collections.singleton(expText));
        System.out.println("Actual List " + actText);

    }

    @Test
    public void verifyThatUserPlaceOrderSuccessfully() throws InterruptedException {
        Thread.sleep(1000);
        homePage.clickOnCurrency();
        homePage.selectCurrencyPound();
        homePage.mouseHoverOnlaptopAndNoteBook();
        homePage.selectmenu("Show All Laptops & Notebooks");
        laptopAndNoteBookPage.sortProductToHighLow("Price (High > Low)");
        laptopAndNoteBookPage.clickOnMacBook();
        Thread.sleep(1000);
        Assert.assertEquals(productMacBookPage.verifyMacBookProduct(), "MacBook", "Not varify");
        productMacBookPage.clickOnCart();
        Thread.sleep(1000);
        Assert.assertEquals(productMacBookPage.verifyMacBookTab(), "Success: You have added MacBook to your shopping cart!\n×", "");
        productMacBookPage.clickOnShoppingCart();
        Thread.sleep(1000);
        // Assert.assertEquals(shoppingCartPage.verifyMassageOfShoppingCart(),"Shopping Cart  (0.00kg)","Not verify");

        Thread.sleep(1000);
        Assert.assertEquals(shoppingCartPage.verifyTextOfMacBook(), "MacBook", "Not verify");
        shoppingCartPage.clearQty();
        shoppingCartPage.newQtychange("2");
        Thread.sleep(1000);
        shoppingCartPage.clickOnUpdateButton();
        Thread.sleep(1000);
        Assert.assertEquals(shoppingCartPage.verifySuceesfullyUpdatecartMassage(), "Success: You have modified your shopping cart!" + "\n×", "");
        Assert.assertEquals(shoppingCartPage.verifyPrice(), "£737.45", "Not verify");
        shoppingCartPage.clickOnCheckOut();
        Thread.sleep(1000);
        Assert.assertEquals(checkoutPage.verifycheckoutTextOnPage(), "Checkout", "Not verify");
        Thread.sleep(1000);
        Assert.assertEquals(checkoutPage.verifyNewCustomerTab(), "New Customer", "Not verify");
        checkoutPage.clickOnGuestCheckout();
        checkoutPage.clickOnContinueTab();
        Thread.sleep(1000);
        checkoutPage.enterFirstname("Jenna");
        checkoutPage.enterLastname("Munim");
        checkoutPage.enterEmail("jennamun@gmail.com");
        checkoutPage.enterTelephone("0125874555");
        checkoutPage.enterAddress1("20,hanover Walk");
        checkoutPage.enterCityName("Bristol");
        checkoutPage.enterPostcode("BW1 2ZX");
        checkoutPage.enterCountryName("Switzerland");
        checkoutPage.enterRegionField("Bern");
        checkoutPage.clickOnContinue();
        Thread.sleep(1000);
        checkoutPage.addCommentOnTextArea("Please delivary onTime");
        checkoutPage.clickOnTermsAndCondition();
        Thread.sleep(1000);
        checkoutPage.clickOnContinueField();
        Thread.sleep(1000);
        Assert.assertEquals(checkoutPage.verifyWarningSign(), "Warning: Payment method required!" + "\n×", "Not verify");
    }

}
