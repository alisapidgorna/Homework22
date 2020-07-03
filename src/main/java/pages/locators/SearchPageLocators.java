package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPageLocators {
    @FindBy (id = "gh-ac")
    public WebElement search;

    @FindBy(id = "gh-btn")
    public WebElement continue_btn;
}
