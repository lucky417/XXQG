package first;

import org.openqa.selenium.remote.DesiredCapabilities;

public class Phone {

    //System.out.printf("aaa11");
    public static DesiredCapabilities huaWei() {
        AndrionPhone andrionPhone = new AndrionPhone("emulator-5554","6.0.1");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName",andrionPhone.getPlatformName());
        capabilities.setCapability("deviceName",andrionPhone.deviceName);
        //安卓的系统版本
        capabilities.setCapability("platformVersion",andrionPhone.platformVersion);
        //apk的路径
        capabilities.setCapability("app",andrionPhone.getApp());
        //apk的包名
        capabilities.setCapability("appPackage",andrionPhone.getAppPackage());
        //设置启动Activity
        capabilities.setCapability("appActivity",andrionPhone.getAppActivity());
        // capabilities.setCapability("clearSystemFiles", true);
     //   capabilities.setCapability("appWaitActivity", andrionPhone.getAppWaitActivity());
        //capabilities.setCapability("appium",AutomationName.APPIUM);
        // capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.APPIUM);
        capabilities.setCapability("noReset", andrionPhone.getNoReset());
        System.out.println("bbbbbb");
        return capabilities;
    }


    public static DesiredCapabilities viVO() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName","a3ede570");
        //安卓的系统版本
        capabilities.setCapability("platformVersion","9.0");
        //apk的路径
        capabilities.setCapability("app","/Users/lucky/workspace/apk/xuexiqiangguo.apk");
        //apk的包名
        //capabilities.setCapability("appPackage","com.xueqiu.android");
        capabilities.setCapability("appPackage","cn.xuexi.android");
        //设置启动Activity
        //capabilities.setCapability("appActivity","com.alibaba.android.rimet.biz.SplashActivity");
        capabilities.setCapability("appActivity","ß");
        // capabilities.setCapability("clearSystemFiles", true);
        //capabilities.setCapability("appWaitActivity", "com.alibaba.android.rimet.biz.SplashActivity");
        //capabilities.setCapability("appium",AutomationName.APPIUM);
        // capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.APPIUM);
        capabilities.setCapability("noReset", "true");
        System.out.println("bbbbbb");
        return capabilities;
    }

}
