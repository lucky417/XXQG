package com.xxqg;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestRetry implements IRetryAnalyzer {

    private  int retryCount =0;
    private  static int maxRetryCount;

    public int getRetryCount() {
        return retryCount;
    }

    public static int getMaxRetryCount() {
        return maxRetryCount;
    }

    @SuppressWarnings("static-access")
    public void RetryToRunCase(){
    }

    @Override
    public boolean retry(ITestResult iTestResult) {
        Reporter.getCurrentTestResult();
        return false;
    }
}
