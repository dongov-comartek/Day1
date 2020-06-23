package Amazon.features.search;

import Amazon.tasks.CreateAccount;
import Amazon.tasks.OpenSignIn;
import Amazon.ui.LoginScreen;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@RunWith(SerenityRunner.class)
public class SignInStory {
    Actor anna = Actor.named("Anna");
    @Managed(driver = "appium")
    public WebDriver herBrowser;
    @Before
    public void annaCanBrowseTheWeb() {
        anna.can(BrowseTheWeb.with(herBrowser));
    }
    @Test
    public void create_account_amazon(){
        anna.attemptsTo(
                OpenSignIn.open(),
                CreateAccount.inputEmail("kakavn10020@gmail.com").withName("Dong200").andPass("kaka2009").input()
        );

    }
}
