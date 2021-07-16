package co.com.devco.certification.stepdefinitions;

import co.com.devco.certification.models.Taxi;
import co.com.devco.certification.tasks.OpenWeb;
import co.com.devco.certification.tasks.SearchTaxi;
import co.com.devco.certification.tasks.SelectOptionTaxis;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class SearchTaxisStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("User");
    }

    @Given("^The user is on the website of the reservation page and enters the data to search for a taxi$")
    public void the_user_is_on_the_website_of_the_reservation_page_and_enters_the_data_to_search_for_a_taxi(List<Taxi> taxiList) {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenWeb.site()
        , SearchTaxi.withData(taxiList.get(0)));
    }

    @When("^he need Add you return date (.*)$")
    public void he_need_Add_you_return_date_August(String date) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectOptionTaxis.toSearch(date));
    }

    @Then("^he can see the total price$")
    public void he_can_see_the_total_price() {

    }

}
