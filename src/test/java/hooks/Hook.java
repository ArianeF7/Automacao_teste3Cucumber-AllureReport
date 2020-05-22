package hooks;

import Drivers.DriverManager;
import Drivers.DriverManagerFactory;
import Drivers.DriverType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;
import pages.DefaultProperties;

public class Hook extends DriverManagerFactory implements DefaultProperties {


    DriverManager driverManager;

    @Before
    public void init(){
        driverManager = DriverManagerFactory.getManager (DriverType.CHROME);
        driver = driverManager.getDriver();
    }

//    @After
//    public void tearDown(){
//        driverManager.quitDriver();
//    }
}
