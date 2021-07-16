package co.com.devco.certification.tasks;

import co.com.devco.certification.userinterfaces.SearchStaysPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectOptionStays implements Task {

    private String message;

    public SelectOptionStays(String message) {
        this.message = message;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Click.on(SearchStaysPage.BUTTON_FILTER.of(message))
            );
    }

    public static SelectOptionStays withFilters(String message) {
        return Tasks.instrumented(SelectOptionStays.class, message);
    }
}
