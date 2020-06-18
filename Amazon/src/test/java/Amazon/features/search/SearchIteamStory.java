package Amazon.features.search;

import Amazon.actions.Wait;
import Amazon.questions.ProductName;
import Amazon.questions.TheResults;
import Amazon.tasks.ItemsList;
import Amazon.ui.ItemScreen;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import Amazon.tasks.Search;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static org.hamcrest.Matchers.*;

@RunWith(SerenityRunner.class)
public class SearchIteamStory {
    Actor anna = Actor.named("Anna");
    @Managed(driver = "Appium")
    public WebDriver herBrowser;
    @Before
    public void annaCanBrowseTheWeb() {
        anna.can(BrowseTheWeb.with(herBrowser));
    }
    @Test
    public void search_results() {
        anna.attemptsTo(
                Search.inputValue("Samsung galaxy s10 plus case").input(),
                Wait.aBit(5).inSecond(),
                ItemsList.at(0),
                Wait.aBit(5).inSecond()
        );
        anna.should(
                seeThat(TheResults.verifyProductName(),equalTo(true)),
                seeThat(TheResults.verifyProductDesc(),equalTo(true)),
                seeThat(TheResults.verifyPrice(),equalTo(true))


        );
    }
}