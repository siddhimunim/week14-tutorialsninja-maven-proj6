package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.*;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterPageTest extends BaseTest {
    HomePage homePage = new HomePage();
    RegisterAccountPage registerAccountPage = new RegisterAccountPage();
    AccountSucessPage accountSucessPage = new AccountSucessPage();
    MyAccountPage myAccountPage = new MyAccountPage();
    LogOutAccountPage logOutAccountPage = new LogOutAccountPage();

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
        homePage.clickOnCurrency();
        homePage.selectCurrencyPound();
        homePage.clickOnMyAccount();
        homePage.selectMyAccountOptions("Register");
        Assert.assertEquals(registerAccountPage.verifyRegAccountText(),"Register Account","Not verify");

    }
    @Test
    public void verifyThatUserRegisterAccountSuccessfully() throws InterruptedException{
        Thread.sleep(1000);
        homePage.clickOnMyAccount();
        homePage.selectMyAccountOptions("Register");
        registerAccountPage.enterFirstName("Jenu");
        registerAccountPage.enterLastName("Thak");
        registerAccountPage.enterEmail("jenuthak");
        registerAccountPage.enterTelephone("025894758");
        registerAccountPage.enterPassword("jenkate123");
        registerAccountPage.enterConfirmPassword("jenkate123");
        Thread.sleep(1000);
        registerAccountPage.clickOnSubscribe();
        registerAccountPage.clickOnCheckbox();
        registerAccountPage.clickOnContinue();
        Thread.sleep(1000);
        Assert.assertEquals(accountSucessPage.verifySucessMassageText(),"Your Account Has Been Created!","Not Verify");
        accountSucessPage.ClickOnContinueTab();
        myAccountPage.clickMyAccountTab();
        homePage.selectMyAccountOptions("Logout");
        Thread.sleep(1000);
        Assert.assertEquals(logOutAccountPage.verifyAccountLogout(),"Account Logout","Not verify");
        logOutAccountPage.clickOnContinueField();

    }


}
