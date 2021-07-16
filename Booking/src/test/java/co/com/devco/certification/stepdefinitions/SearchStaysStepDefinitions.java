package co.com.devco.certification.stepdefinitions;

import co.com.devco.certification.models.Stay;
import co.com.devco.certification.questions.StayValidate;
import co.com.devco.certification.tasks.OpenWeb;
import co.com.devco.certification.tasks.SearchStays;
import co.com.devco.certification.tasks.SelectOptionStays;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class SearchStaysStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("User");
    }

    @Given("^The user is on the Booking Webpage in the accommodation option and enters the search parameters$")
    public void TheUserIsOnTheBookingWebpageInTheAccommodationOptionAndEntersTheSearchParameters(List<Stay> stayList) {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenWeb.site(),
                SearchStays.with(stayList.get(0)));
    }

    @When("^he enters filters for points (.*) and (.*)$")
    public void HeEntersFilterspointsMuyBienAndEstrellas(String punctuation, String distance) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectOptionStays.withFilters(punctuation, distance));
    }

    @Then("^you can see the list of filtered options (.*)$")
    public void YouCanSeeTheListOfFilteredOptions(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(StayValidate.theOption(),
                Matchers.containsString(message)));
    }
}
