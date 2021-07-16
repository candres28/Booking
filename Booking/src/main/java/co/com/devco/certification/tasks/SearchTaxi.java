package co.com.devco.certification.tasks;

import co.com.devco.certification.interactions.SelectDate;
import co.com.devco.certification.models.Taxi;
import co.com.devco.certification.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import static co.com.devco.certification.userinterfaces.TaxiPage.*;

public class SearchTaxi implements Task {
    private final Taxi taxi;

    public SearchTaxi(Taxi taxi) {
        this.taxi = taxi;
    }

    public static SearchTaxi withData(Taxi taxi) {
        return Tasks.instrumented(SearchTaxi.class, taxi);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.BUTTON_TAXIS),
                Enter.theValue(taxi.getPickup()).into(INPUT_PICKUP_LOCATION).thenHit(Keys.TAB),
                Click.on(SELECT_LOCATION.of(taxi.getPickup())),
                Enter.theValue(taxi.getDestination()).into(INPUT_DROP_LOCATION).thenHit(Keys.ENTER),
                Click.on(SELECT_LOCATION.of(taxi.getDestination())),
                Click.on(BUTTON_PICKUP),
                SelectDate.toStay(taxi.getDate(), INPUT_DATE_TAXI, SELECT_DAY),
                Click.on(BUTTON_HOUR),
                SelectFromOptions.byVisibleText(taxi.getPickUpTime()).from(INPUT_HOUR),
                Click.on(BUTTON_CONFIRM),
                SelectFromOptions.byVisibleText(taxi.getPassengers()).from(INPUT_PASSENGERS),
                Click.on(BUTTON_SEARCH)
        );
    }
}
