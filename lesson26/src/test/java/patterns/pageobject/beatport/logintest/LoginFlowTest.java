package patterns.pageobject.beatport.logintest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.patterns.factory.BrowserName;
import org.patterns.factory.WebDriverFactory;
import org.patterns.pageobject.beatport.login.flow.LoginFlow;

public class LoginFlowTest {
    private static LoginFlow loginFlow;
    private static WebDriver driver;

    @BeforeAll
    public static void init() {
        driver = WebDriverFactory.getByName(BrowserName.CHROME);
        loginFlow = new LoginFlow(driver);
    }
    @Test
    public void ErrorTextTest() throws InterruptedException {
        driver.get("https://www.beatport.com/");
        Thread.sleep(3000);

        WebElement loginIcon = driver.findElement(By.xpath("//li[@class='header_item']"));
        loginIcon.click();

        loginFlow.fillUsername("Anatolyi");
        loginFlow.submit();
        //OR
        loginFlow.login("Antoshka","Antoshka");
        Thread.sleep(3000);

        String errorText = loginFlow.getPasswordErrorText();
        Assertions.assertEquals(errorText, "Password must be at least 8 characters and contain at least 1 letter and number.");
    }
}