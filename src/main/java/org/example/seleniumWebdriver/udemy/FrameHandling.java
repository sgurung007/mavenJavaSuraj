package org.example.seleniumWebdriver.udemy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FrameHandling {
    private static FirefoxDriver driver;

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //day 5 in udemy.com selenium webdriver
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_button_test");
//        driver.switchTo().frame("iframeResult");
//        driver.findElement(By.xpath("/html/body/button")).click();
        List<WebElement> frames = driver.findElementsByTagName("iframe");
        System.out.println(frames.size());
        frames.stream()
                .forEach(y-> System.out.println(y));
        driver.quit();
    }
}
