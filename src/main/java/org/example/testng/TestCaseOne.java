package org.example.testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCaseOne {

    @BeforeMethod
    public void launchingBrowser() {
        System.out.println("printing from launching Browser");
    }

    @AfterMethod
    public void tearDownBrowser() {
        System.out.println("printing from close Browser");
    }

    @Test
    public void doLogin() {
        System.out.println("Prinitng from doLogin");
    }

    @Test
    public void doUserReg() {
        System.out.println("prinitng form user registration");
    }

    @Test
    public void validtitle() {
        String expectedTital = "hotmail";
        String actualTital = "hotmail";
        Assert.assertEquals(actualTital, expectedTital);
    }

    @Test
    public void asserstTest() {
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertSame("suraj", "suraj");
        softAssert.assertTrue(true);
        softAssert.assertTrue(true);
        softAssert.assertAll();
    }

}
