package org.patterns.pageobject.beatport.absract;

import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {
    protected WebDriver driver;

    protected AbstractPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }
}
