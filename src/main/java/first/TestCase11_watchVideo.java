package first;

import org.testng.annotations.Test;

public class TestCase11_watchVideo extends CommonUtils{
    @Test
    public void login() throws InterruptedException {
        super.login();
    }

    @Test(dependsOnMethods = {"login"},description = "enterVideo")
    public void enterVideo() {
        super.enterVideo();
        System.out.println("enter video");
    }

    @Test(dependsOnMethods = {"enterVideo"},description = "enterVideo")
    public void enterTheSpecificVideo() throws InterruptedException {
        super.enterTheSpecificVideo();
        System.out.println("$$$$$$$$enter video$$$$$$$$$$$$$$");
    }

}
