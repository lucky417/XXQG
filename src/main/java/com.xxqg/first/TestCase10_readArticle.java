package com.xxqg.first;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestCase10_readArticle extends CommonUtils {
    @Test
    public void login() throws InterruptedException {
        super.login();
    }

    @Test(dependsOnMethods = {"login"},description = "enterMyScore")
    public void enterMyScore() {
        super.enterMyScore();
        System.out.println("enter my myScore");
    }

    @Test(dependsOnMethods = {"enterMyScore"},priority = 1)
    public void checkpoint_01_enterMyScore() {
        assertEquals(getTheTittleOfScorePage(),"学习积分","the page is wrong");
    }

}
