package StartbucksDemo.questions;

import StartbucksDemo.ui.SignScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class SignInErrorPass implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(SignScreen.PASS_ERROR_FILE).viewedBy(actor).asString();
    }
}

