package Drivers;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;

public class DriverManagerFactory {

    @Getter @Setter
    public static WebDriver driver;

    public static DriverManager getManager(DriverType type) {
    DriverManager driverManager;

        switch (type) {
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;
            default:
                driverManager = new EdgeDriverManager();
                break;
        }
        return driverManager;

    }
}
