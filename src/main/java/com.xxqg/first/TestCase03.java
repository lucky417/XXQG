package com.xxqg.first;

import org.testng.annotations.Test;

import java.text.ParseException;

public class TestCase03 extends CommonUtils {
	
	@Test
	public void Step01_EnterModule() throws InterruptedException, ParseException {
		//String NAME;
		System.out.println("ready to enter 视听");
		super.clickListenAndLearn(Contantnum.TEXTLISTEN_XPATH);
		System.out.println("enter 视听");
		super.getListenAndLearnVedioTime(Contantnum.VEDIO_TIME);
		super.clickListenAndLearnVedio(Contantnum.VEDIO_FIRST);
	}


}
