package co.com.devco.certification.tasks;

import co.com.devco.certification.utils.constants.GeneralConstants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.devco.certification.utils.constants.GeneralConstants.*;

public class OpenWeb implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(URL));
    }

    public static OpenWeb site() {
        return Tasks.instrumented(OpenWeb.class);
    }
}