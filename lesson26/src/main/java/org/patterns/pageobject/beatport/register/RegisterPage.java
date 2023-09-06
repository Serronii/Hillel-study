package org.patterns.pageobject.beatport.register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.patterns.pageobject.beatport.absract.AbstractPage;

public class RegisterPage extends AbstractPage {

    private static final By PAGE_TITLE = By.xpath("//h1[@class='sc-1ced2011-1 kfCIOq']");
    private static final By FIRST_NAME = By.xpath("//*[contains(@data-testid, 'signup-input-firstname')]");
    private static final By LAST_NAME = By.xpath("//*[contains(@data-testid, 'signup-input-lastname')]");
    private static final By USER_NAME = By.xpath("//input[@data-testid='signup-input-username']");
    private static final By EMAIL_ADDRESS = By.xpath("//input[@data-testid='signup-input-email']");
    private static final By CREATE_PASSWORD = By.xpath("//input[@data-testid='signup-input-password']");
    private static final By CONFIRM_PASSWORD = By.xpath("//input[@data-testid='signup-input-confirmpassword']");
    private static final By CONTINUE = By.xpath("//input[@data-testid='signup-button-continue']");
    private static final By ERROR_PASSWORD = By.xpath("//p[@class='sc-f0cf8959-1 glljBy']");

    public RegisterPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getPAGE_TITLE() {
        return driver.findElement(PAGE_TITLE);
    }
    public WebElement getFIRST_NAME() {
        return driver.findElement(FIRST_NAME);
    }
    public WebElement getLAST_NAME() {
        return driver.findElement(LAST_NAME);
    }
    public WebElement getUSER_NAME() {
        return driver.findElement(USER_NAME);
    }
    public WebElement getEMAIL_ADDRESS() {
        return driver.findElement(EMAIL_ADDRESS);
    }
    public WebElement getCREATE_PASSWORD() {
        return driver.findElement(CREATE_PASSWORD);
    }
    public WebElement getCONFIRM_PASSWORD() {
        return driver.findElement(CONFIRM_PASSWORD);
    }
    public WebElement getCONTINUE() {
        return driver.findElement(CONTINUE);
    }
    public WebElement getERROR_PASSWORD() {
        return driver.findElement(ERROR_PASSWORD);
    }

}
