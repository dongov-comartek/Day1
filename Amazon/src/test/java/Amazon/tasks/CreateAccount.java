package Amazon.tasks;

import Amazon.ui.LoginScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.yecht.Data;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CreateAccount implements Task {
    String name;
    String email;
    String pass;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LoginScreen.CREATE_ACCOUNT_FILED),
                Enter.theValue(this.name).into(LoginScreen.NAME_FILED),
                Enter.theValue(this.email).into(LoginScreen.EMAIL_FILED),
                Enter.theValue(this.pass).into(LoginScreen.PASS_FILED),
                Click.on(LoginScreen.CONTINUE_FILED),
                WaitUntil.the(LoginScreen.CREATE_AMAZON_ACCOUNT_BUTTON, isVisible()).forNoMoreThan(60).seconds()
        );


    }

    public CreateAccount(String name, String email, String pass) {
        this.email = email;
        this.name = name;
        this.pass = pass;
    }

    public static CreateAccountBuilder inputEmail(String email) {
        return new CreateAccountBuilder(email);
    }

    public static class CreateAccountBuilder {
         String name;
         String email;
         String pass;

        public CreateAccountBuilder(String email) {
            this.email = email;
        }

        public CreateAccountBuilder withName(String name) {
            this.name = name;
            return this;
        }
        public CreateAccountBuilder andPass(String pass){
            this.pass=pass;
            return this;

        }
        public CreateAccount input(){
            return instrumented(CreateAccount.class,this.name,this.email,this.pass);
        }

    }
}
