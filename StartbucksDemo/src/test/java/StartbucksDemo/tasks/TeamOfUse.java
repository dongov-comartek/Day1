package StartbucksDemo.tasks;

import StartbucksDemo.ui.HomeScreen;
import StartbucksDemo.ui.SettingScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class TeamOfUse implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomeScreen.SETTING_FILE),
                Click.on(SettingScreen.TEAM_OF_USE_FILE)
                // WaitUntil.the(SettingScreen.TEAM_OF_USE_FILE, isVisible()).forNoMoreThan(60).seconds()
        );
    }
    public static TeamOfUse open() {
        return instrumented(TeamOfUse.class);
    }

}