package testcases;

import base.Page;
import org.testng.annotations.Test;
import pages.actions.SearchPage;

public class EbaySearchTest {

    @Test
    public void SearchTest() {
        Page.initConfiguration();
        SearchPage search = Page.topNav.gotoSearch();
        search.searchProduct("Treadmills");
        Page.quitBrowser();
    }
}