package org.example.seleniumWebdriver.udemy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class PexelsTest {
    private static FirefoxDriver driver;

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.pexels.com/");
        WebElement finderLadyPexels = driver.findElementByXPath("//body/div[@class='l-container home-page']/div[@class='photos']/div[1]/div[1]/article[1]/a[1]/img[1]");
        Actions actions = new Actions(driver);
        actions.contextClick(finderLadyPexels).perform();

        driver.quit();
    }
}
