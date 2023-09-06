package patterns.pageobject.beatport.registertest;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.patterns.factory.BrowserName;
import org.patterns.factory.WebDriverFactory;
import org.patterns.pageobject.beatport.login.LoginPage;
import org.patterns.pageobject.beatport.register.RegisterPage;

public class RegisterPageTest {

    private static RegisterPage registerPage;
    private static WebDriver driver;

    @BeforeAll
    public static void init() {
        driver = WebDriverFactory.getByName(BrowserName.CHROME);
        registerPage = new RegisterPage(driver);
    }
    @Test
    public void RegistrationTest() throws InterruptedException {
        driver.get("https://www.beatport.com/account/signup");
        Thread.sleep(2000);
        registerPage.getFIRST_NAME().sendKeys("Serhii");
        Thread.sleep(2000);
        registerPage.getLAST_NAME().sendKeys("Shparhalenko");
        Thread.sleep(2000);
        registerPage.getUSER_NAME().sendKeys("Serronii");
        Thread.sleep(2000);
        registerPage.getEMAIL_ADDRESS().sendKeys("serhigold7@gmail.com");
        Thread.sleep(2000);
        registerPage.getCREATE_PASSWORD().sendKeys("Serhii123");
        Thread.sleep(2000);
        registerPage.getCONFIRM_PASSWORD().sendKeys("Serhii123");
        Thread.sleep(2000);
        registerPage.getCONTINUE().click();

    }

}


