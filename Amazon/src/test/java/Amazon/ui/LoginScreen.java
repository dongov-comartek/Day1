package Amazon.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginScreen {
    public static Target CREATE_ACCOUNT_FILED = Target.the("create account filed")
            .located(By.xpath("//*[@content-desc=\"Create account. New to Amazon? \"]"));
    public static Target NAME_FILED = Target.the("create accountname filed")
            .located(By.xpath("//*[@text=\"Name\"]"));
    public static Target EMAIL_FILED = Target.the("email filed")
            .located(By.xpath("//*[@text=\"Mobile number or email\"]"));
    public static Target PASS_FILED = Target.the("pass filed")
            .located(By.xpath("//*[@text=\"Create a password\"]"));
    public static Target CONTINUE_FILED = Target.the("continue filed")
            .located(By.xpath("//*[@content-desc=\"Continue\"]"));
    public static Target OPP_FILED = Target.the("opp filed")
            .located(By.xpath("//*[@text=\"Enter OTP\"]"));
    public static Target CREATE_AMAZON_ACCOUNT_BUTTON = Target.the("create your amazon account button")
            .located(By.xpath("//*[@content-desc=\"Create your Amazon account\"]"));
}
