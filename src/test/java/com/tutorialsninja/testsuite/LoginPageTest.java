package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LogOutAccountPage;
import com.tutorialsninja.pages.LoginPage;
import com.tutorialsninja.pages.MyAccountPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    MyAccountPage myAccountPage = new MyAccountPage();
    LogOutAccountPage logOutAccountPage = new LogOutAccountPage();
    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){
        homePage.clickOnMyAccount();
        homePage.selectMyAccountOptions("Login");
        Assert.assertEquals(loginPage.verifyReturningCustomer(),"Returning Customer", "Not verify");
    }
    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully () throws InterruptedException{
        Thread.sleep(1000);
        homePage.clickOnMyAccount();
        homePage.selectMyAccountOptions("Login");
        loginPage.enterEmailField("jenuthakee@gmail.com");
        loginPage.enterPasswordField("jenkate123");
        loginPage.clickOnLoginField();
        Thread.sleep(1000);
        Assert.assertEquals(myAccountPage.verifyMyAccount(),"My Account","Not verify");
        myAccountPage.clickMyAccountTab();
        homePage.selectMyAccountOptions("Logout");
        Thread.sleep(1000);
       Assert.assertEquals(logOutAccountPage.verifyAccountLogout(),"Account Logout","Not verify");
        logOutAccountPage.clickOnContinueField();



    }
}
