import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    private static WebDriver driver;


    @BeforeAll
    public static void init(){
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @org.junit.jupiter.api.Test
    public void testLogin(){
        driver.get("https://www.beatport.com/");

        WebElement loginButton = driver.findElement(By.xpath("//use[contains(@href, '/icons/sprite.svg#person')]"));
        WebElement inputLogin = driver.findElement(By.xpath("//input[@data-testid='login-input-username']"));
        inputLogin.sendKeys("Serronii");

        WebElement inputPassword = driver.findElement(By.xpath("//input[@data-testid='login-input-password']"));
        inputPassword.sendKeys("Serronii157");
        WebElement loginButton1 = driver.findElement(By.xpath("//input[@data-testid='login-button-login']"));
    }
}
