package Amazon.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ItemScreen {
    public static Target PRODUCT_NAME_FILED = Target.the("product name")
            .located(By.xpath("//*[@content-desc=\"SupCase\"]"));
    public static Target PRODUCT_DESCRIPTION_FILED = Target.the("product description ")
            .located(By.xpath("//android.view.View[@content-desc=\"SUPCASE Unicorn Beetle Pro Series Designed for Samsung Galaxy S10 Plus Case (2019 Release) Full-Body Dual Layer Rugged with Holster & Kickstand Without Built-in Screen Protector (Black)\"]"));

    public static Target PRICE_FILED = Target.the("price filed")
            .located(By.xpath("//*[@content-desc=14]"));
}
