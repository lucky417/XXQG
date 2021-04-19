package com.xxqg.first;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestCase06_myMassage extends CommonUtils {
	@Test
	public void login() throws InterruptedException {
		super.login();
	}
	
	@Test(dependsOnMethods = {"login"})
    public void enterMyMessageOne() {
		super.enterMyMessageOne();
		System.out.println("enter my message");
	}

	@Test(dependsOnMethods = {"enterMyMessageOne"},priority = 1)
    public void checkPoint_01_Username() {
		assertEquals(getElementtext(Contantnum.MYNAME_ID), "杨杏","the massage is wrong");
		System.out.println(getElementtext(Contantnum.MYNAME_ID));
	}

	@Test(dependsOnMethods = {"enterMyMessageOne"},priority = 2)
	public void enterMyDetailMessage() {
		clickElementById(Contantnum.MYDETAIL_ID);
	}

	@Test(dependsOnMethods = {"enterMyDetailMessage"},priority = 1)
	public void checkPoint_02_Username() {
		assertEquals(getMyDetailMessage(0),"杨杏","the username is wrong");
	}

	@Test(dependsOnMethods = {"enterMyDetailMessage"},priority = 2)
	public void checkPoint_03_UserStudyId() {
		assertEquals(getMyDetailMessage(1),"68785167","the UserStudyId is wrong");
	}

	@Test(dependsOnMethods = {"enterMyDetailMessage"},priority = 3)
	public void checkPoint_04_UserPhone() {
		assertEquals(getMyDetailMessage(2),"18910575487","the UserStudyId is wrong");
	}





}
