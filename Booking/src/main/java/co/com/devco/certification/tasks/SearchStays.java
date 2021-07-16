package co.com.devco.certification.tasks;

import co.com.devco.certification.models.Stay;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.devco.certification.userinterfaces.HomePage.*;
import static co.com.devco.certification.userinterfaces.StayPage.*;

public class SearchStays implements Task {
    private Stay stay;

    public SearchStays(Stay stay) {
        this.stay = stay;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_STAYS),
                Enter.theValue(stay.getDestination()).into(INPUT_DESTINATION),
                Click.on(BUTTON_DATEPICKER),
                Click.on(SELECT_CHECKIN.of(stay.getCheckin())),
                Click.on(SELECT_CHECKOUT.of(stay.getCheckout())),
                Click.on(BUTTON_SEARCH)
        );
    }

    public static SearchStays with(Stay stay) {
        return Tasks.instrumented(SearchStays.class, stay);
    }
}
