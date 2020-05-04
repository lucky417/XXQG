package first;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.aspectj.lang.annotation.After;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Basic{
    public static AppiumDriver driver;

    static String nodePath = "/usr/local/bin/node";
    // Set path of your appium.js file.
    static String appiumJSPath = "/Applications/Appium.app/Contents/Resources/app/node_modules/appium/build/lib/main.js";
    AppiumDriverLocalService service;

    @BeforeTest
    public void SetUp() throws InterruptedException, IOException {
        //StartSeversTool.appiumStart();

        AppiumServiceBuilder builder = new AppiumServiceBuilder();
        builder.usingDriverExecutable(new File(nodePath));
        builder.withAppiumJS(new File(appiumJSPath));
        builder.usingPort(4723);
        service = AppiumDriverLocalService.buildService(builder);
        service.start();
        service.getUrl();

        //System.out.printf("aaa11");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        //设置测试的平台
        capabilities.setCapability("platformName","Android");
        //设备的序列号
        capabilities.setCapability("deviceName","a3ede570");
        //安卓的系统版本
        capabilities.setCapability("platformVersion","9.0");
        //apk的路径        
        capabilities.setCapability("app","/Users/lucky/workspace/apk/xx.apk");
        //apk的包名
        capabilities.setCapability("appPackage","cn.xuexi.android");
        //设置启动Activity
        capabilities.setCapability("appActivity","com.alibaba.android.rimet.biz.SplashActivity");
       // capabilities.setCapability("clearSystemFiles", true);
        capabilities.setCapability("appWaitActivity", "com.alibaba.android.rimet.biz.SplashActivity");
        //capabilities.setCapability("appium",AutomationName.APPIUM);
       // capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.APPIUM);
        capabilities.setCapability("noReset", "true");
        System.out.println("bbbbbb");
        driver = new AndroidDriver(service,capabilities );
        //Thread.sleep(10000);
        System.out.println("cccc");
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

    @AfterTest
    public void SetOff() throws IOException {
        driver.closeApp();
        service.stop();
//        StartSeversTool.appiumStop();
    }
    
}
