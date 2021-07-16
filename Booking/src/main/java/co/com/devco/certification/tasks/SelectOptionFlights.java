package co.com.devco.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.devco.certification.userinterfaces.SearchFlightsPage.*;

public class SelectOptionFlights implements Task {

    private String option;

    public SelectOptionFlights(String option) {
        this.option = option;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_SELECT_OPTION.of(option))
        );
    }

    public static SelectOptionFlights withFilter(String option) {
        return Tasks.instrumented(SelectOptionFlights.class, option);
    }
}

