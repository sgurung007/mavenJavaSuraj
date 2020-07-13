package org.example.testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependCasesAAA {

    @Test(priority = 1, groups = "low")
    public void doUserRegAAA() {
        System.out.println("prinitng form user registration");
        Assert.fail();
    }

    @Test(priority = 2)
    public void doLoginAAA() {

        System.out.println("Prinitng from doLogin");
        Reporter.log("hello from the doLoginAAA");
    }


}
