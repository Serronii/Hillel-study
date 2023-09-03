package singlton.factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.patterns.factory.BrowserName;
import org.patterns.factory.WebDriverFactory;

public class FactoryTest {

    private WebDriver webDriver;

    @BeforeEach
    public void init() {
        String browserName = System.getProperty("browserName");
        System.out.println("_________" + browserName + "__________");
        webDriver = WebDriverFactory.getByName(BrowserName.valueOf(browserName));

    }

    @Test
    public void testCash() {
        WebDriverFactory.getByName(BrowserName.CHROME).get("https://www.google.com.ua/");
    }

    @Test
    public void testCash2() {
        WebDriverFactory.getByName(BrowserName.EDGE).get("https://www.google.com.ua/");
    }
}
