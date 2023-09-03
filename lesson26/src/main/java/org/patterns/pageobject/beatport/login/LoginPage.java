package org.patterns.pageobject.beatport.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.patterns.pageobject.beatport.absract.AbstractPage;

public class LoginPage extends AbstractPage {

    private WebDriver driver;

    private static final By USERNAME_FIELD = By.xpath("//input[@data-testid='login-input-username']");

    private static final By PASSWORD_FIELD = By.xpath("//input[@data-testid='login-input-password']");

    private static final By LOGIN_FIELD = By.xpath("//input[@data-testid='login-button-login']");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getUSERNAME_FIELD() {
        return driver.findElement(USERNAME_FIELD);
    }

    public WebElement getPASSWORD_FIELD() {
        return driver.findElement(PASSWORD_FIELD);
    }

    public WebElement getLOGIN_FIELD() {
        return driver.findElement(LOGIN_FIELD);
    }
}