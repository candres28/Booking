package co.com.devco.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.certification.userinterfaces.SearchStaysPage.*;

public class StayValidate implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(LABEL_DETAILS, WebElementStateMatchers.isVisible()));
        return Text.of(LABEL_DETAILS).viewedBy(actor).asString();
    }

    public static StayValidate theOption() {
        return new StayValidate();
    }
}
