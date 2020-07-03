package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {

    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a")
    public WebElement fashion;

    @FindBy(xpath = "//*[@id=\"s0-29-13_2-0-1[0]-0-0\"]/ul/li[4]/a")
    public WebElement jewelry;

    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[5]/a")
    public WebElement health_and_beauty;

    @FindBy(xpath = "//*[@id=\"mainContent\"]/section[1]/div[2]/a[3]/div[2]")
    public WebElement fragrances;

}
