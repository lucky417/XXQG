package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.TouchAction;

import java.util.List;

public class CommonUtils extends Basic {

	// 定位元素_id
	public WebElement findElementById(String id) {
		WebElement a = Basic.driver.findElementById(id);
		return a;
	}

	// 点击元素_id
	public void clickElementById(String id) {
		Basic.driver.findElementById(id).click();
	}

	// 定位元素输入值_id
	public void inputElementById(String id, String password) {
		Basic.driver.findElementById(id).sendKeys(password);
	}

	// 定位元素_xpath
	public void findElementByXpath(String xpath) {
		Basic.driver.findElementByXPath(xpath);
	}

	// 点击元素_xpath
	public void clickElementByXpath(String xpath) {
		Basic.driver.findElementByXPath(xpath).click();
	}
	
	//获取元素的title
	public String getElementtext(String id){
		 String tx = null;
		 tx = Basic.driver.findElementById(id).getText();
	     return tx;
	}

	
	//判断元素是否存在
	public boolean doesWebElementExist() {
		try{
			Basic.driver.findElementById(Contantnum.LOGIN_ID);
			return true;
		}catch(org.openqa.selenium.NoSuchElementException ex)  {
			return false;
		}
	}
	
	
	
	
	

	//获取toast元素
	public void assertToast(String message){
		final WebDriverWait wait = new WebDriverWait(driver, 10);
		Assert.assertNotNull(wait.until(
		ExpectedConditions.presenceOfElementLocated(By.xpath(""))));
		}
	 
	
	
	// 登录
	public void login() throws InterruptedException {
		boolean loginSuccessful = doesWebElementExist();
		String username = "18910575487";
		String password = "222127417";
		System.out.println("ready to enter");
        // 显式等待
        WebDriverWait explicitwait = new WebDriverWait(driver, 10);
	    if (loginSuccessful==false){
	    	System.out.println("ready to login");
	        explicitwait.until(ExpectedConditions.visibilityOfElementLocated(By.id(Contantnum.LOGIN_PASSWORD)));
			inputElementById(Contantnum.LOGIN_USERPHONE, username);
			inputElementById(Contantnum.LOGIN_PASSWORD, password);
			//Thread.sleep(5000);
			System.out.println("input password");
			clickElementById(Contantnum.LOGIN_ENSUREBUTTON);
	    }
		System.out.println(loginSuccessful);
	}

