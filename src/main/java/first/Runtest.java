package first;

import org.testng.TestNG;
import org.testng.collections.Lists;

import java.io.IOException;
import java.util.List;

public class Runtest {
    //first.Runtest
    public static void main(String[] args) throws IOException, InterruptedException {
        TestNG tng = new TestNG();
        List<String> suites = Lists.newArrayList();
        suites.add("testng.xml");
        tng.setTestSuites(suites);
        tng.run();
    }


}



