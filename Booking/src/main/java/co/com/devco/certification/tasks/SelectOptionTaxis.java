package co.com.devco.certification.tasks;

import co.com.devco.certification.interactions.SelectDate;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.devco.certification.userinterfaces.SearchTaxiPage.*;

public class SelectOptionTaxis implements Task {

    private final String date;

    public SelectOptionTaxis(String date) {
        this.date = date;
    }

    public static SelectOptionTaxis toSearch(String date) {
        return Tasks.instrumented(SelectOptionTaxis.class, date);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_ADD),
                Click.on(BUTTON_OPEN_DATE),
                SelectDate.toStay(date, INPUT_DATE_SEARCH_TAXI, SELECT_DATE_SEARCH_TAXI),
                Click.on(BUTTON_SEARCH)
        );
    }
}
