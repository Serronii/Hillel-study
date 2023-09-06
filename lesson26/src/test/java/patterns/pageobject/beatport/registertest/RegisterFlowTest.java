package patterns.pageobject.beatport.registertest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.patterns.factory.BrowserName;
import org.patterns.factory.WebDriverFactory;
import org.patterns.pageobject.beatport.login.flow.LoginFlow;
import org.patterns.pageobject.beatport.register.flow.RegisterFlow;

public class RegisterFlowTest {

    private static RegisterFlow registerFlow;
    private static WebDriver webDriver;

    @BeforeAll
    public static void init() {
       webDriver = WebDriverFactory.getByName(BrowserName.CHROME);
       registerFlow = new RegisterFlow(webDriver);
    }
    @Test
    public void PasswordErrorTextTest() throws InterruptedException {
        webDriver.get("https://www.beatport.com/account/signup");
        Thread.sleep(3000);

        registerFlow.fillName("Serhii","Shparhalenko","Serronii");
        Thread.sleep(3000);

        registerFlow.fillEmailAndPassword("serhigold7@gmail.com","Serhi123","Serhi");
        Thread.sleep(3000);

        WebElement continueButton = webDriver.findElement(By.xpath("//input[@data-testid='signup-button-continue']"));
        continueButton.click();

        String errorText = registerFlow.getErrorPasswordText();
        Assertions.assertEquals(errorText,"Passwords do not match");
    }
}
