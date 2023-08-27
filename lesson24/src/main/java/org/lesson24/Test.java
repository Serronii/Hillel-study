package org.lesson24;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverLogLevel;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");


        //Агригация, хромОпшнс это как дополнительный елемент для вебдрайвера
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setLogLevel(ChromeDriverLogLevel.INFO);
        //Обьект -> сервер(екзешник наш) -> браузе р
        //интерфейс-обьект - клас хромДрайвер
        WebDriver driver = new ChromeDriver(chromeOptions);;//создаем обьект хром драйвера и раним с этим обьектом методы интерфейса(веб драйвера)
//        driver.get("https://www.sunglasshut.com/uk");

        driver.navigate().to("https://www.epochconverter.com/"); // tozhe samoe
//        driver.navigate().back();
//        Thread.sleep(3000);
//        driver.navigate().forward();

//        driver.switchTo().newWindow(WindowType.WINDOW);
////        Thread.sleep(3000);
//        driver.navigate().to("https://www.epochconverter.com/");
//        driver.switchTo().newWindow(WindowType.TAB); // открывает вкладку новую
//        Thread.sleep(3000);

//        driver.close(); //закрывает конекшн но не убивает обьект драйвера и ты можешь дальше работать с ним
//        driver.quit(); // убивает обьект драйвера = будет равно налл

//        driver.manage().window().fullscreen();
        driver.manage().window().maximize(); //тут видно нижнюю панель виндоус
        Thread.sleep(3000);
        driver.manage().window().setSize(new Dimension(1200,1200));
        System.out.println(driver.getCurrentUrl());// дай урлу
        System.out.println(driver.getTitle());
//        WebElement element = driver.findElement();
//        List<WebElement> elements = driver.findElements();



//        System.out.println(chromeOptions.getBrowserName());
//        System.out.println(chromeOptions.getBrowserVersion());


    }
}