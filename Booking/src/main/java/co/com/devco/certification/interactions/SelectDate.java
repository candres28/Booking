package co.com.devco.certification.interactions;

import co.com.devco.certification.userinterfaces.StayPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class SelectDate implements Interaction {
    private final String date;
    private final Target targetYear;
    private final Target targetDay;

    public SelectDate(String date, Target targetYear, Target targetDay) {
        this.date = date;
        this.targetYear = targetYear;
        this.targetDay = targetDay;
    }

    public static SelectDate toStay(String date, Target targetYear, Target targetDay) {
        return Tasks.instrumented(SelectDate.class, date, targetYear, targetDay);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String day = date.split("-")[1].trim();
        String yearMonth = date.split("-")[0] + " " + date.split("-")[2];
        yearMonth = yearMonth.toLowerCase();

        while (!Text.of(targetYear).viewedBy(actor).asString().trim().equals(yearMonth)) {
            actor.attemptsTo(
                    Click.on(StayPage.BUTTON_NEXT)
            );
        }
        actor.attemptsTo(Click.on(targetDay.of(day)));
    }
}

