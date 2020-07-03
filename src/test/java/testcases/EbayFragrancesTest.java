package testcases;

import base.Page;
import org.testng.annotations.Test;
import pages.actions.HomePage;

public class EbayFragrancesTest {

    @Test
    public void goToFragrancesTest(){
        Page.initConfiguration();
        HomePage home = new HomePage();
        home.goToHealthAndBeauty();
        home.goToFragrances();
        Page.quitBrowser();
    }
}