package co.com.devco.certification.tasks;

import co.com.devco.certification.userinterfaces.SearchStaysPage;
import co.com.devco.certification.userinterfaces.SearchTaxiPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectOptionTaxis implements Task {

    private String date;

    public SelectOptionTaxis(String date) {
        this.date = date;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SearchTaxiPage.BUTTON_ADD),
                Click.on(SearchTaxiPage.BUTTON_OPEN_DATE)

        );
    }

    public static SelectOptionTaxis toSearch(String date) {
        return Tasks.instrumented(SelectOptionTaxis.class, date);
    }
}
