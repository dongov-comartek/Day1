package Amazon.questions;

import Amazon.ui.ItemScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ProductDesc implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return  ItemScreen.PRODUCT_DESCRIPTION_FILED.resolveFor(actor).isVisible();
    }
}
