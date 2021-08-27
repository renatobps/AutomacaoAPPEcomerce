package com.shopping.advantage.appium.core;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriveFactory {


    private static AndroidDriver<MobileElement> driver;

    public static AndroidDriver<MobileElement> getDriver() {
        if (driver == null) {
            criarDriver();
        }
        return driver;
    }

    private static void criarDriver() {

        DesiredCapabilities configuracoes = new DesiredCapabilities();
        configuracoes.setCapability("platformName", "Android");
        configuracoes.setCapability("deviceName", "emulator-5554");
        configuracoes.setCapability("automationName", "UiAutomator2");
        configuracoes.setCapability(MobileCapabilityType.APP, "C:\\Users\\renato.souza\\Documents\\Ecomerce\\com.shopping.advantage\\src\\main\\resources\\Advantage+demo+3.1.apk");

        try {
            driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), configuracoes);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    public static void EncerrarDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }

    }
}
