package com.first;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Basic{
    public static AppiumDriver driver;
    
    @BeforeTest
    public void SetUp() throws InterruptedException, MalformedURLException {
    	
        DesiredCapabilities capabilities = new DesiredCapabilities();
        //设置测试的平台
        capabilities.setCapability("platformName","Android");
        //设备的序列号
        capabilities.setCapability("deviceName","a3ede570");
        //安卓的系统版本
        capabilities.setCapability("platformVersion","9.0");
        //apk的路径        
        capabilities.setCapability("app","/Users/lucky/workspace/work/cochat01/src/com/lenovo/automation/Cochat_RY/CoChat.apk");
        //apk的包名
        capabilities.setCapability("appPackage","cn.xuexi.android");
        //设置启动Activity
        capabilities.setCapability("appActivity","com.alibaba.android.rimet.biz.SplashActivity");
       // capabilities.setCapability("clearSystemFiles", true);
        capabilities.setCapability("appWaitActivity", "com.alibaba.android.rimet.biz.SplashActivity");
        //capabilities.setCapability("appium",AutomationName.APPIUM);
       // capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.APPIUM);
        capabilities.setCapability("noReset", "true");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities );
        //Thread.sleep(10000);
      //隐式等待
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("aaaa");
        //driver.findElementById(id)
        //driver.findElementById("cn.xuexi.android:id/home_bottom_tab_icon_highlight");
       // driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"工作\"]/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView")).click();
       //driver.findElement(By.xpath("//*[@text='习近平会见瓦努阿图总理萨尔维']")).click();
       //Thread.sleep(10000);
       //driver.swipe(432, 1387, 450, 809, 3);
      // Thread.sleep(10000);
    }
    
}
