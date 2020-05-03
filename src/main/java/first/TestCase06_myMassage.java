package first;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

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
	
	/*@Test(dependsOnMethods = {"login"})
    public void enterMyMessageTwo() {
		
	}*/
	
	@Test(dependsOnMethods = {"enterMyMessageOne"})
    public void checkPoint_01_Username() {
		assertEquals(getElementtext(Contantnum.MYNAME_ID), "杨杏","the massage is wrong");
		System.out.println(getElementtext(Contantnum.MYNAME_ID));
	}
	
	
	

}
