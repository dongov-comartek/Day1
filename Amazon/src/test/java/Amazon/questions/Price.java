package Amazon.questions;

import Amazon.ui.ItemScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Price implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return  ItemScreen.PRICE_FILED.resolveFor(actor).isVisible();
    }
}
