package Amazon.questions;

import Amazon.ui.ItemScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
public class ProductName implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return  ItemScreen.PRODUCT_NAME_FILED.resolveFor(actor).isVisible();
    }
}
