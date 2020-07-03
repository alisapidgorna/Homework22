package pages.actions;
import base.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import pages.locators.HomePageLocators;

public class HomePage extends Page {

    public HomePageLocators home;

    public HomePage(){
        this.home = new HomePageLocators();
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
        PageFactory.initElements(factory,this.home);

    }
    public void goToFashion(){
        home.fashion.click();
    }

    public void goToJewelry(){home.jewelry.click();}

    public void goToHealthAndBeauty(){home.health_and_beauty.click();}

    public void goToFragrances(){home.fragrances.click();}

}