	// 进入my
	public void enterMy() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("ready to enter listen");
		clickElementById(Contantnum.MY_ID);
		System.out.println("enter listen");
		Thread.sleep(4000);

	}

	// 进入我的分数
	public void enterStudyScore() throws InterruptedException {
		Thread.sleep(8000);
		clickElementByXpath(Contantnum.MYSOCRE_XPATH);
		Thread.sleep(4000);

	}

	// 进入我的分数
	public void getReadArticleScore(String path) throws InterruptedException {
		Thread.sleep(2000);
		clickElementByXpath(path);
		Thread.sleep(4000);

	}

	// 点击进入全部频道
	public void clickModule() throws InterruptedException {
		// Basic.driver.findElement(By.id("")).click();
		TouchAction ta = new TouchAction(Basic.driver);
		ta.tap(1000, 282).release().perform();
		Thread.sleep(10000);
	}

	// 点击坐标
	public void clickXy(int x, int y) throws InterruptedException {
		TouchAction ta = new TouchAction(Basic.driver);
		ta.tap(x, y).release().perform();
		//Thread.sleep(10000);
	}

	// 点击进入具体新闻并操作
	public void enterArticle(String path) throws InterruptedException {
		// Basic.driver.findElementByXPath(path).click();
		clickElementByXpath(path);
		System.out.println("Enter first article");
		Thread.sleep(20000);
		System.out.println("swipe");
		Basic.driver.swipe(462, 1415, 481, 803, 3000);
		Thread.sleep(40000);
		System.out.println("click back");
		Thread.sleep(50000);
		Basic.driver.navigate().back();
		Thread.sleep(8000);
	}

	// 点击进入具体新闻无操作
	public void enterArticleWithOutOperate(String path) throws InterruptedException {
		Basic.driver.findElementByXPath(path).click();
		System.out.println("Enter first article");
		Thread.sleep(10000);
	}

	// 点击收藏
	public void enterArticleFollow() throws InterruptedException {
		TouchAction ta = new TouchAction(Basic.driver);
		ta.tap(840, 1719).release().perform();
		Thread.sleep(20000);
	}

	// 点击取消收藏
	public void enterArticleUnFollow() throws InterruptedException {
		TouchAction ta = new TouchAction(Basic.driver);
		ta.tap(840, 1719).release().perform();
		Thread.sleep(10000);
	}

	// 点击tap标签：试听学习、关注、强国通、我的等
	public void clickListenAndLearn(String Xpath) throws InterruptedException {
		Basic.driver.findElementByXPath(Xpath).click();
		;
		Thread.sleep(10000);
	}

	// 点击视听学习的视频
	public void clickListenAndLearnVedio(String Xpath) throws InterruptedException {
		Basic.driver.findElementByXPath(Xpath).click();
		;
		Thread.sleep(10000);
	}

	// 获取time

	public void getListenAndLearnVedioTime(String Xpath) throws InterruptedException, java.text.ParseException {
		Thread.sleep(20000);
		WebElement element = Basic.driver.findElementByXPath(Xpath);
		System.out.println(element);
		Thread.sleep(10000);
		System.out.println("get text");
		String te = element.getAttribute("text");
		Long time = this.getTimeLong(te);
		System.out.print(te);
		System.out.println(time);
		Thread.sleep(time);
		Thread.sleep(10000);

	}

	//enter order
	public void enterOrder() throws InterruptedException {
		//enter all module
		this.clickModule();
		Thread.sleep(20000);
		this.clickXy(908, 584);
		
	}
	
	//enterAddOrder
	public void enterAddOrder() throws InterruptedException{
        WebDriverWait explicitwait = new WebDriverWait(driver, 10);
        explicitwait.until(ExpectedConditions.elementToBeClickable(By.xpath(Contantnum.ORDERADD_XPATH)));
		this.clickElementByXpath(Contantnum.ORDERADD_XPATH);

		//Thread.sleep(10000);
	}
	
	//chooseOneModule
	public void chooseOneModule() throws InterruptedException{
		for(int i=7;i>=0;i--) {
		Basic.driver.swipe(462, 1415, 481, 803, 3000);
		}
		
	}
	
	
	public static Long getTimeLong(String timeStr) {
		String[] timeArray = timeStr.split(":");
		Integer minute = Integer.parseInt(timeArray[0]);
		Integer second = Integer.parseInt(timeArray[1]);

		return minute * 60 * 1000L + second * 1000L;
	}


	//enter my message
	public void enterMyMessageOne() {
		System.out.println("ready to click the user picture");
		clickElementById(Contantnum.MYPICTURE_ID);
	}

	//get the detail of mine
	public String getMyDetailMessage(int i){
		System.out.println("----------$$$$$$$$$$$$----------");
		//List<WebElement> details = new ArrayList<WebElement>();
		//WebElement de = Basic.driver.findElement(By.id(Contantnum.MYBASIC_ID));
		List<WebElement> details = Basic.driver.findElementsById(Contantnum.MYDETAIL);
		System.out.println("text:"+details.get(i).getText());
		return details.get(i).getText();
	}
	//enter the i want to answer the question
	public void enterIWantAnswerTheQuestion(){
		System.out.println("my massage page");
		List<WebElement> contents = Basic.driver.findElementsById(Contantnum.MYMESSAGE);
		System.out.println("___$$$$$$$____");
		System.out.println(contents.get(2).getText());
		contents.get(2).click();
	}

	//enter the answer the question every day
	public void enterAnswerQuestionEveryDay() throws InterruptedException {
		Thread.sleep(20000);
		clickXy(400,800);
		System.out.println("the page is");
	}


	//enter my score
	public void enterMyScore(){
		clickElementById(Contantnum.MYSTUDYSCORE_ID);
	}

	public String getTheTittleOfScorePage(){
		return getElementtext(Contantnum.MYSCORE_PAGE_ID);

	}

	//read article
	public void readArticle() throws InterruptedException {
		List<WebElement> article = Basic.driver.findElementsById("cn.xuexi.android:id/general_card_title_id");
		System.out.println(article.size());
		for (int i=0;i< article.size();i++){
			article.get(i).click();
			System.out.println("read the"+(i+1)+"文章");
			Thread.sleep(10000);
			driver.navigate().back();
			Thread.sleep(1000);
		}


	}

	//enter my video
	public void enterVideo(){
		clickElementByXpath(Contantnum.VIDEO_XPATH);
		System.out.println("enter the video");
	}
	//enter the specific video
	public void enterTheSpecificVideo() throws InterruptedException {
		System.out.println("aaaaaaa");
		//List<WebElement> video = Basic.driver.findElementsByXPath(Contantnum.VIDEO_ON);
		List<WebElement> time = Basic.driver.findElementsByXPath(Contantnum.VIDEO_TIME_XPATH);
		for (int f=0;f<time.size();f++) {
			getTheTime(f);
			enterTheVi(f);
			Thread.sleep(10000);
			driver.navigate().back();
			Thread.sleep(100);
		}

	}

	//get the time
	public void getTheTime(int i){
		List<WebElement> time = Basic.driver.findElementsByXPath(Contantnum.VIDEO_TIME_XPATH);
		System.out.println("time:"+time);
		System.out.println("bbbbbbbbbb");
		System.out.println(time.get(i));
		System.out.println("time.get(0).getText()"+time.get(i).getText());
		//return time.get(0).getText();
	}
	//enter the video
	public void enterTheVi(int i){
		System.out.println("ccccccc");
		List<WebElement> video = Basic.driver.findElementsByXPath(Contantnum.VIDEO_ON);
		video.get(i).click();
		System.out.println("enter the video");
	}



}
