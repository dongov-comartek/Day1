package StartbucksDemo.tasks;

import StartbucksDemo.ui.HomeScreen;
import StartbucksDemo.ui.SignScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SignIn implements Task {
    String email;
    String pass;
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(this.email).into(SignScreen.EMAIL_FILE),
                Enter.theValue(this.pass).into(SignScreen.PASS_FILE),
                Click.on(SignScreen.SIGN_IN_BUTTON)
        );
    }
    public SignIn(String email, String pass) {
        this.email = email;
        this.pass = pass;
    }
    public static SignInBuilder inputEmail(String email) {
        return new SignInBuilder(email);
    }
    public static class SignInBuilder{
        String email;
        String pass;
        public SignInBuilder (String email) {
            this.email = email;
        }
        public SignInBuilder inputPass(String pass) {
            this.pass = pass;
            return this;
        }
        public SignIn input() {
            return instrumented(SignIn.class,this.email,this.pass);
        }
    }

}
