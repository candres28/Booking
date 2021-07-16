package co.com.devco.certification.stepdefinitions;

import co.com.devco.certification.models.Flight;
import co.com.devco.certification.questions.Message;
import co.com.devco.certification.tasks.OpenWeb;
import co.com.devco.certification.tasks.SearchFlights;
import co.com.devco.certification.tasks.SelectOptionFlights;
import co.com.devco.certification.userinterfaces.SearchFlightsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class SearchFligthsStepDefinitions {

    @Given("^The user is on the Booking Webpage in the flights option and enters the search parameters$")
    public void TheUserIsOnTheBookingWebpageInTheFlightsOptionAndEntersTheSearchParameters(List<Flight> flightList) {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenWeb.site(),
                SearchFlights.toParameters(flightList.get(0)));
    }

    @When("^he enters filters for (.*)$")
    public void HeEntersFiltersFor(String option) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectOptionFlights.withFilter(option));
    }

    @Then("^you can see the list of options and the (.*) button$")
    public void YouCanSeeTheListOfOptionsAndTheButton(String message) {
        OnStage.theActorInTheSpotlight().should(seeThat(Message.isTo(SearchFlightsPage.LABEL_OFFER), equalTo(message)));
    }
}
