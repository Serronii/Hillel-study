package homework25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTest {

    private  static WebDriver driver;

    @BeforeClass
    public static void init() throws InterruptedException {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        driver = new ChromeDriver();


        driver.get("https://www.beatport.com/");
        Thread.sleep(3000);

        WebElement accessCookies = driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
        accessCookies.click();
        Thread.sleep(3000);

//        WebElement closePopUp = driver.findElement(By.cssSelector("img[src*='svg-close-btn-black-7.svg']"));
//        closePopUp.click();
//        Thread.sleep(3000);
//        System.out.println("Preconditions passed");
    }
     @BeforeMethod

     public void method1() throws InterruptedException {

         driver.get("https://www.beatport.com/");
         Thread.sleep(3000);

//         WebElement accessCookies = driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
//         accessCookies.click();
//         Thread.sleep(3000);

         WebElement closePopUp = driver.findElement(By.cssSelector("img[src*='svg-close-btn-black-7.svg']"));
         closePopUp.click();
         Thread.sleep(3000);
         System.out.println("Preconditions passed");
     }

    @Test
    public void testLogin() throws InterruptedException {
        driver.get("https://www.beatport.com/");
        Thread.sleep(3000);

        WebElement loginIcon = driver.findElement(By.xpath("//li[@class='header_item']"));
        loginIcon.click();
        Thread.sleep(3000);

        WebElement inputLogin = driver.findElement(By.xpath("//input[@data-testid='login-input-username']"));
        inputLogin.sendKeys("Music");
        Thread.sleep(3000);

        WebElement inputPassword = driver.findElement(By.xpath("//input[@data-testid='login-input-password']"));
        inputPassword.sendKeys("Music123");
        Thread.sleep(3000);

        WebElement logInButton = driver.findElement(By.xpath("//input[@data-testid='login-button-login']"));
        logInButton.click();
        Thread.sleep(5000);

        WebElement errorMessage = driver.findElement(By.xpath("//p[@class='sc-f0cf8959-1 glljBy' and text()='Your username and/or password were incorrect.']"));
        Assert.assertTrue(errorMessage.isDisplayed());
        Assert.assertEquals("Your username and/or password were incorrect.", errorMessage.getText());
        Thread.sleep(3000);
        System.out.println("Test login passed ");
    }

    @Test
    public void searchTest() throws InterruptedException {
        driver.get("https://www.beatport.com/");
        Thread.sleep(3000);

        WebElement search = driver.findElement(By.xpath("//li[.//*[name()='svg' and @width='24' and @height='24' and @fill='#8C8C8C']//*[name()='use' and @href='/icons/sprite.svg#search']]"));
        search.click();
        Thread.sleep(3000);

        WebElement inputData = driver.findElement(By.xpath("//input[@id='search-field']"));
        inputData.sendKeys("Axwell");
        Thread.sleep(3000);

//        WebElement play1 = driver.findElement(By.xpath("//button[@class='sc-3cab1104-0 MvVXa']"));
//        play1.click();
//        Thread.sleep(3000);

        System.out.println("SearchTest passed ");

    }
}

