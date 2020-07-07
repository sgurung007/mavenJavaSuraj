package org.example.seleniumWebdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Test1 {
    private static FirefoxDriver driver;
    private static String currentPageTitle;
    private static String currentUrl;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.homedepot.com/");
        currentPageTitle=driver.getTitle();
        currentUrl = driver.getCurrentUrl();
        driver.findElementByXPath("//a[contains(text(),'Home Decor & Furniture')]").click();
        currentPageTitle=driver.getTitle();
        currentUrl = driver.getCurrentUrl();
        driver.quit();
    }
}
