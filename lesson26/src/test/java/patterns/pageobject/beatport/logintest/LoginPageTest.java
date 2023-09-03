package patterns.pageobject.beatport.logintest;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.patterns.factory.BrowserName;
import org.patterns.factory.WebDriverFactory;
import org.patterns.pageobject.beatport.login.LoginPage;

public class LoginPageTest {

    private static LoginPage loginPage;
    private static WebDriver driver;

    @BeforeAll
    public static void init(){
        driver = WebDriverFactory.getByName(BrowserName.CHROME);
        loginPage = new LoginPage(driver);
    }

    @Test
    public void loginTest() throws InterruptedException{
        driver.get("https://www.beatport.com/");
        Thread.sleep(3000);

        WebElement loginIcon = driver.findElement(By.xpath("//li[@class='header_item']"));
        loginIcon.click();

        loginPage.getUSERNAME_FIELD().sendKeys("Anatoliy");
    }

}
