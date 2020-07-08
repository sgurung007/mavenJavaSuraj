package org.example.seleniumWebdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

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
//        driver.get("http://www.way2automation.com/");
////        WebElement selenium = driver.findElementByXPath("//body/div[@class='layout-theme animated-css']/div[@id='wrapper']/header[@class='header']/div[@class='nav_base']/div[@class='container']/nav[@class='navbar yamm']/div[@id='navbar-collapse-1']/ul[@class='nav navbar-nav']/li[3]");
////        Actions actions = new Actions(driver);
////        actions.moveToElement(selenium).perform();
////        driver.findElementByXPath("//a[contains(text(),'Selenium JAVA Classroom Training')]").click();
        driver.get("https://www.flipkart.com/clothing-and-accessories/pr?sid=clo&otracker=categorytree&p%5B%5D=facets.ideal_for%255B%255D%3DMen&otracker=nmenu_sub_Men_0_Clothing&p%5B%5D=facets.ideal_for%255B%255D%3Dmen&p%5B%5D=facets.price_range.from%3DMin&p%5B%5D=facets.price_range.to%3D1000");
        WebElement sliderWebElement = driver.findElementByXPath("//div[@class='gl5Kwg']");
        int sliderOffx = sliderWebElement.getSize().getWidth();
        System.out.println(sliderOffx);
        new Actions(driver).dragAndDropBy(sliderWebElement,sliderOffx,0).perform();

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
