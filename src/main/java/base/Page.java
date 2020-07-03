package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.actions.TopNavigation;

public class Page {

    public static WebDriver driver;
    public static WebDriverWait wait;
    public static TopNavigation topNav;

    public static void initConfiguration(){
        if(Constants.BROWSER.equals("firefox")){
            driver = new FirefoxDriver();
        }else if (Constants.BROWSER.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        driver.get(Constants.TESTSITEURL);
        topNav = new TopNavigation(driver);
    }

    public static void quitBrowser(){
        driver.quit();
    }
}
