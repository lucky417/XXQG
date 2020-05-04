package first;

import org.apache.commons.exec.*;
import org.testng.annotations.Test;
import java.io.IOException;

class StartSeversTool{
    static Process p;
    // Set path of your node.exe file.
    // Progra~1 represents Program Files folder.
    static String nodePath = "/usr/local/bin/node";
    // Set path of your appium.js file.
    static String appiumJSPath = "/Applications/Appium.app/Contents/Resources/app/node_modules/appium/build/lib/main.js";
    static String cmd = nodePath + " " + appiumJSPath;

    // This method Is responsible for starting appium server.
    public static void appiumStart() throws IOException, InterruptedException {
        // Execute command string to start appium server.
        p = Runtime.getRuntime().exec(cmd);

        // Provide wait time of 10 mins to start appium server properly.
        // If face any eÏrror(Could not start a new session...) then Increase
        // this time to 15 or 20 mins.
        Thread.sleep(10000);
        if (p != null) {
            System.out.println("Appium server Is started now.");
        }
    }

    // This method Is responsible for stopping appium server.
    public static void appiumStop() throws IOException {
        System.out.println(p);
        if (p != null) {
            p.destroy();
        }
        System.out.println("Appium server Is stopped now.");
    }


}
