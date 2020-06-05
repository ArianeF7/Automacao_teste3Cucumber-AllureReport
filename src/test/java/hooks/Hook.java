package hooks;

import Drivers.DriverManager;
import Drivers.DriverManagerFactory;
import Drivers.DriverType;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;
import pages.DefaultProperties;

import java.util.concurrent.TimeUnit;

public class Hook extends DriverManagerFactory implements DefaultProperties {


    DriverManager driverManager;

    @Before
    public void init(){
        driverManager = DriverManagerFactory.getManager (DriverType.CHROME);
        driver = driverManager.getDriver();
        driver.manage().timeouts().implicitlyWait(DefaultProperties.TIME_OUT, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        driverManager.quitDriver();
    }
}
