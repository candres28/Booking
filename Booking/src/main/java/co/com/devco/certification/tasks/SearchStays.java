package co.com.devco.certification.tasks;

import co.com.devco.certification.interactions.SelectDate;
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
                SelectDate.toStay(stay.getCheckin(),INPUT_YEAR,INPUT_DAY),
                SelectDate.toStay(stay.getCheckout(),INPUT_YEAR,INPUT_DAY),
                Click.on(BUTTON_SEARCH)
        );
    }

    public static SearchStays with(Stay stay) {
        return Tasks.instrumented(SearchStays.class, stay);
    }
}
