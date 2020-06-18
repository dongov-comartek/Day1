package StartbucksDemo.features.search;

import StartbucksDemo.questions.TheResults;
import StartbucksDemo.tasks.TeamOfUse;
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
public class TeamsOfUseStory {
    Actor anna = Actor.named("Anna");
    @Managed(driver = "Appium")
    public WebDriver herBrowser;

    @Before
    public void annaCanBrowseTheWeb() {
        anna.can(BrowseTheWeb.with(herBrowser));
    }

    @Test
    public void teams_of_use_verify_title() {
        anna.attemptsTo(
                TeamOfUse.open()
        );
        anna.should(
                seeThat(TheResults.TitleTeam(),equalTo(true))
        );

    }
}
