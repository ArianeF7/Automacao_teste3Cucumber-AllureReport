package Drivers;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {

    WebDriver driver;
    abstract void startService();
    abstract void stopService();
    abstract void createDriver();

    public void quitDriver() {
        if (null != driver) {
            driver.quit();
            driver = null;
        }
    }

    public WebDriver getDriver() {
        if (null == driver) {
            startService();
            createDriver();
        }
        return driver;
    }


}
