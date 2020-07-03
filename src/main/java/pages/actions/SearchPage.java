package pages.actions;

import base.Page;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import pages.locators.SearchPageLocators;

public class SearchPage extends Page {

    public SearchPageLocators searchPage;

    public SearchPage(){
        this.searchPage = new SearchPageLocators();
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
        PageFactory.initElements(factory,this.searchPage);
    }

    public void searchProduct(String product){
        searchPage.search.sendKeys(product);
        searchPage.continue_btn.click();
    }
}