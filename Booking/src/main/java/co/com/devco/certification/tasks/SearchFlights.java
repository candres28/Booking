package co.com.devco.certification.tasks;

import co.com.devco.certification.interactions.SelectInTheList;
import co.com.devco.certification.models.Flight;
import co.com.devco.certification.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.selectactions.SelectByIndexFromElement;
import org.openqa.selenium.Keys;

import static co.com.devco.certification.userinterfaces.FlightPage.*;

public class SearchFlights implements Task {
    private Flight flight;

    public SearchFlights(Flight flight) {
        this.flight = flight;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.BUTTON_FLIGHTS),
                Click.on(OPEN_ROUNDTRIP),
                Click.on(SELECT_ROUNDTRIP.of(flight.getOption())),
                Click.on(OPEN_CLASS),
                Click.on(SELECT_CLASS.of(flight.getType())),
                Click.on(OPEN_FROM),
                Enter.theValue(flight.getFrom()).into(INPUT_FROM).thenHit(Keys.ENTER),
                Click.on(OPEN_TO),
                Enter.theValue(flight.getTo()).into(INPUT_TO).thenHit(Keys.ENTER),
                Click.on(OPEN_DATE),
                Click.on(INPUT_DATE.of(flight.getDate())),
                Click.on(BUTTON_SEARCH)
        );
    }

    public static SearchFlights toParameters(Flight flight) {
        return Tasks.instrumented(SearchFlights.class, flight);
    }
}
