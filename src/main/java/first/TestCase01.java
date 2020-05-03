package first;

import org.testng.annotations.Test;

public class TestCase01 extends CommonUtils {
	
	@Test
	public void Step01_EnterModule() throws InterruptedException {
		int x = 416;
		int y = 735;
		super.clickModule();
		super.clickXy(x,y);
		super.enterArticle(Contantnum.TECH_LIST01);
		super.enterArticle(Contantnum.TECH_LIST02);
		//super.enterArticle(Contantnum.TECH_LIST03);
		//super.enterArticle(Contantnum.TECH_LIST04);
	}


}
