package co.com.devco.certification.tasks;

import co.com.devco.certification.userinterfaces.SearchStaysPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectOptionStays implements Task {

    private String punctuation;
    private String distance;

    public SelectOptionStays(String punctuation, String distance) {
        this.punctuation = punctuation;
        this.distance = distance;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Click.on(SearchStaysPage.BUTTON_POINTS.of(punctuation)),
                    Click.on(SearchStaysPage.BUTTON_STARS.of(distance))
            );
    }

    public static SelectOptionStays withFilters(String punctuation, String distance) {
        return Tasks.instrumented(SelectOptionStays.class, punctuation,distance);
    }
}
