package Amazon.tasks;

import Amazon.ui.HomeScreen;
import Amazon.ui.LoginScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenSignIn implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomeScreen.DONE_LANGUAGE_BUTTON),
                Click.on(HomeScreen.SKIP_SIGN_IN_BUTTON),
                Click.on(HomeScreen.MENU_BUTTON),
                Click.on(HomeScreen.SIGN_IN_BUTTON)
        );
    }
    public static OpenSignIn open(){
        return instrumented(OpenSignIn.class);
    }
}
