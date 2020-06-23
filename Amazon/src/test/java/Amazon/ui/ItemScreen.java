package Amazon.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ItemScreen {
    public static Target DELIVER_FILED = Target.the("deliver name")
            .located(By.xpath("//*[@text='Deliver to Vietnam']"));
    public static Target PRODUCT_NAME_FILED = Target.the("product name")
            .located(By.xpath("//*[@text=\"SUPCASE\"]"));
    public static Target PRODUCT_DESCRIPTION_FILED = Target.the("product description ")
            .located(By.xpath("//android.view.View[@text=\"SUPCASE Unicorn Beetle Pro Series Designed for Samsung Galaxy S10 Plus Case (2019 Release) Full-Body Dual Layer Rugged with Holster & Kickstand Without Built-in Screen Protector (Black)\"]"));

    public static Target PRICE_FILED = Target.the("price filed")
            .located(By.xpath("//*[@text=19]"));
}
