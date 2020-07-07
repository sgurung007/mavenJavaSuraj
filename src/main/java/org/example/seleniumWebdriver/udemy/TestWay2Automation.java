package org.example.seleniumWebdriver.udemy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestWay2Automation {
    private static FirefoxDriver driver;
    static Logger logger = LogManager.getLogger(TestWay2Automation.class);


    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://way2automation.com/way2auto_jquery/index.php");
        List<WebElement> listInput = driver.findElementsByXPath("//input");
        listInput.stream().forEach(y-> logger.info(y.getTagName()));
        WebElement selectCountry=driver.findElementByXPath("//select[@name='country']");
        Select select = new Select(selectCountry);
        select.selectByValue("American Samoa");
        List<WebElement> optionList = driver.findElementsByTagName("option");
        System.out.println(optionList.size());
        optionList.stream().forEach(y->logger.info(y.getAttribute("value")));
        List<WebElement> linkList = driver.findElementsByTagName("a");
        linkList.stream().forEach(h->logger.info(h.getText()));
        logger.info("size of links: "+linkList.size());

        driver.quit();
    }
}
