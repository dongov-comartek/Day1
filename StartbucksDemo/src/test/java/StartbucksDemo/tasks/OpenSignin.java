package StartbucksDemo.tasks;

import StartbucksDemo.ui.HomeScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class OpenSignin implements Task {
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(HomeScreen.SIGN_IN_FILE, isVisible()).forNoMoreThan(60).seconds(),
                Click.on(HomeScreen.SIGN_IN_FILE)
        );
    }
    public static OpenSignin open() {
        return instrumented(OpenSignin.class);
    }
}
