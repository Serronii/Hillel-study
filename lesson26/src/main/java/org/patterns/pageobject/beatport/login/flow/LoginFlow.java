package org.patterns.pageobject.beatport.login.flow;

import org.openqa.selenium.WebDriver;
import org.patterns.pageobject.beatport.login.LoginPage;

public class LoginFlow {
    private LoginPage loginPage;

    public LoginFlow(WebDriver webDriver) {
        this.loginPage = new LoginPage(webDriver);
    }
    public void fillUsername(String username) {
        loginPage.getUSERNAME_FIELD().sendKeys(username);
        loginPage.getLOGIN_FIELD().click();
    }
    public void fillPassword(String password) {
        loginPage.getPASSWORD_FIELD().sendKeys(password);
    }
    public void submit(){
        loginPage.getLOGIN_FIELD().click();
    }
    public String getPasswordErrorText() {
        return loginPage.getPASSWORD_ERROR().getText();
    }
    public void login(String username ,String password ){
        fillUsername(username);
        fillPassword(password);
        submit();
    }

}
