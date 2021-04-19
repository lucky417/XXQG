package com.xxqg.first;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Basic{
    public static AppiumDriver driver;

    static String nodePath = "/usr/local/bin/node";
    // Set path of your appium.js file.
    static String appiumJSPath = "/Applications/Appium.app/Contents/Resources/app/node_modules/appium/build/lib/main.js";
    AppiumDriverLocalService service;

    @BeforeSuite
    public void SetUp() throws InterruptedException, IOException {
        //StartSeversTool.appiumStart();

        AppiumServiceBuilder builder = new AppiumServiceBuilder();
        builder.usingDriverExecutable(new File(nodePath));
        builder.withAppiumJS(new File(appiumJSPath));
        builder.usingPort(4723);
        service = AppiumDriverLocalService.buildService(builder);
        service.start();
        service.getUrl();

        DesiredCapabilities capabilities = Phone.huaWei();


      //  AndrionPhone capabilities=new AndrionPhone("WTKDU16C12004013","8.0");
        driver = new AndroidDriver(service, capabilities);
        //Thread.sleep(10000);
        System.out.println("cccc");
      //隐式等待
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("aaaa");
    }


    @AfterSuite
    public void SetOff() throws IOException {
        driver.closeApp();
        service.stop();
//        StartSeversTool.appiumStop();
    }
    
}
