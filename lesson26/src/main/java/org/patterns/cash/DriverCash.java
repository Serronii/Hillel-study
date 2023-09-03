package org.patterns.cash;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class DriverCash {

    private static WebDriver driver;

    private DriverCash(){
    }

    public static WebDriver getDriver() {
        if (Objects.isNull(driver)) {
            System.setProperty("webdriver.http.factory", "jdk-http-client");
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }
}
