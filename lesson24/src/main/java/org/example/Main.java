package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverLogLevel;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");


        //Агригация, хромОпшнс это как дополнительный елемент для вебдрайвера
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setLogLevel(ChromeDriverLogLevel.INFO);


        //Обьект -> сервер(екзешник наш) -> браузе р
        //интерфейс-обьект - клас хромДрайве
        WebDriver driver = new ChromeDriver(chromeOptions);//создаем обьект хром драйвера и раним с этим обьектом методы интерфейса(веб драйвера)
//        driver.get("https://www.sunglasshut.com/uk");
        driver.navigate().to("https://www.sunglasshut.com/uk"); // tozhe samoe
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();

        driver.switchTo().newWindow(WindowType.WINDOW);
//        Thread.sleep(3000);
        driver.navigate().to("https://www.epochconverter.com/");


//        System.out.println(chromeOptions.getBrowserName());
//        System.out.println(chromeOptions.getBrowserVersion());



    }
}