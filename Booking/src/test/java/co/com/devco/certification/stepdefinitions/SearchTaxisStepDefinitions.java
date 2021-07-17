package co.com.devco.certification.stepdefinitions;

import co.com.devco.certification.exceptions.CreateAccountException;
import co.com.devco.certification.models.Taxi;
import co.com.devco.certification.questions.Message;
import co.com.devco.certification.tasks.OpenWeb;
import co.com.devco.certification.tasks.SearchTaxi;
import co.com.devco.certification.tasks.SelectOptionTaxis;
import co.com.devco.certification.userinterfaces.SearchTaxiPage;
import co.com.devco.certification.utils.constants.ExceptionsConstants;
import co.com.devco.certification.utils.constants.GeneralConstants;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static co.com.devco.certification.utils.constants.GeneralConstants.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class SearchTaxisStepDefinitions {

    @Managed(driver = CHROME)
    private WebDriver hisBrowser;

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(USER);
    }

    @Given("^The user is on the website of the reservation page and enters the data to search for a taxi$")
    public void TheUserIsOnTheWebsiteOfTheReservationPageAndEntersTheDataToSearchForATaxi(List<Taxi> taxiList) {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenWeb.site()
                , SearchTaxi.withData(taxiList.get(0)));
    }

    @When("^he need Add you return date (.*)$")
    public void HeNeedAddYouReturnDate(String date) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectOptionTaxis.toSearch(date));
    }

    @Then("^he can see the total price (.*)$")
    public void HeCanSeeTheTotalPrice(String price) {
        OnStage.theActorInTheSpotlight().should(seeThat(Message.isTo(SearchTaxiPage.LABEL_PRICE),
                Matchers.containsString(price)).orComplainWith(CreateAccountException.class,
                ExceptionsConstants.TAXI_ERROR));

    }

}
