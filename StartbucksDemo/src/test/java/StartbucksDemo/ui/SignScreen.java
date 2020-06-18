package StartbucksDemo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignScreen {
    public static Target EMAIL_FILE = Target.the("email field")
            .located(By.id("com.starbucks.vn:id/et_sign_in_email"));
    public static Target PASS_FILE = Target.the("pass field")
            .located(By.id("com.starbucks.vn:id/et_sign_in_pw"));
    public static Target PASS_ERROR_FILE = Target.the("pass error field")
            .located(By.xpath("//*[@text=\"Please input Password\"]"));
    public static Target EMAIL_ERROR_FILE = Target.the("email error field")
            .located(By.xpath("//*[@text=\"Please input Email\"]"));
    public static Target SIGN_IN_BUTTON = Target.the("sign in button")
            .located(By.id("com.starbucks.vn:id/tv_main_button"));
    public static Target JOIN_IN_FILE = Target.the("join in field")
            .located(By.id("com.starbucks.vn:id/tv_right"));
}
