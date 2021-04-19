package com.xxqg.first;

public class AndrionPhone {

    //属性（成员变量）有什么
    private String platformName="Android";
    String deviceName;
    String platformVersion;
    private String app="/Users/lucky/workspace/apk/xuexiqiangguo.apk";
   // private String appPackage="com.xueqiu.android";
  //  private String appActivity="com.xueqiu.android.common.splash.SplashActivity";
    private String appWaitActivity="com.alibaba.android.rimet.biz.SplashActivity";
    private String appPackage="cn.xuexi.android";
    private String appActivity="com.alibaba.android.rimet.biz.im.activities.AlbumPreviewActivity";
    private String noReset="true";




    //构造方法
    public  AndrionPhone(){

    }

    public AndrionPhone(String NewDeviceName,String NewPlatformVersion){
        deviceName = NewDeviceName;
        platformVersion = NewPlatformVersion;
    }


    //get
    public String getApp() {
        return app;
    }

    public String getAppActivity() {
        return appActivity;
    }

    public String getAppPackage() {
        return appPackage;
    }

    public String getAppWaitActivity() {
        return appWaitActivity;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public String getNoReset() {
        return noReset;
    }

    public  String getPlatformName() {
        return platformName;
    }

    public String getPlatformVersion() {
        return platformVersion;
    }

}
