package StartbucksDemo.questions;

import StartbucksDemo.ui.SettingScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TitleTeams implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return SettingScreen.TITLE_FILE.resolveFor(actor).isVisible();
        // return Text.of(SettingScreen.TITLE_FILE).viewedBy(actor).asString();
    }
}