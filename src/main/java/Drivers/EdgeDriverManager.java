package Drivers;

import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;

import java.io.File;

public class EdgeDriverManager extends DriverManager {

    private EdgeDriverService edgeService;

//    @Override
//    public void startService() {
//        if (null == chService) {
//            try {
//                chService = new ChromeDriverService.Builder()
//                        .usingDriverExecutable(new File("src\\test\\Resources\\chromedriver.exe"))
//                        .usingAnyFreePort()
//                        .build();
//                chService.start();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    @Override
//    public void startService() {
//        if (null == edgeService) {
//            try {
//                edgeService = new EdgeDriverService.Builder()
//                    .usingDriverExecutable(new File("src\\test\\resources\\msedgedriver.exe"))
//                    .usingAnyFreePort()
//                    .build();
//        }
//    }
//
//    @Override
//    public void stopService() {
//        if (edgeService != null && edgeService.isRunning()) {
//            edgeService.stop();
//        }
//    }
//
//    @Override
//    void createDriver() {
//        driver = new EdgeDriver(edgeService);
//    }
//
    @Override
    protected void startService() {

    }

    @Override
    protected void stopService() {

    }

    @Override
    protected void createDriver() {

    }

}
