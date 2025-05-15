package org.helper;

import org.Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.helper.PropertyHelper.getBaseURL;
import static org.helper.PropertyHelper.getBrowser;


public class Initializer {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static CardsPage cardsPage;
    public static UserDetailsPage userDetailsPage;
    public static DriverInitializer driverInitializer;
    public static Home home;
    public static String base_url;
    public static WebElement ele;


    static {
        base_url = getBaseURL();
        driverInitializer = new DriverInitializer();
        switch (getBrowser()){
            case "CHROME":
                driver = DriverInitializer.getChromeDriver();
            case "FIREFOX":
                driver = DriverInitializer.getFirefoxDriver();
            case "HEADLESS":
                driver = DriverInitializer.getHeadlessDriver();
        }
        userDetailsPage = new UserDetailsPage();
        cardsPage = new CardsPage();
        home = new Home();

    }
}

