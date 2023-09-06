package org.patterns.pageobject.beatport.register.flow;

import org.openqa.selenium.WebDriver;
import org.patterns.pageobject.beatport.register.RegisterPage;

public class RegisterFlow {

    private RegisterPage registerPage;

    public RegisterFlow(WebDriver webDriver) {
        this.registerPage = new RegisterPage(webDriver);
    }
    public void fillName(String firstName,String lastName,String userName) {
        registerPage.getFIRST_NAME().sendKeys(firstName);
        registerPage.getLAST_NAME().sendKeys(lastName);
        registerPage.getUSER_NAME().sendKeys(userName);
    }
    public void continueButton() {
        registerPage.getCONTINUE().click();
    }
    public void fillEmailAndPassword(String email,String password,String confirmPassword) {
        registerPage.getEMAIL_ADDRESS().sendKeys(email);
        registerPage.getCREATE_PASSWORD().sendKeys(password);
        registerPage.getCONFIRM_PASSWORD().sendKeys(confirmPassword);
    }

    public String getErrorPasswordText() {
        return registerPage.getERROR_PASSWORD().getText();
    }


}
