package org.example.testng;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class DependCasesAA {
    @Test(priority = 1,groups = "low")
    public void firstCaseDependCasesAA() {
        System.out.println("prinitng from firstCaseDependCasesAA");
        //Assert.fail();
    }

    @Test(priority = 2)
    public void secondCasesDependCasesAA() {
        System.out.println("prinitng from secondCaseDepedCasesAA");
    }


}
