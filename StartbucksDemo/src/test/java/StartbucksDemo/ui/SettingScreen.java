package StartbucksDemo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SettingScreen {
    public static Target TEAM_OF_USE_FILE = Target.the("Terms of usen field")
            .located(By.id("com.starbucks.vn:id/tv_term_of_use"));
    public static Target TITLE_FILE = Target.the("title field")
            .located(By.xpath("//*[starts-with(@content-desc,\"PLEASE READ THESE TERMS OF USE CAREFULLY\")]"));
}
