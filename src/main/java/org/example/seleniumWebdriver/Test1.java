package org.example.seleniumWebdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Test1 {
    private static FirefoxDriver driver;


    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.homedepot.com/");
        boolean elementPresent = isElementPresent(By.xpath("//a[@class='MainFlyout__link'][contains(text(),'Blinds & Window Treatment')]"));
        System.out.println(elementPresent);
        boolean project_calculatorsIs = isElementPresent(By.linkText("Project Calculators"));
        System.out.println(project_calculatorsIs);
        driver.quit();
    }
//utility method to see if Webelement is present
    private static boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
