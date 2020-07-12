package org.example.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependCases {

    @Test(priority = 1)
    public void doUserReg() {
        System.out.println("prinitng form user registration");
        //Assert.fail();
    }

    @Test(priority = 2,dependsOnMethods = "doUserReg")
    public void doLogin() {
        System.out.println("Prinitng from doLogin");
    }


}
