package org.example.testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        Reporter.log("passed");

    }

    @Override
    public void onTestFailure(ITestResult result) {
        Reporter.log("failed Gurung: "+result.getMethod());
//        Reporter.log("<a href=\"https://www.w3schools.com/\">Visit W3Schools.com!</a>\n");
        Reporter.log("<a href=\"file:///Users/surajgurung/Downloads/women_book.jpg\" target=\"_blank\">screen 1 shot</a>");

    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }
}
