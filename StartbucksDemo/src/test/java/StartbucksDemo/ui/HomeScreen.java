package StartbucksDemo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeScreen {
    public static Target SIGN_IN_FILE = Target.the("sign in field")
            .located(By.id("com.starbucks.vn:id/ll_home_account"));
    public static Target INBOX_FILE = Target.the("inbox field")
            .located(By.id("com.starbucks.vn:id/ll_home_inbox"));
    public static Target SETTING_FILE = Target.the("setting field")
            .located(By.id("com.starbucks.vn:id/iv_home_setting"));
}
