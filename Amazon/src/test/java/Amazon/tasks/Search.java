package Amazon.tasks;

import Amazon.actions.Press;
import io.appium.java_client.android.nativekey.AndroidKey;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnBy;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;

import Amazon.ui.HomeScreen;
import org.openqa.selenium.Keys;

public class Search  implements Task {

    String input;
    @Override

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomeScreen.SKIP_SIGN_IN_BUTTON),
                Click.on(HomeScreen.SEARCH_FIELD),
                Enter.theValue(this.input).into(HomeScreen.SEARCH_FIELD),
                Press.key(AndroidKey.ENTER)

        );

    }
    public Search(String input) {
        this.input = input;
    }
    public static SearchBuilder inputValue(String input)
    {
        return new SearchBuilder(input);
    }
    public static class SearchBuilder {
        private String input;
        public SearchBuilder(String input)
        {
            this.input=input;
        }
        public Search input(){
            return instrumented(Search.class,this.input);
        }
    }
}
