package com.xxqg.first;
import org.testng.annotations.Test;

public class TestCase04_getReadArticleScore extends CommonUtils {
	
	@Test
	public void login() throws InterruptedException {
		super.login();
	}
	
	@Test(dependsOnMethods = {"login"})
	public void enterMy() throws InterruptedException {
		super.enterMy();
	}

	@Test(dependsOnMethods = {"login"})
	public void readArticle() throws InterruptedException {
		super.readArticle();
	}


	/*
	@Test (dependsOnMethods= {"enterMy"})
	public void enterStudyScore() throws InterruptedException {
		super.enterStudyScore();
		
	}
	
	@Test(dependsOnMethods= {"enterStudyScore"})
	public void getReadArticleScore() throws InterruptedException {
		super.getReadArticleScore(Contantnum.LOOK_ONE);
		//super.enterArticle(Contantnum.TECH_LIST01);
		clickElementByXpath(Contantnum.TECH_LIST01);
		System.out.println("Enter first article");
		Thread.sleep(20000);
		System.out.println("swipe");
		Basic.driver.swipe(462, 1415, 481, 803, 3000);
		Thread.sleep(40000);
		System.out.println("click back");
		Basic.driver.navigate().back();
		Thread.sleep(8000);
		System.out.println("end");
	}
//
	 */

}
