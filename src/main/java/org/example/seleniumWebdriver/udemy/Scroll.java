package org.example.seleniumWebdriver.udemy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Scroll {
    private static WebDriver driver;

    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //day 5 in udemy.com selenium webdriver
       driver.get("https://www.homedepot.com/");
       //driver.findElement(By.xpath("//a[contains(text(),'Home Decor & Furniture')]")).sendKeys(Keys.ENTER);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(500);

        File screenshotAs = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotAs,new File("imageScreenShot.jpg"));
        driver.quit();
    }
}
