package first;

import jdk.nashorn.internal.runtime.regexp.joni.constants.Arguments;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestPhone {

    public static enum AndroidVersion implements Arguments{
        Android_9("9.0"),
        Android_8("8.0");
        private String version;
        AndroidVersion(String version) {
            this.version = version;
        }

        @Override
        public String toString() {
            return this.version;
        }
    }
    public static enum PhoneModel implements Arguments{
        Huawei("huawei"),
        Vivo("vivo");

        private  String name;
        PhoneModel(String name) {
            this.name = name;
        }
    }

    public static String HUAWEI = new DesiredCapabilities().getVersion();
}
