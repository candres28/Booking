package co.com.devco.certification.stepdefinitions;

import co.com.devco.certification.exceptions.CreateAccountException;
import co.com.devco.certification.models.Stay;
import co.com.devco.certification.questions.Message;
import co.com.devco.certification.questions.StayValidate;
import co.com.devco.certification.tasks.OpenWeb;
import co.com.devco.certification.tasks.SearchStays;
import co.com.devco.certification.tasks.SelectOptionStays;
import co.com.devco.certification.userinterfaces.StayPage;
import co.com.devco.certification.utils.constants.ExceptionsConstants;
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

import static co.com.devco.certification.utils.constants.GeneralConstants.CHROME;
import static co.com.devco.certification.utils.constants.GeneralConstants.USER;

public class SearchStaysStepDefinitions {

    @Managed(driver = CHROME)
    private WebDriver hisBrowser;

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(USER);
    }

    @Given("^The user is on the Booking Webpage in the accommodation option and enters the search parameters$")
    public void TheUserIsOnTheBookingWebpageInTheAccommodationOptionAndEntersTheSearchParameters(List<Stay> stayList) {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenWeb.site(),
                SearchStays.with(stayList.get(0)));
    }

    @When("^he enters points filters (.*)$")
    public void HeEntersPointsFilters(String message) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectOptionStays.withFilters(message));
    }

    @Then("^you can see the list of filtered options (.*)$")
    public void YouCanSeeTheListOfFilteredOptions(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(StayValidate.theOption(),
                Matchers.containsString(message)));
    }

    @Then("^he can see (.*)$")
    public void heCanSeeLoSentimosNoEsPosibleRealizarReservasParaMásDeNoches(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Message.isTo(StayPage.MESSAGE_ALERT),
                Matchers.equalTo(message)).orComplainWith(CreateAccountException.class,
                ExceptionsConstants.STAY_ERROR));
    }
}
