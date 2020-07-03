package testcases;

import base.Page;
import org.testng.annotations.Test;
import pages.actions.HomePage;

public class EbayJewelryTest {

    @Test
    public void goToJewelryTest(){
        Page.initConfiguration();
        HomePage home = new HomePage();
        home.goToFashion();
        home.goToJewelry();
        Page.quitBrowser();
    }
}

