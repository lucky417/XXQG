package com.xxqg.first;

import org.testng.annotations.Test;

public class TestCase05_orderModule extends CommonUtils {
	
	@Test
	public void login() throws InterruptedException {
		super.login();
	}
	
	@Test(dependsOnMethods = {"login"})
	public void enterOrder() throws InterruptedException {
		super.enterOrder();
		//Thread.sleep(5000);
		System.out.println("enterOrder");
	}
	
	
	@Test(dependsOnMethods = {"enterOrder"})
	public void enterAddOrder() throws InterruptedException {
		//Thread.sleep(5000);
		super.enterAddOrder();
		System.out.println("enterAddOrder");
	}
	
	@Test(dependsOnMethods = {"enterAddOrder"})
	public void chooseOneModule() throws InterruptedException {
		super.chooseOneModule();
		System.out.println("chooseOneModule");
	}

}
