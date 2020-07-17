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
        Reporter.log("<a href=\"https://www.w3schools.com/\">Visit W3Schools.com!</a>");
        Reporter.log("<br>");
        Reporter.log("<a href=\"https://www.w3schools.com/\"<img src=\"/Users/surajgurung/Documents/mavenJavaSuraj/src/main/resources/women_book.jpg alt=\"Flowers in Chania\" width=\"500\" height=\"600\"\"</a>");



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
