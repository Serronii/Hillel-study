package homework25;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

    public class BeatPortTest {

        private static WebDriver driver;

        @BeforeAll
        public static void init() throws InterruptedException {
            System.setProperty("webdriver.http.factory", "jdk-http-client");
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

            driver = new ChromeDriver();
            driver.get("https://www.beatport.com/");
            Thread.sleep(3000);

            WebElement accessCookies = driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
            accessCookies.click();
            Thread.sleep(5000);

            WebElement closePopUp = driver.findElement(By.cssSelector("img[src*='svg-close-btn-black-7.svg']"));
            closePopUp.click();
            System.out.println("Preconditions passed");
        }

        @Test
        public void testLogin() throws InterruptedException {
            driver.get("https://www.beatport.com/");
            Thread.sleep(3000);

            WebElement loginIcon = driver.findElement(By.xpath("//li[@class='header_item']"));
            loginIcon.click();

            WebElement inputLogin = driver.findElement(By.xpath("//input[@data-testid='login-input-username']"));
            inputLogin.sendKeys("PutinXyilo");
            Thread.sleep(3000);

            WebElement inputPassword = driver.findElement(By.xpath("//input[@data-testid='login-input-password']"));
            inputPassword.sendKeys("Lalala123");
            Thread.sleep(3000);

            WebElement logInButton = driver.findElement(By.xpath("//input[@data-testid='login-button-login']"));
            logInButton.click();
            Thread.sleep(5000);

            WebElement errorMessage = driver.findElement(By.xpath("//p[@class='sc-f0cf8959-1 glljBy' and text()='Your username and/or password were incorrect.']"));
            Assertions.assertTrue(errorMessage.isDisplayed());
            Assertions.assertEquals("Your username and/or password were incorrect.", errorMessage.getText());

            System.out.println("Test login passed ");
        }

        @Test
        public void searchTest() throws InterruptedException {
            driver.get("https://www.beatport.com/");
            Thread.sleep(3000);

            WebElement testPlay = driver.findElement(By.xpath("//li[.//*[name()='svg' and @width='24' and @height='24' and @fill='#8C8C8C']//*[name()='use' and @href='/icons/sprite.svg#search']]"));
            testPlay.click();
            Thread.sleep(3000);

            WebElement testPlay1 = driver.findElement(By.xpath("//input[@id='search-field']"));
            testPlay1.sendKeys("Axwell");

            System.out.println("SearchTest passed ");

        }
    }
