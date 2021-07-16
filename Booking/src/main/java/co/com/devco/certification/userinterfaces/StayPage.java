package co.com.devco.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StayPage {

    public static final Target INPUT_DESTINATION = Target.the("input destination")
            .located(By.name("ss"));

    public static final Target BUTTON_DATEPICKER = Target.the("button open datepicker")
            .locatedBy("//div[@class='xp__dates-inner']");

    public static final Target SELECT_CHECKIN = Target.the("select date to checkin {0}")
            .locatedBy("//td[@data-date='{0}']");

    public static final Target SELECT_CHECKOUT = Target.the("select date to checkout {0}")
            .locatedBy("//td[@data-date='{0}']");

    public static final Target BUTTON_SEARCH = Target.the("button search stays")
            .locatedBy("//span[contains(text(),'Buscar')]");
}
