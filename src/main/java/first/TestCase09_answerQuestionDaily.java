package first;

import org.testng.annotations.Test;

public class TestCase09_answerQuestionDaily extends CommonUtils {

    @Test
    public void login() throws InterruptedException {
        super.login();
    }

    @Test(dependsOnMethods = {"login"})
    public void enterMyMessageOne() {
        super.enterMyMessageOne();
        System.out.println("enter my message");
    }

    @Test(dependsOnMethods = {"enterMyMessageOne"})
    public void enterDailyQuestion() throws InterruptedException {
        System.out.println("ready enter daily question:");
        enterIWantAnswerTheQuestion();
        enterAnswerQuestionEveryDay();
    }
}
