package Amazon.tasks;

import Amazon.ui.HomeScreen;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ItemsList implements Task {
    int index = 0;

    public ItemsList(int index) {
        this.index = index;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> lsItems= HomeScreen.ITEMS_LIST_FIELD.resolveAllFor(actor);
        actor.attemptsTo(
                Click.on(lsItems.get(this.index))
        );

    }
    public static ItemsList at(int index) {
        return instrumented(ItemsList.class, index);
    }
}
