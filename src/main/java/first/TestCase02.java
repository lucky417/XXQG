package first;

import org.testng.annotations.Test;

public class TestCase02 extends CommonUtils {
	
	@Test
	public void Step01_EnterModule() throws InterruptedException {
		int x = 654;
		int y = 736;
		super.clickModule();
		super.clickXy(x,y);
		super.enterArticleWithOutOperate(Contantnum.TECH_LIST01);
		super.enterArticleFollow();
		super.enterArticleUnFollow();

	}


}
