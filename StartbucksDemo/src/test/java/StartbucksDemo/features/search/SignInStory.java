package StartbucksDemo.features.search;

import StartbucksDemo.questions.TheResults;
import StartbucksDemo.tasks.OpenSignin;
import StartbucksDemo.tasks.SignIn;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

@RunWith(SerenityRunner.class)
public class SignInStory {
    Actor anna = Actor.named("Anna");
    @Managed(driver = "Appium")
    public WebDriver herBrowser;

    @Before
    public void annaCanBrowseTheWeb() {
        anna.can(BrowseTheWeb.with(herBrowser));
    }

    @Test
    public void input_email_blank_value() {
        anna.attemptsTo(
                OpenSignin.open(),
                SignIn.inputEmail("").inputPass("abdc").input()
        );
        anna.should(
                seeThat(TheResults.ErrorEmail(), equalTo("Please input Email"))
        );
        anna.attemptsTo(

                SignIn.inputEmail("koten@gmail.com").inputPass("").input()
        );
        anna.should(
                seeThat(TheResults.ErrorPass(), equalTo("Please input Password"))
        );
    }
}
