package org.example.seleniumWebdriver.udemy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FrameHandling {
    private static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //day 5 in udemy.com selenium webdriver
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_form_submit");
        driver.switchTo().frame("iframeResult");
        driver.findElement(By.xpath("//*[@id=\"myForm\"]/input[2]")).sendKeys("suraj");

        ((JavascriptExecutor)driver).executeScript("myFunction()");

        driver.quit();
    }
}
