package Amazon.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeScreen {
    public static Target SKIP_SIGN_IN_BUTTON = Target.the("skip sign in button")
            .located(By.id("com.amazon.mShop.android.shopping:id/skip_sign_in_button"));
    public static Target SEARCH_FIELD = Target.the("search field")
            .located(By.id("com.amazon.mShop.android.shopping:id/rs_search_src_text"));
    public static Target ITEMS_LIST_FIELD = Target.the("items list field")
            .located(By.xpath("//*[@text=\"Tap and long press to fling this item to your tray.\"]"));
    public static Target MENU_BUTTON = Target.the("menu button")
            .located(By.id("com.amazon.mShop.android.shopping:id/action_bar_burger_icon"));
    public static Target SIGN_IN_BUTTON = Target.the("home button")
            .located(By.xpath("//*[@text=\"Hello. Sign In\"]"));
}
