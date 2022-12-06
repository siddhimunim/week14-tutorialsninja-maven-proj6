package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.ComponentsPage;
import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopAndNoteBookPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
    HomePage homepage = new HomePage();
    DesktopsPage desktopsPage = new DesktopsPage();
    LaptopAndNoteBookPage laptopAndNoteBookPage = new LaptopAndNoteBookPage();
    ComponentsPage componentsPage = new ComponentsPage();

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        homepage.mouseHoverOnDesktop();
        homepage.selectmenu("Show All Desktops");
        String expText ="Desktops";
        String actText = desktopsPage.verifyText();
        Assert.assertEquals(actText,expText,"Not varify ");
    }

   @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){
       homepage.mouseHoverOnlaptopAndNoteBook();
       homepage.selectmenu("Show All Laptops & Notebooks");
       String expText ="Laptops & Notebooks";
       String actText = laptopAndNoteBookPage.verifyTextOfLaptop();
       Assert.assertEquals(actText,expText,"Not varify ");


   }
   @Test
   public void verifyUserShouldNavigateToComponentsPageSuccessfully(){
       homepage.mouseHoverOnComponents();
       homepage.selectmenu("Show All Components");
       String expText ="Components";
       String actText = componentsPage.verifyTextOfComponents();
       Assert.assertEquals(actText,expText,"Not varify ");

   }

}
