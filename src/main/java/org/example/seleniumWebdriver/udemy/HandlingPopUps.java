package org.example.seleniumWebdriver.udemy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HandlingPopUps {
    private static FirefoxDriver driver;

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://www.way2automation.com/");
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        String first_window = iterator.next();
        System.out.println("first window id: " + first_window);
        driver.findElementByXPath("//a[contains(text(),'MEMBER LOGIN')]").click();
        windowHandles = driver.getWindowHandles();
        iterator = windowHandles.iterator();
        String firstWindow = iterator.next();
        String secondWidnow = iterator.next();
        driver.switchTo().window(secondWidnow);
        String title = driver.getTitle();
        driver.findElementByXPath("//input[@id='user_email']").sendKeys("sgrg007@gmail.com");
        driver.findElementByXPath("//input[@id='user_password']").sendKeys("Banana$1234");
        driver.findElementByXPath("//input[@name='commit']").click();


        driver.quit();

    }
}
