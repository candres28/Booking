package co.com.devco.certification.tasks;

import co.com.devco.certification.models.Account;
import co.com.devco.certification.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.devco.certification.userinterfaces.RegisterPage.*;

public class RegisterAccount implements Task {
    private Account account;

    public RegisterAccount(Account account) {
        this.account = account;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.BUTTON_MAKE_ACCOUNT)
                , Enter.theValue(account.getEmail()).into(LABEL_EMAIL).thenHit(Keys.ENTER)
                , Enter.theValue(account.getPassword()).into(LABEL_PASSWORD)
                , Enter.theValue(account.getPassword()).into(LABEL_CONFIRMED_PASSWORD).thenHit(Keys.ENTER)
        );
    }

    public static RegisterAccount withData(Account account) {
        return Tasks.instrumented(RegisterAccount.class, account);
    }
}